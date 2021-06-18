import java.util.Scanner;

public class UnicoDigito {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, k = 0;
		int sum = 0;
		int digitoUnico;
		
		System.out.println("Input n: ");
		n = sc.nextInt();
		System.out.println("Input k: ");
		k = sc.nextInt();
		
		String num = String.valueOf(n * k);
		
		int numbers = Integer.parseInt(String.valueOf(num));
		
	    while (numbers > 0) {
			sum += (numbers % 10);
			numbers /= 10;
		}
		digitoUnico = sum;
		System.out.println();
	 
			if(digitoUnico > 10) {	
			} else {
				numbers = digitoUnico;
				sum = 0; 
				while (numbers > 0 ) {
					sum += (numbers % 10);
					numbers /= 10;
				}
				digitoUnico = sum; 
			}
			{
				numbers = digitoUnico;
				sum = 0;
				while (numbers > 0 ) {
					sum += (numbers % 10);
					numbers /= 10;
				}
				digitoUnico = sum; 
				System.out.println(digitoUnico);
			}
		 
	
		sc.close();
	}
}