/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;
import java.sql.*;
import java.util.ArrayList;
import Models.Store;

        

/**
 *
 * @author nosil
 */
public class SelectStoreController {


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
                stores.add(new Store(id, storeName, storePostalCode));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stores;
    }
}

