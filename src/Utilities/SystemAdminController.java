/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Models.ClientInformationManager;
import Models.Store;
import Models.StoreEmployee;
import Models.StoreService;
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
    /**
     * Privatized constructor so as to not allow object creation
     */
    private SystemAdminController() {
    }

//     Store CRUD
    public static ArrayList<String> getAllStoreNames() {
        ArrayList<String> storeNames = new ArrayList<>();

        String query = "SELECT store_name FROM Store"; // Ensure your table name is correct
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

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
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

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
    
    public static ArrayList<StoreService> getAllStoreServices() {
        ArrayList<StoreService> storeServiceList= new ArrayList<>();

        String query = "SELECT * FROM Store_Service";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                ClientInformationManager cim = new ClientInformationManager();
                StoreService ss  = new StoreService();
                ss.setStoreServiceID(rs.getInt("store_serv_id"));
                ss.setServiceName(rs.getString("service_name"));
                ss.setServicePrice(rs.getFloat("service_price"));


                storeServiceList.add(ss);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return storeServiceList;
    }
    
    public static ArrayList<SystemAdmin> getAllSystemAdmins() {
        ArrayList<SystemAdmin> systemAdminList= new ArrayList<>();

        String query = "SELECT * FROM System_Admin";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                
                SystemAdmin sa = new SystemAdmin();
                sa.setAdminID(rs.getInt("admin_id"));
                sa.setAdminName(rs.getString("name"));
                sa.setAdminEmail(rs.getString("email"));
                sa.setAdminPassword(rs.getString("password"));

                systemAdminList.add(sa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return systemAdminList;
    }
    
    public static ArrayList<SystemAdmin> getDefaultSystemAdmins() {
        ArrayList<SystemAdmin> defaultSystemAdminList= new ArrayList<>();

        String query = "SELECT * FROM System_Admin";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                
                SystemAdmin dsa = new SystemAdmin();

                dsa.setAdminEmail(rs.getString("email"));
                dsa.setAdminPassword(rs.getString("password"));

                defaultSystemAdminList.add(dsa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return defaultSystemAdminList;
    }

    public static int getStoreIdByName(String storeName) {
        int storeId = -1; // Default value if not found

        String query = "SELECT store_id FROM Store WHERE store_name = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

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
    
    public static void addStoreType(StoreService storeService) {
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
    
    public static void addNewSystemAdmin(SystemAdmin systemAdmin) {
        String query = "INSERT INTO System_Admin (name, email, password) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, systemAdmin.getAdminName());
            stmt.setString(2, systemAdmin.getAdminEmail());
            stmt.setString(3, systemAdmin.getAdminPassword());


            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new store has been created!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void addNewStoreEmployee(SystemAdmin systemAdmin) {
        String query = "INSERT INTO Store_Employee (name, email, password) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, systemAdmin.getAdminName());
            stmt.setString(2, systemAdmin.getAdminEmail());
            stmt.setString(3, systemAdmin.getAdminPassword());


            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new store has been created!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void addDefaultAdminCreds(SystemAdmin systemadmin) {
        String query = "INSERT INTO DEFAULT_SYS_ADM_CREDS (sys_email,sys_password) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, systemadmin.getAdminEmail());
            stmt.setString(2, systemadmin.getAdminPassword());

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new default admin creds has been created!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void editStore(Store oldStore, Store newStore) {
        String query = "UPDATE Store SET store_name=?, store_postal_code=? WHERE store_id=?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, newStore.getStoreName());
            stmt.setString(2, newStore.getPostalCode());
            stmt.setInt(3, oldStore.getStoreId());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Store updated successfully.");
            } else {
                System.out.println("Failed to update Store.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteStore(Store store) {
        String query = "delete from Store where store_id = ?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
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

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {
            
            
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
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

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
    
    public static ArrayList<StoreEmployee> getStoreEmployees() {
        ArrayList<StoreEmployee> storeEmployees = new ArrayList<>();

        String query = "select Store_Employee.employee_id,Store_Employee.name, Store_Employee.store_id, Store_Employee.email, "
                + "Store_Employee.password from Store_Employee join Store where Store_Employee.store_id = Store.store_id;";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                
                StoreEmployee se = new StoreEmployee();
                se.setstoreEmpID(rs.getInt("Store_Employee.employee_id"));
                se.setStoreID(rs.getInt("Store_Employee.store_id"));
                se.setStoreEmployeeName(rs.getString("Store_Employee.name"));
                se.setStoreEmployeeEmail(rs.getString("Store_Employee.email"));
                se.setstoreEmployeePassword(rs.getString("Store_Employee.password"));


                storeEmployees.add(se);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return storeEmployees;
    }
    
    public static void editStoreEmployee(StoreEmployee oldSE, StoreEmployee newSE) {
        String query = "UPDATE Store_Employee SET name=?, store_id = ?, email=?, password=? WHERE employee_id=?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, newSE.getStoreEmployeeName());
            stmt.setInt(2, newSE.getStoreID());
            stmt.setString(3, newSE.getStoreEmployeeEmail());

            stmt.setString(4, newSE.getStoreEmployeePassword());
            
            
            stmt.setInt(5, oldSE.getstoreEmpID());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Store Employee updated successfully.");
            } else {
                System.out.println("Failed to update Store Employee.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void editClientInformationManager(ClientInformationManager oldCIM, ClientInformationManager newCIM) {
        String query = "UPDATE Client_Information_Manager SET name=?, email=?, password=? WHERE cim_id=?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

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
    
    public static void editStoreServices(StoreService oldSS, StoreService newSS) {
        String query = "UPDATE Store_Service SET service_name=?, service_price=? WHERE store_serv_id=?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, newSS.getServiceName());
            stmt.setDouble(2, newSS.getServicePrice());

            stmt.setInt(3, oldSS.getStoreServiceID());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Store Service Types successfully.");
            } else {
                System.out.println("Failed to update Store Service Types.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void editSystemAdmin(SystemAdmin oldSA, SystemAdmin newSA) {
        String query = "UPDATE System_Admin SET name=?, email=?, password=? WHERE admin_id=?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, newSA.getAdminName());
            stmt.setString(2, newSA.getAdminEmail());
            stmt.setString(3, newSA.getAdminPassword());


            stmt.setInt(4, oldSA.getAdminID());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("System Admin updated successfully.");
            } else {
                System.out.println("Failed to update System Admin.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteCIM(ClientInformationManager cim) {
        String query = "delete from Client_Information_Manager where cim_id = ?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, cim.getCIMID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
     public static void deleteSS(StoreService ss) {
        String query = "delete from Store_Service where store_serv_id = ?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, ss.getStoreServiceID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public static void deleteSA(SystemAdmin sa) {
        String query = "delete from System_Admin where admin_id = ?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, sa.getAdminID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void deleteSE(StoreEmployee se) {
        String query = "delete from Store_Employee where employee_id = ?";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, se.getstoreEmpID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//     System Admin CRUD
    public static void addSystemAdmin(SystemAdmin sysAdmin) {
        String query = "INSERT INTO System_Admin (name, email, password) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement stmt = conn.prepareStatement(query)) {

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

        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD()); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, storeEmp.getstoreEmpID());
            pstmt.setString(2, storeEmp.getStoreEmployeeName());
            pstmt.setInt(3, storeEmp.getStoreID());
            pstmt.setString(4, storeEmp.getStoreEmployeeEmail());
            pstmt.setString(5, storeEmp.getStoreEmployeePassword());

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
