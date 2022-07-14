/*
 * Advent of Quorum
 * @author Yannick Tollenaere
 * 
 * www.jemaja.nl
 * 
 * 
 */

package stampede;

public class MainPrime {

	public static void main(String[] args) {
		int dollar = 0;
		for(int h = 1100; h<2400;h=h+100 ) {
			for(int m = 00; m<60;m++) {
				int check = h+m;
				if(isPrime(check)) {
					dollar = dollar+13;
					System.out.println("found prime: "+check+"  amount to pay: "+dollar);
				}
			}
			
		}
		

	}
	public static boolean isPrime(int number) {
		boolean isItPrime = true;
		 
		if(number <= 1) 
		{
		isItPrime = false;
		 
		return isItPrime;
		}
		else
		{
		for (int i = 2; i<= number/2; i++) 
		{
		if ((number % i) == 0)
		{
		isItPrime = false;
		 
		break;
		}
		}
		 
		return isItPrime;
		}
		
	}

}
