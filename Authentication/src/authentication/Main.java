package authentication;

import static authentication.Database.connect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Database dbb=new Database();
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

        }
        //</editor-fold>
        
        //</editor-fold>
        if (true) { // Displays the main Window of the login System
            connect();
            dbb.selectAll();
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new MainWindow().setVisible(true);
                }
            });
        }

    }

 
}
