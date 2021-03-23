package poo_lista3_ex2;
import java.util.ArrayList;
public class Pessoa {
    private int codigo;
    private String nome;
    ArrayList<Automovel> automoveis;
    
    public Pessoa(){
        automoveis = new ArrayList<>();        
    }
    public Pessoa(int codigo, String nome){
        this();
        this.codigo = codigo;
        this.nome = nome;
    }
    public void insertAutomovel(Automovel automovel){
        automoveis.add(automovel);
    }
    public void removeAutomovel(int index){
        automoveis.remove(index);
    }
    
}
