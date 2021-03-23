package poo_lista2_ex1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class POO_Lista2_Ex1 {     
    public static void main(String[] args) {
     int opc = 0;
         char sexo;
        double valorAuto;
        Apolice apolice = null;
        while(opc != 3){
        ArrayList<Apolice> listApolice = new ArrayList<>();
        while (opc != 4) {
            opc = Integer.parseInt(
                    JOptionPane.showInputDialog("1 - Criar Apólice\n2 - Mostrar Apólice\n3 - Sair"));
            switch(opc){
                case 1: 
                    JOptionPane.showInputDialog("1 - Criar Apólice\n2 - Mostrar todas Apólice\n"
                            + "3 - Mostrar Apólice por número\n4 - Sair");
            switch (opc) {
                case 1:
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
                    nome = JOptionPane.showInputDialog("Nome");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
                    sexo = JOptionPane.showInputDialog("Sexo").toUpperCase().charAt(0);
                    valorAuto = Double.parseDouble(JOptionPane.showInputDialog("Valor automóvel"));
                    apolice = new Apolice(numero, nome, idade, sexo, valorAuto);
                    listApolice.add(apolice);
                    break;
                case 2:                    
                    if (listApolice.size() > 0) {
                        String msg = "";
                        for (Apolice ap : listApolice) {
                           msg += ap.imprimir() + "\n ---------- \n";
                        }
                         JOptionPane.showMessageDialog(null, msg);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma Apólice cadastrada.", "Atenção",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 3: 
                    if(apolice != null)
                        JOptionPane.showMessageDialog(null, apolice.imprimir());
                    else
                        JOptionPane.showMessageDialog(null, "Nenhuma Apólice cadastrada.", "Atenção", 
                                                                            JOptionPane.WARNING_MESSAGE);                    
                case 4:
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
                    for(Apolice ap : listApolice){
                        if(ap.getNumero() == numero)
                            JOptionPane.showMessageDialog(null, ap.imprimir());
                    }
                    break;           
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida","Erro", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
        }
    }
}
