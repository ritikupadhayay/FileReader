import java.awt.Color;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
 
class Railway   
{
	JLabel search1,search2,search3,search4,search5,search6,search7,search8,search9,search10;
    JTextField srch1,srch2,srch3,srch4,srch5,srch6, srch7,srch8,srch9,srch10;
	JButton submit;
	String fsearch1=null,fsearch2=null,fsearch3=null,fsearch4=null,fsearch5=null,fsearch6=null,fsearch7=null,fsearch8=null,fsearch9=null,fsearch10=null;	
	 String s="";
	 String str="";
	BufferedReader bp=null;
	Container c;
	int a=0;
	int count1=0;
	public Railway(){
		  
  int count=0;

Font font1 = new Font("TimesRoman", Font.BOLD,20);
String a="Ritik";
String b="Shilpi";
String d="Indian";
JFrame Frame=new JFrame();
Frame.setVisible(true);
Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Frame.setSize(700,500);
Frame.setLocation(100,50);
Frame.setTitle("Ministry Of Railway");
      
	 
	    c=Frame.getContentPane();
		c.setLayout(null);
		Color clr=new Color(226,223,243);
        c.setBackground(clr);
ImageIcon icon=new ImageIcon("Indian_Railway.png");
Frame.setIconImage(icon.getImage());  
JMenuBar menubar=new JMenuBar();
menubar.setBounds(0,0,100,100);
Frame.setJMenuBar(menubar);
 
 
////
JMenu Advsearch=new JMenu("Search");
JMenuItem Search1=new JMenuItem("One Word Search");
JMenuItem advsearch2=new JMenuItem("Two Word Search");
JMenuItem advsearch3=new JMenuItem("Three Word Search");
JMenuItem advsearch4=new JMenuItem("Four Word Search");
JMenuItem advsearch5=new JMenuItem("Five Word Search");
Advsearch.add(Search1);
Advsearch.add(advsearch2);
Advsearch.add(advsearch3);
Advsearch.add(advsearch4);
Advsearch.add(advsearch5);
menubar.add(Advsearch);

JMenu Change_Background=new JMenu("Change Background");
ImageIcon icon1 = new ImageIcon("icon1.gif");
JMenuItem Sky_Blue=new JMenuItem("Sky Blue",icon1);
Change_Background.add(Sky_Blue);
ImageIcon icon2 = new ImageIcon("icon2.gif");
JMenuItem light_pink=new JMenuItem("Light Pink",icon2);
Change_Background.add(light_pink);
menubar.add(Change_Background);
ImageIcon icon3 = new ImageIcon("icon3.gif");
JMenuItem white=new JMenuItem("White",icon3);
Change_Background.add(white);
menubar.add(Change_Background);

JMenu help=new JMenu("Help");
JMenuItem docmt=new JMenuItem("Help-Document");
help.add(docmt);
menubar.add(help);

JMenu exit=new JMenu("Exit");
JMenuItem print25=new JMenuItem("Exit");
exit.add(print25);
menubar.add(exit);



JButton openButton = new JButton("Open File");


c.add(openButton);

 
       
	JFileChooser fileChooser = new JFileChooser(".");
    fileChooser.setControlButtonsAreShown(true);
	fileChooser.setBounds(0,0,700,500);
    c.add(fileChooser);
	
	int result = fileChooser.showOpenDialog(Frame);
	 //String s="";
	 
    if (result == JFileChooser.APPROVE_OPTION) {
		try{
			  
              File selectedFile = fileChooser.getSelectedFile();
			  s=selectedFile.getAbsolutePath();
		   }
		   catch(Exception e2){
			    JOptionPane.showMessageDialog(null,"File Not Selected ");
		                                  }
	
		
	                                           }
											   
			//String str="";									//--to print all file
	try{											
	str = new Scanner(new File(s))
                          .useDelimiter("\\A").next();	
	   }	catch(Exception e){}		   
//--			 
   		  
BufferedReader br=null;
try{
   br=new BufferedReader(new InputStreamReader(System.in));
   File f1=new File(s);
//File f2=new File("C:\\Users\\RITIKUPADHAYAY\\Desktop\\RITIK2.txt");
                boolean l1=true;
              try{
              l1=f1.createNewFile();
			     }
			   catch(IOException e)
			   {
				   System.out.println("File Not Created ");
			   }
              if(l1)
                 {
                   System.out.println("First File Not Found ");
                    System.exit(0);
                 } 
              FileReader fr=new FileReader(f1);
              bp=new BufferedReader(fr);
              //FileWriter fw=new FileWriter(f2);
              //BufferedWriter bw=new BufferedWriter(fw);
			  
			 
			  JLabel labelz = new JLabel("Status:Name of word");
                           labelz.setFont(font1);
				           labelz.setBounds(1000,1,400,450);
				           c.add(labelz);
						   int n1=100;
						   int n2=100;
						   int n3=800; 
						   int n4=50;
						   JLabel labeltextleft = new JLabel("Input File");
						   Color cl=new Color(102, 255, 255);
						   
                           labeltextleft.setFont(font1);
				           labeltextleft.setBounds(n1,20,n3,n4);
						   labeltextleft.setBackground(cl);
				           c.add(labeltextleft);
					
                            while((s=bp.readLine())!=null)
  
                    {
					    Pattern p=Pattern.compile(a);
                          Matcher m=p.matcher(s);
                        if(m.find())
                            {
						   JLabel labela = new JLabel("1.Word Found:"+a);
                           labela.setFont(font1);
				           labela.setBounds(1000,20,400,450);
				           c.add(labela);
						  // count++;
                            }
						  Pattern p1=Pattern.compile(b);
                          Matcher m1=p1.matcher(s);
                        if(m1.find())
                            {
                           JLabel labelb = new JLabel("2.Word Found:"+b);
                           labelb.setFont(font1);
				           labelb.setBounds(1000,40,400,450);
				           c.add(labelb);
						  //count++;
						   }
							Pattern p2=Pattern.compile(d);
                            Matcher m2=p2.matcher(s);
                        if(m2.find())
                            {
						   JLabel labeld = new JLabel("3.Word Found:"+d);
                           labeld.setFont(font1);
				           labeld.setBounds(1000,60,400,450);
				           c.add(labeld);
						   //count++;
                            }
										
							
                         						 
                   }
}
catch(IOException ex){
	System.out.println("An IOException was caught!");
	ex.printStackTrace();
                      }
	finally{
		try{
			br.close();
		   }
		   

            catch(IOException ex) {

                System.out.println("An IOException was caught!");

                ex.printStackTrace();

                                   }
	         }
	        
				            
						   JTextArea area = new JTextArea(400,200);
						   Font font12 = new Font("TimesRoman", Font.BOLD,22);
						   area.setFont(font12);
						   area.setBounds(100,100,800,800);
						   area.setEditable(false);
                           area.setText(str);
						   
						   Highlighter highlighter = area.getHighlighter();
						   // stating new highlighter1
                           HighlightPainter painter1 = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
						   int length=str.length();
                           int pp0 = str.indexOf(a);
						   int pp1 = pp0 + a.length();
						   if(pp0==-1){count=0;}
						   else{count++;}
						    
						   while(pp1<=length){
						   try{
                           highlighter.addHighlight(pp0, pp1, painter1 );
						      }
						   catch (Exception e1) {}
						int newword=str.indexOf(a,pp1);
						 if(newword>=0){
							pp0=newword;
						 pp1=pp0 + a.length();
						 count++;
						               }
						 else{
							 pp1=length+1;
						     }
                                   }
						  HighlightPainter painter2 = new DefaultHighlighter.DefaultHighlightPainter(Color.pink);
                           pp0 = str.indexOf(b);
						   pp1 = pp0 + b.length();
						   if(count!=0) 
						   {
							   if(pp0!=-1){count++;}
						   }
							while(pp1<=length){
						   try{
                           highlighter.addHighlight(pp0, pp1, painter2 );
						      }
						   catch (BadLocationException e1) {
					
					                      e1.printStackTrace();
										  //JOptionPane.showMessageDialog(null,"No Match Found");
							 
				                                            }
						int newword2=str.indexOf(b,pp1);
						 if(newword2>=0){
							pp0=newword2;
						 pp1=pp0 + b.length();
						 count++;
						               }
						 else{
							 pp1=length+1;
						     }
															
															
							}
															//end highlighter2
								// stating new highlighter3
						  HighlightPainter painter3 = new DefaultHighlighter.DefaultHighlightPainter(Color.green);
                           pp0 = str.indexOf(d);
						   
                            pp1 = pp0 + d.length();
							if(count!=0) 
						   {
							   if(pp0!=-1){count++;}
						   }
							while(pp1<=length){
						   try{
                           highlighter.addHighlight(pp0, pp1, painter3 );
						      }
						   catch (BadLocationException e1) {
					
					                      e1.printStackTrace();
										 // JOptionPane.showMessageDialog(null,"No Match Found");
							 
				                                            }
						 int newword3=str.indexOf(d,pp1);
						 if(newword3>=0){
						 pp0=newword3;
						 pp1=pp0 + d.length();
						 count++;
						               }
						 else{
							 pp1=length+1;
						     }
															
							                   }
															//end highlighter3
                             c.add(area);
						   JScrollPane scroller = new JScrollPane(area, 
                           JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                           JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
						   scroller.setBounds(100,100,800,500);
                           c.add(scroller);
                           						  
				            			
				  JLabel label111 = new JLabel("Total No of Words Founds :" +count);
				  
				  label111.setFont(font1);
				  label111.setBounds(1000,100,400,450);
				  c.add(label111);
				  
				  
				  
				  
				  
		   Search1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				//Search_Action(event);
				  search_box1();
			}
		});
		  advsearch2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				//Search_Action(event);
				  search_box2();
			}
		});
		
	      advsearch3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				//Search_Action(event);
				  search_box3();
			}
		});
			
		advsearch4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				//Search_Action(event);
				  search_box4();
			}
		});
		
		advsearch5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				 
				  search_box();
			}
		});
		print25.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				  
				 System.exit(0);
			}
		});
			
		Sky_Blue.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				 Color clr=new Color(209,242,249);
                 c.setBackground(clr); 
				  
			}
		});
		light_pink.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				 Color clr=new Color(249,209,238);
                 c.setBackground(clr); 
				  
			}
		});
		white.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				 Color clr=new Color(255,255,255);
                 c.setBackground(clr); 
				  
			}
		});
		docmt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				  String str1="";
				  String p="doc.txt";
   try{											
	str1 = new Scanner(new File(p))
                          .useDelimiter("\\A").next();	
	   }	catch(Exception e){}
	   
        Font font1 = new Font("TimesRoman", Font.BOLD,20);
		Font font2 = new Font("Verdana", Font.BOLD,20);
		JFrame Frame=new JFrame();
        Frame.setVisible(true);
       // Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(1400,800);
        Frame.setLocation(0,0);
        Frame.setTitle("Help-Document");
		final Container c;
	 
	    c=Frame.getContentPane();
		c.setLayout(null);
		Color clr=new Color(226,223,243);
        c.setBackground(clr);	   
	   
