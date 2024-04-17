/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author chait
 *
 * The StoreEmployee class represents an employee working in a store, which is a type of administrator.
 * It inherits from the Admin class.
 */
public class StoreEmployee extends Admin {
    
    private int storeEmpID;
    private int storeID;
    private String storeName;
    private String storeEmployeeName;

    /**
     * Constructs a new StoreEmployee instance with the specified details.
     *
     * @param storeEmpID The ID of the store employee.
     * @param storeID The ID of the store where the employee works.
     * @param storeName The name of the store.
     * @param storeEmployeeName The name of the store employee.
     * @param email The email of the store employee.
     * @param password The password of the store employee.
     */
    public StoreEmployee(int storeEmpID, int storeID, String storeName, String storeEmployeeName, String email, String password) {
        super(email, password);
        this.storeEmpID = storeEmpID;
        this.storeID = storeID;
        this.storeName = storeName;
        this.storeEmployeeName = storeEmployeeName;
    }

    /**
     * Constructs a new StoreEmployee instance.
     * The email and password are set to empty strings.
     */
    public StoreEmployee() {
        super("", "");
    }
    /**
     * Gets the ID of the store employee.
     *
     * @return The store employee ID.
     */
    public int getstoreEmpID() {
        return storeEmpID;
    }
    /**
     * Sets the ID of the store employee.
     *
     * @param storeEmpID The store employee ID to set.
     */
    public void setstoreEmpID(int storeEmpID) {
        this.storeEmpID = storeEmpID;
    }
    /**
     * Gets the ID of the store where the employee works.
     *
     * @return The store ID.
     */
    public int getStoreID() {
        return storeID;
    }
    /**
     * Sets the ID of the store where the employee works.
     *
     * @param storeID The store ID to set.
     */
    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }
    /**
     * Gets the name of the store employee.
     *
     * @return The store employee name.
     */
    public String getStoreEmployeeName() {
        return storeEmployeeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    /**
     * Sets the name of the store employee.
     *
     * @param storeEmployeeName The store employee name to set.
     */
    public void setStoreEmployeeName(String storeEmployeeName) {
        this.storeEmployeeName = storeEmployeeName;
    }
    /**
     * Gets the email of the store employee.
     *
     * @return The store employee email.
     */
    public String getStoreEmployeeEmail() {
        return getEmail();
    }

    /**
     * Sets the email of the store employee.
     *
     * @param email The store employee email to set.
     */
    public void setStoreEmployeeEmail(String email) {
        setEmail(email);
    }

    /**
     * Gets the password of the store employee.
     *
     * @return The store employee password.
     */
    public String getStoreEmployeePassword() {
        return getPassword();
    }

    /**
     * Sets the password of the store employee.
     *
     * @param password The store employee password to set.
     */
    public void setstoreEmployeePassword(String password) {
        setPassword(password);
    }
}
