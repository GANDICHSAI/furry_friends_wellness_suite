/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Models.StoreEmployee;
import Utilities.SystemAdminController;

/**
 * Implements the {@code Account} interface to provide account creation functionality
 * for Store Managers. This class handles the initialization and registration of store manager
 * account details within the system.
 */

/**
 *
 * @author hanee
 */
public class StoreManager implements Account {

    private final String storeName;
     /**
     * Constructs a {@code StoreManager} object associated with a specific store.
     * 
     * @param storeName The name of the store to which the store manager will be assigned.
     */
    
    public StoreManager(String storeName) {
        this.storeName = storeName;
    }

    /**
     * Creates a store manager account with specified email, password, and name, then registers
     * this account with the system's account controller. Additionally, it assigns a store ID
     * based on the store name associated with this manager.
     * 
     * @param email The email address to be associated with the store manager account.
     * @param password The password for the store manager account.
     * @param name The full name of the store manager.
     */
    @Override
    public void createAccount(String email, String password, String name) {
        // Implementation to create a CIM account
        
        StoreEmployee storeEmp = new StoreEmployee();

          storeEmp.setStoreEmployeeName(name);
        storeEmp.setStoreEmployeeEmail(email);
        storeEmp.setstoreEmployeePassword(password);
        
//        Retrieve the ID using the name 
        storeEmp.setStoreID(SystemAdminController.getStoreIdByName(storeName));
 
        SystemAdminController.addStoreEmployee(storeEmp);
    }
}
