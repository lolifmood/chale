/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto_o_chale;

/**
 *
 * @author vanilson.gonga
 */
public class Pizza extends ItemVenda {
    
    private int id_pizza;
    private String molho;
    private String cobertura;
    
    
    public Pizza(){
        super();
    }

    public Pizza(int id_pizza, String molho, String cobertura) {
        super();
        this.id_pizza = id_pizza;
        this.molho = molho;
        this.cobertura = cobertura;
    }
    
    

    public int getId_pizza() {
        return id_pizza;
    }

    public void setId_pizza(int id_pizza) {
        this.id_pizza = id_pizza;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
}
    




