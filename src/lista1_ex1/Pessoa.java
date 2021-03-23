package lista1_ex1;

public class Pessoa {
    private String cpf;
    private String nome;
    private int idade;
    private char sexo;
    
    public String imprimir(){
        return "CPF: "+cpf+"\nNome: "+nome+"\nIdade: "+
        idade+"\nSexo: "+sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public char getSexo(){
        return sexo;       
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
}