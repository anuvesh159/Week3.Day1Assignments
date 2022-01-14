package wee3.day1;

public class Calculator1 {
	
     public void add(int num1, int num2) {
		
	System.out.println(num1+num2);
		
	}
	
		public void add(int num1, int num2, int num3) {
			System.out.println(num1+num2+num3);
				
	}
	
		public void multiply(int num1, int num2) {
			System.out.println(num1*num2);
	}
		
		public void multiply(int num1, double num2) {
			System.out.println(num1*num2);
			
		}
		
		public void subtract(int num1, int num2) {
			System.out.println(num1-num2);
		}
		public void subtract(double num1,double num2)
		{
			double sub= num1-num2;
			System.out.println(sub);
		}
		
		public void divide(int num1, int num2)  {
			System.out.println(num1/num2);
		}
		
		public void divide(double num1, int num2)  {
		   double divide1= num1/num2;
		   System.out.println(divide1);
		}
	public static void main(String[] args) {
		
		Calculator1 calc = new Calculator1();
				
				calc.add(10, 10);
		        calc.add(10, 10, 10);
		        calc.subtract(10, 10);
		        calc.subtract(10, 10.05);
		        calc.multiply(10, 10.05);
		        calc.multiply(10, 10);
		        calc.divide(10, 10);
		        calc.divide(25.05, 1);

	}

}
