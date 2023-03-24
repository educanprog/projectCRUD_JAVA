/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author aluno
 */
public class ConnectionDB {
    
    private static Connection connection = null;

    private ConnectionDB(){}
    public static Connection getConnection() throws Exception{
        try
        {
            if(connection == null){
                String driver = "org.postgresql.Driver";
                String url = "jdbc:postgresql://localhost:5432/Project_DB";
                String user = "postgres";
                String password = "aluno"; 
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            }               
        }
        catch(ClassNotFoundException erro){
            //Erro de não encontrar o drive do banco no projeto
            throw new Exception("Drive: "+erro.getMessage());
        }
        catch(SQLException erro){
            //Erro no banco de dados: usuario, senha ou banco de dados 
            throw new Exception("Banco: " + erro.getMessage());
        }
        return connection;
    }
}