/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Models.Customer;
import Models.Store;
import java.sql.*;
import java.util.ArrayList;

/**
 * The {@code CustomerController} class provides static methods to manage {@code Customer} 
 * objects within the database. It includes methods to add a new customer and retrieve all 
 * customers. This class uses JDBC to connect to the database and perform SQL queries.
 */
/**
 * Database Connector class for interacting with database
 * @author hanee
 * @author A
 * @author chait
 * @author yihan
 */
public class CustomerController {

    /**
     * Privatized constructor so as to not allow object creation
     */
    private CustomerController() {
    }

    /**
     * Insert given user to database
     *
     * @see User
     * @param customer User object to be added
     */
    public static int addCustomer(Customer customer) {
        //add to database
        int generatedId = -1;

        String query = "INSERT INTO Customer(first_name,last_name,email,password) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, customer.getFirstName());
            stmt.setString(2, customer.getLastName());
            stmt.setString(3, customer.getEmail());
            stmt.setString(4, customer.getPassword());

            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                generatedId = rs.getInt(1); // get generatedId
                System.out.println("Generated Customer ID: " + generatedId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return generatedId;
    }

    /**
     * Return lost of all users in database
     *
     * @see User
     * @return list of users
     */
    public static ArrayList<Customer> getAllCustomers() {
//        return list of users from db
        ArrayList<Customer> customers = new ArrayList<>();

        String query = "SELECT * FROM Customer";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Customer cust = new Customer();
                cust.setFirstName(rs.getString("first_name"));
                cust.setLastName(rs.getString("last_name"));

                cust.setEmail(rs.getString("email"));
                cust.setPassword(rs.getString("password"));

                cust.setCustomerID(rs.getInt("cust_id"));
                customers.add(cust);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customers;
    }
    
    public static void editCustomer(Customer oldCustomer, Customer newCustomer) {
    String query = "UPDATE Customer SET first_name=?, last_name=?, email=?, password=? WHERE cust_id=?";

    try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD());
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setString(1, newCustomer.getFirstName());
        stmt.setString(2, newCustomer.getLastName());
        stmt.setString(3, newCustomer.getEmail());
        stmt.setString(4, newCustomer.getPassword());
        stmt.setInt(5, oldCustomer.getCustomerID());

        int rowsUpdated = stmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Customer updated successfully.");
        } else {
            System.out.println("Failed to update Customer.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    public static void deleteCustomerCascade(Customer customer) {
        String deleteCustomerQuery = "DELETE FROM Customer WHERE cust_id=?";
//        String deletePetsQuery = "DELETE FROM Pet WHERE customer_id=?";
//        String deleteAppointmentsQuery = "DELETE FROM Appointment WHERE cust_id=?";

         try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
             PreparedStatement deleteCustomerStmt = conn.prepareStatement(deleteCustomerQuery);
//             PreparedStatement deletePetsStmt = conn.prepareStatement(deletePetsQuery);
//             PreparedStatement deleteAppointmentsStmt = conn.prepareStatement(deleteAppointmentsQuery);

                conn.setAutoCommit(false); // Start transaction

                // Delete Customer
                deleteCustomerStmt.setInt(1, customer.getCustomerID());
                int rowsDeletedCustomer = deleteCustomerStmt.executeUpdate();

                // Delete Pets
    //            deletePetsStmt.setInt(1, customer.getCustomerID());
    //            int rowsDeletedPets = deletePetsStmt.executeUpdate();
    //
    //            // Delete Appointments
    //            deleteAppointmentsStmt.setInt(1, customer.getCustomerID());
    //            int rowsDeletedAppointments = deleteAppointmentsStmt.executeUpdate();

                if (rowsDeletedCustomer > 0) {
                    System.out.println("Customer, pets, and appointments deleted successfully.");
                    conn.commit(); // Commit the transaction
                } else {
                    System.out.println("Customer, pets, and appointments not found or not deleted.");
                    conn.rollback(); // Rollback if nothing was deleted
                }

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions, rollback transaction
        }
    }
    
    
}
