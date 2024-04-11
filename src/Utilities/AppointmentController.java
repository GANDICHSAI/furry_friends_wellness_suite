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
        String query = "INSERT INTO Appointment(cust_id,store_name,service_id,pet_id,date,status,rating) VALUES(?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            java.util.Date utilDate = appointment.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, appointment.getCustomerId());
            stmt.setString(2, appointment.getStoreName());
            stmt.setInt(3, appointment.getServiceId());
            stmt.setInt(4, appointment.getPetId());
            stmt.setDate(5, sqlDate);
            stmt.setString(6, appointment.getStatus());
            stmt.setInt(7, appointment.getRating());

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
                appointment.setRating(rs.getInt("rating"));

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
                appointment.setRating(rs.getInt("rating"));

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
                appointment.setRating(rs.getInt("rating"));

                appointments.add(appointment);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appointments;
    }
    
    public static void deleteAppointment(int appointmentId) {
        String query = "DELETE FROM Appointment WHERE app_id = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, appointmentId);
            int rowsAffected = stmt.executeUpdate();
            System.out.println("Deleted " + rowsAffected + " appointment(s).");
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

}
