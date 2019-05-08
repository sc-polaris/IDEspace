package six;

import javax.swing.*;

/**
 * @ClassName: StyleWindow
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/5/8 15:08
 * @Version: 1.0
 */
public class StyleWindow {
    public StyleWindow()
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RevertSql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}

