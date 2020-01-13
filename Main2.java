package aa;

 class Tet {
 public void display() {
	 System.out.println("hello"); 
 }
}
public class Main2
{ 
	public static void main(String[] args) {
		Tet t=new Tet()
				{
			//@override
			public void display()
			{
				System.out.println("good morning");
			}
			};
				t.display();
	}
}
	