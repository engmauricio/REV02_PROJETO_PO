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
public class Secretario extends Funcionarios {
    
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
}
