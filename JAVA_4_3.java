/*The program in this assignment is attempted to print the following output: 

-----------------OUTPUT-------------------
This is large
This is medium
This is small
This is extra-large
-------------------------------------------------
*/

interface ExtraLarge{
	String extra = "This is extra-large";
    	void display();
}

class Large {
    public void Print() {
        System.out.println("This is large");
    }
}
 
class Medium extends Large {
    public void Print() {
    	super.Print();  
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
        super.Print();  
        System.out.println("This is small");
    }
  }
 
public class JAVA_4_3 implements ExtraLarge{
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
	  JAVA_4_3 q = new JAVA_4_3();
	  q.display();
    }
  public void display(){
    System.out.print(extra);
    }
}