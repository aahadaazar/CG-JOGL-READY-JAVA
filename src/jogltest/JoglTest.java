package jogltest;

import com.jogamp.opengl.util.FPSAnimator;
import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.*;

public class JoglTest {

    public static void main(String[] args) {
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);

        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        Triangle l = new Triangle();
        glcanvas.addGLEventListener(l);
        glcanvas.setSize(800, 400);

        //creating frame
        final JFrame frame = new JFrame("Triangle");

        //adding canvas to frame
        frame.getContentPane().add(glcanvas);

        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);

    }

}
