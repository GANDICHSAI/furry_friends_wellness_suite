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

/**
 * Implements the {@code Account} interface to provide account creation functionality
 * specific to Client Information Managers (CIM). This class handles the initialization
 * and storage of CIM account details in the system.
 */
public class CIM implements Account {
    /**
     * Creates a Client Information Manager (CIM) account with the specified details and registers it
     * with the system's account controller.
     * 
     * @param email The email address to be associated with the CIM account.
     * @param password The password for the CIM account.
     * @param name The full name of the account holder.
     */
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