JTextArea area = new JTextArea(1200,600);
Font font12 = new Font("Verdana", Font.BOLD,12);
area.setFont(font12);
area.setBounds(100,50,1200,600);
area.setEditable(false);
area.setText(str1);
c.add(area);
 JScrollPane scroller = new JScrollPane(area, 
JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
scroller.setBounds(100,50,1200,600);
c.add(scroller);
				  
			}
		});
	}
	
	//a class to select a file and create buffer to read file
	  
  public static void main(String[] argc) throws IOException,BadLocationException
  
 {
	Railway r=  new Railway();
	 
	
 }
/////////////////
public void search_box1()
	  {
		Font font1 = new Font("TimesRoman", Font.BOLD,20);
		Font font2 = new Font("Verdana", Font.BOLD,20);
		JFrame Frame=new JFrame();
        Frame.setVisible(true);
       // Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(700,500);
        Frame.setLocation(100,50);
        Frame.setTitle("Search For Only One Value");
		final Container c;
	 
	    c=Frame.getContentPane();
		c.setLayout(null);
		Color clr=new Color(226,223,243);
        c.setBackground(clr);
		search1=new JLabel("Search 1 :");
		search1.setFont(font1);
		search1.setBounds(100,100,100,50);
		
	    c.add(search1); 
	 
		
		srch1=new JTextField();
		srch1.setBounds(250,110,250,30);
		srch1.setFont(font2);
		srch1.setForeground(Color.BLUE);
		 
		c.add(srch1);
		
		submit=new JButton("Submit");	
        submit.setBounds(310,200,100,30);		
		c.add(submit);
		
     

		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				 if(srch1.getText() != null && srch1.getText().equals(""))
    JOptionPane.showMessageDialog(null, "Please Fill the Search Box");
                               
else{
	     
				String k1= srch1.getText();
				 
				 
				 
				
				
				JTextArea area = new JTextArea(800,800);
				Font font12 = new Font("TimesRoman", Font.BOLD,22);
				area.setFont(font12);
				area.setBounds(700,100,800,800);
				area.setEditable(false);
                area.setText(str);
				Highlighter highlighter = area.getHighlighter();
				 
						   // stating new highlighter1
                           HighlightPainter painter_a = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
						   int length=str.length();
                           int pq0 = str.indexOf(k1);
						   int pq1 = pq0 + k1.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_a );
						      }
						   catch (BadLocationException e1) {
					
					                       
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword1=str.indexOf(k1,pq1);
						 if(newword1>=0){
							pq0=newword1;
						 pq1=pq0 + k1.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							
			                                  }
														   //ending first highlighter
														    					
									 				   
														   
														   
														   
				           c.add(area);
						   JScrollPane scroller = new JScrollPane(area, 
                           JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                           JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
						   scroller.setBounds(600,100,600,600);
                           c.add(scroller);
           // }			   
             
			}
			}
		});

		}











