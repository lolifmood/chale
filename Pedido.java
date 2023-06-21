/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto_o_chale;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author vanilson.gonga
 */
public class Pedido {
    
    private int id_pedido;
    private String nome_Cliente;
    private ArrayList<ItemVenda> itens;
    private float taxa_servico;
    
    public Pedido(){
        itens= new ArrayList<>();
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getNome_Cliente() {
        return nome_Cliente;
    }

    public void setNome_Cliente(String nome_Cliente) {
        this.nome_Cliente = nome_Cliente;
    }

    public float getTaxa_servico() {
        return taxa_servico;
    }

    public void setTaxa_servico(float taxa_servico) {
        this.taxa_servico = taxa_servico;
    }
    
    // Add intem 
    public void AddItem(ItemVenda item){
        this.itens.add(item);
        System.out.println(item.getDescricao()+" adicionado com sucesso. ");
    }
    
    // remover item
    public void  RemoverItem(ItemVenda item){
        System.out.println("Deseja realmente remover esse item? (Insira S sem SIM)");
        Scanner sc = new Scanner(System.in);
        if(sc.next().toLowerCase()=="s")
        {    
            this.itens.remove(item);
            System.out.println(item.getDescricao()+" removido com sucesso.");
        }else{
            System.out.println("Item não removido.");
        }   
    }
    // total de itens
    public int QuantItens(){
        int qnt=this.itens.size();
        System.out.println(this.getNome_Cliente()+" tem: "+qnt+" Pedido(s)");
        return qnt;
    }

    //total a pagar
    public float total_pagar(){ 
        float total=0;
       for (int i=0; i<itens.size(); i++){
          total=total+this.itens.get(i).getPreco_venda();
       }
       return total+this.getTaxa_servico();
    }
    
    
    
    
}
