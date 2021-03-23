package poo_lista1_ex3;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora,qtdeHora,salario,valorDesconto;   
   public float CalcularValorSalario(){
       if(tipoVinculo == 'H'){
          return salario = (valorHora * qtdeHora) - valorDesconto;
           
       }else {
           return salario - valorDesconto;
       }       
   }   
   public String Imprimir(){
       return "Cracha: " + cracha +
             "\nNome: " + nome+
                 "\nVinculo : " +tipoVinculo +
                    "\nSalario : " +salario+
                         "\nDesconto: " +valorDesconto+ 
                             "\nValor a Receber : " +salario;                     
   }    
   public void setCracha(int cracha){
       this.cracha = cracha;
   }
   public int getCracha(){
       return cracha;
   }
   public void setNome(String nome){
       this.nome = nome;
   }
   public String getNome(){
       return nome;
   }
   public void setTipoVinculo(char tipoVinculo){
       this.tipoVinculo = tipoVinculo;
   }
   public char getTipoVinculo(){
       return tipoVinculo;
   }
   public void setValorHora(float valorHora){
       this.valorHora = valorHora;
   }
   public float getValorHora(){
       return valorHora;
   }
   public void setQtdeHora(float qtdeHora){
       this.qtdeHora = qtdeHora;
   }
   public float getQtdeHora(){
       return qtdeHora;
   }   
   public void setSalario(float salario){
       this.salario = salario;
   }
   public float getSalario(){
       return salario;
   }
   public void setValorDesconto(float valorDesconto){
       this.valorDesconto = valorDesconto;
   }
   public float getValorDesconto(){
       return valorDesconto;
   }       
}

