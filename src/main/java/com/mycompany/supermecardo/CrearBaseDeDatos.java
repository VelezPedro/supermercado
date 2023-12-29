package com.mycompany.supermecardo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearBaseDeDatos {

    public void CrearBD() {
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

            if (!baseDeDatosExiste()) {
                // Crear la base de datos
                statement = (Statement) connection.createStatement();
                String nombreBaseDeDatos = "Supermercado";
                statement.executeUpdate("CREATE DATABASE IF NOT EXISTS " + nombreBaseDeDatos);
                System.out.println("Base de datos creada con éxito.");

                String insertDataSQL = "INSERT INTO `supermercado`.`usuario` (`ID`, `NOMBREUSUARIO`, `PASSWORD`, `ROL`) VALUES ('1', 'admin', 'password', 'admin');";
                statement.executeUpdate(insertDataSQL);
                System.out.println("Datos insertados exitosamente.");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar recursos
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean baseDeDatosExiste() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/supermercado?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String usuario = "root";
            String contraseña = "root";
            connection = DriverManager.getConnection(url, usuario, contraseña);
            // Comprobar si la base de datos existe
            DatabaseMetaData metadata = connection.getMetaData();
            ResultSet resultSet = metadata.getCatalogs();
            while (resultSet.next()) {
                String databaseName = resultSet.getString(1);
                if ("supermercado".equalsIgnoreCase(databaseName)) {
                    return true; // La base de datos existe
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false; // La base de datos no existe
    }

}
