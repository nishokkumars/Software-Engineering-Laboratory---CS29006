class Overload
{
	void test(){
		System.out.println(" no parameters\n");
	}
	void test(int a){
		System.out.println("a="+a);
	}
	void test(int a,int b){
		System.out.println("a and b are :"+a+" "+b);
	}
	double test(double a){
		System.out.println("double a is :"+a);
		return a*a;
	}
	
}
public class OverloadDemo{
	public static void main(String args[]){
		Overload ob=new Overload();
		double result;
		ob.test();
		ob.test(10);
		ob.test(10,20);
		result=ob.test(123.25);
		System.out.println("result of ob.test(123.25) = "+result);
		
	}
}

