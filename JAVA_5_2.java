class Question{
	static int x;
	static{
		x++;
	}
	{
		++x;
	}
}

class Question1 extends Question{
	static{
		--x;
	}
	{
		x--;
	}
}

public class JAVA_5_2{
	public static void main(String[] args){
		System.out.println(new Question1().x);
	}
}