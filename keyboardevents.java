import java.awt.*;
import java.awt.event.*;

public class keyboardevents extends Frame implements KeyListener {
	Label l,l1;
	String msg="";
	keyboardevents(){
		addKeyListener(this);
		l=new Label();
		l.setBounds(10,100,100,150);
		add(l);
		
		l1=new Label();
		l1.setBounds(10,90,200,400);
		add(l1);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	
	}
	public void keyPressed(KeyEvent ke){
	  l.setText("Key Down");
	  int key=ke.getKeyCode();
	  switch(key){/* virtual key codes present in keyEvent class*/
	  	case KeyEvent.VK_F1: 		msg="<F1>"; break;
	  	case KeyEvent.VK_F2: 		msg="<F2>"; break;
	  	case KeyEvent.VK_PAGE_DOWN: 	msg="<PgDn>"; break;
	  	case KeyEvent.VK_PAGE_UP: 	msg="<PgUp>"; break;
	  	case KeyEvent.VK_LEFT: 		msg="<Left arrow>"; break;
	  	case KeyEvent.VK_RIGHT: 	msg="<Right arrow>"; break;
	  }
	  l1.setText(msg);
	}
	public void keyReleased(KeyEvent ke){
		l.setText("KeyReleased");
	}
	public void keyTyped(KeyEvent ke){
		msg=msg+ke.getKeyChar();
		l1.setText(msg);
	}
	public static void main(String[] args){
		new keyboardevents();
	}
	
 
}
