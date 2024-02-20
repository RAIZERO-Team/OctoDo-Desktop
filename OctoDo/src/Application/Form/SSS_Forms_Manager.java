package Application.Form;

import Application.Main.Application;
import javax.swing.*;
import java.awt.*;
//import com.formdev.flatlaf.extras.FlatAnimatedLafChange;

public class SSS_Forms_Manager {

    private Application application;
    private static SSS_Forms_Manager instance;

    public static SSS_Forms_Manager getInstance() {
        if (instance == null) {
            instance = new SSS_Forms_Manager();
        }
        return instance;
    }

    private SSS_Forms_Manager() {

    }

    public void initApplication(Application application) {
        this.application = application;
    }
    
        public void showForm(JComponent form) {
        EventQueue.invokeLater(() -> {
            //FlatAnimatedLafChange.showSnapshot();
            application.setContentPane(form);
            application.revalidate();
            application.repaint();
            //FlatAnimatedLafChange.hideSnapshotWithAnimation();
        });
    }
}
