package OOPCLASSPRACTICE;

public class Lec9InheritanceParent {
	
public int number1=10;//public access modifier
	
	int number2=12;//default a.m
	
	private String flower="rose";//private a.m
	protected String car="BMw";
	
	public void method1(){
		
		System.out.println("nextechitc");
	}
	
	void method2(){
		
		System.out.println("nexttechitcBD");
	}
	
	private void method3(){
		
		System.out.println("lonestarus");
	}
	protected void method4(){
		System.out.println("Wafir");
	}
	public static void main(String[]args){
		//oop 
		Lec9InheritanceParent obj=new Lec9InheritanceParent();
		System.out.println(obj.flower);
		obj.method1();
		System.out.println(obj.number2);
		
		
	}

}



