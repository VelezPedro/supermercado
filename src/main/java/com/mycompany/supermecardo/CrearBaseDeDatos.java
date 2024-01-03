package com.mycompany.supermecardo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearBaseDeDatos {

    public void crearBD() {
        Connection connection = null;
        Statement statement = null;

        try {
            // Cargar el controlador JDBC
            Class.forName("org.sqlite.JDBC");

            // Establecer la conexión a la base de datos
            String url = "jdbc:sqlite:supermercado.db";
            connection = DriverManager.getConnection(url);

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

    public void crearAdmin() {
        Connection connection = null;
        Statement statement = null;

        try {
            // Cargar el controlador JDBC
            Class.forName("org.sqlite.JDBC");

            // Establecer la conexión a la base de datos
            String url = "jdbc:sqlite:supermercado.db";
            connection = DriverManager.getConnection(url);
            if (!existeAdmin(connection)) {
                String insertDataSQL = "INSERT INTO usuario (ID, NOMBREUSUARIO, PASSWORD, ROL) VALUES ('1', 'admin', 'admin', 'admin');";
                statement = (Statement) connection.createStatement();
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

    private static boolean existeAdmin(Connection conexion) throws SQLException {
        String sql = "SELECT COUNT(*) FROM usuario WHERE id = 1";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0;
                }
            }
        }
        return false;
    }
}
