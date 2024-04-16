/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Models.Appointment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yihan
 */
public class AppointmentController {

    /**
     * Privatized constructor so as to not allow object creation
     */
    private AppointmentController() {
    }

    public static void addAppointment(Appointment appointment) {
        //add to database
        String query = "INSERT INTO Appointment(cust_id,store_name,service_id,store_id,pet_id,date,status) VALUES(?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            java.util.Date utilDate = appointment.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, appointment.getCustomerId());

            stmt.setString(2, appointment.getStoreName());
            stmt.setInt(3, appointment.getServiceId());
            stmt.setInt(4, appointment.getStoreId());
            stmt.setInt(5, appointment.getPetId());

            stmt.setDate(6, sqlDate);
            stmt.setString(7, appointment.getStatus());

            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Appointment> getAllAppointments() {
//        return list of users from db
        ArrayList<Appointment> appointments = new ArrayList<>();

        String query = "SELECT * FROM Appointment";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Appointment appointment = new Appointment();
                appointment.setAppointmentId(rs.getInt("app_id"));
                appointment.setCustomerId(rs.getInt("cust_id"));
                appointment.setStoreName(rs.getString("store_name"));
                appointment.setServiceId(rs.getInt("service_id"));
                appointment.setPetId(rs.getInt("pet_id"));
                appointment.setDate(rs.getDate("date"));
                appointment.setStatus(rs.getString("status"));

                appointments.add(appointment);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appointments;
    }

    public static ArrayList<Appointment> getAppointmentsByCustomerId(int customerId) {
        ArrayList<Appointment> appointments = new ArrayList<>();

        String query = "SELECT * FROM Appointment WHERE cust_id = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, customerId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Appointment appointment = new Appointment();
                appointment.setAppointmentId(rs.getInt("app_id"));
                appointment.setCustomerId(rs.getInt("cust_id"));
                appointment.setStoreName(rs.getString("store_name"));
                appointment.setServiceId(rs.getInt("service_id"));
                appointment.setPetId(rs.getInt("pet_id"));
                appointment.setDate(rs.getDate("date"));
                appointment.setStatus(rs.getString("status"));
//                appointment.setRating(rs.getInt("rating"));

                appointments.add(appointment);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appointments;
    }

    public static ArrayList<Appointment> getAppointmentsByStoreId(int storeId) {
        ArrayList<Appointment> appointments = new ArrayList<>();

        String query = "SELECT * FROM Appointment WHERE store_id = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, storeId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Appointment appointment = new Appointment();
                appointment.setAppointmentId(rs.getInt("app_id"));
                appointment.setCustomerId(rs.getInt("cust_id"));
                appointment.setStoreName(rs.getString("store_name"));
                appointment.setServiceId(rs.getInt("service_id"));
                appointment.setPetId(rs.getInt("pet_id"));
                appointment.setDate(rs.getDate("date"));
                appointment.setStatus(rs.getString("status"));

                appointments.add(appointment);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appointments;
    }

    public static ArrayList<Appointment> getAppointmentsByStoreID(int storeId) {
        ArrayList<Appointment> appointments = new ArrayList<>();

        String query = "select Appointment.app_id, Appointment.store_name,Pet.pet_name,Store_Service.service_name,Appointment.date,"
                + "Appointment.status from Appointment join Customer on "
                + "Appointment.cust_id = Customer.cust_id join Pet on Appointment.pet_id = Pet.pet_id join "
                + "Store_Service on Appointment.service_id = Store_Service.store_serv_id where Appointment.store_id=?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, storeId);
//            stmt.setInt(2, storeId);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Appointment appointment = new Appointment();
                appointment.setAppointmentId(rs.getInt("Appointment.app_id"));
//                appointment.setCustomerId(rs.getInt("cust_id"));
                appointment.setStoreName(rs.getString("Appointment.store_name"));
                appointment.setServiceName(rs.getString("Store_Service.service_name"));
                appointment.setPetName(rs.getString("Pet.pet_name"));
                appointment.setDate(rs.getDate("Appointment.date"));
                appointment.setStatus(rs.getString("Appointment.status"));

                appointments.add(appointment);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appointments;
    }

    public static ArrayList<Appointment> getAppointmentsByJoin() {
        ArrayList<Appointment> appointments = new ArrayList<>();

        String query = "select Appointment.app_id, Appointment.store_name,Pet.pet_name,Store_Service.service_name,Appointment.date,"
                + "Appointment.status, Customer.cust_id from Appointment join Customer on "
                + "Appointment.cust_id = Customer.cust_id join Pet on Appointment.pet_id = Pet.pet_id join "
                + "Store_Service on Appointment.service_id = Store_Service.store_serv_id";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Appointment appointment = new Appointment();
                appointment.setAppointmentId(rs.getInt("Appointment.app_id"));
                appointment.setCustomerId(rs.getInt("Customer.cust_id"));
                appointment.setStoreName(rs.getString("Appointment.store_name"));
                appointment.setServiceName(rs.getString("Store_Service.service_name"));
                appointment.setPetName(rs.getString("Pet.pet_name"));
                appointment.setDate(rs.getDate("Appointment.date"));
                appointment.setStatus(rs.getString("Appointment.status"));

                appointments.add(appointment);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appointments;
    }

    public static void deleteAppointment(int appointmentId) {
        String query = "UPDATE Appointment SET status=? WHERE app_id=?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "CANCELLED");
            stmt.setInt(2, appointmentId);
            int rowsAffected = stmt.executeUpdate();
            //System.out.println("Deleted " + rowsAffected + " appointment(s).");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void editAppointmentDate(int appointmentId, java.util.Date newDate) {
        String query = "UPDATE Appointment SET date=? WHERE app_id=?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setDate(1, new java.sql.Date(newDate.getTime()));
            stmt.setInt(2, appointmentId);

            int rowsAffected = stmt.executeUpdate();
            System.out.println("Updated " + rowsAffected + " appointment(s).");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Appointment> getAppointmentListByCustomerId(int customerId) {
        ArrayList<Appointment> appointments = new ArrayList<>();

//        String query = "SELECT a.app_id, s.store_name, sv.service_name, p.pet_name, " +
//                        "a.date, a.status, a.rating " +
//                        "FROM Appointment a " +
//                        "JOIN Store s ON a.store_id = s.store_id " +
//                        "JOIN Store_Service sv ON a.service_id = sv.store_serv_id " +
//                        "JOIN Pet p ON a.pet_id = p.pet_id " +
//                        "WHERE a.cust_id = ?";
        String query = "SELECT a.app_id, s.store_name, sv.service_name, p.pet_name, "
                + "a.date, a.status, a.cust_id "
                + "FROM Appointment a "
                + "JOIN Store s ON a.store_id = s.store_id "
                + "JOIN Store_Service sv ON a.service_id = sv.store_serv_id "
                + "JOIN Pet p ON a.pet_id = p.pet_id "
                + "WHERE a.cust_id = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, customerId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int appId = rs.getInt("app_id");
                String storeName = rs.getString("store_name");
                String serviceName = rs.getString("service_name");
                String petName = rs.getString("pet_name");
                Date date = rs.getDate("date");
                String status = rs.getString("status");
//                        int rating = rs.getInt("rating");

                Appointment selectedAppointment = new Appointment();
                selectedAppointment.setAppointmentId(rs.getInt("app_id"));
                selectedAppointment.setStoreName(rs.getString("store_name"));
                selectedAppointment.setServiceName(rs.getString("store_name"));
                selectedAppointment.setPetName(rs.getString("pet_name"));

                //java.util.Date utilDate = selectedAppointment.getDate();
                //java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                selectedAppointment.setDate(rs.getDate("date"));
                selectedAppointment.setStatus(rs.getString("status"));
                selectedAppointment.setCustomerId(rs.getInt("cust_id"));

//                        selectedAppointment.setRating(rs.getInt("rating"));
                // Print the retrieved data
//                        System.out.println("Store Name: " + storeName);
//                        System.out.println("Service Name: " + serviceName);
//                        System.out.println("Pet Name: " + petName);
//                        System.out.println("Date: " + date);
//                        System.out.println("Status: " + status);
//                        System.out.println("Rating: " + rating);
//                        System.out.println("-----------------------------------");
                //add to column
                appointments.add(selectedAppointment);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appointments;
    }

//    public static Appointment getAppointmentById(int appointmentId) {
//    String query = "SELECT * FROM Appointment WHERE app_id = ?";
//    Appointment appointment = null;
//
//    try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD());
//         PreparedStatement stmt = conn.prepareStatement(query)) {
//
//        stmt.setInt(1, appointmentId);
//        ResultSet rs = stmt.executeQuery();
//
//        if (rs.next()) {
//            appointment = new Appointment();
//            appointment.setAppointmentId(rs.getInt("app_id"));
//            appointment.setCustomerId(rs.getInt("cust_id"));
//            appointment.setStoreName(rs.getString("store_name"));
//            appointment.setServiceId(rs.getInt("service_id"));
//            appointment.setPetId(rs.getInt("pet_id"));
//            appointment.setDate(rs.getDate("date"));
//            appointment.setStatus(rs.getString("status"));
//            appointment.setRating(rs.getInt("rating"));
//        }
//
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//    return appointment;
//}
//    public static void editAppointment(Appointment oldAppointment, Appointment newAppointment) {
//        String query = "UPDATE Appointment SET cust_id=?, store_name=?, service_id=?, pet_id=?, date=?, status=?, rating=? WHERE app_id=?";
//        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
//            PreparedStatement stmt = conn.prepareStatement(query);
//            
//            // Set the parameters for the new values
//            stmt.setInt(1, newAppointment.getCustomerId());
//            stmt.setString(2, newAppointment.getStoreName());
//            stmt.setInt(3, newAppointment.getServiceId());
//            stmt.setInt(4, newAppointment.getPetId());
//            stmt.setDate(5, new java.sql.Date(newAppointment.getDate().getTime()));
//            stmt.setString(6, newAppointment.getStatus());
//            stmt.setInt(7, newAppointment.getRating());
//            
//            // Set the parameter for the appointment ID we are updating
//            stmt.setInt(8, oldAppointment.getAppointmentId());
//            
//            int rowsAffected = stmt.executeUpdate();
//            System.out.println("Updated " + rowsAffected + " appointment(s).");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    public static void updateAppointmentStatus(String appointmentId, String status) {
        String sql = "UPDATE Appointment SET status = ? WHERE app_id = ?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, status);
            pstmt.setString(2, appointmentId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