/////////////////
////////////////////
 public void search_box2()
	  {
		Font font1 = new Font("TimesRoman", Font.BOLD,20);
		Font font2 = new Font("Verdana", Font.BOLD,20);
		JFrame Frame=new JFrame();
        Frame.setVisible(true);
       // Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(700,500);
        Frame.setLocation(100,50);
        Frame.setTitle("Search for two Value");
		final Container c;
	 
	    c=Frame.getContentPane();
		c.setLayout(null);
		Color clr=new Color(226,223,243);
        c.setBackground(clr);
		search1=new JLabel("Search 1 :");
		search1.setFont(font1);
		search1.setBounds(100,100,100,50);
		search2=new JLabel("Search 2 :");
		search2.setFont(font1);
		search2.setBounds(100,150,100,50);
		 	
		c.add(search1); 
		c.add(search2);
	 
		srch1=new JTextField();
		srch1.setBounds(250,110,250,30);
		srch1.setFont(font2);
		srch1.setForeground(Color.BLUE);
		srch2=new JTextField();
		srch2.setBounds(250,160,250,30);
		srch2.setFont(font2);
		srch2.setForeground(Color.BLUE);
		 
		
		c.add(srch1);
		c.add(srch2);
		 
		
		submit=new JButton("Submit");	
        submit.setBounds(310,200,100,30);		
		c.add(submit);
		
     

		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				 if(srch1.getText() != null && srch1.getText().equals(""))
    JOptionPane.showMessageDialog(null, "Please Fill the First Search Box");
                               
else{
	
	             if(srch2.getText() != null && srch2.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Please Fill the Second Search Box");
				 }
else{			 
		  
				  
 
				String k1= srch1.getText();
				String k2= srch2.getText();
				 
				 
				 
				
				
				JTextArea area = new JTextArea(800,800);
				Font font12 = new Font("TimesRoman", Font.BOLD,22);
				area.setFont(font12);
				area.setBounds(700,100,800,800);
				area.setEditable(false);
                area.setText(str);
				Highlighter highlighter = area.getHighlighter();
				 
						   // stating new highlighter1
                           HighlightPainter painter_a = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
						   int length=str.length();
                           int pq0 = str.indexOf(k1);
						   int pq1 = pq0 + k1.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_a );
						      }
						   catch (BadLocationException e1) {
					
					                       
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword1=str.indexOf(k1,pq1);
						 if(newword1>=0){
							pq0=newword1;
						 pq1=pq0 + k1.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							
							 
						                                   }
														   //ending first highlighter
														   // stating new highlighter2
                           HighlightPainter painter_b = new DefaultHighlighter.DefaultHighlightPainter(Color.CYAN);
						   length=str.length();
                           pq0 = str.indexOf(k2);
						   pq1 = pq0 + k2.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_b );
						      }
						   catch (BadLocationException e1) {
					
					                      
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword1=str.indexOf(k2,pq1);
						 if(newword1>=0){
							 pq0=newword1;
						 pq1=pq0 + k2.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							 }
												//ending 2nd Highlighter
                                                				   
														   
														   
														   
				           c.add(area);
						   JScrollPane scroller = new JScrollPane(area, 
                           JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                           JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
						   scroller.setBounds(600,100,600,600);
                           c.add(scroller);
           // }			   
             
			}
			}
			}
		});

		}	
