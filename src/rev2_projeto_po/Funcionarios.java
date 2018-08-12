/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rev2_projeto_po;

import java.util.Objects;

/**
 *
 * @author EngMauricio
 */
public class Funcionarios {
    
    private String nome;
    private String cpf;
    private String numCTB;
    private String RG;
    private Double salario;
    
     @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.cpf);
        return hash;
    }
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionarios other = (Funcionarios) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

    
    public Funcionarios(){
        
    }

       
    public Funcionarios(String nome, String cpf, String numCTB, String RG, Double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.numCTB = numCTB;
        this.RG = RG;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumCTB() {
        return numCTB;
    }

    public void setNumCTB(String numCTB) {
        this.numCTB = numCTB;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public String removido(){
        return "o funcionario foi removido com sucesso.";
    }
    
    public String adicionado(){
        
        return "o funcionario /*foi */adicionado com sucesso.";
    }
    
}
