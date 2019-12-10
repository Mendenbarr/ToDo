/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIComponents;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author 01048750
 */
// Not used for anything in the end, although I'm happy with the code itself. 
public class JButtonIcon extends JButton {

    public JButtonIcon() {
        super();
        this.setBorderPainted(false);
        this.setBorder(null);
        this.setMargin(new Insets(0, 0, 0, 0));
        this.setContentAreaFilled(false);
    }
    
    
    public void setImage(String image){
        ImageIcon IconBase = new ImageIcon(image);
        IconBase.setImage(getScaledImage(IconBase, 24, 24));
        this.setIcon(IconBase);
        ImageIcon closeIconRollover = new ImageIcon(getScaledImage(IconBase, 30, 30));
        this.setRolloverIcon(closeIconRollover);
        ImageIcon closeIconSelected = new ImageIcon(getScaledImage(IconBase, 30, 30));
        this.setSelectedIcon(closeIconSelected);
        ImageIcon closeIconPressed = new ImageIcon(getScaledImage(IconBase, 30, 30));
        this.setPressedIcon(closeIconPressed);
        ImageIcon closeIconDisabled = new ImageIcon(getScaledImage(IconBase, 30, 30));
        this.setDisabledIcon(closeIconDisabled);
    }

    // Returns an image scaled to width w and height h, in pixels.
    private Image getScaledImage(ImageIcon srcImg, int w, int h) {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg.getImage(), 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }

}
