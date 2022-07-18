package stampede;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.*;
public class Composit {
	
	
	public static void main(String[] args) {
		int index =0;
		int finalIndex =0;
	for(int i=2;i<100000;i+=2) {
		if(!MainPrime.isPrime(i))
		{
			//found composite number
			index++;
			if(index ==5456) {
				System.out.println(index +" at place: "+i);
				finalIndex = i;
				i=100000000;
			}
		}
	}
	FileInputStream fis;
	try {
		fis = new FileInputStream("C:\\EnergyComponents\\TheClownNames.txt");
	
		Scanner sc=new Scanner(fis);    //file to be scanned  
		//returns true if there is another line to read  
		int x=0;
		while(sc.hasNextLine())  
			{  
			String str = sc.nextLine();
			if(finalIndex == x) {
				System.out.println(str);
			}
			x++;
			}  
		sc.close();  
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
}
}

