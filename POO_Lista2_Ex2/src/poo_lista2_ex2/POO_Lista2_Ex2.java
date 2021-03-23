package poo_lista2_ex2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class POO_Lista2_Ex2 {
    public static void main(String[] args) {
    int opc = 0;
    int codigo;
    String nome;
    double percentualComissao, valorVenda, desconto;   
    Vendedor vendedor = null;
    while (opc != 3){
        ArrayList<Vendedor> listVendedor = new ArrayList<>();       
        opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar\n2 - Calcular Venda\n3 - Sair"));      
        switch(opc){
            case 1: 
                JOptionPane.showInputDialog("1 - Cadastrar\n3 - Sair");
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Código"));
                nome = JOptionPane.showInputDialog("Nome");
                percentualComissao = Double.parseDouble(JOptionPane.showInputDialog("% Comissao"));
                vendedor = new Vendedor();
                vendedor.setCodigo(codigo);
                vendedor.setNome(nome);
                vendedor.setPercentualComissao(percentualComissao);
                listVendedor.add(vendedor); break;                
            case 2:
                valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Valor da Venda"));
                desconto = Double.parseDouble(JOptionPane.showInputDialog("Desconto"));
                vendedor = new Vendedor();                
                vendedor.setValorVenda(valorVenda);
                vendedor.setDesconto(desconto);                
                listVendedor.add(vendedor);
                JOptionPane.showInputDialog(null, vendedor.Imprimir());
                 break;
            case 3: break;
                default : break;
    }
    }
}
}