package Application.Form;

import Application.Main.Application;
import javax.swing.*;
import java.awt.*;
//import com.formdev.flatlaf.extras.FlatAnimatedLafChange;

public class FormsManager {

    private Application application;
    private static FormsManager instance;

    public static FormsManager getInstance() {
        if (instance == null) {
            instance = new FormsManager();
        }
        return instance;
    }

    private FormsManager() {

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
