package teste;

import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class teste2 {
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        addAButton("Novo", pane);
        addAButton("Editar", pane);
        addAButton("Excluir", pane);
        addAButton("Sair", pane);
    }

    private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
    
    
    private static void createAndShowGUI() {
        
        JFrame janela = new JFrame("O que deseja fazer?");
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        janela.setSize(500,500);
        
        janela.setLocationRelativeTo(null);
        
        addComponentsToPane(janela.getContentPane());

        //Display the window.
        janela.pack();
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
