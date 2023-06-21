/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto_o_chale;

/**
 *
 * @author vanilson.gonga
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FaturaRecibo {
    
    private String nome_cliente;
    private int numero;
    private List<ItemVenda> produtos;
    private float valor_pago;
    private float total;
    private float troco;
    
    public FaturaRecibo(){
        
    }

    public String getNome() {
        return nome_cliente;
    }

    public void setNome(String nome) {
        this.nome_cliente = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<ItemVenda> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ItemVenda> produtos) {
        this.produtos = produtos;
    }
    
    
    public float getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(float valor_pago) {
        this.valor_pago = valor_pago;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }
    
    public float troco(){
        float troco = this.valor_pago - this.total;
        this.setTroco(troco);
        System.out.println("O seu troco é: "+troco);
        return troco;
    }
    
    
    public void adicionarProduto(ItemVenda itemVenda) {
        produtos.add(itemVenda);
    }

    
    public void gerarFatura(){
       System.out.println("========== Fatura ==========");
        System.out.println("Nome: " +nome_cliente);
        System.out.println("Número: " + numero);
        System.out.println("Valor Pago: " + valor_pago); 
        System.out.println("Total: " + total);
        System.out.println("Troco: " + troco);
        System.out.println("============================");
        
         
        
    
    }
    public void lerValorPago() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor pago: ");
        valor_pago = scanner.nextFloat();
        scanner.close();
    } 
}

    

    
