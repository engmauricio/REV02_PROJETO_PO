/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rev2_projeto_po;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author EngMauricio
 */
public class EmpresaAgropecuaria implements Serializable{
  
    Double r = 0.0;
    Double Resul = 0.0;
    private String nome;
    private String endereco;
    private String dono;
    private Double Financeiro;
    private ArrayList<Funcionarios> func = new ArrayList<>();
    private ArrayList<Negocio> negocios = new ArrayList<>(); 
    
    
    public EmpresaAgropecuaria(){
    
    }
    
    public EmpresaAgropecuaria(String nome, String endereco, String dono){
        
        this.nome = nome;
        this.endereco = endereco;
        this.dono = dono;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
     public ArrayList<Funcionarios> getFunc(){
        return func;
    }
    
    public ArrayList<Negocio> getNegocios(){
        
        return negocios;
    }   
    
    public void adi(Negocio negocio) {
        
        this.negocios.add(negocio);
    }
    
    public Double CalculaNegocio(Negocio negocio){ 
    // peso já em cotação; estabelecido como uma estimativa de gado para este peso especifico;
    // preço sera dado pelo usuario;
    // lembrando que estou fazendo uma estimativa de capital em bens;
               
        switch(negocio.getTipoNegocio()){
            
            case 1: //tipo de negocio gado
                Resul = Resul + 20*negocio.getPreco()*negocio.getQuan();
                break;
            case 2: // tipo de negocio cacau
              Resul = Resul + 15*negocio.getPreco()*negocio.getQuan();
                break;
            case 3: //tipo de negocio hectares
              Resul = Resul + negocio.getPreco()*negocio.getQuan();
                break;
                
            default:
                break;
        }
        
          return Resul;
    }
    
    public Double GeraFinanças(Financeiro f){
        
        r = r + f.getEntCapital() - f.getSaiCapital();
            f.setBalanço(r);
            
      return f.getBalanço();  
    }

    public Double getFinanceiro() {
        return Financeiro;
    }

    public void setFinanceiro(Double Financeiro) {
        this.Financeiro = Financeiro;
    }
    
       
    public void AdiFuncionarios(Funcionarios Fu){
        this.func.add(Fu);
    }
    
    public void removeFuncionarios(Funcionarios Fu){
        
        Funcionarios emp = new Funcionarios();
        for(Funcionarios f: func){
            if(f.getCpf().equals(Fu.getCpf())){
                
                emp = f;
            }
        }
        func.remove(emp);
       
    }
    public Funcionarios procurarfuncionarios(String cpf){
        Funcionarios emp = null;
        
        for(Funcionarios f: func){
            if(f.getCpf().equals(cpf)){
                
                emp = f;
            }
        }
    
        return emp;
    }  
    
}
