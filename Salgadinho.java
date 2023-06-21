/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto_o_chale;

/**
 *
 * @author vanilson.gonga
 */
public class Salgadinho extends ItemVenda{

    private int id_salgadinho;
    private String tipo;
    private String massa;
    private String pao;
    
    public Salgadinho(){
        super();   
    }

    public Salgadinho(int id_salgadinho, String tipo, String massa, String pao) {
        super();
        this.id_salgadinho = id_salgadinho;
        this.tipo = tipo;
        this.massa = massa;
        this.pao = pao;
        
    }

    public int getId_salgadinho() {
        return id_salgadinho;
    }

    public void setId_salgadinho(int id_salgadinho) {
        this.id_salgadinho = id_salgadinho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    

    
}
