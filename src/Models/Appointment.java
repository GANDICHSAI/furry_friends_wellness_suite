package Models;

import java.util.Date;

public class Appointment {
    private int appointmentId;
    private int customerId;
    private String storeName;
    private String serviceType;
    private int petId;
    private Date date;
    private String status;
    private int rating;

    public Appointment(int appointmentId, int customerId, String storeName, String serviceType, int petId, Date date, String status, int rating) {
        this.appointmentId = appointmentId;
        this.customerId = customerId;
        this.storeName = storeName;
        this.serviceType = serviceType;
        this.petId = petId;
        this.date = date;
        this.status = status;
        this.rating = rating;
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

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
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

