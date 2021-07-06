import java.util.ArrayList;

public class PowerArray {
	
		public static void toPower(int size, int power) {
			ArrayList<Integer> base = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				base.add((int) Math.pow(i, power));
			}

			System.out.println(base);
		}

		public static void main(String[] args) {
			toPower(4, 2);
			
		}

	}
