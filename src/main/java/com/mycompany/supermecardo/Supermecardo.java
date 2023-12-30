package com.mycompany.supermecardo;

import com.mycompany.supermecardo.index.Login;


public class Supermecardo {

    public static void main(String[] args) {
       CrearBaseDeDatos cbd = new CrearBaseDeDatos();
       Login login= new Login();
       login.setVisible(true);
       login.setLocationRelativeTo(null);
       cbd.crearAdmin();
    }
}
