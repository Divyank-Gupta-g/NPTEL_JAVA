//Complete the code segment to call the default method in the interface First and Second.

interface First{  
    default void show(){ 			// default method
        System.out.println("Default method implementation of First interface."); 
    } 
} 
  
interface Second{ 
    default void show(){ 			// Default method 
        System.out.println("Default method implementation of Second interface."); 
    } 
} 
  
// Implementation class code
 
public class Question44 implements First, Second{ 
    public void show(){				// Overriding default show method 
        
        First.super.show();			// Call show() of First interface.
        
        Second.super.show();			// Call show() of Second interface.
    } 
  
    public static void main(String args[]){ 
        Question44 q = new Question44(); 
        q.show(); 
    } 
}