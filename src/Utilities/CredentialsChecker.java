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
public class CredentialsChecker {

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
