package poo_lista3_ex1;

public class Aluno { 
   
    private String ra,nome;
    
    public Aluno(){       
    }
    public Aluno(String ra, String nome){
        this.ra= ra;
        this.nome= nome;
    }
    public String imprimir(){
        return "RA: "+ra+"\nNome: "+nome;
    }
    public String getRa(){
        return ra;
    }
    public void setRa(String ra){
        this.ra = ra;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}