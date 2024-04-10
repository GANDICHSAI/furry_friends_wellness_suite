package Models;

// Pet.java
public class Pet {
    private int petId;
    private int customerId;
    private String petName;
    private int age;
    private String color;
    private String gender;
    private float weight;
    private String type;
    
    public Pet() {
    }

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

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
