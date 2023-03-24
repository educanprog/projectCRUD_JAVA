/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistence;

import models.Project;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public interface IProjectDAO {

    void createProject(Project projeto) throws Exception;

    ArrayList<Project> listaDeProjeto() throws Exception;
}
