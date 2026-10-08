/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestor_escolar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author F37094
 */
public class Conexao {
    
    private static final String URL = "Jdbc:mysql://localhost:3306/gestor_escolar";

    private static final String USER = "root";

    private static final String PWD = "";

    public static Connection Ligacao() throws SQLException {

        try {

            Connection conn = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Conexão Estabelecida");
            return conn;

        } catch (SQLException e) {
            System.out.println("Error Connection");
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            System.out.println("Error Connection");
            e.printStackTrace();
            return null;
        }

    }
}
