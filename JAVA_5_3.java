interface X{
	void display();
}

class Y implements X{
	public void display(){
		System.out.println("Java");
	}
}

public class JAVA_5_3{
	public static void main(String[] args){
		Y r = new Y();
		r.display();
	}
}