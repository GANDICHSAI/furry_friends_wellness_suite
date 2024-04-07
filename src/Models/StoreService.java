/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author chait
 */
public class StoreService {
    
    private int storeServiceID;
    
    private String serviceName;
    
    private String serviceType;

    public int getStoreServiceID() {
        return storeServiceID;
    }

    public void setStoreServiceID(int storeServiceID) {
        this.storeServiceID = storeServiceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() { 
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    
}
