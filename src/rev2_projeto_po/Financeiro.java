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
public class Financeiro implements Serializable{
    
    private Double EntCapital;
    private Double SaiCapital;
    private Double Balanço;
    
    
    public Financeiro(){
        
    }
    public Financeiro(Double EntCapital, Double SaiCapital, Double Balanço){
        
        this.EntCapital = EntCapital;
        this.SaiCapital = SaiCapital;
        this.Balanço = Balanço;
        
    }
    
    
    public Double getEntCapital() {
        return EntCapital;
    }

    public void setEntCapital(Double EntCapital) {
        this.EntCapital = EntCapital;
    }

    public Double getSaiCapital() {
        return SaiCapital;
    }

    public void setSaiCapital(Double SaiCapital) {
        this.SaiCapital = SaiCapital;
    }

    public Double getBalanço() {
        return Balanço;
    }

    public void setBalanço(Double Balanço) {
        this.Balanço = Balanço;
    }
    
    
}
