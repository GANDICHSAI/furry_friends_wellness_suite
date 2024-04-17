package Models;

/**
 * The Store class represents a store in the system.
 */
public class Store {
    private int storeId;
    private String storeName;
    private String postalCode;

//    public Store(int storeId, String storeName, String postalCode) {
//        this.storeId = storeId;
//        this.storeName = storeName;
//        this.postalCode = postalCode;
//    }

    /**
     * Gets the ID of the store.
     *
     * @return The store ID.
     */
    public int getStoreId() {
        return storeId;
    }

    /**
     * Sets the ID of the store.
     *
     * @param storeId The store ID to set.
     */
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    /**
     * Gets the name of the store.
     *
     * @return The store name.
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the name of the store.
     *
     * @param storeName The store name to set.
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    /**
     * Gets the postal code of the store.
     *
     * @return The postal code.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code of the store.
     *
     * @param postalCode The postal code to set.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

