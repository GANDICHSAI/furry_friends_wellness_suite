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
    
    private float servicePrice;

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

    public float getServicePrice() { 
        return servicePrice;
    }

    public void setServicePrice(float servicePrice) {
        this.servicePrice = servicePrice;
    }
    
//    public StoreService serviceSelection(int storeServiceID, String serviceName, String servicePrice) {
//        StoreService storeService = new StoreService();
//        storeService.setStoreServiceID(storeServiceID);
//        storeService.setServiceName(serviceName);
//        storeService.setServicePrice(servicePrice);
//        return storeService;
//    }

}
