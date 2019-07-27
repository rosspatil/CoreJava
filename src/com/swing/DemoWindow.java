package com.swing;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JWindow;
import javax.swing.text.html.ImageView;

public class DemoWindow extends JFrame {

	JDesktopPane desktop=new JDesktopPane();
	JInternalFrame fr=new JInternalFrame("nternel frame");
	Button btn=new Button("ok");
	DemoWindow(){
		setSize(100, 100);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		new DemoWindow();
	}
	
}


