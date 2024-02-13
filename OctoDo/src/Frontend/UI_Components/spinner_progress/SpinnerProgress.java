package Frontend.UI_Components.spinner_progress;

import javax.swing.JProgressBar;


public class SpinnerProgress extends JProgressBar {

    public SpinnerProgress() {
        init();
    }

    @Override
    public void updateUI() {
        setUI(new SpinnerProgressUI());
    }

    private void init() {
        setUI(new SpinnerProgressUI());
    }
}
