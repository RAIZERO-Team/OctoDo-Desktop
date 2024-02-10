
package Frontend.UI_Components;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JLabel;


public class svgIcon extends JLabel{
    private FlatSVGIcon svgIcon;
    
    public void setSVGIcon(String Icon,int width, int height){
      svgIcon = new FlatSVGIcon(Icon, width, height);
      setIcon(svgIcon);
    }
    
    public void setCursorHand(){
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
     
}
