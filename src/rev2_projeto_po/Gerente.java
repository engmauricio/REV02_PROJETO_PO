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
public class Gerente extends Funcionarios implements Serializable, Autenticavel{
    
    public Gerente(){
        
    }
    
    public Gerente(String nome, String cpf, String numCTB, String RG, Double salario) {
       super(nome, cpf, numCTB, RG, salario);
    }
    
    @Override
      public String removido(){
        return "o gerente foi removido com sucesso.";
    }
    
    @Override
    public String adicionado(){
        return "o gerente foi adicionado com sucesso.";
    }

    @Override
    public Boolean autentica(String login, String senha) {
        String Login = "admin";
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
