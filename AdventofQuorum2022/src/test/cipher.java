

/*
 * Advent of Quorum
 * @author Yannick Tollenaere
 * 
 * www.jemaja.nl
 * 
 * 
 */

package test;

import java.util.Arrays;

public class Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ciphered = "CUbWn UWffUi.UsioUh q.Whaf ZUliXinUehiqUcnUWffmUqcnbUsiolUNcenieUWhZUsiolUZcmYiUZWhY mVUQb hUCUqWmUsiolUWa Uq Uom ZUniUom UqWmbchaUgWYbch mUniUmnil UZWnWVUufmiUjf Wm UjcYeUojUjloh mVU aamVUWhZU.ilnsUm p hUfcnl mUi.UsiolU.Wpilcn UYiiechaUicfV";
		String key = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ .";
		String index = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ .";
		char[] keyArray = key.toCharArray();
		char[] indexArray = index.toCharArray();
		char[] cipherArray = ciphered.toCharArray();
		char[] decipher = new char[241];
		for(int i=0;i<54;i++)
		{
			int x = keyArray[i];
			
			for(int j=0;j<241;j++) {
				
				decipher[j] = decode(cipherArray[j],i,key);
				//System.out.println(cipherArray[j]+"-> "+decipher[j]+ " key "+i);
			}
		String str = Arrays.toString(decipher);	
		System.out.println(str);	
		}

	}

	private static char decode(char c, int i, String key) {
		int x=0;
		int y =0;
		char[] keyArray = key.toCharArray();
		for(int l=0;l<54;l++) {
			if(keyArray[l]== c) {
				//found index
				x=l;
				//System.out.println("y:"+y);
			}
		y = (x+i)%54;
		
		
		}
		//System.out.println("y:"+y);
		return keyArray[y];
	}

}
//a 97 z122
//A65 Z90
// space 32 .56
F