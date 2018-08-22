/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rev2_projeto_po;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author EngMauricio
 */

public class REV02_PROJETO_PO {
        
    public static Boolean Validacao(Autenticavel a){
      String lo_g, cod;
          
          lo_g = JOptionPane.showInputDialog("Login: ");
          cod = JOptionPane.showInputDialog("Senha: ");
          
    return a.autentica(lo_g,cod);
    
    }
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
                
          JOptionPane.showMessageDialog(null, "Recolhimento de dados da Empresa Agropecuaria");
          
          EmpresaAgropecuaria e = new EmpresaAgropecuaria("Fazenda Marinho", "Itamari - Bahia", "Maurício Andrade Marinho");
          Negocio negocio = new Negocio();
          Financeiro finanças = new Financeiro();
          Funcionarios Fu = new Funcionarios();
          Gerente gerente = new Gerente();
          Secretario secretario = new Secretario();
          
          Scanner in = new Scanner(System.in);
          Integer variavel, opc, numero, num;
          
          if(Validacao(gerente)){
          do{
           
          System.out.println("Sistema digital para recolhimento de dados da Fazenda ");
//          System.out.println(e.getNome());
//          System.out.println(e.getDono());
//          System.out.println(e.getEndereco());
          JOptionPane.showMessageDialog(null,"\n" +e.getNome()+ "\n"+e.getDono()+ "\n"+e.getEndereco());
          //System.out.println("Digite: 1- Menu de Funcionarios | 2- Menu de Negocio | 3- Menu de Financeiro | 4-Sair");
          //numero = Integer.parseInt(in.nextLine());
          
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite: 1- Menu de Funcionarios | 2- Menu de Negocio | 3- Menu de Financeiro | 4-Carregar Dados | 5-Sair", JOptionPane.INFORMATION_MESSAGE));
          
          switch(numero){
          
              case 1:
          
                  do{
          
//                System.out.println("Digite: 1- Adicionar Funcionarios | 2- Procurar Funcionarios | 4- Sair");
//                opc = Integer.parseInt(in.nextLine());
                
                 opc = Integer.parseInt(JOptionPane.showInputDialog("Digite: 1- Adicionar Funcionarios | 2- Procurar Funcionarios | 4- Sair", JOptionPane.WARNING_MESSAGE));
          
                switch(opc){
              
                    case 1:
           
//                System.out.println("Digite: 1-Gerente | 2-Secretario | 3-EmpServ ");
//                opc = Integer.parseInt(in.nextLine());
                        
                opc = Integer.parseInt(JOptionPane.showInputDialog("Digite: 1-Gerente | 2-Secretario | 3-EmpServ "));
//                System.out.println("Informe o nome: ");
//                String nome = in.nextLine();
                String nome = JOptionPane.showInputDialog("Informe o nome:  ");
                Fu.setNome(nome);

//                System.out.println("Informe o cpf: ");
//                String cpf = in.nextLine();
                String cpf = JOptionPane.showInputDialog("Informe o cpf:  ");
                Fu.setCpf(cpf);

                 String numCTB = JOptionPane.showInputDialog("Informe o numero da carteira de trabalho: ");
//                System.out.println("Informe o numero da carteira de trabalho: ");
//                String numCTB = in.nextLine();
                Fu.setNumCTB(numCTB);

                 String RG = JOptionPane.showInputDialog("Informe o RG: ");
//                System.out.println("Informe o RG: ");
//                String RG = in.nextLine();
                Fu.setRG(RG);

                Double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o Salario atual: ")); 
//                System.out.println("Informe o Salario atual: ");
//                Double salario =  Double.parseDouble(in.nextLine());
                Fu.setSalario(salario);
                
                if(opc == 1){
                     gerente = new Gerente(Fu.getNome(), Fu.getCpf(), Fu.getNumCTB(), Fu.getRG(), Fu.getSalario());
                    e.AdiFuncionarios(gerente);
                    System.out.println(gerente.adicionado());
                   
                    }else if(opc==2){
                         secretario = new Secretario(Fu.getNome(),Fu.getCpf(),Fu.getNumCTB(),Fu.getRG(),Fu.getSalario());
                        e.AdiFuncionarios(secretario);
                        System.out.println(secretario.adicionado());
                                              
                        }else if(opc == 3){
                            EmpServ empserv = new EmpServ(Fu.getNome(),Fu.getCpf(),Fu.getNumCTB(),Fu.getRG(),Fu.getSalario());
                            e.AdiFuncionarios(empserv);
                            System.out.println(empserv.adicionado());
                
                        }
                
                        break;
                
              
                  case 2:  
                      
//                      System.out.println("Informe o cpf: ");
//                      cpf = in.nextLine();
                     
                      cpf = JOptionPane.showInputDialog("Informe o cpf: ");
                      
                      Fu = e.procurarfuncionarios(cpf);
                      
                          if(Fu == null)
//                                  	System.err.print("Erro. Funcionario não encontrado. cpf não cadastrado.");
                                       JOptionPane.showMessageDialog(null, "Erro. Funcionario não encontrado. cpf não cadastrado."); 
                            else {
					JOptionPane.showMessageDialog(null, "->nome:  "+ Fu.getNome() + " \n-> RG: " + Fu.getRG() + "\n-> cpf: " +Fu.getCpf()+ "\n -> salario: R$ "+Fu.getSalario());
//					System.out.println("Funcionario: ->nome:  "+ Fu.getNome() + " -> RG: " + Fu.getRG() + "-> cpf:" +Fu.getCpf()+ "-> salario"+Fu.getSalario());

                                        opc = Integer.parseInt(JOptionPane.showInputDialog("Digite: 1- remover | 2- nao remover | 3- Alterar salario"));

//					System.out.println("Digite: 1- remover | 2- nao remover | 3- Alterar salario");
//					opc = Integer.parseInt(in.nextLine());
                                        if(opc == 1){
					e.removeFuncionarios(Fu);
                                        System.out.println(Fu.removido());
                                        
                                        }else if(opc == 3){
                                            System.out.println("Informe o Salario atual: ");
                                            salario =  Double.parseDouble(in.nextLine());
                                            Fu.setSalario(salario);
                                            
                                        }
				}
                        break;
                        
                  default:
                  break;
              
          }
          
          }while(opc!=4); 
          break;
         
                  case 2:
                 
                      do{
            
//                     System.out.println("MENU ADICIONAR -> Digite: 1-Gado | 2-Cacau | 3-Terras | 4-Sair ");
//                     variavel = Integer.parseInt(in.nextLine());
                     variavel = Integer.parseInt(JOptionPane.showInputDialog("MENU ADICIONAR -> Digite: 1-Gado | 2-Cacau | 3-Terras | 4-Sair "));
                     negocio.setTipoNegocio(variavel);
         
                         switch(variavel){
             
                     case 1:
                 
//                         System.out.println("Digite o Preço em cotação para 1 arroba: ");
//                         Double p = Double.parseDouble(in.nextLine());
                         Double p = Double.parseDouble(JOptionPane.showInputDialog(" Digite o Preço em cotação para 1 arroba: "));
                         negocio.setPreco(p);
                         System.out.println("Digite a quantidade: ");// o peso de um boi para estiamativa de capital em bens da fazenda
                                                                     // será considerado como 20 arrobas. 
                         Double q = Double.parseDouble(in.nextLine());
                         negocio.setQuan(q);
                         e.CalculaNegocio(negocio);
                         e.adi(negocio);
                         
                        break;
                        
                     case 2:
                 
                         System.out.println("Digite o Preço em cotação para 1 arroba: ");
                          p = Double.parseDouble(in.nextLine());
                         negocio.setPreco(p);
                         System.out.println("Digite a quantidade: "); // o peso de uma saca de cacau sera considerado como 15 kg 
                          q = Double.parseDouble(in.nextLine());
                         negocio.setQuan(q);
                         e.CalculaNegocio(negocio);
                         e.adi(negocio);
                         
                        break;
                        
                     case 3:

                         System.out.println("Digite o Preço: ");
                          p = Double.parseDouble(in.nextLine());
                         negocio.setPreco(p);
                         System.out.println("Digite a quantidade: ");
                          q = Double.parseDouble(in.nextLine());
                         negocio.setQuan(q);
                         e.CalculaNegocio(negocio);
                         e.adi(negocio);
                         
                         break;
                         
                     default:
                       break;
                 
         }      

         }while(variavel!=4);
         
         
                System.out.println("o valor em bens é: ");
                System.out.println(e.CalculaNegocio(negocio));
              
         break;
         
         case 3:
        System.out.println("Digite o valor de entrada de capital: ");
        Double ent = Double.parseDouble(in.nextLine());

        finanças.setEntCapital(ent);
                
        System.out.println("Digite o valor de saída de capital: ");
        Double sai =  Double.parseDouble(in.nextLine());

        finanças.setSaiCapital(sai);
            
       
        System.out.println(" O valor em caixa de capital é:  ");
        System.out.println(e.GeraFinanças(finanças));
        break;
        
         case 4:
         
          FileInputStream input = new FileInputStream("binario.bin");
          ObjectInputStream on = new ObjectInputStream(input);
          e = (EmpresaAgropecuaria) on.readObject();
          System.out.println(e.getNome());
          on.close();
          input.close();
          
          JOptionPane.showMessageDialog(null, "Dados carregados com sucesso. "); 
             break;

        default:
        break;
          }

          }while(numero!=5);
          
         
        FileOutputStream arquivosaida = new FileOutputStream("binario.bin");
        ObjectOutputStream out = new ObjectOutputStream(arquivosaida);  
        
        out.writeObject(e);
        
        out.close();
        arquivosaida.close();
           }else{
               System.out.println("Você nao tem permissao para entrar no sistema. Sorry ! ");
          }  
   
}
}

