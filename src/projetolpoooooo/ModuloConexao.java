/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolpoooooo;

import java.sql.*;

/**
 *
 * @author vilal
 */
public class ModuloConexao {

    /**
     *
     * @return
     */
    public static Connection conector(){
        java.sql.Connection conexao;
        conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbProjetoLpoo";
        String user ="root";
        String password = "";
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e){
            return null;
        }
    }
}
