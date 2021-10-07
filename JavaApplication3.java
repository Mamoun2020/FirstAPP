/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;
/**
 *
 * @author Mamoun
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities caps = new GLCapabilities(profile);

        GLWindow windows = GLWindow.create(caps);

        windows.setTitle("Hello JOGL");
        windows.setSize(640, 360);
        windows.setRealized(false);
        windows.setVisible(true);
        
        FPSAnimator animator = new FPSAnimator(windows, 60);
        animator.start();
    }
    
}
