/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author chait
 *
 * The SystemAdmin class represents a system administrator, which is a type of administrator.
 * It inherits from the Admin class.
 */
public class SystemAdmin extends Admin {
    private int adminID;
    private String adminName;

    /**
     * Constructs a new SystemAdmin instance with the specified details.
     *
     * @param adminID The ID of the system administrator.
     * @param adminName The name of the system administrator.
     * @param email The email of the system administrator.
     * @param password The password of the system administrator.
     */
    public SystemAdmin(int adminID, String adminName, String email, String password) {
        super(email, password);
        this.adminID = adminID;
        this.adminName = adminName;
    }

    /**
     * Constructs a new SystemAdmin instance.
     * The email and password are set to empty strings.
     */
    public SystemAdmin() {
        super("", "");
    }

    /**
     * Gets the ID of the system administrator.
     *
     * @return The system administrator ID.
     */
    public int getAdminID() {
        return adminID;
    }

    /**
     * Sets the ID of the system administrator.
     *
     * @param adminID The system administrator ID to set.
     */
    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    /**
     * Gets the name of the system administrator.
     *
     * @return The system administrator name.
     */
    public String getAdminName() {
        return adminName;
    }
    /**
     * Sets the name of the system administrator.
     *
     * @param adminName The system administrator name to set.
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * Gets the email of the system administrator.
     *
     * @return The system administrator email.
     */
    public String getAdminEmail() {
        return getEmail();
    }

    /**
     * Sets the email of the system administrator.
     *
     * @param email The system administrator email to set.
     */
    public void setAdminEmail(String email) {
        setEmail(email);
    }

    /**
     * Gets the password of the system administrator.
     *
     * @return The system administrator password.
     */
    public String getAdminPassword() {
        return getPassword();
    }

    /**
     * Sets the password of the system administrator.
     *
     * @param password The system administrator password to set.
     */
    public void setAdminPassword(String password) {
        setPassword(password);
    }
}
