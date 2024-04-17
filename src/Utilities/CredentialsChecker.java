/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Models.Pet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author hanee
 */
/**
 * The {@code CredentialsChecker} class provides static methods to check the existence
 * of various user accounts in the database by their email addresses. It includes methods
 * to verify accounts for Client Information Managers (CIMs), Store Employees, System
 * Administrators, and Customers.
 */
public class CredentialsChecker {
    /**
     * Checks if a Client Information Manager (CIM) account exists for a given email.
     *
     * @param email The email address to check in the CIM database.
     * @return {@code true} if the account exists, {@code false} otherwise.
     */

    public static Boolean checkCimExist(String email) {
        String query = "SELECT COUNT(*) FROM Client_Information_Manager WHERE email = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;  // If count > 0, row exists; otherwise, it doesn't
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    /**
     * Checks if a Store Employee account exists for a given email.
     *
     * @param email The email address to check in the Store Employee database.
     * @return {@code true} if the account exists, {@code false} otherwise.
     */
    
    public static Boolean checkStoreEmployee(String email) {
        String query = "SELECT COUNT(*) FROM Store_Employee WHERE email = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;  // If count > 0, row exists; otherwise, it doesn't
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     * Checks if a System Administrator account exists for a given email.
     *
     * @param email The email address to check in the System Administrator database.
     * @return {@code true} if the account exists, {@code false} otherwise.
     */
     public static Boolean checkSysAdmin(String email) {
        String query = "SELECT COUNT(*) FROM System_Admin WHERE email = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;  // If count > 0, row exists; otherwise, it doesn't
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
     
     /**
     * Checks if a Customer account exists for a given email.
     *
     * @param email The email address to check in the Customer database.
     * @return {@code true} if the account exists, {@code false} otherwise.
     */
     public static Boolean checkCustomer(String email) {
        String query = "SELECT COUNT(*) FROM Customer WHERE email = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;  // If count > 0, row exists; otherwise, it doesn't
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
