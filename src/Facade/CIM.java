/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Models.ClientInformationManager;
import Utilities.SystemAdminController;

/**
 *
 * @author hanee
 */
public class CIM implements Account {
     @Override
    public void createAccount(String email, String password, String name) {
        // Implementation to create a CIM account
        
         ClientInformationManager cim = new ClientInformationManager();
        
        cim.setCIMName(name);
        cim.setCIMEmail(email);
        cim.setCIMPassword(password);
        
        SystemAdminController.addCIM(cim);
    }
}
