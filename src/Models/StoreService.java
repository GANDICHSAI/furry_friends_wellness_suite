/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author chait
 * The StoreService class represents a service offered by a store.
 */
public class StoreService {
    
    private int storeServiceID;
    
    private String serviceName;
    
    private float servicePrice;

    /**
     * Gets the ID of the store service.
     *
     * @return The store service ID.
     */
    public int getStoreServiceID() {
        return storeServiceID;
    }


    /**
     * Sets the ID of the store service.
     *
     * @param storeServiceID The store service ID to set.
     */
    public void setStoreServiceID(int storeServiceID) {
        this.storeServiceID = storeServiceID;
    }

    /**
     * Gets the name of the service.
     *
     * @return The service name.
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the name of the service.
     *
     * @param serviceName The service name to set.
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Gets the price of the service.
     *
     * @return The service price.
     */
    public float getServicePrice() { 
        return servicePrice;
    }

    /**
     * Sets the price of the service.
     *
     * @param servicePrice The service price to set.
     */
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
