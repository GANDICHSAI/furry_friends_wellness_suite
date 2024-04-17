/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author chait
 * The ClientInformationManager class represents a client information manager, which is a type of business customer role.
 * It inherits from the Admin class.
 */
public class ClientInformationManager extends Admin {
    
    private int CIMID;
    
    private String CIMName;
    /**
     * Constructs a new ClientInformationManager instance with the specified details.
     *
     * @param CIMID The ID of the client information manager.
     * @param CIMName The name of the client information manager.
     * @param email The email of the client information manager.
     * @param password The password of the client information manager.
     */
    public ClientInformationManager(int CIMID, String CIMName, String email, String password) {
        super(email, password);
        this.CIMID = CIMID;
        this.CIMName = CIMName;
    }
    /**
     * Constructs a new ClientInformationManager instance.
     * The email and password are set to empty strings.
     */
    public ClientInformationManager() {
        super("", "");
    }
    /**
     * Gets the ID of the client information manager.
     *
     * @return The client information manager ID.
     */
    public int getCIMID() {
        return CIMID;
    }
    /**
     * Sets the ID of the client information manager.
     *
     * @param CIMID The client information manager ID to set.
     */
    public void setCIMID(int CIMID) {
        this.CIMID = CIMID;
    }
    /**
     * Gets the name of the client information manager.
     *
     * @return The client information manager name.
     */
    public String getCIMName() {
        return CIMName;
    }

    /**
     * Sets the name of the client information manager.
     *
     * @param CIMName The client information manager name to set.
     */
    public void setCIMName(String CIMName) {
        this.CIMName = CIMName;
    }
    /**
     * Gets the email of the client information manager.
     *
     * @return The client information manager email.
     */
    public String getCIMEmail() {
        return getEmail();
    }

    /**
     * Sets the email of the client information manager.
     *
     * @param email The client information manager email to set.
     */
    public void setCIMEmail(String email) {
        setEmail(email);
    }
    /**
     * Gets the password of the client information manager.
     *
     * @return The client information manager password.
     */
    public String getCIMPassword() {
        return getPassword();
    }
    /**
     * Sets the password of the client information manager.
     *
     * @param password The client information manager password to set.
     */
    public void setCIMPassword(String password) {
        setPassword(password);
    }
}
