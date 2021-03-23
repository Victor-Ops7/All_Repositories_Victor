package poo_lista1_ex3;
import javax.swing.JOptionPane;
public class POO_Lista1_Ex3 {

    public static void main(String[] args) {
       int cracha, opc=0;
        String nome;
        char tipoVinculo;
        float valorHora,QtdeHora,Salario,valorDesconto;
        Funcionario funcionario=null;
        Object[] opcTipoVinculo = {"H","V","C"};
        while(opc!=3){            
            opc=Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Funcionário\n2 - Mostrar Folha de Pagamento\n3 - Alterar Remuneração\n4 - Sair"));
            switch(opc){
                case 1: 
                   cracha = Integer.parseInt(JOptionPane.showInputDialog("Cracha"));
                   nome = JOptionPane.showInputDialog("Nome");                   
                   tipoVinculo = String.valueOf(JOptionPane.showInputDialog(null,"Tipo Vinculo","Opção",
                   JOptionPane.QUESTION_MESSAGE,null,opcTipoVinculo,opcTipoVinculo[0])).charAt(0);
                   valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor Hora"));
                   QtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Quantidade de Hora"));
                   Salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
                   valorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Valor do Desconto"));
                   funcionario = new  Funcionario();
                   funcionario.setCracha(cracha);
                   funcionario.setNome(nome);
                   funcionario.setTipoVinculo(tipoVinculo);
                   funcionario.setValorHora(valorHora);
                   funcionario.setQtdeHora(QtdeHora);
                   funcionario.setSalario(Salario);
                   funcionario.setValorDesconto(valorDesconto);
                   break;
                case 2:
                    funcionario.CalcularValorSalario();
                    JOptionPane.showMessageDialog(null, funcionario.Imprimir());
                    break;
                case 3:                    
                    Salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
                    valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor Hora"));
                    QtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Quantidade de Hora"));
                    tipoVinculo = String.valueOf(JOptionPane.showInputDialog(null,"Tipo Vinculo","Opção",
                   JOptionPane.QUESTION_MESSAGE,null,opcTipoVinculo,opcTipoVinculo[0])).charAt(0);
                    funcionario = new Funcionario();
                    funcionario.setSalario(Salario);  
                    funcionario.setValorHora(valorHora);
                    funcionario.setQtdeHora(QtdeHora);
                    funcionario.setTipoVinculo(tipoVinculo);
                    JOptionPane.showMessageDialog(null, funcionario.Imprimir());
                    break;               
                default: break;
            }
        }
    }    
}
