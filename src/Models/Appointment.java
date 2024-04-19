package Models;

import java.util.Date;
/**
 * The Appointment class represents an appointment in the system.
 */
public class Appointment {
    private int appointmentId;
    private int customerId;
    private String storeName;
    private int serviceId;
    private String serviceName;
    private String petName;
    private int petId;
    private Date date;
    private String status;
    private int storeId;
    /**
     * Constructs a new Appointment instance.
     */
    public Appointment() {
    }
    /**
     * Constructs a new Appointment instance with specified details.
     *
     * @param appointmentId The ID of the appointment.
     * @param customerId The ID of the customer associated with the appointment.
     * @param storeName The name of the store where the appointment is scheduled.
     * @param serviceId The ID of the service for the appointment.
     * @param petId The ID of the pet associated with the appointment.
     * @param date The date and time of the appointment.
     * @param status The status of the appointment.
     */
    public Appointment(int appointmentId, int customerId, String storeName, int serviceId, int petId, Date date, String status) {
        this.appointmentId = appointmentId;
        this.customerId = customerId;
        this.storeName = storeName;
        this.serviceId = serviceId;
        this.petId = petId;
        this.date = date;
        this.status = status;
    }
    

    /**
     * Gets the appointment ID.
     *
     * @return The appointment ID.
     */
    public int getAppointmentId() {
        return appointmentId;
    }
    /**
     * Sets the appointment ID.
     *
     * @param appointmentId The appointment ID to set.
     */
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }
    /**
     * Gets the customer ID associated with the appointment.
     *
     * @return The customer ID.
     */
    public int getCustomerId() {
        return customerId;
    }
    /**
     * Sets the customer ID associated with the appointment.
     *
     * @param customerId The customer ID to set.
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    /**
     * Gets the name of the store where the appointment is scheduled.
     *
     * @return The store name.
     */
    public String getStoreName() {
        return storeName;
    }
    /**
     * Sets the name of the store where the appointment is scheduled.
     *
     * @param storeName The store name to set.
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    /**
     * Gets the ID of the service for the appointment.
     *
     * @return The service ID.
     */
    public int getServiceId() {
        return serviceId;
    }
    /**
     * Sets the ID of the service for the appointment.
     *
     * @param serviceId The service ID to set.
     */
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }
    /**
     * Gets the ID of the pet associated with the appointment.
     *
     * @return The pet ID.
     */
    public int getPetId() {
        return petId;
    }
    /**
     * Sets the ID of the pet associated with the appointment.
     *
     * @param petId The pet ID to set.
     */
    public void setPetId(int petId) {
        this.petId = petId;
    }
    /**
     * Gets the date and time of the appointment.
     *
     * @return The appointment date.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date and time of the appointment.
     *
     * @param date The appointment date to set.
     */
    public void setDate(Date date) {
        this.date = date;
    }
    /**
     * Gets the status of the appointment.
     *
     * @return The appointment status.
     */
    public String getStatus() {
        return status;
    }
    /**
     * Sets the status of the appointment.
     *
     * @param status The appointment status to set.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * Gets the name of the pet associated with the appointment.
     *
     * @return The pet name.
     */
    public String getPetName() {
        return petName;
    }
    /**
     * Sets the name of the pet associated with the appointment.
     *
     * @param petName The pet name to set.
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }
    /**
     * Gets the name of the service for the appointment.
     *
     * @return The service name.
     */
    public String getServiceName() {
        return serviceName;
    }
    /**
     * Sets the name of the service for the appointment.
     *
     * @param serviceName The service name to set.
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    /**
     * Gets the ID of the store where the appointment is scheduled.
     *
     * @return The store ID.
     */
    public int getStoreId() {
        return storeId;
    }
    /**
     * Sets the ID of the store where the appointment is scheduled.
     *
     * @param storeId The store ID to set.
     */
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
}

