/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author chait
 */
public class SystemAdmin extends Admin {
    private int adminID;
    private String adminName;

    public SystemAdmin(int adminID, String adminName, String email, String password) {
        super(email, password);
        this.adminID = adminID;
        this.adminName = adminName;
    }

    public SystemAdmin() {
        super("", "");
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return getEmail();
    }

    public void setAdminEmail(String email) {
        setEmail(email);
    }

    public String getAdminPassword() {
        return getPassword();
    }

    public void setAdminPassword(String password) {
        setPassword(password);
    }
}