///////////////////
/////////////////////
public void search_box3()
	  {
		Font font1 = new Font("TimesRoman", Font.BOLD,20);
		Font font2 = new Font("Verdana", Font.BOLD,20);
		JFrame Frame=new JFrame();
        Frame.setVisible(true);
       // Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(700,500);
        Frame.setLocation(100,50);
        Frame.setTitle("Search for three words");
		final Container c;
	 
	    c=Frame.getContentPane();
		c.setLayout(null);
		Color clr=new Color(226,223,243);
        c.setBackground(clr);
		search1=new JLabel("Search 1 :");
		search1.setFont(font1);
		search1.setBounds(100,100,100,50);
		search2=new JLabel("Search 2 :");
		search2.setFont(font1);
		search2.setBounds(100,150,100,50);
		search3=new JLabel("Search 3 :");
		search3.setFont(font1);
		search3.setBounds(100,200,100,50);
		 
		
				
		
		c.add(search1); 
		c.add(search2);
		c.add(search3);
		 
		
		srch1=new JTextField();
		srch1.setBounds(250,110,250,30);
		srch1.setFont(font2);
		srch1.setForeground(Color.BLUE);
		srch2=new JTextField();
		srch2.setBounds(250,160,250,30);
		srch2.setFont(font2);
		srch2.setForeground(Color.BLUE);
		srch3=new JTextField();
		srch3.setBounds(250,210,250,30);
		srch3.setFont(font2);
		srch3.setForeground(Color.BLUE);
		 
		
		c.add(srch1);
		c.add(srch2);
		c.add(srch3);
		 
		
		submit=new JButton("Submit");	
        submit.setBounds(310,300,100,30);		
		c.add(submit);
		
     

		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				 if(srch1.getText() != null && srch1.getText().equals(""))
    JOptionPane.showMessageDialog(null, "Please Fill the First Search Box");
                               
else{
	
	             if(srch2.getText() != null && srch2.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Please Fill the Second Search Box");
				 }
else{			 
		 if(srch3.getText() != null && srch3.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Please Fill the Third Search Box");
				 }
else{			
          	    String k1= srch1.getText();
				String k2= srch2.getText();
				String k3= srch3.getText(); 
				 
				 
				 
				
				
				JTextArea area = new JTextArea(800,800);
				Font font12 = new Font("TimesRoman", Font.BOLD,22);
				area.setFont(font12);
				area.setBounds(700,100,800,800);
				area.setEditable(false);
                area.setText(str);
				Highlighter highlighter = area.getHighlighter();
				 
						   // stating new highlighter1
                           HighlightPainter painter_a = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
						   int length=str.length();
                           int pq0 = str.indexOf(k1);
						   int pq1 = pq0 + k1.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_a );
						      }
						   catch (BadLocationException e1) {
					
					                       
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword1=str.indexOf(k1,pq1);
						 if(newword1>=0){
							pq0=newword1;
						 pq1=pq0 + k1.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							
							 
						                                   }
														   //ending first highlighter
														   // stating new highlighter2
                           HighlightPainter painter_b = new DefaultHighlighter.DefaultHighlightPainter(Color.CYAN);
						   length=str.length();
                           pq0 = str.indexOf(k2);
						   pq1 = pq0 + k2.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_b );
						      }
						   catch (BadLocationException e1) {
					
					                      
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword1=str.indexOf(k2,pq1);
						 if(newword1>=0){
							 pq0=newword1;
						 pq1=pq0 + k2.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							 }
												//ending 2nd Highlighter
                                                //stating 3rd Highlight
 
                           HighlightPainter painter_c = new DefaultHighlighter.DefaultHighlightPainter(Color.magenta);
						   length=str.length();
                           pq0 = str.indexOf(k3);
						   pq1 = pq0 + k3.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_c );
						      }
						   catch (BadLocationException e1) {
					
					                       
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword2=str.indexOf(k3,pq1);
						 if(newword2>=0){
							 pq0=newword2;
						 pq1=pq0 + k2.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							
							 
						                                   }
                                    //ending 3rd highlighter					   
				           c.add(area);
						   JScrollPane scroller = new JScrollPane(area, 
                           JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                           JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
						   scroller.setBounds(600,100,600,600);
                           c.add(scroller);
           // }			   
            }
			
			}
			}
			}
		});

		}
