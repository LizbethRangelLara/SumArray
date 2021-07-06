
public class SumAllValues {

	public static void sumAllVal(int[] val) {
		
		int sum = 0;
		for(int i=0; i< val.length; i++) {
			sum += val[i];
		}
		
		System.out.println("The sum of the array is: " + sum);
	}
	
	public static void main(String[] args ) {
		int []numbers = {1,23,6,7,3,14}; 
		
		sumAllVal(numbers);
	}


}
