/*
 * Advent of Quorum
 * @author Yannick Tollenaere
 * 
 * www.jemaja.nl
 * 
 * 
 */

package stampede;
import java.io.*;  
import java.util.Scanner;  
public class Caloric {

	public static void main(String[] args) {
		char[][] map = new char[200][200];
		int calories = 0;
		char direction = 'E';
		int[] pos = new int[2];
		boolean hot = false;
		pos[0] = 0;
		pos[1] =0;
		int step =0;
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\EnergyComponents\\map.txt");
		int i =0;   
		Scanner sc=new Scanner(fis);    //file to be scanned  
		//returns true if there is another line to read  
		while(sc.hasNextLine())  
		{  
		String str = sc.nextLine();
		//System.out.println(str);      //returns the line that was skipped 
		map[i] = str.toCharArray();
		for(int j =0;j<200;j++) {
			if (map[i][j] == 'X') {
				pos[0]=j;
				pos[1]=i;
				//we found start
				System.out.println("start at: "+pos[0]+" " +pos[1]);
			}
			
		}
		i++;
		}  
		sc.close();     //closes the scanner  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		
		while(pos[0] > -1&& step <50000) {
			step++;
			pos = move(pos[0],pos[1],direction);
			//read the new pos record
			System.out.println(pos[0]+" "+pos[1]+direction+calories);
			if(pos[0] == -1) {
				System.out.println("moved out calories:"+calories);
				step = 60000;
			}
			char rec = map[pos[0]][pos[1]];
			switch (rec) {
			case 'T':
				direction = changeDirRight(direction);
				calories = calories+1222;
				break;
			case 'K':
				direction = changeDirRight(direction);
				calories = calories+813;
				break;
			case 'P':
				direction = changeDirRight(direction);
				calories = calories+654;
				break;	
			case 'F':
				direction = changeDirRight(direction);
				if(!hot) {
					calories = calories+955;
				}
				hot = true;
				break;
			case 'H':
				direction = changeDirLeft(direction);
				calories = calories+569;
				break;
			case 'L':
				direction = changeDirLeft(direction);
				calories = calories+498;
				break;
			case 'S':
				direction = changeDirLeft(direction);
				calories = calories+812;
				break;
			case 'C':
				direction = changeDirLeft(direction);
				calories = calories+4500;
				break;
			case 'O':
				
				calories = calories+1678;
				break;
			case 'D':
				hot = false;
				calories = calories+499;
				break;
			}
				
		}
		System.out.println(step +"end" + calories);

	}
	private static char changeDirLeft(char direction) {
		switch (direction) {
		case 'E':
			return 'N';
		case 'S':
			return 'E';
		case 'W':
			return 'S';
		case 'N':
			return 'W';
		}
		return 0;
	}
	private static char changeDirRight(char direction) {
		switch (direction) {
		case 'E':
			return 'S';
		case 'S':
			return 'W';
		case 'W':
			return 'N';
		case 'N':
			return 'E';
		}
		return 0;// TODO Auto-generated method stub
		
	}
	static int[] move(int x, int y, char d) {
		switch(d) {
		case 'N':
			y--;
			break;
		case 'S':
			y++;
			break;
		case 'E':
			x++;
			break;
		case 'W':
			x--;
			break;
		}
		if(y>200 || y<0 || x>200 || x<0) {
			x=-1;
			y=-1;
		}
		int[] retv = new int[2];
		retv[0] =x;
		retv[1] =y;
		return retv;
	}

}
