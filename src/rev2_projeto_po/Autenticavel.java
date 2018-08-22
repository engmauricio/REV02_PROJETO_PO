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
public interface Autenticavel {
    
    /**
     *
     * @param login
     * @param senha
     * @return
     */
    Boolean autentica(String login, String senha);
      
}
