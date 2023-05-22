import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        ChecaExpressao app = new ChecaExpressao();
        String expressao = JOptionPane.showInputDialog("Insira a expressão: ");
        // String expressao = "((7*5)*4-(8/3)";

        System.out.println(app.isCorrect(expressao));        

    
    }
}
// ((7*5)*4-(8/3))
// ((7*5)*4-(8/3)
