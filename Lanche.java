import javax.swing.JOptionPane;
public class Lanche {
    public static void main(String[] args) throws Exception {
        int pedido = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do pedido:")); //recebe pedido
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada:")); //recebe quantidade do pedido
        double valor = 0;
        if(pedido == 1) valor = 4; //seta o valor do produto
        else if(pedido == 2) valor = 4.5;
        else if(pedido == 3) valor = 5;
        else if(pedido == 4) valor = 2;
        else if(pedido == 5) valor = 1.5;
        if(valor != 0 && quantidade > 0) JOptionPane.showMessageDialog(null, String.format("Total: R$ %.2f", valor * quantidade)); //devolve o valor total
        else if (valor == 0) JOptionPane.showMessageDialog(null, "Código do pedido inválido."); //retorna inválido se o código do pedido não existir
        else JOptionPane.showMessageDialog(null, "Quantidade inválida"); //retorna inválido se a quantidade for menor ou igual à 0
    }
}
