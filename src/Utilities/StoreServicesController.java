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

/**
 * The {@code StoreServicesController} class provides static methods to manage {@code StoreService} objects
 * within the database. It offers functionalities to add new store services, retrieve all store services,
 * and get a service's name by its ID. This class uses JDBC to connect to the database and perform SQL queries.
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
    
    /**
     * Inserts a new store service into the database.
     *
     * @param storeService The {@code StoreService} object to be added.
     */
    
    
    public static void addNewStoreService(StoreService storeService) {
        String query = "INSERT INTO Store_Service (service_name, service_price) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, storeService.getServiceName());
            stmt.setFloat(2, storeService.getServicePrice());



            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new store has been created!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Retrieves the name of a store service based on its ID.
     *
     * @param serviceId The ID of the store service to find.
     * @return The name of the store service, or null if no service is found with the given ID.
     */
    

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
