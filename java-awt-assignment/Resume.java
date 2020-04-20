

import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;


public class Resume extends Frame implements ActionListener,WindowListener,ItemListener {
	
	
	Frame f;
	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	TextArea t15,t16;
	Label title,l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	Checkbox m,c,o;
	CheckboxGroup cbg;
	Choice l;
	Button b;
	
	Resume()
	{
		f = new Frame();
		// f.setBackground(Color.GRAY);
		
		
		Font myFont = new Font("arial",Font.BOLD,17);
		
		title = new Label("RESUME");
		title.setBounds(200,30,100,15);
		 title.setFont(myFont);
		 
		 
		
		l0 = new Label("Personal Details");
		l0.setBounds(20,60,200,12);
		 l0.setFont(myFont);
		
		l1 = new Label("First name :-");
		l1.setBounds(10, 120, 100, 20);
		
		t1 = new TextField(50);
		t1.setBounds(120, 120, 100, 20);
		
		l2 = new Label("Last name :-");
		l2.setBounds(10, 150, 100, 20);
		
		t2 = new TextField(50);
		t2.setBounds(120, 150, 100, 20);
		
		l3 = new Label("Sex :-");	
		l3.setBounds(80,180,40,20);
		
		cbg = new CheckboxGroup();
		m  = new Checkbox("Male", cbg, false);
		m.setBounds(150,180,40,20);
		
		c = new Checkbox("Female", cbg, false);
		c.setBounds(220,180,80,20);
		
		o = new Checkbox("Others", cbg, false);
		o.setBounds(300,180,60,20);
		
		l4 = new Label("DOB ( dd/mm/yy):-");
		l4.setBounds(10,210,100,20);
		
		t4 = new TextField(10);
		t4.setBounds(120,210,100,20);
		
		l13 = new Label("Father's Name :-");
		l13.setBounds(10,240,100,20);
		
		t13 = new TextField(50);
		t13.setBounds(120,240,100,20);
		
		l11 = new Label("Email Address :-");
		l11.setBounds(10,250,100,20);
		
		t11 = new TextField(50);
		t11.setBounds(120,270,100,20);
		

		l12 = new Label("Mobile no. :-");
		l12.setBounds(10,300,100, 20);
		
		t12 = new TextField(15);
		t12.setBounds(120, 300, 100, 20);
		
		l14 = new Label("Postal Address :-");
		l14.setBounds(10,330,100,20);
		
		t14 = new TextField(150);
		t14.setBounds(120,330,300,20);
	
	
		l5 = new Label("Educational Details");
		l5.setBounds(20,380,180,20);
		 l5.setFont(myFont);
		 
		 l6 = new Label("Institute Name:-");
		 l6.setBounds(10,440,100,20);
		 
		 t6 = new TextField(100);
		 t6.setBounds(120,440,300,20);
		 
		 l8 = new Label("Branch:-");
		 l8.setBounds(10,470,80,20);
		 
		 t8 = new TextField(10);
		 t8.setBounds(120,470,200,20);
		 
		 l7 =  new Label("Semester:-");
		 l7.setBounds(10,500,80,20);
		 
		 l9 = new Label("CGPA:-");
		 l9.setBounds(10,530,80,20);
		 
		 t9 = new TextField(10);
		 t9.setBounds(120,530,150,20);
		 
		 l10 = new Label("Area of Interest:-");
		 l10.setBounds(10,560,100,20);
		 
		 t10 = new TextField(20);
		 t10.setBounds(120,560,150,20);
		 
		 l15 = new Label("Skills :-");
		 l15.setBounds(10,590,100,20);
		 
		 t15 = new TextArea();
		 t15.setBounds(120,590,200,70);
		 
		 l16 = new Label("Hobbies :-");
		 l16.setBounds(10,680,100,20);
		 
		 t16 = new TextArea();
		 t16.setBounds(120,680,200,70);
		 

		 
		 l = new Choice();
		 l.setBounds(120,500,150,25);
		 
		 l.add("1");
		 l.add("2");
		 l.add("3");
		 l.add("4");
		 l.add("5");
		 l.add("6");
		 l.add("7");
		 l.add("8");
		 l.add("completed");
		 
		 b = new Button("Submit");
		 b.setBounds(200,780,70,20);
		
		

		add(title);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(m);
		add(c);
		add(o);
		add(l4);
		add(t4);
		add(l13);
		add(t13);
		add(l11);
		add(t11);
		add(l12);
		add(t12);
		add(l14);
		add(t14);
		add(l5);
		add(l0);
		add(l6);
		add(t6);
		add(l7);
		add(l);
		add(l8);
		add(t8);
		add(l9);
		add(t9);
		add(l10);
		add(t10);
		add(l15);
		add(t15);
		add(l16);
		add(t16);
		add(b);
	
		setLayout(null);
		
		setSize(500,820);
		setVisible(true);
		addWindowListener(this);
		b.addActionListener(this);
		m.addItemListener(this);
	    c.addItemListener(this);
	    o.addItemListener(this);
	 
		
		
		
	}
	
	
	@Override public void windowClosing(WindowEvent evt) {
	      System.exit(0);
	   }
	
	
	
	String str = "";
	public void itemStateChanged(ItemEvent e)
	  {
		 
	    if(m.getState() == true)
	      str = "Male";
	    else if(c.getState() == true)
	      str = "Female";
	    else if(o.getState() == true)
	      str = "Other";
	           
	    
	  }

	
	
	public void actionPerformed (ActionEvent ae)
	{
		
		
		 String firstName = t1.getText();
         String lastName = t2.getText();
         String dob = t4.getText();
         String fatherName = t13.getText();
         String emailAddress = t11.getText();
         String contact = t12.getText();
         String address = t14.getText();
         String instituteName = t6.getText();
         String branch = t8.getText();
         String sem = l.getSelectedItem();
         String cg = t9.getText();
         String interest = t10.getText();
         String skills = t15.getText();
         String hobbies = t16.getText();
         
         try{    
             FileWriter fw=new FileWriter("C:\\Users\\HP\\Desktop\\Resume.txt");    
             fw.write("-----------------------RESUME-------------------------------\n\n\n"); 
             fw.write("\n\n Personal Details");
             fw.write("\n\n First Name :- "+ firstName + "\t");  
             fw.write(" Last Name :-"+ lastName);
             fw.write("\n\n Sex :-  "+ str);
             fw.write("\n\n Date of Birth :-  "+ dob);
             fw.write("\n\n Father's Name :-  "+ fatherName);
             fw.write("\n\n Email Address :-  "+ emailAddress);
             fw.write("\n\n Mobile Number :-  "+ contact);
             fw.write("\n\n Postal Address :-  "+ address);
             fw.write("\n\n ----------------------------------------------------------------");
             fw.write("\n\n EDUCATION");
             fw.write("\n\n Institute name :- "+ instituteName);
             fw.write("\n\n Branch :- "+ branch);
             fw.write("\n\n Semester :- "+ sem);
             fw.write("\n\n CGPA :- "+ cg);
             fw.write("\n\n Interest :- "+ interest);
             fw.write("\n\n Skills :- "+ skills);
             fw.write("\n\n Hobbies :- "+ hobbies);
             fw.close();    
            }catch(Exception e){System.out.println(e);}    
            System.out.println("Success..."); 
      
		
	}
	
	public static void main (String args[]) {
		 new Resume();
		 
		
	}
	 @Override public void windowOpened(WindowEvent evt) { }
	   @Override public void windowClosed(WindowEvent evt) { }
	   @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
	   @Override public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified"); }
	   @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
	   @Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated"); }
	}
