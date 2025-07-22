// In the Main class
//public class Adittion {
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		int c = a+b;
//		System.out.println("the addition of the two number is = " + c);
//	}
//}

//CREATING METHOD AND OBJECT TO PRIN THE SUM 
public class Adittion{
	public void Add() {
		int a,b,c;
		a=20;
		b=30;
		c=a+b;
		System.out.println("add of two number is = " +c);
	}
	public static void main(String[] args) {
		Adittion add = new Adittion();
		add.Add();
	}
}