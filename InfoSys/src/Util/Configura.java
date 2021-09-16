package Util;

import static java.awt.SystemColor.info;
import javax.swing.UIManager;

public class Configura {
    public static void LookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo : UIManager.getInstalledLookAndFeels()){
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch (UnsuportedLookAndFeelException | ClassNotFoundException | InstantionException | IllegalAccessException e){
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    
}
