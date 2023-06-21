/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto_o_chale;

/**
 *
 * @author vanilson.gonga
 */
public class Lanche extends ItemVenda {
    
    private int id_lanche;
    private String tipo_pao;
    private String molho;
    
    public Lanche(){
        super();
        
    }

    public Lanche(int id_lanche, String tipo_pao, String molho) {
        super();
        this.id_lanche = id_lanche;
        this.tipo_pao = tipo_pao;
        this.molho = molho;
    }
    
    public int getId_lanche() {
        return id_lanche;
    }

    public void setId_lanche(int id_lanche) {
        this.id_lanche = id_lanche;
    }

    public String getTipo_pao() {
        return tipo_pao;
    }

    public void setTipo_pao(String tipo_pao) {
        this.tipo_pao = tipo_pao;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }
    }

