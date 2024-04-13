package Models;

import java.util.Date;

public class Appointment {
    private int appointmentId;
    private int customerId;
    private String storeName;
    private int serviceId;
    private String serviceName;
    private String petName;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    private int petId;
    private Date date;
    private String status;
    private int rating;
    
    private int storeId;

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public Appointment() {
    }
        
    public Appointment(int appointmentId, int customerId, String storeName, int serviceId, int petId, Date date, String status, int rating) {
        this.appointmentId = appointmentId;
        this.customerId = customerId;
        this.storeName = storeName;
        this.serviceId = serviceId;
        this.petId = petId;
        this.date = date;
        this.status = status;
        this.rating = rating;
    }
    
    public Appointment(int appointmentId, int customerId, String storeName, int serviceId, int petId, Date date, String status) {
    this(appointmentId, customerId, storeName, serviceId, petId, date, status, -1); // -1 means rating is empty
}

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

