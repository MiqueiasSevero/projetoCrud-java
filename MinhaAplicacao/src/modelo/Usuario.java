/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 692710
 */
public class Usuario {
    public long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    
    public int getId(){
        
        return (int) this.id;
    }
    public void  setId(int id){
    
        this.id =  id;
    }
    
    public String getCpf(){
       
        return this.cpf;
       
    }
    public void setCpf(String cpf){
        this.cpf = cpf;      
    }
    public String getNome(){
       
        return this.nome;
       
    }
    public void setNome(String nome){
        this.nome = nome;      
    }
    public String getEmail(){
       
        return this.email;
       
    }
    public void setEmail(String email ){
        this.email = email;      
    }
    public String getTelefone(){
       
        return this.telefone;
       
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;      
    }
    
}
