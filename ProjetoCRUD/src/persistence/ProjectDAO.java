/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import models.Project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tools.ConnectionDB;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author aluno
 */
public class ProjectDAO implements IProjectDAO {
    
    private Connection connection = null;

    public ProjectDAO() throws Exception {
        connection = ConnectionDB.getConnection();
    }

    @Override
    public void createProject(Project projeto) throws Exception {
        try {
            String sql = "insert into project  (description, endereco, price ) values (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            // Parameters iniciar os elementos
            preparedStatement.setString(1, projeto.getDescription());
            preparedStatement.setString(2, projeto.getEndereco());
            preparedStatement.setString(3, projeto.getPrice());
            preparedStatement.executeUpdate();
        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro: " + erro.getMessage());
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList<Project> listaDeProjeto() throws Exception {
        ArrayList<Project> listaDosProjetos = new ArrayList<Project>();
        String sql = "select * from project";
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                Project projeto = new Project();
                projeto.setIdproject(rs.getInt("idproject"));
                projeto.setDescription(rs.getString("description"));
                projeto.setEndereco(rs.getString("endereco"));
                projeto.setPrice(rs.getString("price"));
                listaDosProjetos.add(projeto);
            }   
    }
         catch (SQLException error) {
            error.printStackTrace();
        }
        return listaDosProjetos;
    }
}

