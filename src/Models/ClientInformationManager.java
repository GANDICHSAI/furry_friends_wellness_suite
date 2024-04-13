/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author chait
 */
public class ClientInformationManager implements Authenticatable {
    
    private int CIMID;
    
    private String CIMName;
    
    private String CIMEmail;
    
    private String CIMPassword;

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
        return CIMEmail;
    }

    public void setCIMEmail(String CIMEmail) {
        this.CIMEmail = CIMEmail;
    }

    public String getCIMPassword() {
        return CIMPassword;
    }

    public void setCIMPassword(String CIMPassword) {
        this.CIMPassword = CIMPassword;
    }
    
    @Override
    public String getEmail() {
        return CIMEmail;
    }

    @Override
    public String getPassword() {
        return CIMPassword;
    }
}
