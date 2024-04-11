/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Models.Customer;
import java.sql.*;
import java.util.ArrayList;


/**
 * Database Connector class for interacting with database
 * @author akshatr
 */
public class CustomerController {



    /**
     * Privatized constructor so as to not allow object creation
     */
    private CustomerController() {
    }

    /**
     * Insert given user to database
     * @see User
     * @param customer User object to be added
     */
    public static int addCustomer(Customer customer) {
        //add to database
        int generatedId = -1;

        String query = "INSERT INTO Customer(first_name,last_name,email,password) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
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
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return generatedId;
    }

    /**
     * Return lost of all users in database
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

    /**
     * Delete given user from database
     * @see User
     * @param u User to be deleted
     * 
     */
//    public static void deleteUser(User u) {
//        String query = "delete from USER where id = ?";
//
//        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            PreparedStatement stmt = conn.prepareStatement(query);
//            stmt.setInt(1, u.getId());
//            stmt.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * Edit given user details in the database
//     * @param oldUser existing user in database
//     * @param newUser modified user details to be added
//     */
//    public static void editUser(User oldUser, User newUser) {
//        String query = "UPDATE USER SET name=?, age=? WHERE id=?";
//
//        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            PreparedStatement stmt = conn.prepareStatement(query);
//            stmt.setString(1, newUser.getName());
//            stmt.setInt(2, newUser.getAge());
//            stmt.setInt(3, oldUser.getId());
//            stmt.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}
