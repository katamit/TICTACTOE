/*program to make tic tac toe games*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.awt.HeadlessException;
//import javax.swing.event.*;
class tic implements ActionListener
{
	 int cunt=-1;
	 int x[]= {0,0,0,0,0,0,0,0,0};
	JFrame jf,jm;
	JButton b[]= new JButton[9];
	JButton b2,b1,b3,jb3;
	int i=0;
	int sel=0;
	String s1,s2;
	
	
	JTextField lb,jt,jt1;

	tic()
	{
		jf = new JFrame("tic tac toe");

		lb= new JTextField("welcome,Select the playing mode",28);
		JPanel p1= new JPanel();
		JPanel p2= new JPanel(new GridLayout(3,3));
		JPanel p3= new JPanel();

		p1.add(lb);
		jf.add(p1,BorderLayout.NORTH);
//		JButton b[] = new JButton[9];

		for( i=0;i<b.length;i++)
		{ 
			b[i]= new JButton("");
			p2.add(b[i]);
			b[i].addActionListener(this);
		}

		b1= new JButton("One Player");
		b2= new JButton("Two Player");
		b3= new JButton("New Game");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		jf.add(p3,BorderLayout.SOUTH);
		/*try{
	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
		catch(Exception e){};*/

		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(p2,BorderLayout.CENTER);
		jf.setVisible(true);
		jf.setLocation(350,300);
		//jf.pack();
		jf.setSize(340,300);






	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)

		{	
			while(s1==null )
			{
			 s1=JOptionPane.showInputDialog(b1, "Please Enter your name");
				
			}
			s2="Computer";
			lb.setText("Good Luck "+s1+"; your move");
			sel=1;
		}


		if(e.getSource()==b2)
		{	
			
			name();
			lb.setText(s1+"'s move");
			JOptionPane.showMessageDialog(jf,"Good Luck Both!!!!");
			
			
			
			sel=2;

			/*System.out.println(b2.getLocation());
			System.out.println(b2.getBounds());
			System.out.println(b2.getX());
			System.out.println(b2.getY());*/
		}


		if(e.getSource()==jb3)
		{	
			jm.dispose();
			s1=jt.getText();
			s2= jt1.getText();
		}

		if(sel==2)
		{  cunt++;
			
			

			

			if(cunt==1||cunt==3||cunt==5||cunt==7||cunt==9)
			{
				for(int i=0;i<=8;i++)
				{
					if(e.getSource()==b[i]&&x[i]==0)
					{
						//method(b[0]);
						b[i].setBackground(Color.RED);
						lb.setText(s2+"'s move");
						x[i]=1;
					}

					else if(e.getSource()==b[i]&&x[i]!=0)
					{cunt--;}
				}
			
			
				if(cunt>4)
				{
					check(x);
				}

				//cunt++;


			
			}

			if(cunt==2||cunt==4||cunt==6||cunt==8)
			{

				for(int i=0;i<=8;i++)
				{
					if(e.getSource()==b[i]&&x[i]==0)
					{
						//method1(b[i]);
						b[i].setBackground(Color.GREEN);
						lb.setText(s1+"'s move");
						x[i]=2;
					}
				}
			



				if(cunt>4)
				{
					check1(x);
				}


				//cunt++;	
			}

			
		}
		else if(sel==1)
		{
			cunt++;
			int t=0;
				for(int i=0;i<=8;i++)
				{
					if(e.getSource()==b[i]&&x[i]==0)
					{
						//method(b[0]);
						//JButton b=b[i];
						b[i].setBackground(Color.ORANGE);
						x[i]=1;
						t= check(x);
						lb.setText("Computer"+"'s move");
						
					}

					else if(e.getSource()==b[i]&&x[i]!=0)
					{cunt--;}
					//System.out.println("Exited frome for loop of sel=1");
				}
				if(cunt >0)
				{
				if(t!=1)
				 comp();}
				/*if(y==0)
				{
					for(int j=0;j<=8;j++)
					{
						if(x[j]==0)
						{
							b[j].setBackground(Color.BLUE);
							x[j]=2;
							check1(x);
							lb.setText(s1+"'s move");
						}
						
					}
				}}*/
				//check();
				
				
				/*if((b==b[0]||b==b[2]||b==b[6]||b==b[8])&& x[4]==0)
				{
					b[4].setBackground(Color.PURPLE);
					x[4]=2;
				}
				else if((b==b[1]||b==b[3]||b==b[5]||b==b[7])&& x[4]==0)

				{
					b[4].setBackground(Color.PURPLE);
					x[4]=2;
				}
				else if()*/
				
			
		}
		else
		{
			JOptionPane.showMessageDialog(jf,"Select playing mode first");
		}

		if(e.getSource()==b3)
		{
			//jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			jf.dispose();
			main();
		}




	}

		static void method(JButton b)
		{
				int x= b.getX();
				int y= b.getY();
				int hgt= b.getHeight();
				int wdt= b.getWidth();

				System.out.println(x);
				System.out.println(y);
				System.out.println(hgt);
				System.out.println(wdt);

				//Graphics g= b.getGraphics();
				//g.drawLine(x,y,x+wdt,y+hgt);
				b.setBackground(Color.RED);
		}

		 int check(int x[])
		{
			//System.out.println("in check function");
			/*for(int i=0;i<x.length;i++)
			{
				System.out.println(x[i]);
			}*/
			if((x[0]==1&&x[1]==1&&x[2]==1)||(x[3]==1&&x[4]==1&&x[5]==1)||(x[6]==1&&x[7]==1&&x[8]==1)
				||(x[0]==1&&x[3]==1&&x[6]==1)||(x[1]==1&&x[4]==1&&x[7]==1)||(x[2]==1&&x[5]==1&&x[8]==1)
			||(x[0]==1&&x[4]==1&&x[8]==1)||(x[6]==1&&x[4]==1&&x[2]==1))
			{
			
				JOptionPane.showMessageDialog(jf,"Congratulations!!"+"\n"+s1+" won the game","End of the Game",1);
				jf.dispose();
				
				main();
				return 1;

			
			}
			//System.out.println(cunt);
				if(cunt==9)
				{
				JOptionPane.showMessageDialog(jf,"Game drawn","End of the Game",1);
				jf.dispose();
				main();
				return 1;

				/*JFrame f= new JFrame("End of hte Game");
				JLabel lb= new JLabel("Game Drawn");
				JPanel jp= new JPanel();
				jp.add(lb);
				f.add(jp,BorderLayout.CENTER);
				f.setVisible(true);
				f.setSize(100,100);
				f.setLocation(250,250);
				f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);*/
				}
			return 0;
			
		}


		 void check1(int x[])
		{
			//System.out.println("in check1 function");
			if((x[0]==2&&x[1]==2&&x[2]==2)||(x[3]==2&&x[4]==2&&x[5]==2)||(x[6]==2&&x[7]==2&&x[8]==2)
				||(x[0]==2&&x[3]==2&&x[6]==2)||(x[1]==2&&x[4]==2&&x[7]==2)||(x[2]==2&&x[5]==2&&x[8]==2)
			||(x[0]==2&&x[4]==2&&x[8]==2)||(x[6]==2&&x[4]==2&&x[2]==2))
			{
			
				if(sel==2)
				JOptionPane.showMessageDialog(jf,"Congratulations!!"+"\n"+s2+" won the game","End of the Game",1);
				if(sel==1)
				JOptionPane.showMessageDialog(jf,"Better Luck next time!!"+"\n"+s2+" won the game","End of the Game",1);
				jf.dispose();
				main();				

				/*JFrame f= new JFrame("End of hte Game");
				JLabel lb= new JLabel("Player 2 won the game");
				JPanel jp= new JPanel();
				jp.add(lb);
				f.add(jp,BorderLayout.CENTER);
				f.setVisible(true);
				//f.pack();
				f.setSize(250,60);
				f.setLocation(250,250);
				f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);*/
			}
			else
			{
				if(cunt==9)
				{
		JOptionPane.showMessageDialog(jf,"Game drawn","End of the Game",1);

					jf.dispose();
					main();

				/*JFrame f= new JFrame("End of hte Game");
				
				JLabel lb= new JLabel("Game Drawn");
				JPanel jp= new JPanel();
				jp.add(lb);
				f.add(jp,BorderLayout.CENTER);
				f.setVisible(true);
				f.setSize(100,100);
				f.setLocation(250,250);
				f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);*/
				}
			}
		}
		

		void name()
		{
			/*jm= new JFrame("Enter Players name");
			JLabel lb1= new JLabel("First player name");
			JLabel lb2= new JLabel("Second player name");
			jt= new JTextField("",20);

			jt1= new JTextField("",20);
			JPanel jp1= new JPanel(new GridLayout(2,2));
			jp1.add(lb1);
			jp1.add(jt);
			jp1.add(lb2);
			jp1.add(jt1);
		
			JPanel jp2 = new JPanel();
			jb3 = new JButton("Enter");
			
			jb3.addActionListener(this);
			
			jp2.add(jb3);
			jm.add(jp1,BorderLayout.NORTH);
			jm.add(jp2,BorderLayout.CENTER);
			jm.setLocation(350,300);
			jm.setVisible(true);
			jm.pack();*/
			
			while(s1==null || s1=="" )
			{	try{
			 s1=JOptionPane.showInputDialog(b2, "Enter name of 1st player");
				}
				catch(Exception e){}
			}
			
			System.out.println(s1);
			while(s2==null || s2=="" )
			{
				 s2= JOptionPane.showInputDialog(b2, "Enter name of 2nd player");
			}
			System.out.println(s2);
			
		}

		int comp()
		{
			cunt++;
			//System.out.println("Call to comp function");
//Computer first checks its own possiblities of winnig the game


			if((x[0]==2&&x[1]==2)&&x[2]==0)
			{	b[2].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[2]=2;
				check1(x);
				return 1;
			}


			if((x[2]==2&&x[1]==2)&&x[0]==0)
			{	b[0].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[0]=2;
				check1(x);
				return 1;
			}


			if((x[2]==2&&x[0]==2)&&x[1]==0)
			{	b[1].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[1]=2;
				check1(x);
				return 1;
			}


			if((x[3]==2&&x[4]==2)&&x[5]==0)
			{	b[5].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[5]=2;
				check1(x);
				return 1;
			}


			if((x[4]==2&&x[5]==2)&&x[3]==0)
			{	b[3].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[3]=2;
				check1(x);
				return 1;
			}


			if((x[3]==2&&x[5]==2)&&x[4]==0)
			{	b[4].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[4]=2;
				check1(x);
				return 1;
			}


			if((x[6]==2&&x[7]==2)&&x[8]==0)
			{	b[8].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[8]=2;
				check1(x);
				return 1;
			}


			if((x[7]==2&&x[8]==2)&&x[6]==0)
			{	b[6].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[6]=2;
				check1(x);
				return 1;
			}


			if((x[6]==2&&x[8]==2)&&x[7]==0)
			{	b[7].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[7]=2;
				check1(x);
				return 1;
			}


			if((x[0]==2&&x[3]==2)&&x[6]==0)
			{	b[6].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[6]=2;
				check1(x);
				return 1;
			}


			if((x[6]==2&&x[3]==2)&&x[0]==0)
			{	b[0].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[0]=2;
				check1(x);
				return 1;
			}


			if((x[6]==2&&x[0]==2)&&x[3]==0)
			{	b[3].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[3]=2;
				check1(x);
				return 1;
			}


			if((x[1]==2&&x[4]==2)&&x[7]==0)
			{	b[7].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[7]=2;
				check1(x);
				return 1;
			}


			if((x[4]==2&&x[7]==2)&&x[1]==0)
			{	b[1].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[1]=2;
				check1(x);
				return 1;
			}


			if((x[1]==2&&x[7]==2)&&x[4]==0)
			{	b[4].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[4]=2;
				check1(x);
				return 1;
			}


			if((x[2]==2&&x[5]==2)&&x[8]==0)
			{	b[8].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[8]=2;
				check1(x);
				return 1;
			}


			if((x[5]==2&&x[8]==2)&&x[2]==0)
			{	b[2].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[2]=2;
				check1(x);
				return 1;
			}


			if((x[2]==2&&x[8]==2)&&x[5]==0)
			{	b[5].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[5]=2;
				check1(x);
				return 1;
			}


			if((x[4]==2&&x[8]==2)&&x[0]==0)
			{	b[0].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[0]=2;
				check1(x);
				return 1;
			}


			if((x[0]==2&&x[8]==2)&&x[4]==0)
			{	b[4].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[4]=2;
				check1(x);
				return 1;
			}


			if((x[4]==2&&x[0]==2)&&x[8]==0)
			{	b[8].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[8]=2;
				check1(x);
				return 1;
			}


			if((x[4]==2&&x[2]==2)&&x[6]==0)
			{	b[6].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[6]=2;
				check1(x);
				return 1;
			}


			if((x[4]==2&&x[6]==2)&&x[2]==0)
			{	b[2].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[2]=2;
				check1(x);
				return 1;
			}


			if((x[6]==2&&x[2]==2)&&x[4]==0)
			{	b[4].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[4]=2;
				check1(x);
				return 1;
			}

//Computer Stops  opponent from  wining the game


			if((x[0]==1&&x[1]==1)&&x[2]==0)
			{	b[2].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[2]=2;
				check1(x);
				return 1;
			}


			if((x[2]==1&&x[1]==1)&&x[0]==0)
			{	b[0].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[0]=2;
				check1(x);
				return 1;
			}


			if((x[2]==1&&x[0]==1)&&x[1]==0)
			{	b[1].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[1]=2;
				check1(x);
				return 1;
			}


			if((x[3]==1&&x[4]==1)&&x[5]==0)
			{	b[5].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[5]=2;
				check1(x);
				return 1;
			}


			if((x[4]==1&&x[5]==1)&&x[3]==0)
			{	b[3].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[3]=2;
			
				check1(x);
				return 1;
			}


			if((x[3]==1&&x[5]==1)&&x[4]==0)
			{	b[4].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[4]=2;
			
				check1(x);
				return 1;
			}


			if((x[6]==1&&x[7]==1)&&x[8]==0)
			{	b[8].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[8]=2;
			
				check1(x);
				return 1;
			}


			if((x[7]==1&&x[8]==1)&&x[6]==0)
			{	b[6].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[6]=2;
		
				check1(x);
				return 1;
			}


			if((x[6]==1&&x[8]==1)&&x[7]==0)
			{	b[7].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[7]=2;
	
				check1(x);
				return 1;
			}


			if((x[0]==1&&x[3]==1)&&x[6]==0)
			{	b[6].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[6]=2;
	
				check1(x);
				return 1;
			}


			if((x[6]==1&&x[3]==1)&&x[0]==0)
			{	b[0].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[0]=2;

				check1(x);
				return 1;
			}


			if((x[6]==1&&x[0]==1)&&x[3]==0)
			{	b[3].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[3]=2;
			
				check1(x);
				return 1;
			}


			if((x[1]==1&&x[4]==1)&&x[7]==0)
			{	b[7].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[7]=2;
		
				check1(x);
				return 1;
			}


			if((x[4]==1&&x[7]==1)&&x[1]==0)
			{	b[1].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[1]=2;
				check1(x);
				return 1;
			}


			if((x[1]==1&&x[7]==1)&&x[4]==0)
			{	b[4].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[4]=2;
		
				check1(x);
				return 1;
			}


			if((x[2]==1&&x[5]==1)&&x[8]==0)
			{	b[8].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[8]=2;
		
				check1(x);
				return 1;
			}


			if((x[5]==1&&x[8]==1)&&x[2]==0)
			{	b[2].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[2]=2;
		
				check1(x);
				return 1;
			}


			if((x[2]==1&&x[8]==1)&&x[5]==0)
			{	b[5].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[5]=2;
	
				check1(x);
				return 1;
			}


			if((x[4]==1&&x[8]==1)&&x[0]==0)
			{	b[0].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[0]=2;
			
				check1(x);
				return 1;
			}


			if((x[0]==1&&x[8]==1)&&x[4]==0)
			{	b[4].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[4]=2;
		
				check1(x);
				return 1;
			}


			if((x[4]==1&&x[0]==1)&&x[8]==0)
			{	b[8].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[8]=2;
			
				check1(x);
				return 1;
			}


			if((x[4]==1&&x[2]==1)&&x[6]==0)
			{	b[6].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[6]=2;

				check1(x);
				return 1;
			}


			if((x[4]==1&&x[6]==1)&&x[2]==0)
			{	b[2].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[2]=2;
				
				check1(x);
				return 1;
			}


			if((x[6]==1&&x[2]==1)&&x[4]==0)
			{	b[4].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[4]=2;
			
				check1(x);
				return 1;
			}
//for the cross move


			if((x[1]==1&&x[3]==1)&&x[0]==0)
			{	b[0].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[0]=2;
			
				check1(x);
				return 1;
			}


			if((x[5]==1&&x[1]==1)&&x[2]==0)
			{	b[2].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[2]=2;
			
				check1(x);
				return 1;
			}
			


			if((x[3]==1&&x[7]==1)&&x[6]==0)
			{	b[6].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[6]=2;
			
				check1(x);
				return 1;
			}


			if((x[5]==1&&x[7]==1)&&x[8]==0)
			{	b[8].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[8]=2;
			
				check1(x);
				return 1;
			}

//additional

		
			if((x[2]==1&&x[6]==1)&&x[5]==0)
			{	b[5].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[5]=2;
			
				check1(x);
				return 1;
			}

			
			if((x[5]==1&&x[6]==1)&&x[8]==0)
			{	b[8].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[8]=2;
			
				check1(x);
				return 1;
			}

			if((x[4]==1&&x[8]==1)&&x[6]==0)
			{	b[6].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[6]=2;
			
				check1(x);
				return 1;
			}
			
			if((x[0]==1&&x[7]==1)&&x[6]==0)
			{	b[6].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[6]=2;
			
				check1(x);
				return 1;
			}
			
			if((x[2]==1&&x[7]==1)&&x[6]==0)
			{	b[6].setBackground(Color.BLUE);
				lb.setText(s1+"'s move");
				x[6]=2;
			
				check1(x);
				return 1;
			}


//for the initial move of computer

			if(x[4]==0)
			{
				b[4].setBackground(Color.BLUE);
				x[4]=2;
	
				check1(x);
				lb.setText(s1+"'s move");
				return 1;
				
			}

			for(int j=0;j<=8;j++)
			{
				//System.out.println("for of comp executed");
				if(x[j]==0)
				{
					b[j].setBackground(Color.BLUE);
					x[j]=2;
			
					check1(x);
					lb.setText(s1+"'s move");
					break;
					//return 1;
				}
							
			}		


			return 0;

		}






				

	public static void main(String... ar)
	{
		new tic();	
	}
}
