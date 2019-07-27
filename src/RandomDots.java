import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Paint;
import java.util.Date;
import java.util.Random;


public class RandomDots extends Applet implements Runnable {

	int a,b,c,d;
//	@Override
//	public void init() {
//	 
//		   new Thread(this).start();
//	}
//	
	@Override
	public void run() {
		Random r=new Random();
		for(;;) {
			showStatus(new Date().toString());		
			a=r.nextInt(400);
			b=r.nextInt(400);
			c=d=10;
			repaint();
			
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
			g.fillOval(a,b,c,d);
			
	}
	
	
	
	
	@Override
	public void start() {
		  new Thread(this).start();
	}
	
	@Override
	public void stop() {
		new Thread(this).start();
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	
	
}
