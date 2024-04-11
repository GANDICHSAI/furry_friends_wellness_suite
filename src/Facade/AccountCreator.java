/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

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
    }

    public void createStoreManagerAccount(String email, String password, String name, String storeName) {
        storeManager = new StoreManager(storeName);
        storeManager.createAccount(email, password, name);
    }

    public void createSystemAdminAccount(String email, String password, String name) {
        systemAdministrator.createAccount(email, password, name);
    }
}
