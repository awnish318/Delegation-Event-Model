import java.awt.*;
import java.awt.event.*;


public class GUI extends Frame implements MouseListener,MouseMotionListener{
   Label l,l1,l2;
   GUI(){
   	addMouseListener(this);
   	addMouseMotionListener(this);
   
   	l=new Label();
   	l.setBounds(0,10,100,150);
   	add(l);
   	l1=new Label();
   	l1.setBounds(10,90,100,150);
   	add(l1);
   	l2=new Label();
   	l2.setBounds(10,180,100,150);
   	add(l2);
   	
        setSize(400,400);
        setLayout(null);
        setVisible(true);
   }
   public void mouseClicked(MouseEvent e){
   	l.setText("Mouse CLicked");
   	System.out.println(e.getX()+""+e.getY());	
   }
   public void mouseEntered(MouseEvent e){
   	l.setText("Mouse Entered");
   }
   public void mouseexited(MouseEvent e){
   	l2.setText("Mouse exited");
   }
   public void mousePressed(MouseEvent e){
   	l.setText("Mouse Pressed");
   }
   public void mouseReleased(MouseEvent e){
   	l2.setText("Mouse Released");
   }
   public void mouseDragged(MouseEvent e){
   	l1.setText("Mouse Dragged");
   }
   public void mouseMoved(MouseEvent e){
   	l1.setText("Mouse Moved");
   }
   public static void main(String[] args){
   	new GUI();
   }
}
