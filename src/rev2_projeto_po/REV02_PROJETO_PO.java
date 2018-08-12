/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rev2_projeto_po;

import java.util.Scanner;

/**
 *
 * @author EngMauricio
 */
public class REV02_PROJETO_PO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
          EmpresaAgropecuaria e = new EmpresaAgropecuaria("Fazenda Marinho", "Itamari - Bahia", "Maurício Andrade Marinho");
          Negocio negocio = new Negocio();
          Financeiro finanças = new Financeiro();
          Funcionarios Fu = new Funcionarios();
          
          Scanner in = new Scanner(System.in);
          Integer variavel, opc, numero;
          
          do{
          System.out.println("Sistema digital para recolher dados da Fazenda ");
          System.out.println(e.getNome());
          System.out.println(e.getDono());
          System.out.println(e.getEndereco());
          
          System.out.println("Digite: 1- Menu de Funcionarios | 2- Menu de Negocio | 3- Menu de Financeiro | 4-Sair");
          numero = Integer.parseInt(in.nextLine());
          
          switch(numero){
          
              case 1:
          
                  do{
          
                System.out.println("1- Adicionar Funcionarios | 2- Procurar Funcionarios | 4- Sair");
                opc = Integer.parseInt(in.nextLine());
          
          
                switch(opc){
              
                    case 1:
                //System.out.println("Menu adicionar Funcionarios ");
                System.out.println("Digite: 1-Gerente | 2-Secretario | 3-EmpServ ");
                opc = Integer.parseInt(in.nextLine());
                
                System.out.println("Informe o nome: ");
                String nome = in.nextLine();
                Fu.setNome(nome);

                System.out.println("Informe o cpf: ");
                String cpf = in.nextLine();
                Fu.setCpf(cpf);

                System.out.println("Informe o numero da carteira de trabalho: ");
                String numCTB = in.nextLine();
                Fu.setNumCTB(numCTB);

                System.out.println("Informe o RG: ");
                String RG = in.nextLine();
                Fu.setRG(RG);

                System.out.println("Informe o Salario atual: ");
                Double salario =  Double.parseDouble(in.nextLine());
                Fu.setSalario(salario);
               
               
                if(opc == 1){
                    Gerente gerente = new Gerente(Fu.getNome(), Fu.getCpf(), Fu.getNumCTB(), Fu.getRG(), Fu.getSalario());
                    e.AdiFuncionarios(gerente);
                    System.out.println(gerente.adicionado());
                
                    }else if(opc==2){
                        Secretario secretario = new Secretario(Fu.getNome(),Fu.getCpf(),Fu.getNumCTB(),Fu.getRG(),Fu.getSalario());
                        e.AdiFuncionarios(secretario);
                        System.out.println(secretario.adicionado());
                        }else if(opc == 3){
                            EmpServ empserv = new EmpServ(Fu.getNome(),Fu.getCpf(),Fu.getNumCTB(),Fu.getRG(),Fu.getSalario());
                            e.AdiFuncionarios(empserv);
                            System.out.println(empserv.adicionado());
                }
                
                                break;
                
              
                  case 2:  
                      
                      System.out.println("Informe o cpf: ");
                      cpf = in.nextLine();

                      Fu = e.procurarfuncionarios(cpf);
                      
                          if(Fu == null)
                                  	System.err.print("Erro. Funcionario não encontrado. cpf não cadastrado.");
                                        
                            else {
					
					System.out.println("Funcionario: ->nome:  "+ Fu.getNome() + " -> RG: " + Fu.getRG() + "-> cpf:" +Fu.getCpf());
					System.out.println("Deseja remover o funcionario: 1- remover | 2- nao remover");
					opc = Integer.parseInt(in.nextLine());
                                        if(opc == 1){
					e.removeFuncionarios(Fu);
                                        System.out.println(Fu.removido());
                                        
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
            
                     System.out.println("MENU ADICIONAR -> Digite: 1-Gado | 2-Cacau | 3-Terras | 4-Sair ");
                     variavel = Integer.parseInt(in.nextLine());
                     negocio.setTipoNegocio(variavel);
         
                         switch(variavel){
             
                     case 1:
                 
                         System.out.println("Digite o Preço em cotação para 1 arroba: ");
                         Double p = Double.parseDouble(in.nextLine());
                         negocio.setPreco(p);
                         System.out.println("Digite a quantidade: ");// o peso de um boi para estiamativa de capital em bens da fazenda
                                                                     // será considerado como 30 arrobas. 
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
        //Double ent = in.nextDouble();
        finanças.setEntCapital(ent);
                
        System.out.println("Digite o valor de saída de capital: ");
        Double sai =  Double.parseDouble(in.nextLine());
        //Double sai = in.nextDouble();
        finanças.setSaiCapital(sai);
            
       
        System.out.println(" O valor em caixa de capital é:  ");
        System.out.println(e.GeraFinanças(finanças));
        break;
        
        default:
        break;
          }
        }while(numero!=4);
        
    }
    
}
