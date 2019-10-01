/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.sql.Connection; 
// conexão SQL para Java 
import java.sql.DriverManager; 
// driver de conexão SQL para Java 
import java.sql.SQLException; 
// classe para tratamento de exceções 
/**
 *
 * @author 692710
 */
public class ConnectionFactory {
    public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1/projetojava","root","");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }
}