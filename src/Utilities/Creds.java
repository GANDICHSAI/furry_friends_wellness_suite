/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

/**
 *
 * @author nosil
 */

/**
 * The {@code Creds} class stores the database credentials for the application. It provides
 * static methods to access the database URL, username, and password, which are used throughout
 * the application to connect to the database. This class ensures that database credentials
 * are centralized and managed from a single point in the application, making changes and
 * maintenance easier and more secure.
 */

public class Creds {
    private static final String URL = "jdbc:mysql://localhost:3306/FFWS";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mysql";
    
    
    /**
     * Returns the database URL.
     * 
     * @return A {@code String} representing the database URL.
     */
    
    public static String getURL() {
        return URL;
    }

    /**
     * Returns the database username.
     * 
     * @return A {@code String} representing the database username.
     */
    public static String getUSERNAME() {
        return USERNAME;
    }

    /**
     * Returns the database password.
     * 
     * @return A {@code String} representing the database password.
     */
    public static String getPASSWORD() {
        return PASSWORD;
    }
}
