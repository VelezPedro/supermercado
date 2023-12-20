/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermecardo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maxic
 */
public class CrearBaseDeDatos {
    
    public void CrearBD(){
        Connection connection = null;
       Statement statement = null;

        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión a la base de datos
            String url = "jdbc:mysql://localhost:3306/supermercado?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String usuario = "root";
            String contraseña = "root";
            connection = DriverManager.getConnection(url, usuario, contraseña);

            // Crear la base de datos
            statement = (Statement) connection.createStatement();
            String nombreBaseDeDatos = "Supermercado";
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS " + nombreBaseDeDatos);
            System.out.println("Base de datos creada con éxito.");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar recursos
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
