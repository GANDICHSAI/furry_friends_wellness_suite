/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views.systemAdmin;

import Models.StoreEmployee;
import Models.SystemAdmin;
import Models.ClientInformationManager;
import Utilities.SystemAdminController;

/**
 *
 * @author hanee
 */
public class AccountFacade {
    
    private SystemAdmin sysAdmin;
    private ClientInformationManager cim;
    private StoreEmployee storeEmp;
    
    public AccountFacade(){ 
        this.storeEmp = new StoreEmployee();
        this.cim = new ClientInformationManager();
        this.sysAdmin = new SystemAdmin();
    }
    
    public void createAdminAccount(String email, String password, String name){
        sysAdmin.setAdminEmail(email);
        sysAdmin.setAdminName(name);
        sysAdmin.setAdminPassword(password);
        
        SystemAdminController.addSystemAdmin(sysAdmin);
    }
    
    public void createCIMAccount(String email, String password, String name){
        cim.setCIMName(name);
        cim.setCIMEmail(email);
        cim.setCIMPassword(password);
        
        SystemAdminController.addCIM(cim);
    }
    
    public void createSetStoreEmployeeAccount(String email, String password, String name, String storeName){
        storeEmp.setStoreEmployeeName(name);
        storeEmp.setstoreEmployeeEmail(email);
        storeEmp.setstoreEmployeePassword(password);
        
//        Retrieve the ID using the name 
        storeEmp.setStoreID(SystemAdminController.getStoreIdByName(storeName));
 
        SystemAdminController.addStoreEmployee(storeEmp);
    }
    
}
