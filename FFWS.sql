create database FFWS;

use FFWS;

-- DDL

CREATE TABLE Customer (
cust_id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(100),
last_name VARCHAR(100),
email VARCHAR(100),
password VARCHAR(100)
)AUTO_INCREMENT=1001;

CREATE TABLE Store (
store_id INT AUTO_INCREMENT PRIMARY KEY,
store_name VARCHAR(100),
store_postal_code VARCHAR(20)
)AUTO_INCREMENT=2001;

CREATE TABLE Store_Employee (
employee_id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
store_id INT,
email VARCHAR(100),
password VARCHAR(100),
FOREIGN KEY (store_id) REFERENCES Store(store_id)
)AUTO_INCREMENT=3001;

CREATE TABLE Pet (
pet_id INT AUTO_INCREMENT PRIMARY KEY,
customer_id INT,
pet_name VARCHAR(100),
age INT,
color VARCHAR(50),
gender VARCHAR(10),
weight FLOAT,
type VARCHAR(50),
FOREIGN KEY (customer_id) REFERENCES Customer(cust_id) ON DELETE CASCADE
)AUTO_INCREMENT=4001;

CREATE TABLE System_Admin (
admin_id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
email VARCHAR(100),
password VARCHAR(100)
)AUTO_INCREMENT=5001;

CREATE TABLE Client_Information_Manager (
cim_id INT AUTO_INCREMENT PRIMARY KEY ,
name VARCHAR(100),
email VARCHAR(100),
password VARCHAR(100)
)AUTO_INCREMENT=6001;

CREATE TABLE Store_Service (
store_serv_id INT AUTO_INCREMENT PRIMARY KEY,
service_name VARCHAR(100),
service_price decimal(10,2)
)AUTO_INCREMENT=7001;

CREATE TABLE Appointment (
app_id INT AUTO_INCREMENT PRIMARY KEY,
cust_id INT,
store_name VARCHAR(100),
service_id INT,
store_id INT,
pet_id INT,
date DATE,
status VARCHAR(20),
FOREIGN KEY (store_id) REFERENCES Store(store_id),
FOREIGN KEY (service_id) REFERENCES Store_Service(store_serv_id ),
FOREIGN KEY (cust_id) REFERENCES Customer(cust_id) ON DELETE CASCADE,
FOREIGN KEY (pet_id) REFERENCES Pet(pet_id)
)AUTO_INCREMENT=8001; 


























