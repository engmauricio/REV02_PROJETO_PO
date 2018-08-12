/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rev2_projeto_po;

/**
 *
 * @author EngMauricio
 */
public class Gerente extends Funcionarios {
    
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
    
}
