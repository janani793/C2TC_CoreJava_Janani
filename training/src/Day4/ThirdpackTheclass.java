package Day4;

public class ThirdpackTheclass {
		private static ThirdpackTheclass obj=new ThirdpackTheclass();
		private int id;
		
		public int getId()
		{
			return id;
		}
		
		public void setId(int id)
		{
			this.id=id;
		}
		
		private ThirdpackTheclass() {
			System.out.println("MyClass object created");		
		}
		
		public static ThirdpackTheclass getObject() //factory method
		{
			return obj;
		}

		@Override
		public String toString() {
			return "MyClass [id=" + id + "]";
		}
		
	}


