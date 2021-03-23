package poo_lista3_ex1;
import java.util.ArrayList;

public class Curso { 
    private int codigo, cargaHoraria;
    private String nome;
    ArrayList<Aluno> alunos;
    
    public Curso(){
        alunos = new ArrayList<>();
    }
    public Curso(int codigo, String nome, int cargaHoraria){
        this();
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    public void insertAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void removerAluno(int index){
        alunos.remove(index);
    }
    public String imprimir(){
        return "Código: "+codigo+"\n"
                + "Nome: "+nome+"\n"
                + "CH: "+cargaHoraria;
    }
    public String imprimirCompleto(){
        String retorno = imprimir() + "\n -- Alunos --\n";
        for(Aluno aluno : alunos){
            retorno += aluno.imprimir() + "\n";
        }
        return retorno;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos){
        this.alunos = alunos;
    }            
    }   
