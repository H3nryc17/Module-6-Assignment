package week5;  
import java.awt.*;  
import java.awt.event.*;  

public class AWTExample2 extends Frame {  
   
    public AWTExample2() {  
          
        Label l = new Label("Employee id:");  

          
        Button submitButton = new Button("Submit");  

         
        Button exitButton = new Button("Exit");  

       
        TextField t = new TextField();  

       
        l.setBounds(20, 80, 80, 30);  
        t.setBounds(20, 100, 80, 30);  
        submitButton.setBounds(100, 100, 80, 30);  
        exitButton.setBounds(100, 150, 80, 30);   

       
        add(l);  
        add(t);  
        add(submitButton);  
        add(exitButton);  

          
        setSize(400, 300);  

         
        setTitle("Employee Info");  

        
        setLayout(null);  

        
        setVisible(true);  

        
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  // Exit the application
            }
        });

          
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);  
            }
        });
    }  

     
    public static void main(String[] args) {  
        new AWTExample2();    
    }  
}