/////////////////////
////////////////////////
 public void search_box4()
	  {
		Font font1 = new Font("TimesRoman", Font.BOLD,20);
		Font font2 = new Font("Verdana", Font.BOLD,20);
		JFrame Frame=new JFrame();
        Frame.setVisible(true);
       // Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(700,500);
        Frame.setLocation(100,50);
        Frame.setTitle("Search");
		final Container c;
	 
	    c=Frame.getContentPane();
		c.setLayout(null);
		Color clr=new Color(226,223,243);
        c.setBackground(clr);
		search1=new JLabel("Search 1 :");
		search1.setFont(font1);
		search1.setBounds(100,100,100,50);
		search2=new JLabel("Search 2 :");
		search2.setFont(font1);
		search2.setBounds(100,150,100,50);
		search3=new JLabel("Search 3 :");
		search3.setFont(font1);
		search3.setBounds(100,200,100,50);
		search4=new JLabel("Search 4 :");
		search4.setFont(font1);
		search4.setBounds(100,250,100,50);
		 
		
				
		
		c.add(search1); 
		c.add(search2);
		c.add(search3);
		c.add(search4);
		 
		
		srch1=new JTextField();
		srch1.setBounds(250,110,250,30);
		srch1.setFont(font2);
		srch1.setForeground(Color.BLUE);
		srch2=new JTextField();
		srch2.setBounds(250,160,250,30);
		srch2.setFont(font2);
		srch2.setForeground(Color.BLUE);
		srch3=new JTextField();
		srch3.setBounds(250,210,250,30);
		srch3.setFont(font2);
		srch3.setForeground(Color.BLUE);
		srch4=new JTextField();
		srch4.setBounds(250,260,250,30);
		srch4.setFont(font2);
		srch4.setForeground(Color.BLUE);
	 
		
		c.add(srch1);
		c.add(srch2);
		c.add(srch3);
		c.add(srch4);
		 
		
		submit=new JButton("Submit");	
        submit.setBounds(310,350,100,30);		
		c.add(submit);
		
     

		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				 if(srch1.getText() != null && srch1.getText().equals(""))
    JOptionPane.showMessageDialog(null, "Please Fill the First Search Box");
                               
else{
	
	             if(srch2.getText() != null && srch2.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Please Fill the Second Search Box");
				 }
else{			 
		 if(srch3.getText() != null && srch3.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Please Fill the Third Search Box");
				 }
else{			
         if(srch4.getText() != null && srch4.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Please Fill the Forth Search Box");
				 }	 
else{
	
	    if(srch5.getText() != null && srch5.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Please Fill the Fifth Search Box");
				 }	
else{	      
				String k1= srch1.getText();
				String k2= srch2.getText();
				String k3= srch3.getText(); 
				String k4= srch4.getText();
				 
				 
				 
				
				
				JTextArea area = new JTextArea(800,800);
				Font font12 = new Font("TimesRoman", Font.BOLD,22);
				area.setFont(font12);
				area.setBounds(700,100,800,800);
				area.setEditable(false);
                area.setText(str);
				Highlighter highlighter = area.getHighlighter();
				 
						   // stating new highlighter1
                           HighlightPainter painter_a = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
						   int length=str.length();
                           int pq0 = str.indexOf(k1);
						   int pq1 = pq0 + k1.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_a );
						      }
						   catch (BadLocationException e1) {
					
					                       
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword1=str.indexOf(k1,pq1);
						 if(newword1>=0){
							pq0=newword1;
						 pq1=pq0 + k1.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							
							 
						                                   }
														   //ending first highlighter
														   // stating new highlighter2
                           HighlightPainter painter_b = new DefaultHighlighter.DefaultHighlightPainter(Color.CYAN);
						   length=str.length();
                           pq0 = str.indexOf(k2);
						   pq1 = pq0 + k2.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_b );
						      }
						   catch (BadLocationException e1) {
					
					                      
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword1=str.indexOf(k2,pq1);
						 if(newword1>=0){
							 pq0=newword1;
						 pq1=pq0 + k2.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							 }
												//ending 2nd Highlighter
                                                //stating 3rd Highlight
 
                           HighlightPainter painter_c = new DefaultHighlighter.DefaultHighlightPainter(Color.magenta);
						   length=str.length();
                           pq0 = str.indexOf(k3);
						   pq1 = pq0 + k3.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_c );
						      }
						   catch (BadLocationException e1) {
					
					                       
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword2=str.indexOf(k3,pq1);
						 if(newword2>=0){
							 pq0=newword2;
						 pq1=pq0 + k2.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							
							 
						                                   }
                                    //ending 3rd highlighter
                                   //stating 4th highlighter
 //stating 3rd Highlight
 
                           HighlightPainter painter_d = new DefaultHighlighter.DefaultHighlightPainter(Color.red);
						   length=str.length();
                           pq0 = str.indexOf(k4);
						   pq1 = pq0 + k4.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_d );
						      }
						   catch (BadLocationException e1) {
							   
					                                           }
						int newword4=str.indexOf(k4,pq1);
						 if(newword4>=0){
							 pq0=newword4;
						 pq1=pq0 + k4.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							
				             }
			//	endling 4th highlighter													   
		 							   
				           c.add(area);
						   JScrollPane scroller = new JScrollPane(area, 
                           JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                           JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
						   scroller.setBounds(600,100,600,600);
                           c.add(scroller);
            }			   
            }
			}
			}
			}
			}
		});

		}
