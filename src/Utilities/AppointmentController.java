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
 * The {@code AppointmentController} class manages CRUD (Create, Read, Update, Delete)
 * operations for {@code Appointment} objects in the database. This class provides static
 * methods to add, retrieve, and update appointments, ensuring encapsulation of SQL handling.
 * 
 * This class cannot be instantiated (private constructor) and should be used statically.
 */
/**
 *
 * @author yihan
 * @author A
 * @author haneesh
 * @author Chaitanya
 */
public class AppointmentController {

    /**
     * Privatized constructor so as to not allow object creation
     */
    private AppointmentController() {
    }

    public static void addAppointment(Appointment appointment) {
        //add to database
    /**
     * Adds an appointment to the database.
     *
     * @param appointment The {@code Appointment} object to add.
     */
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
/**
     * Retrieves all appointments from the database.
     *
     * @return An {@code ArrayList} of {@code Appointment} objects.
     */
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
/**
     * Retrieves all appointments for a specific customer from the database.
     *
     * @param customerId The customer ID to filter appointments.
     * @return An {@code ArrayList} of {@code Appointment} filtered by customer ID.
     */
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
    
/**
     * Retrieves all appointments for a specific store from the database.
     *
     * @param storeId The store ID to filter appointments.
     * @return An {@code ArrayList} of {@code Appointment} filtered by store ID.
     */
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


            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Appointment appointment = new Appointment();
                appointment.setAppointmentId(rs.getInt("Appointment.app_id"));

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
                int appId = rs.getInt("a.app_id");
                String storeName = rs.getString("s.store_name");
                String serviceName = rs.getString("sv.service_name");
                String petName = rs.getString("p.pet_name");
                Date date = rs.getDate("a.date");
                String status = rs.getString("a.status");
//                        int rating = rs.getInt("rating");

                Appointment selectedAppointment = new Appointment();
                selectedAppointment.setAppointmentId(rs.getInt("a.app_id"));
                selectedAppointment.setStoreName(rs.getString("s.store_name"));
                selectedAppointment.setServiceName(rs.getString("sv.service_name"));
                selectedAppointment.setPetName(rs.getString("p.pet_name"));

                selectedAppointment.setDate(rs.getDate("a.date"));
                selectedAppointment.setStatus(rs.getString("a.status"));
                selectedAppointment.setCustomerId(rs.getInt("a.cust_id"));


                //add to column
                appointments.add(selectedAppointment);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appointments;
    }


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
