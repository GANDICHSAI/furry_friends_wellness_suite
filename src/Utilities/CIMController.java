package Utilities;

import Models.ClientInformationManager;
import Models.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chait
 */
public class CIMController {
    
    public static ArrayList<ClientInformationManager> getAllCIM() {
//        return list of users from db
        ArrayList<ClientInformationManager> cims = new ArrayList<>();

        String query = "SELECT * FROM Client_Information_Manager";
        try (Connection conn = DriverManager.getConnection(Creds.getURL(), Creds.getUSERNAME(), Creds.getPASSWORD())) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                ClientInformationManager cim = new ClientInformationManager();


                cim.setCIMEmail(rs.getString("email"));
                cim.setCIMPassword(rs.getString("password"));

                cim.setCIMID(rs.getInt("cim_id"));
                cims.add(cim);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cims;
    }
    
}
