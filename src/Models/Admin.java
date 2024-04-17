/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 * @author yihan
 * The Admin class represents an administrator account in the system.
 */
public class Admin {
    private String email;
    private String password;

    /**
     * Creates a new instance of Admin.
     *
     * @param email The email address of the administrator.
     * @param password The password of the administrator.
     */
    public Admin(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Gets the email address of the administrator.
     *
     * @return The email address of the administrator.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the administrator.
     *
     * @param email The email address to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the password of the administrator.
     *
     * @return The password of the administrator.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the administrator.
     *
     * @param password The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
