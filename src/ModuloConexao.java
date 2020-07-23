/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolpoooooo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vilal
 */
public class ModuloConexao {

    /*private static Connection conexao;

    public static Connection getConexao() {
        if (conexao == null){
            try {
                conexao = DriverManager.getConnection("jdbc:mysql://192.168.2.3:3308/compraonline" + "?serverTimezone=UTC&autoReconnect=true&useSLL=false", "root", "root");
            } catch (SQLException ex) {
                System.out.println("Erro ao conectar no BD.");
                Logger.getLogger(ModuloConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        return conexao;
    }*/
        public Connection conectar(){
            try{
            
                return DriverManager.getConnection("jdbc:mysql://localhost:3308/?user=root","root","");
            }catch (SQLException e){
                throw new RuntimeException();
            }
        
        }
    
    
    
       
    
}