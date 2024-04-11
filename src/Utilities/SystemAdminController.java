/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Models.ClientInformationManager;
import Models.Customer;
import Models.Store;
import Models.StoreEmployee;
import Models.SystemAdmin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hanee
 */
public class SystemAdminController {

    private static final String URL = "jdbc:mysql://localhost:3306/FFWS";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mysql";

    /**
     * Privatized constructor so as to not allow object creation
     */
    private SystemAdminController() {
    }

//     Store CRUD
    public static ArrayList<String> getAllStoreNames() {
        ArrayList<String> storeNames = new ArrayList<>();

        String query = "SELECT store_name FROM Store"; // Ensure your table name is correct
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String storeName = rs.getString("store_name");
                storeNames.add(storeName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return storeNames;
    }

    public static ArrayList<Store> getAllStores() {
        ArrayList<Store> allStores = new ArrayList<>();

        String query = "SELECT * FROM Store"; // Ensure your table name is correct
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Store store = new Store();
                store.setStoreId(rs.getInt("store_id"));
                store.setStoreName(rs.getString("store_name"));
                store.setPostalCode(rs.getString("store_postal_code"));

                // Add this store to the list of allStores
                allStores.add(store);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return allStores;
    }

    public static int getStoreIdByName(String storeName) {
        int storeId = -1; // Default value if not found

        String query = "SELECT store_id FROM Store WHERE store_name = ?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, storeName);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                storeId = rs.getInt("store_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return storeId;
    }

    public static void addStore(Store store) {
        String query = "INSERT INTO Store (store_name, store_postal_code) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, store.getStoreName());
            stmt.setString(2, store.getPostalCode());

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new store has been created!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void editStore(Store oldStore, Store newStore) {
        String query = "UPDATE Store SET store_name=?, store_postal_code=? WHERE store_id=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, newStore.getStoreName());
            stmt.setString(2, newStore.getPostalCode());
            stmt.setInt(3, oldStore.getStoreId());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Store updated successfully.");
            } else {
                System.out.println("Failed to update Store Manager.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteStore(Store store) {
        String query = "delete from Store where store_id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, store.getStoreId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    CIM CRUD
    public static void addCIM(ClientInformationManager cim) {
        String query = "INSERT INTO Client_Information_Manager (name, email, password) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, cim.getCIMName());
            stmt.setString(2, cim.getCIMEmail());
            stmt.setString(3, cim.getCIMPassword());

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new client information manager has been created!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<ClientInformationManager> getAllCIMs() {
        ArrayList<ClientInformationManager> cims = new ArrayList<>();

        String query = "SELECT * FROM Client_Information_Manager";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                ClientInformationManager cim = new ClientInformationManager();
                cim.setCIMID(rs.getInt("cim_id"));
                cim.setCIMName(rs.getString("name"));
                cim.setCIMEmail(rs.getString("email"));
                cim.setCIMPassword(rs.getString("password"));

                cims.add(cim);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cims;
    }

    public static void editClientInformationManager(ClientInformationManager oldCIM, ClientInformationManager newCIM) {
        String query = "UPDATE Client_Information_Manager SET name=?, email=?, password=? WHERE cim_id=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, newCIM.getCIMName());
            stmt.setString(2, newCIM.getCIMEmail());
            stmt.setString(3, newCIM.getCIMPassword());
            stmt.setInt(4, oldCIM.getCIMID());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Client Information Manager updated successfully.");
            } else {
                System.out.println("Failed to update Client Information Manager.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteCIM(ClientInformationManager cim) {
        String query = "delete from Client_Information_Manager where cim_id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, cim.getCIMID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//     System Admin CRUD
    public static void addSystemAdmin(SystemAdmin sysAdmin) {
        String query = "INSERT INTO System_Admin (name, email, password) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, sysAdmin.getAdminName());
            stmt.setString(2, sysAdmin.getAdminEmail());
            stmt.setString(3, sysAdmin.getAdminPassword());

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new system admin has been created!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

// Store Employee CRUD
    public static void addStoreEmployee(StoreEmployee storeEmp) {
        String query = "INSERT INTO Store_Employee (employee_id, name, store_id, email, password) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, storeEmp.getstoreEmpID());
            pstmt.setString(2, storeEmp.getStoreEmployeeName());
            pstmt.setInt(3, storeEmp.getStoreID());
            pstmt.setString(4, storeEmp.getstoreEmployeeEmail());
            pstmt.setString(5, storeEmp.getstoreEmployeePassword());

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new store employee was added successfully.");
            } else {
                System.out.println("Failed to add a new store employee.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
