import javax.swing.JOptionPane;
public class Coordenada {
    public static void main(String[] args) throws Exception {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite a cordenada X:")); //recebe x
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite a cordenada Y:")); //recebe y
        if(x == 0){ //retorna valores de acordo com x ou y
            if(y == 0) JOptionPane.showMessageDialog(null, "Origem");
            else JOptionPane.showMessageDialog(null, "Eixo Y");
        } else if(x > 0){
            if(y > 0) JOptionPane.showMessageDialog(null, "Q1");
            else if(y < 0) JOptionPane.showMessageDialog(null, "Q4");
            else JOptionPane.showMessageDialog(null, "Eixo X");
        } else {
            if(y > 0) JOptionPane.showMessageDialog(null, "Q2");
            else if(y < 0) JOptionPane.showMessageDialog(null, "Q3");
            else JOptionPane.showMessageDialog(null, "Eixo X");
        }
    }
}
