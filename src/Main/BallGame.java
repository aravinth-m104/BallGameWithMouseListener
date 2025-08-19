package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BallGame extends JFrame implements MouseMotionListener {

    int circleX= 200, circleY = 200, circleRadius = 18;
    BallGame(){
        addMouseMotionListener(this);

        setSize(400,400);
        setLayout(null);
        setTitle("BallGame");
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(circleX,circleY,2*circleRadius,2*circleRadius);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        if(x < circleX + circleRadius){
            circleX++;
        }
        if(x > circleX + circleRadius){
            circleX--;
        }

        if(y < circleX + circleRadius){
            circleY++;
        }
        if(y > circleX + circleRadius){
            circleY--;
        }
        repaint();
    }

    public static void main(String[] args) {
        new BallGame();
    }
}
