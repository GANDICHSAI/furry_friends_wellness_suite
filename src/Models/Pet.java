package Models;

/**
 * The Pet class represents a pet in the system.
 */
public class Pet {
    private int petId;
    private int customerId;
    private String petName;
    private int age;
    private String color;
    private String gender;
    private float weight;
    private String type;

    /**
     * Constructs a new Pet instance.
     */
    public Pet() {
    }

    /**
     * Constructs a new Pet instance with the specified details.
     *
     * @param petId The ID of the pet.
     * @param customerId The ID of the customer who owns the pet.
     * @param petName The name of the pet.
     * @param age The age of the pet.
     * @param color The color of the pet.
     * @param gender The gender of the pet.
     * @param weight The weight of the pet.
     * @param type The type of the pet.
     */
    public Pet(int petId, int customerId, String petName, int age, String color, String gender, float weight, String type) {
        this.petId = petId;
        this.customerId = customerId;
        this.petName = petName;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.weight = weight;
        this.type = type;
    }

    /**
     * Gets the ID of the pet.
     *
     * @return The pet ID.
     */
    public int getPetId() {
        return petId;
    }

    /**
     * Sets the ID of the pet.
     *
     * @param petId The pet ID to set.
     */
    public void setPetId(int petId) {
        this.petId = petId;
    }

    /**
     * Gets the ID of the customer who owns the pet.
     *
     * @return The customer ID.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the ID of the customer who owns the pet.
     *
     * @param customerId The customer ID to set.
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the name of the pet.
     *
     * @return The pet name.
     */
    public String getPetName() {
        return petName;
    }


    /**
     * Sets the name of the pet.
     *
     * @param petName The pet name to set.
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }

    /**
     * Gets the age of the pet.
     *
     * @return The pet age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the pet.
     *
     * @param age The pet age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the color of the pet.
     *
     * @return The pet color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the pet.
     *
     * @param color The pet color to set.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the gender of the pet.
     *
     * @return The pet gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the pet.
     *
     * @param gender The pet gender to set.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the weight of the pet.
     *
     * @return The pet weight.
     */
    public float getWeight() {
        return weight;
    }


    /**
     * Sets the weight of the pet.
     *
     * @param weight The pet weight to set.
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Gets the type of the pet.
     *
     * @return The pet type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the pet.
     *
     * @param type The pet type to set.
     */
    public void setType(String type) {
        this.type = type;
    }
}
