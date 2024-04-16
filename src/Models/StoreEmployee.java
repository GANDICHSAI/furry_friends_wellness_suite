/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author chait
 */
public class StoreEmployee extends Admin {
    
    private int storeEmpID;
    private int storeID;
    private String storeName;
    private String storeEmployeeName;

    public StoreEmployee(int storeEmpID, int storeID, String storeName, String storeEmployeeName, String email, String password) {
        super(email, password);
        this.storeEmpID = storeEmpID;
        this.storeID = storeID;
        this.storeName = storeName;
        this.storeEmployeeName = storeEmployeeName;
    }

    public StoreEmployee() {
        super("", "");
    }

    public int getstoreEmpID() {
        return storeEmpID;
    }

    public void setstoreEmpID(int storeEmpID) {
        this.storeEmpID = storeEmpID;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public String getStoreEmployeeName() {
        return storeEmployeeName;
    }
    
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setStoreEmployeeName(String storeEmployeeName) {
        this.storeEmployeeName = storeEmployeeName;
    }

    public String getStoreEmployeeEmail() {
        return getEmail();
    }

    public void setStoreEmployeeEmail(String email) {
        setEmail(email);
    }

    public String getStoreEmployeePassword() {
        return getPassword();
    }

    public void setstoreEmployeePassword(String password) {
        setPassword(password);
    }
}
