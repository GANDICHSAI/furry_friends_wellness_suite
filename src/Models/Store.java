package Models;

public class Store {
    private int storeId;
    private String storeName;
    private String postalCode;

//    public Store(int storeId, String storeName, String postalCode) {
//        this.storeId = storeId;
//        this.storeName = storeName;
//        this.postalCode = postalCode;
//    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

