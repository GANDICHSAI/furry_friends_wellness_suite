/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Utilities.SystemAdminController;
import Models.SystemAdmin;

/**
 *
 * @author hanee
 */
public class SystemAdministrator implements Account  {
    @Override
    public void createAccount(String email, String password, String name) {
        // Implementation to create a SystemADministrator account
        
        SystemAdmin sysAdmin = new SystemAdmin();
        
         sysAdmin.setAdminEmail(email);
        sysAdmin.setAdminName(name);
        sysAdmin.setAdminPassword(password);
        
        SystemAdminController.addSystemAdmin(sysAdmin);
        
    }
}
