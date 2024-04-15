/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Models.StoreService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;

/**
 *
 * @author chait
 */
public class StoreServicesController {

    /**
     * Privatized constructor so as to not allow object creation
     */
    private StoreServicesController() {
    }

    /**
     * Return lost of all users in database
     *
     * @see User
     * @return list of users
     */
    public static ArrayList<StoreService> getAllStoreServices() {
//        return list of users from db
        ArrayList<StoreService> storeServicesList = new ArrayList<>();

        String query = "SELECT * FROM Store_Service";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                StoreService storeServices = new StoreService();
                storeServices.setStoreServiceID(rs.getInt("store_serv_id"));
                storeServices.setServiceName(rs.getString("service_name"));

                storeServices.setServicePrice((float) rs.getDouble("service_price"));

                storeServicesList.add(storeServices);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return storeServicesList;
    }

    public static String getServiceNameById(int serviceId) {
        String serviceName = null;

        String query = "SELECT service_name FROM Store_Service WHERE store_serv_id = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, serviceId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                serviceName = rs.getString("service_name");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return serviceName;
    }

}
