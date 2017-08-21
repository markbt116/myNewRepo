
public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] breakfast = new String[3];
		breakfast[0] = "Waffles";
		breakfast[1] = "coffee";
		breakfast[2] = "syrup";
		
		for (int i = 0; i < breakfast.length; i++){
			System.out.println(breakfast[i]);
		}
		
		MyClass mc = new MyClass();
		System.out.println(mc.myNum);
		mc.myMethod();
	}

}
