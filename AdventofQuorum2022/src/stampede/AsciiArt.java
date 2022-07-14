package stampede;

import java.io.*;  
import java.util.Scanner;  

public class AsciiArt {
	public static void main(String[] args) {
		char[][] map = new char[600][600];
		FileInputStream fis;
		AsciiLine[] lineArray = new AsciiLine[1];
		lineArray[0] = new AsciiLine();
		try {
			fis = new FileInputStream("C:\\EnergyComponents\\segments.csv");
		
			Scanner sc=new Scanner(fis);    //file to be scanned  
			//returns true if there is another line to read  
			while(sc.hasNextLine())  
				{  
				String str = sc.nextLine();
				//System.out.println(str);      

				int row = Integer.parseInt(str.substring( 0, str.indexOf(",")));
				String remainder = str.substring(str.indexOf(",")+1, str.length());
				int col = Integer.parseInt(remainder.substring( 0, remainder.indexOf(",")));
				String art = remainder.substring(remainder.indexOf(",")+1, remainder.length());
				/*for(int l =art.length();l<8;l++) {
					art = art+ " "; //Pad with spaces
				}
				char[] artArray = new char[8];

				artArray = art.toCharArray();
				*/
				 
				if(art.length()>0) {
					char[] artArray = new char[art.length()];
					artArray = art.toCharArray();
					if(row < lineArray.length) {
						// line array big enough, we can add the art
						try {
							lineArray[row].addArt(col*8, artArray);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						lineArray = increaseArray(lineArray, row+1);
						try {
							lineArray[row].addArt(col*8, artArray);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				
				}  
			sc.close();  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		
		//Now print the art
		for(int k=0;k<lineArray.length;k++) {
			System.out.println(lineArray[k].toString());
		}
	}
	
	private AsciiLine[] lineArrayGrow(AsciiLine[] or) {
		AsciiLine[] newArray = new AsciiLine[or.length+1];
		for (int i=0;i<or.length;i++) {
			newArray[i] = or[i];
		} 
		return newArray;
	}
	
	private static AsciiLine[] increaseArray(AsciiLine[] or,int y) {
		if(y <= or.length) {
			return or;
		}
		AsciiLine[] newArray = new AsciiLine[y];
		for (int i=0;i<y;i++) {
			if(i<or.length) {
				newArray[i] = or[i];
			} else {
				newArray[i] = new AsciiLine();
			}
				
		} 
		return newArray;
	}
}
