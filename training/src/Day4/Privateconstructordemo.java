package Day4;

public class Privateconstructordemo {

		public static void main(String s[]) {
			// Can't create object with private constructor
			// MyClass m1=new MyClass();
			
			ThirdpackTheclass m=ThirdpackTheclass.getObject();
			m.setId(10);
			
			ThirdpackTheclass m1=ThirdpackTheclass.getObject();
			
			System.out.println(m);
			System.out.println(m1);
			
		}
	}


