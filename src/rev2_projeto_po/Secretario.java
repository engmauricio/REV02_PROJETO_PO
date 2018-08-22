/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rev2_projeto_po;

import java.io.Serializable;

/**
 *
 * @author EngMauricio
 */
public class Secretario extends Funcionarios implements Serializable, Autenticavel {
    
    public Secretario(){

}
    public Secretario(String nome, String cpf, String numCTB, String RG, Double salario){
        
        super(nome, cpf, numCTB, RG, salario);
}   
    @Override
      public String removido(){
        return "o secretario foi removido com sucesso.";
    }
    
    @Override
      public String adicionado(){
        return "o secretario foi adicionado com sucesso.";
    }  
       @Override
    public Boolean autentica(String login, String senha) {
        String Login = "subadmin";
        String Senha = "123";
        Boolean msg;
        if(Login.equals(login) && Senha.equals(senha)){
            msg = true;
        }else {
            msg = false;
        }
        return msg;
    }
}
