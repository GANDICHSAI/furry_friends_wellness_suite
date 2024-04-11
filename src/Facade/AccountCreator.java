/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Utilities.EmailSender;
import javax.mail.MessagingException;

/**
 *
 * @author hanee
 */
public class AccountCreator {
    private Account cim;
    private Account storeManager;
    private Account systemAdministrator;

    public AccountCreator() {
        this.cim = new CIM();
        this.storeManager = new StoreManager("");
        this.systemAdministrator = new SystemAdministrator();
    }
    
    public void createCIMAccount(String email, String password, String name) {
        cim.createAccount(email, password, name);
        
        String body = "Hello " + name +",\n\nYour CIM account has been created.\n\n";
        body += "Email: " + email + "\n";
        body += "Password: " + password + "\n\n";
        body += "We look forward to working with you!";
        
        try {
             EmailSender.sendEmail(email, "Client Information Manager Account Created!", body );
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

    public void createStoreManagerAccount(String email, String password, String name, String storeName) {
        storeManager = new StoreManager(storeName);
        storeManager.createAccount(email, password, name);
        
         String body = "Hello " + name +",\n\nYour Store manager account has been created.\n\n";
        body += "Email: " + email + "\n";
        body += "Password: " + password + "\n\n";
        body += "We look forward to working with you at " + storeName + "!";
        
        try {
             EmailSender.sendEmail(email, "Store Manager Account Created!", body );
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public void createSystemAdminAccount(String email, String password, String name) {
        systemAdministrator.createAccount(email, password, name);
        
         String body = "Hello " + name +",\n\nYour system admin account has been created.\n\n";
        body += "Email: " + email + "\n";
        body += "Password: " + password + "\n\n";
        body += "We look forward to working with you!";
        
        try {
             EmailSender.sendEmail(email, "System Admin Account Created!", body );
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
