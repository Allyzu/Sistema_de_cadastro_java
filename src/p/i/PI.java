/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.i;
import javax.swing.JOptionPane;

/**
 *
 * @author Allyson 
 */
public class PI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     int opcion;  
     
     do{
     opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
     "              Esolha uma Opção   \n"+
             
     "1 - Cadastro \n"+
             
     "2 - Excluiir  \n"+
             
     "3 - Sair  \n"+
             
     "Casa de Adoção Bom Jesus ", "Sistema de Cadastros", JOptionPane.QUESTION_MESSAGE));
     
     switch (opcion){
         
         case 1: cadastro(); break;
         case 2: excluir(); break;
         case 3: JOptionPane.showMessageDialog (null, "Encerrando");System.exit(0); break;
         default: JOptionPane.showMessageDialog(null, "Escolha uma opção valida  \n", "Erro de opção", JOptionPane.WARNING_MESSAGE);
         
     } }while (opcion!=3);
     
           
    }      

     public static void cadastro() {
        
       String[] cadastros = {"Cadastro_cliente", "Cadastro_funcionario", "Cadastro_pet"};
        String c = (String) JOptionPane.showInputDialog(null, "Escolha um Cadastro", "ESCOLHA", JOptionPane.QUESTION_MESSAGE, null,
          cadastros, cadastros[0]);
        
        if(c.equalsIgnoreCase("Cadastro_cliente")){
            String nome;
            String cpf;
            String telefone;
            String email;
            String endereco;
            nome = JOptionPane.showInputDialog("Nome");
            System.out.println(nome);
            cpf = JOptionPane.showInputDialog("CPF");
            System.out.println(cpf);
            telefone = JOptionPane.showInputDialog("Telefone");
            System.out.println(telefone);
            email = JOptionPane.showInputDialog("E-mail");
            System.out.println(email);
            endereco = JOptionPane.showInputDialog("Endereço");
            System.out.println(endereco);
            
            JOptionPane.showMessageDialog(null,"Lista \n" + "Nome: " + nome + ". \n" + "Cpf: " + cpf + ". \n" + "Telefone: " + telefone + ". \n" + "E-mail: " + email + ". \n" + "Endereço: " + endereco );
           
        }
        if(c.equalsIgnoreCase("Cadastro_funcionario")){
            String[] funcao = {"Administrador", "Serviços Gerais", "Médico Veterinário"};
            String nome;
            String cpf;
            String telefone;
            String email;
            String endereco;
            String salario;
            
            String a = (String) JOptionPane.showInputDialog(null, "Função", "ESCOLHA", JOptionPane.QUESTION_MESSAGE, null, funcao, funcao[0]);
            System.out.println(a);
            nome = JOptionPane.showInputDialog("Nome");
            System.out.println(nome);
            cpf = JOptionPane.showInputDialog("CPF");
            System.out.println(cpf);
            telefone = JOptionPane.showInputDialog("Telefone");
            System.out.println(telefone);
            email = JOptionPane.showInputDialog("E-mail");
            System.out.println(email);
            endereco = JOptionPane.showInputDialog("Endereço");
            System.out.println(endereco); 
            salario = JOptionPane.showInputDialog("Salário");
            System.out.println(salario);
            
         JOptionPane.showMessageDialog(null, "Nome: " + nome + ". \n" + "Cpf: " + cpf + ". \n"  + "Telefone: " + telefone + ". \n" + "E-mail: " + email + ". \n" + "Endereço: " + endereco + ". \n" + "Salário: " + salario );
         
        }
        if(c.equalsIgnoreCase("Cadastro_pet")){
            String tipo[] = {"Dog", "Cat"};
            String b = (String) (JOptionPane.showInputDialog(null, "Escolha o Tipo", "ESCOLHA", JOptionPane.QUESTION_MESSAGE, null, tipo, tipo[0]));
            System.out.println(b);
            
             JOptionPane.showMessageDialog(null, "Pet: " + b);
             
        }
       
        
       }


    private static void excluir() {
        
        try{
            
            final String os = System.getProperty("Cadastro_pet");
            if(os.contains("Wuindows"))
            {
                Runtime.getRuntime().exec("cls");
                
            }else{
                Runtime.getRuntime().exec("clear");
            }
           
            }
        catch (final Exception e){
            
        }
        }
     
    }
    

 
        
     