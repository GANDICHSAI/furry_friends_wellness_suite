/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Utilities.EmailSender;
import javax.mail.MessagingException;
/**
 * The {@code AccountCreator} class facilitates the creation of various user accounts
 * including CIM (Client Information Manager), store manager, and system administrator accounts.
 * It automates the account creation process and sends an email to the user with account details.
 */

/**
 *
 * @author hanee
 */

/**
     * Constructs a new instance of {@code AccountCreator}.
     * Initializes three types of accounts: CIM, Store Manager, and System Administrator.
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
    
    /**
     * Creates a new CIM account with specified email, password, and name.
     * Sends an email to the user with the account details.
     *
     * @param email The email address for the account.
     * @param password The password for the account.
     * @param name The name of the account holder.
     * @throws MessagingException If there is a failure in sending the email.
     */
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

    /**
     * Creates a new store manager account with specified email, password, name, and store name.
     * Sends an email to the user with the account details.
     *
     * @param email The email address for the account.
     * @param password The password for the account.
     * @param name The name of the account holder.
     * @param storeName The name of the store the manager will manage.
     * @throws MessagingException If there is a failure in sending the email.
     */
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
/**
     * Creates a new system administrator account with specified email, password, and name.
     * Sends an email to the user with the account details.
     *
     * @param email The email address for the account.
     * @param password The password for the account.
     * @param name The name of the account holder.
     * @throws MessagingException If there is a failure in sending the email.
     */
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
