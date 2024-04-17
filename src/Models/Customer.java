package Models;
/**
 * The Customer class represents a customer in the system.
 */
public class Customer {
    private int customerID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

//    public Customer(int customerID, String firstName, String lastName, String email, String password) {
//        this.customerID = customerID;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;lic Customer(int customerID, String firstName, String lastName, String email, String password) {
//        this.customerID = customerID;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.password = password;
//    }
//        this.password = password;
//    }
    /**
     * Gets the customer ID.
     *
     * @return The customer ID.
     */
    public int getCustomerID() {
        return customerID;
    }
    /**
     * Sets the customer ID.
     *
     * @param customerID The customer ID to set.
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    /**
     * Gets the first name of the customer.
     *
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Sets the first name of the customer.
     *
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Gets the last name of the customer.
     *
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Sets the last name of the customer.
     *
     * @param lastName The last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Gets the email address of the customer.
     *
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }
    /**
     * Sets the email address of the customer.
     *
     * @param email The email address to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the password of the customer.
     *
     * @return The password.
     */
    public String getPassword() {
        return password;
    }
    /**
     * Sets the password of the customer.
     *
     * @param password The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}

