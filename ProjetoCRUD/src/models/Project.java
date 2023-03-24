/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author aluno
 */
public class Project {
        private int idproject=0;
        private String description="";
        private String endereco="";
        private String price="";
        
        public Project(){}
        
        public Project(int idproject, String description, String endereco, String price){
            this.idproject=idproject;
            this.description=description;
            this.endereco=endereco;
            this.price=price;
        }

    public int getIdproject() {
        return idproject;
    }
    public void setIdproject(int idproject) {
        this.idproject = idproject;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Project{" + "idproject=" + idproject + ", description=" + description + ", endereco=" + endereco + ", price=" + price + '}';
    }
        
    
        
        
}
