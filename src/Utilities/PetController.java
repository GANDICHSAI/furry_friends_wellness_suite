/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Models.Pet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author yihan
 */
public class PetController {

    private PetController() {
    }

    public static int addPet(Pet pet) {
        //add to database
        int generatedId = -1;
        String query = "INSERT INTO Pet(customer_id,pet_name,age,color,gender,weight,type) VALUES(?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {

            PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, pet.getCustomerId());
            stmt.setString(2, pet.getPetName());
            stmt.setInt(3, pet.getAge());
            stmt.setString(4, pet.getColor());
            stmt.setString(5, pet.getGender());
            stmt.setFloat(6, pet.getWeight());
            stmt.setString(7, pet.getType());

            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                generatedId = rs.getInt(1); // get generatedId
                System.out.println("Generated Pet ID: " + generatedId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return generatedId;
    }

    public static ArrayList<Pet> getPetsByCustomerId(int customerId) {
        ArrayList<Pet> pets = new ArrayList<>();

        String query = "SELECT * FROM Pet WHERE customer_id = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, customerId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pet pet = new Pet();
                pet.setPetId(rs.getInt("pet_id"));
                pet.setCustomerId(rs.getInt("cust_id"));
                pet.setPetName(rs.getString("pet_name"));
                pet.setAge(rs.getInt("age"));
                pet.setColor(rs.getString("color"));
                pet.setGender(rs.getString("gender"));
                pet.setWeight(rs.getFloat("weight"));
                pet.setType(rs.getString("type"));

                pets.add(pet);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pets;
    }

    public static String getPetNameByPetId(int petId) {
        String petName = null;

        String query = "SELECT pet_name FROM Pet WHERE pet_id = ?";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, petId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                petName = rs.getString("pet_name");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return petName;
    }
}
