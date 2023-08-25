interface X{
	class Question{
		int i;
		public Question(int i){
			this.i = ++i;
		}

		int disp(){
			return ++i;
		}
	}
}

public class JAVA_5_4{
	public static void main(String[] args){
		X.Question c = new X.Question(1);
		System.out.println(c.disp());
	}
}