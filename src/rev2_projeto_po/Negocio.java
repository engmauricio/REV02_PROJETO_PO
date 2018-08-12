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
public class Negocio {
    
    private Double quan;
    private Double preco;
    private Integer TipoNegocio;
    private Double peso;
    private  Double Resul;
    
    
    
    
    public Negocio(){
       
    }
    public Negocio(Double quan, Double preco, Integer TipoNegocio, Double peso){
                
        this.quan = quan;
        this.preco = preco;
        this.TipoNegocio = TipoNegocio;
        this.peso = peso;
       
    }

    public Double getQuan() {
        return quan;
    }

    public void setQuan(Double quan) {
        this.quan = quan;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getTipoNegocio() {
        return TipoNegocio;
    }

    public void setTipoNegocio(Integer TipoNegocio) {
        this.TipoNegocio = TipoNegocio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getResul() {
        return Resul;
    }

    public void setResul(Double Resul) {
        this.Resul = Resul;
    }

   
}
