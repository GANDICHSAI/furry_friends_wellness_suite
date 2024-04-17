/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;
import java.sql.*;
import java.util.ArrayList;
import Models.Store;
import Models.SystemAdmin;


/**
 *
 * @author nosil
 */
public class StoreController {


    /**
     * Searches for stores by the provided postal code and returns a list of stores that match.
     *
     * @param postalCode The postal code to search for.
     * @return A list of {@code Store} objects that match the postal code.
     */
    public ArrayList<Store> searchByPostalCode(String postalCode) {
    /**
     * Searches for stores by the provided postal code.
     * @param postalCode the postal code to search for.
     * @return a list of stores that match the postal code.
     */
   
        ArrayList<Store> stores = new ArrayList<>();
        String query = "SELECT * FROM Store WHERE store_postal_code = ?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD());
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, postalCode);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("store_id");
                String storeName = rs.getString("store_name");
                String storePostalCode = rs.getString("store_postal_code");
                // Assuming your Store model class has a constructor matching these arguments
                
                Store store = new Store();
                store.setStoreId(id);
                store.setPostalCode(storePostalCode);
                store.setStoreName(storeName);
                stores.add(store);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stores;
    }
    
    /**
     * Inserts a new store into the database.
     *
     * @param store The {@code Store} object to be added.
     */
    
    public static void addNewStore(Store store) {
        String query = "INSERT INTO Store (store_name, store_postal_code) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

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

    /**
     * Retrieves all stores from the database.
     *
     * @return An ArrayList of {@code Store} objects, each representing a store.
     */
    public static ArrayList<Store> getAllStores() {
        ArrayList<Store> stores = new ArrayList<>();
        String query = "SELECT * FROM Store";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD());
             PreparedStatement stmt = conn.prepareStatement(query)) {
             
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Store store = new Store();
                store.setStoreId(rs.getInt("store_id"));
                store.setStoreName(rs.getString("store_name"));
                store.setPostalCode(rs.getString("store_postal_code"));
                stores.add(store);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stores;
    }
    
    
    /**
     * Retrieves the name of a store based on its ID.
     *
     * @param storeId The ID of the store to find.
     * @return The name of the store, or null if no store is found.
     */
    
    public static String getStoreNameById(int storeId) {
        String storeName = null;
        String query = "SELECT store_name FROM Store WHERE store_id = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD());
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, storeId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                storeName = rs.getString("store_name");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return storeName;
    }
    
    /**
     * Retrieves the ID of a store based on its name.
     *
     * @param storeName The name of the store to find.
     * @return The ID of the store, or 0 if no store is found.
     */
    
    
    public static int getStoreIDByName(String storeName) {
        int storeId = 0;
        String query = "SELECT store_id FROM Store WHERE store_name = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD());
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, storeName);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                storeId = rs.getInt("store_id");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return storeId;
    }
}



