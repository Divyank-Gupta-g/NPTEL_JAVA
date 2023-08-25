class X{
	static{
		Y.display();
	}
}

class Y extends X{
	static void display(){
		System.out.println("Java");
	}
}

public class JAVA_5_5{
	public static void main(String[] args){
		Y.display();
	}
}