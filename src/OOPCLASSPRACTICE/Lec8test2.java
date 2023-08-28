package OOPCLASSPRACTICE;

public class Lec8test2 {
	
	public int number1=10;//public access modifier
	
	int number2=12;//default a.m
	
	private String flower="rose";//private a.m
	
	public void method1(){
		
		System.out.println("nextechitc");
	}
	
	void method2(){
		
		System.out.println("nexttechitcBD");
	}
	
	private void method3(){
		
		System.out.println("lonestarus");
	}
	public static void main(String[]args){
		//oop 
		Lec8test2 obj=new Lec8test2();
		System.out.println(obj.flower);
		obj.method1();
		System.out.println(obj.number2);
		
		
	}

}
