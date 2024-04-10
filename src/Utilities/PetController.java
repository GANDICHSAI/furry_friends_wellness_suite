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

    public static void addPet(Pet pet) {
        //add to database
        String query = "INSERT INTO Pet(cust_id,pet_name,age,color,gender,weight,type) VALUES(?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {

            PreparedStatement stmt = conn.prepareStatement(query);
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
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

}