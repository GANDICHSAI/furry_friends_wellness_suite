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

    private static final String URL = "jdbc:mysql://localhost:3306/FFWS";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    /**
     * Privatized constructor so as to not allow object creation
     */
    private AppointmentController() {
    }

    public static void addAppointment(Appointment appointment) {
        //add to database
        String query = "INSERT INTO Appointment(cust_id,store_name,service_id,pet_id,date,status,rating) VALUES(?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
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
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Appointment appointment = new Appointment();
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
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, customerId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Appointment appointment = new Appointment();
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
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, storeId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Appointment appointment = new Appointment();
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

}
