package poo_lista2_ex2;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao,valorVenda,desconto;   
    
    public void Vendedor(){        
    }
    public void Vendedor(int codigo, String nome, double percentualComissao){
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
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
    public double getPercentualComissao(){
        return percentualComissao;
    }
    public void setPercentualComissao(double percentualComissao){
        this.percentualComissao = percentualComissao;
    }       
     public double getValorVenda(){
        return valorVenda;
    }
    public void setValorVenda(double valorVenda){
        this.valorVenda = valorVenda;
    }
    public double getDesconto(){
        return desconto;
    }
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }
    public double calcularPagamentoComissao(double valorVenda){
        return valorVenda = valorVenda * percentualComissao / 100;
    }
    public double calcularPagamentoComissao(double valorVenda, double desconto){
        return calcularPagamentoComissao(valorVenda) - desconto;
    }
    public String Imprimir(double valorVenda, double desconto){
        return "Código: "+codigo+"\n"
                +"Nome: "+nome+"\n"
                +"Valor Venda: "+valorVenda+"\n"
                +"% Comissao: "+percentualComissao+"\n"
                +"Desconto: "+desconto+"\n"
                +"Valor a Pagar: "+valorVenda;
    }
}