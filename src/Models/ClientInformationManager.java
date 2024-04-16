/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author chait
 */
public class ClientInformationManager extends Admin {
    
    private int CIMID;
    
    private String CIMName;

    public ClientInformationManager(int CIMID, String CIMName, String email, String password) {
        super(email, password);
        this.CIMID = CIMID;
        this.CIMName = CIMName;
    }

    public ClientInformationManager() {
        super("", "");
    }

    public int getCIMID() {
        return CIMID;
    }

    public void setCIMID(int CIMID) {
        this.CIMID = CIMID;
    }

    public String getCIMName() {
        return CIMName;
    }

    public void setCIMName(String CIMName) {
        this.CIMName = CIMName;
    }

    public String getCIMEmail() {
        return getEmail();
    }

    public void setCIMEmail(String email) {
        setEmail(email);
    }

    public String getCIMPassword() {
        return getPassword();
    }

    public void setCIMPassword(String password) {
        setPassword(password);
    }
}
