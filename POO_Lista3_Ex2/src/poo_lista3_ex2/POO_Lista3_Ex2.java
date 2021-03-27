package poo_lista3_ex2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class POO_Lista3_Ex2 {
    public static void main(String[] args) {
     int opc =0;
     String marca, modelo, nome, texto;
     int codigo;
     ArrayList<Pessoa> listPessoa = new ArrayList<>();
     Pessoa pessoaSelecionado = null;
     Pessoa vendedorSelecionado = null;
     Pessoa compradorSelecionado = null;
     while (opc !=6){
         opc = Integer.parseInt(JOptionPane.showInputDialog(
         "1 - Criar Pessoa\n"
         + "2 - Criar Automóvel\n"
         + "3 - Transferir Automóvel\n"
         + "4 - Mostrar Todas as Pessoas\n"
         + "5 - Mostrar Automóvel da Pessoa\n"
         + "6 - Sair"));
         
         if (opc == 2 || opc == 5 ){
             pessoaSelecionado=null;
             codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
             for(Pessoa p : listPessoa){
                 if (p.getCodigo()==codigo)
                     pessoaSelecionado = p;
             }
             if (pessoaSelecionado == null){
                 continue;
             }
         }
         switch (opc){
             case 1:
                 codigo = Integer.parseInt(JOptionPane.showInputDialog("Código"));
                 nome = JOptionPane.showInputDialog("Nome");
                 listPessoa.add(new Pessoa(codigo, nome));
                 break;
             case 2:
                 marca = JOptionPane.showInputDialog("Marca");
                 modelo = JOptionPane.showInputDialog("Modelo");
                 pessoaSelecionado.insertAutomovel(new Automovel(marca,modelo));                                  
                 break;
             case 3:
                 vendedorSelecionado=null;
                 codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Vendedor"));
                 for(Pessoa p : listPessoa){
                     if(p.getCodigo() == codigo)
                         vendedorSelecionado = p;
                 }
                 compradorSelecionado=null;
                 codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Comprador"));
                 for (Pessoa p : listPessoa){
                     if(p.getCodigo() == codigo)
                         compradorSelecionado = p;
                 } 
                 texto = "";
                 int cont = 1;
                 for(Automovel a : vendedorSelecionado.getAutomoveis()){
                 texto += cont + "-" + a.getModelo()+ "\n";
                         cont ++;
                 }         
                 codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Automovel\n"+texto));
                 Automovel auto = vendedorSelecionado.getAutomoveis().get(codigo - 1);
                 vendedorSelecionado.removeAutomovel(codigo - 1);
                 compradorSelecionado.insertAutomovel(auto);
                 break;
             case 4:
                 String msg = "";
                 for(Pessoa p : listPessoa){
                     msg += p.imprimir()+"\n";
                 }
                 JOptionPane.showInputDialog(null, msg);
                 break;
             case 5:
                 JOptionPane.showInputDialog(null, pessoaSelecionado.imprimirCompleto());
                 break;
             case 6:
                 break;
             default:break;
         }
     }
    }    
}
