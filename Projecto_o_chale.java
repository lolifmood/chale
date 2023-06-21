
package projecto_o_chale;

import java.util.Scanner;

/**
 *
 * @author M1_trabalho
 */
public class Projecto_o_chale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá. \nQual é o seu nome?");
        String nome_cliente= sc.next();
        System.out.println("Bem vindo a nossa loja "+nome_cliente+"!");
        System.out.println("O que deseja?");
        int  seleccao = 0;
       
        Pedido Pedido= new Pedido();
        Pedido.setTaxa_servico(200);
        Pedido.setNome_Cliente(nome_cliente);
        /*Menú do chale */
        do {            
             ItemVenda item = new ItemVenda();
             System.out.println("Esolha uma opção: 1 Pizza, 2 Salgadinho, 3 Lanche, 0: Nada" );
             seleccao= sc.nextInt();
             switch (seleccao) {
                case 1:
                    item.setDescricao("Pizza");
                    item.setPeso(5000);
                    Pizza pizza= new Pizza();
                    System.out.println("Escolha o tipo de molho: 1 Molho Barbecue , 2 Molho de tomate Picante, 3 Molho Branco ");
                    int molho = sc.nextInt();
                    switch(molho){
                        case 1:
                            pizza.setMolho("Molho Barbecue");
                            break;
                        case 2:
                            pizza.setMolho("Molho de tomate Picante");
                            break;
                        case 3:
                            pizza.setMolho("Molho Branco");
                            break;

                        default:
                            pizza.setMolho("sem molho");
                             break;
                    } 
                    System.out.println("Escolha um recheio para pizza : 1 Calabresa, 2 Presunto, 3 Pepperoni ");
                    int recheio = sc.nextInt();
                    switch(recheio){
                        case 1:
                            pizza.setRecheio("Calabresa");
                            break;
                        case 2:
                            pizza.setRecheio("Presunto e Queijo");
                            break;
                        case 3:
                            pizza.setRecheio("Pepperoni");
                            break;
                        default:
                            pizza.setRecheio("sem recheio");
                            break;
                    }
                    System.out.println("Escolha a cobertura: 1 Atum, 2 Frango, 3 Camarão, 4 Carne ");
                    int cobertura= sc.nextInt();
                    switch(cobertura){
                        case 1:
                            pizza.setCobertura("atum");
                            break;
                        case 2:
                            pizza.setCobertura("frango");
                            break;
                        case 3:
                            pizza.setCobertura("camarão");
                            break;
                         case 4:
                            pizza.setCobertura("carne");
                            break;    
                        default:
                            pizza.setCobertura("sem cobertura");   
                            break;
                    }
                    Pedido.AddItem(item);
                    break; 
                case 2:
                    item.setDescricao("Salgadinho");
                    item.setPeso(1000);
                    Salgadinho salgadinho = new Salgadinho();
                    System.out.println("Escolha o tipo de salgadinho: 1 Frito, 2 Assado");
                    int tipo = sc.nextInt();
                    switch(tipo){
                        case 1: 
                         salgadinho.setTipo("Frito");
                         break;
                        case 2:
                         salgadinho.setTipo("Assado");
                         break;
                        default:
                         salgadinho.setTipo("Indisponivel");  // A não escolha do tipo deverá resumir-se na ausencia do item, neste caso, o salgadinho.
                        break;   
                    } 
                    System.out.println("Escolha o tipo de massa: 1 normal, 2 integral");
                    int massa = sc.nextInt();
                    switch(massa){
                        case 1:
                            salgadinho.setMassa("normal");
                            break;
                        case 2:
                            salgadinho.setMassa("integral");
                            break;
                        default:
                            salgadinho.setMassa("Indisponivel");  // A não escolha do tipo deverá resumir-se na escolha da massa normal.
                        break;
                    }
                    System.out.println("Escolha o tipo de recheio para o salgadinho: 1 Frango, 2 peixe, 3 Camarão ");
                    recheio = sc.nextInt();
                    switch(recheio){
                        case 1:
                            salgadinho.setRecheio("Frango");
                            break;
                        case 2:
                            salgadinho.setRecheio("Peixe");
                            break;
                        case 3:
                            salgadinho.setRecheio("Camarão");
                            break;
                        default:
                            salgadinho.setRecheio("");  // A não escolha do tipo deverá resumir-se na escolha da massa normal.
                            break;
                    }
                    Pedido.AddItem(item);
                    break;
                case 3:
                    item.setDescricao("Lanche");
                    item.setPeso(8000);
                    Lanche lanche = new Lanche();
                    System.out.println("Escolha o tipo de pão para o lanche: 1 Sandes de atato com pão normal, 2 Croissant misto");
                    int pao = sc.nextInt();
                    switch(pao){
                        case 1:
                            lanche.setTipo_pao("Sandes de catato com pão normal");
                            break;
                        case 2:
                            lanche.setTipo_pao("Croissant misto");
                            break;
                        default:
                            lanche.setTipo_pao("croissant misto");
                            break;
                    }
                    Pedido.AddItem(item);
                    break;
                case 0:
                    Pedido.QuantItens();
                    item.setDescricao("Bom apetite!!!");
                    break;
                default:
                    System.out.println("Escolha inválida. Esolha novamente uma opção: 1 Pizza, 2 Salgadinho, 3 Lanche, 0: Nada");
                    break;
                    
            }    
             
        } while (seleccao!=0);
        /*Geração da Factura */
        FaturaRecibo fatura = new FaturaRecibo();
        fatura.setNome(nome_cliente);
        fatura.setNumero(12345);
        fatura.setTotal(100.0f);
        fatura.lerValorPago(); // Lê o valor pago pelo usuário
        fatura.troco(); // Calcula e define o valor do troco
        fatura.gerarFatura(); // Gera a fatura
        
        
    }
}


    
