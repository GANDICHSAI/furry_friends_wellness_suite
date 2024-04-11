/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author chait
 */
public class StoreEmployee {
    
    private int storeEmpID;
    private int storeID;
    private String storeName;
    private String storeEmployeeName;
    private String storeEmployeeEmail;
    private String storeEmployeePassword;

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

    public String getstoreEmployeeEmail() {
        return storeEmployeeEmail;
    }

    public void setstoreEmployeeEmail(String storeEmployeeEmail) {
        this.storeEmployeeEmail = storeEmployeeEmail;
    }

    public String getstoreEmployeePassword() {
        return storeEmployeePassword;
    }

    public void setstoreEmployeePassword(String storeEmployeePassword) {
        this.storeEmployeePassword = storeEmployeePassword;
    }
    
    
}
