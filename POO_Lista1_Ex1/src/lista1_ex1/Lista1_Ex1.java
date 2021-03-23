package lista1_ex1;

import javax.swing.JOptionPane;

public class Lista1_Ex1 {

    public static void main(String[] args) {
 
    String cpf, nome;
    int idade, opc = 0;
    char sexo;
    Pessoa objPessoa = null;
    Object[] opcSexo = {"Masculino","Feminino"};
    while(opc != 3){
        opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar\n2 - Mostrar\n3 - Sair"));
        switch(opc){
            case 1:
            cpf = JOptionPane.showInputDialog("CPF");
            nome = JOptionPane.showInputDialog("Nome");
            sexo = String.valueOf(JOptionPane.showInputDialog(null,"Sexo","Opção",
               JOptionPane.QUESTION_MESSAGE,null,opcSexo,opcSexo[0])).charAt(0);
              idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
                objPessoa = new Pessoa();
                objPessoa.setCpf(cpf);
                objPessoa.setNome(nome);
                objPessoa.setIdade(idade);
                objPessoa.setSexo(sexo);
                    break;          
                case 2: 
                    JOptionPane.showMessageDialog(null, objPessoa.imprimir());
                    break;
                case 3: break;
                default: break;
            }
        }
    }
    
}
