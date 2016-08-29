package Game;


import java.awt.Dimension;
import java.awt.Toolkit;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Main extends BasicGame {
	private int direct = 0;
	private Image grass,person,walk,walkL,grassL,personL,InvDude,Slime;
	private SpriteSheet charSheetR,dirtR,charSheetL,dirtL,slimeSheet;
	private Animation charAnimationR,dirtAnimationR,charAnimationL,dirtAnimationL,slimeAnimation;
	
	public Main(String title) {
		super(title);
		
		// TODO Auto-generated constructor stub
	}

	

	

	@Override
	public void init(GameContainer cont) throws SlickException {
		// TODO Auto-generated method stub
	 grass = new Image("Data/grass.png");
	 grassL = new Image("Data/grassL.png");
	 walk = new Image("Data/charWalk.png");
	 walkL = new Image("Data/charWalkL.png");
	 InvDude = new Image("Data/InvDude.png");
	 Slime  = new Image("Data/SlimeEnemy.png");
	 person = (walk.getSubImage(0, 64, 64, 64));
	 personL = (walkL.getSubImage(0, 64,64,64));
	 dirtR = new SpriteSheet("Data/grass.png",64,64);
	 dirtL = new SpriteSheet("Data/grassL.png",64,64);
	 slimeSheet = new SpriteSheet("Data/SlimeEnemy.png",64,64);
	 charSheetR = new SpriteSheet("Data/charWalk.png", 64,64);
	 charSheetL = new SpriteSheet("Data/charWalkL.png", 64,64);
	 slimeAnimation = new Animation(slimeSheet,100);
	 charAnimationR = new Animation(charSheetR,100);
	 charAnimationL = new Animation(charSheetL,100);
	 dirtAnimationR = new Animation(dirtR,100);
	 dirtAnimationL = new Animation(dirtL,100);}
	
	 

	@Override
	public void update(GameContainer cont, int g) throws SlickException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void render(GameContainer cont, Graphics g) throws SlickException {
		int mX = Mouse.getX();
		int mY = Mouse.getY();
		g.setColor(Color.gray);
		g.fillRect(0, 0, cont.getWidth(), 300);
		g.setColor(Color.darkGray);
		g.drawRect(300, 25, 800, 250);
		g.drawRect(350, 50, 75, 75);
		g.drawRect(425, 50, 75, 75);
		g.drawRect(500, 50, 75, 75);
		g.drawRect(575, 50, 75, 75);
		g.drawImage(InvDude, 800, 100);
		g.drawRect(805, 50, 50, 50);
		g.drawRect(750, 95, 50, 50);
		g.drawRect(860, 95, 50, 50);
		g.drawRect(775, 160, 50, 50);
		g.drawRect(835, 160, 50, 50);
		
		
		Boolean right = Keyboard.isKeyDown(Keyboard.KEY_D);
		Boolean left = Keyboard.isKeyDown(Keyboard.KEY_A);
		int jump  = 0;
		
		//slimeAnimation.draw(cont.getWidth()/2 + 100, cont.getHeight()-75 );
		
		// TODO Auto-generated method stub
		//g.drawString(Mouse.getX()+"", 10, 20);
		//g.drawString(Mouse.getY()+"", 10, 30);
		
		if(right){
			direct =1;
			dirtAnimationR.start();
			
		charAnimationR.draw(cont.getWidth()/2, cont.getHeight()-80 );
		for(int x = 0; x < cont.getWidth(); x+=64){
			
			
			dirtAnimationR.draw(x,cont.getHeight()-32);
			
			
			
		}
		}
		else if(left)
		{
			
			 direct = 2;
			dirtAnimationL.start();
			
			charAnimationL.draw(cont.getWidth()/2, cont.getHeight()-80 );
			for(int x = 0; x < cont.getWidth(); x+=64){
				
				
				dirtAnimationL.draw(x,cont.getHeight()-32);}
			
		}
		else
		{
		
			dirtAnimationR.stop();
			dirtAnimationL.stop();
			
			
			if(direct  == 0){
			
			g.drawImage(person,cont.getWidth()/2, cont.getHeight()-80);
			
			
			
				
				for(int x = 0; x < cont.getWidth(); x+=64){
					g.drawImage(dirtAnimationR.getCurrentFrame(), x, cont.getHeight()-32);
			}
			}
			
			if(direct  == 1){
				
				g.drawImage(person,cont.getWidth()/2, cont.getHeight()-80);
				
				
				
					
					for(int x = 0; x < cont.getWidth(); x+=64){
						g.drawImage(dirtAnimationR.getCurrentFrame(), x, cont.getHeight()-32);
				}
				}
			
			if(direct  == 2){
				
				g.drawImage(personL,cont.getWidth()/2, cont.getHeight()-80);
				
				
				
					
					for(int x = 0; x < cont.getWidth(); x+=64){
						g.drawImage(dirtAnimationL.getCurrentFrame(), x, cont.getHeight()-32);
				}
				}
		
		}
		// creates a square at mouse location
		// g.fillRect(mX-25, cont.getHeight()-mY-25, 50, 50);
	
		if(jump == 1)
		{
			
		}
		
	}
	
	public static void main(String args[]) throws SlickException
	{
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		
		AppGameContainer app = new AppGameContainer(new Main("Test"));
		 
		 app.setDisplayMode((int)width, (int)height, true);
		 
		 app.start();
	}

}