////////////////////////
public void search_box()
	  {
		Font font1 = new Font("TimesRoman", Font.BOLD,20);
		Font font2 = new Font("Verdana", Font.BOLD,20);
		JFrame Frame=new JFrame();
        Frame.setVisible(true);
       // Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(700,500);
        Frame.setLocation(100,50);
        Frame.setTitle("Search");
		final Container c;
	 
	    c=Frame.getContentPane();
		c.setLayout(null);
		Color clr=new Color(226,223,243);
        c.setBackground(clr);
		search1=new JLabel("Search 1 :");
		search1.setFont(font1);
		search1.setBounds(100,100,100,50);
		search2=new JLabel("Search 2 :");
		search2.setFont(font1);
		search2.setBounds(100,150,100,50);
		search3=new JLabel("Search 3 :");
		search3.setFont(font1);
		search3.setBounds(100,200,100,50);
		search4=new JLabel("Search 4 :");
		search4.setFont(font1);
		search4.setBounds(100,250,100,50);
		search5=new JLabel("Search 5 :");
		search5.setFont(font1);
		search5.setBounds(100,300,100,50);
		
				
		
		c.add(search1); 
		c.add(search2);
		c.add(search3);
		c.add(search4);
		c.add(search5);
		
		srch1=new JTextField();
		srch1.setBounds(250,110,250,30);
		srch1.setFont(font2);
		srch1.setForeground(Color.BLUE);
		srch2=new JTextField();
		srch2.setBounds(250,160,250,30);
		srch2.setFont(font2);
		srch2.setForeground(Color.BLUE);
		srch3=new JTextField();
		srch3.setBounds(250,210,250,30);
		srch3.setFont(font2);
		srch3.setForeground(Color.BLUE);
		srch4=new JTextField();
		srch4.setBounds(250,260,250,30);
		srch4.setFont(font2);
		srch4.setForeground(Color.BLUE);
		srch5=new JTextField();
		srch5.setBounds(250,310,250,30);
		srch5.setFont(font2);
		srch5.setForeground(Color.BLUE);
		
		c.add(srch1);
		c.add(srch2);
		c.add(srch3);
		c.add(srch4);
		c.add(srch5);
		
		submit=new JButton("Submit");	
        submit.setBounds(310,400,100,30);		
		c.add(submit);
		
     

		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
		    {
				 if(srch1.getText() != null && srch1.getText().equals(""))
    JOptionPane.showMessageDialog(null, "Please Fill the First Search Box");
                               
else{
	
	             if(srch2.getText() != null && srch2.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Please Fill the Second Search Box");
				 }
else{			 
		 if(srch3.getText() != null && srch3.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Please Fill the Third Search Box");
				 }
else{			
         if(srch4.getText() != null && srch4.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Please Fill the Forth Search Box");
				 }	 
else{
	      //if(srch5.getText() != null && srch5.getText().equals("")){
   // JOptionPane.showMessageDialog(null, "Please Fill the Fifth Search Box");
		//		 }
//else{
				String k1= srch1.getText();
				String k2= srch2.getText();
				String k3= srch3.getText(); 
				String k4= srch4.getText();
				String k5= srch5.getText();
				 
				 
				
				
				JTextArea area = new JTextArea(800,800);
				Font font12 = new Font("TimesRoman", Font.BOLD,22);
				area.setFont(font12);
				area.setBounds(700,100,800,800);
				area.setEditable(false);
                area.setText(str);
				Highlighter highlighter = area.getHighlighter();
				 
						   // stating new highlighter1
                           HighlightPainter painter_a = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
						   int length=str.length();
                           int pq0 = str.indexOf(k1);
						   int pq1 = pq0 + k1.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_a );
						      }
						   catch (BadLocationException e1) {
					
					                       
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword1=str.indexOf(k1,pq1);
						 if(newword1>=0){
							pq0=newword1;
						 pq1=pq0 + k1.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							
							 
						                                   }
														   //ending first highlighter
														   // stating new highlighter2
                           HighlightPainter painter_b = new DefaultHighlighter.DefaultHighlightPainter(Color.CYAN);
						   length=str.length();
                           pq0 = str.indexOf(k2);
						   pq1 = pq0 + k2.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_b );
						      }
						   catch (BadLocationException e1) {
					
					                      
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword1=str.indexOf(k2,pq1);
						 if(newword1>=0){
							 pq0=newword1;
						 pq1=pq0 + k2.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							 }
												//ending 2nd Highlighter
                                                //stating 3rd Highlight
 
                           HighlightPainter painter_c = new DefaultHighlighter.DefaultHighlightPainter(Color.magenta);
						   length=str.length();
                           pq0 = str.indexOf(k3);
						   pq1 = pq0 + k3.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_c );
						      }
						   catch (BadLocationException e1) {
					
					                       
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword2=str.indexOf(k3,pq1);
						 if(newword2>=0){
							 pq0=newword2;
						 pq1=pq0 + k2.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							
							 
						                                   }
                                    //ending 3rd highlighter
                                   //stating 4th highlighter
 //stating 3rd Highlight
 
                           HighlightPainter painter_d = new DefaultHighlighter.DefaultHighlightPainter(Color.red);
						   length=str.length();
                           pq0 = str.indexOf(k4);
						   pq1 = pq0 + k4.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_d );
						      }
						   catch (BadLocationException e1) {
							   
					                                           }
						int newword4=str.indexOf(k4,pq1);
						 if(newword4>=0){
							 pq0=newword4;
						 pq1=pq0 + k4.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							
				             }
			//	endling 4th highlighter													   
										
                       //stating 5rd Highlight
 
                           HighlightPainter painter_e = new DefaultHighlighter.DefaultHighlightPainter(Color.orange);
						   length=str.length();
                           pq0 = str.indexOf(k5);
						   pq1 = pq0 + k5.length();
						   if(pq0==-1){count1=0;}
						   else{count1++;}
						    try{
						   while(pq1<=length){
						   try{
                           highlighter.addHighlight(pq0, pq1, painter_e);
						      }
						   catch (BadLocationException e1) {
					
					                       
										  //JOptionPane.showMessageDialog(null,"No Match Found");
				                                            }
						int newword5=str.indexOf(k5,pq1);
						 if(newword5>=0){
							 pq0=newword5;
						 pq1=pq0 + k5.length();
						 count1++;
						               }
						 else{
							 pq1=length+1;
						     }
							}		}catch(Exception e)	{}							
									//ending of 5th Highlighter					   
														   
														   
														   
				           c.add(area);
						   JScrollPane scroller = new JScrollPane(area, 
                           JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                           JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
						   scroller.setBounds(600,100,600,600);
                           c.add(scroller);
           // }			   
            }
			}
			}
			}
			}
		});

		}	
}