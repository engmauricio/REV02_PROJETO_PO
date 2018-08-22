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
public class EmpServ extends Funcionarios implements Serializable{
    
     public EmpServ(){
        
    }
    
    public EmpServ(String nome, String cpf, String numCTB, String RG, Double salario) {
       super(nome, cpf, numCTB, RG, salario);
    }
    
    @Override
      public String removido(){
        return "o empregado de servicos gerais foi removido com sucesso.";
    }
    
    @Override
      public String adicionado(){
        return "o empregado de servicos gerais foi adicionado com sucesso.";
    }
      
}
