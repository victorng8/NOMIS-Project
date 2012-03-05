import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;




public class PrimitiveGUI extends JFrame
{
	 public PrimitiveGUI() throws IOException
	 {
		 addMainScreen();
		 addMenu();
		 addStatusBar();
	 }

	 
	 public final void addMainScreen() throws IOException
	 {
	        setTitle("Nomis");
	        setSize(new Dimension(450, 600));
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setResizable(false);
	       
	    	JPanel mainPanel = new JPanel();//Base panel definition
	        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
	        add(mainPanel);
	    	
	    	JPanel top = new JPanel(new BorderLayout(0, 0));//Top panel definition
	    	top.setMaximumSize(new Dimension(450, 0));
	    	top.setBackground(Color.gray);
	    	JLabel title = new JLabel("Welcome to Nomis, good luck and have fun!");//Title on top panel
	    	title.setFont(new Font("Orator Std", Font.BOLD,20));
	    	title.setForeground(Color.white);
	    	title.setBorder(BorderFactory.createEmptyBorder(0, 12, 0,0));
	    	top.add(title);
	        JLabel label = new JLabel();//Border around title
	        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
	        top.add(label, BorderLayout.EAST);
	    	JSeparator separator = new JSeparator();
	    	separator.setForeground(Color.black);
	        top.add(separator, BorderLayout.SOUTH);
	        mainPanel.add(top);//Activate top panel
	        
	        JPanel mid = new JPanel(new BorderLayout());//Mid panel definition, insert picture here
	        BufferedImage nomisSplash = ImageIO.read(new File("C:/Users/³ÂÆäÁÁ/Desktop/splash1.png")); //Edit image path first
	        JLabel picLabel = new JLabel(new ImageIcon(nomisSplash));
	        mid.add(picLabel);
	        mainPanel.add(mid);
	        
	        
	        JPanel bot = new JPanel(new FlowLayout(FlowLayout.LEFT));//Bottom panel definition
	        JButton play = new JButton("Start Game");
	        JButton options = new JButton("Options");
	        JButton about = new JButton("About");
	        JButton exit = new JButton("Exit");
	        exit.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent event) {
	        		System.exit(0);
	        	}
	        });
	        
	        bot.add(play);
	        bot.add(options);
	        bot.add(about);
	        bot.add(exit);
	        bot.setMaximumSize(new Dimension(330, 0));
	        mainPanel.add(bot);


	        //pack();
	    	
	    	/*JButton Abutton = new JButton("A"); //Define button template
	    	Abutton.setBounds(50, 35, 100, 100);
	        Abutton.setToolTipText("Button A");
	        Abutton.addActionListener(new ActionListener()
	        
	        {
	        	public void actionPerformed(ActionEvent event) //Code to execute on button
	        	{
	        		//Insert action here
	        	}
	        });*/
	        
	    	
	 }
	 
	 public final void addMenu()
	 {
		 JMenuBar menubar = new JMenuBar();
	     JMenu file = new JMenu("File");
	     JMenu mNew = new JMenu("New Game");
	     JMenu option = new JMenu("Options");
	     JMenu about = new JMenu("About");
	     JMenu pause = new JMenu("Pause");
	     
	     JMenuItem mExit = new JMenuItem("Exit(Why don't you just click on the exit bar ...)");//, icon); //Set menu item "exit"
	     mExit.setToolTipText("Exit program");
	     mExit.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	                System.exit(0);
	            }
	        });
	     JMenuItem vEasy = new JMenuItem("VEEEEEEEEEEEEEEERY Easy(coming soon...)");
	     vEasy.setToolTipText("Start a new game at VEEEEEEEEEEERY easy difficulty which means not available.");
	     vEasy.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent event) {
	    		 //Insert action here
	    	 }
	     });
	     
	     JMenuItem nEasy = new JMenuItem("Easy");
	     nEasy.setToolTipText("Start a new game at easy difficulty");
	     nEasy.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent event) {
	    		 //Insert action here
	    	 }
	     });
	     
	     JMenuItem nMedium = new JMenuItem("Medium");
	     nMedium.setToolTipText("Start a new game at medium difficulty");
	     nMedium.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent event) {
	    		 //Insert action here
	    	 }
	     });
	     
	     JMenuItem nHard = new JMenuItem("Hard");
	     nHard.setToolTipText("Start a new game at hard difficulty");
	     nHard.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent event) {
	    		 //Insert action here
	    	 }
	     });
	     JMenuItem hell = new JMenuItem("HELL MODE(designed for demons)");
	     hell.setToolTipText("Start a new game at HELL, play if you wanna go hell.");
	     hell.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent event) {
	    		 //Insert action here
	    	 }
	     });
	     JMenuItem oScore = new JMenuItem("Show Highscores");
	     oScore.setToolTipText("View leaderboards");
	     oScore.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent event) {
	    		 //Insert action here
	    	 }
	     });
	     
	     JMenuItem aInstructions = new JMenuItem("Instructions");
	     aInstructions.setToolTipText("View instructions");
	     aInstructions.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent event) {
	     		//Insert action here
	     	}
	 	 });
	     
	     JMenuItem aCredits = new JMenuItem("Credits");
	     aCredits.setToolTipText("View credits");
	     aCredits.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent event) {
	     		//Insert action here
	     	}
	 	 });
	     
	     
	     menubar.add(file); //Add item to menubar
	     menubar.add(option);
	     menubar.add(about);
	     menubar.add(pause);
	     about.add(aInstructions);
	     about.add(aCredits);
	     option.add(oScore);
	     file.add(mNew);
	     mNew.add(vEasy);
	     mNew.add(nEasy);
	     mNew.add(nMedium);
	     mNew.add(nHard);
	     mNew.add(hell);
	     file.add(mExit); //Define what the item is
	     
	     setJMenuBar(menubar); //Activate menubar
	     
	     
		 
	 }
	 
	 public final void addStatusBar()
	 {
		 JLabel statusbar = new JLabel();
	     statusbar.setPreferredSize(new Dimension(-1, 22));
	     statusbar.setBorder(LineBorder.createGrayLineBorder());
	     statusbar.setText("Why we have something here...A useless addStatusBar?..");
	     add(statusbar, BorderLayout.SOUTH);
	 }
	 
	 
	 public static void main(String[] args)  //Code to execute, main section
	 {
       SwingUtilities.invokeLater(new Runnable()  //Ignore
       {
    	   public void run() 
	       {
    		   PrimitiveGUI ex = null;
			try {
				ex = new PrimitiveGUI();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	           ex.setVisible(true);
	       }   
       });
	 }
	
}
