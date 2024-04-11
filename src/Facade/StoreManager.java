/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Models.StoreEmployee;
import Utilities.SystemAdminController;

/**
 *
 * @author hanee
 */
public class StoreManager implements Account {

    private final String storeName;
    
    public StoreManager(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public void createAccount(String email, String password, String name) {
        // Implementation to create a CIM account
        
        StoreEmployee storeEmp = new StoreEmployee();

          storeEmp.setStoreEmployeeName(name);
        storeEmp.setstoreEmployeeEmail(email);
        storeEmp.setstoreEmployeePassword(password);
        
//        Retrieve the ID using the name 
        storeEmp.setStoreID(SystemAdminController.getStoreIdByName(storeName));
 
        SystemAdminController.addStoreEmployee(storeEmp);
    }
}
