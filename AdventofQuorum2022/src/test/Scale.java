/*
 * Advent of Quorum
 * @author Yannick Tollenaere
 * 
 * www.jemaja.nl
 * 
 * 
 */

package test;

public class Scale {

	public static void main(String[] args) {
		//create array
		
		int[] weigths = new int[61];
		
		weigths[0] = 23212;
		weigths[1] = 38062;
		weigths[2] = 48020;
		weigths[3] = 120255;
		weigths[4] = 235323;
		weigths[5] = 241815;
		weigths[6] = 333821;
		weigths[7] = 407353;
		weigths[8] = 477076;
		weigths[9] = 481986;
		weigths[10] = 684464;
		weigths[11] = 829705;
		weigths[12] = 833311;
		weigths[13] = 908023;
		weigths[14] = 923943;
		weigths[15] = 950928;
		weigths[16] = 1001796;
		weigths[17] = 1011000;
		weigths[18] = 1053962;
		weigths[19] = 1132607;
		weigths[20] = 1146327;
		weigths[21] = 1154408;
		weigths[22] = 1160497;
		weigths[23] = 1166188;
		weigths[24] = 1255938;
		weigths[25] = 1278513;
		weigths[26] = 1329600;
		weigths[27] = 1425925;
		weigths[28] = 1429673;
		weigths[29] = 1527321;
		weigths[30] = 1547231;
		weigths[31] = 1550126;
		weigths[32] = 1581189;
		weigths[33] = 1598695;
		weigths[34] = 1608094;
		weigths[35] = 1659586;
		weigths[36] = 1691332;
		weigths[37] = 1736222;
		weigths[38] = 1738404;
		weigths[39] = 1746665;
		weigths[40] = 1749772;
		weigths[41] = 1753466;
		weigths[42] = 1785697;
		weigths[43] = 1796177;
		weigths[44] = 1800164;
		weigths[45] = 1880950;
		weigths[46] = 1882753;
		weigths[47] = 1925537;
		weigths[48] = 2036734;
		weigths[49] = 2079996;
		weigths[50] = 2125969;
		weigths[51] = 2141545;
		weigths[52] = 2155983;
		weigths[53] = 2258875;
		weigths[54] = 2266958;
		weigths[55] = 2282652;
		weigths[56] = 2327425;
		weigths[57] = 2356781;
		weigths[58] = 2363035;
		weigths[59] = 2463058;
		weigths[60] = 3838979;
		int count =0;
		//one on the left
		for(int i=0;i<=60;i++) {
			//System.out.println("Left animal: "+i+ " count: "+count);
			for(int j=0;j<i;j++) {
				if(i==j) {
					continue;
				}
				for(int k=0;k<=60;k++) {
					if(k == i || k == j) {
						continue;
					}
					for(int l=0;l<k;l++) {
						if(l == k || l == j || l == i) {
							continue;
						}
						if(weigths[i] == weigths[j]+weigths[k]+weigths[l]) {
							System.out.println("Balance: "+weigths[i]+" with one the left: "+i+ " and right: "+j+" "+k+" "+l);
							count++;
						} else {
							count++;
						}
					}
				}
			}
		}
			//two on the left
			for(int i=0;i<=60;i++) {
				
				for(int j=0;j<i;j++) {
					if(i==j) {
						continue;
					}
					//System.out.println("Left animals: "+i+ " and "+j +" count: "+count);
					for(int k=0;k<=60;k++) {
						if(k == i || k == j) {
							continue;
						}
						for(int l=0;l<k;l++) {
							if(l == k || l == j || l == i) {
								continue;
							}
							if(weigths[i]+weigths[j]==weigths[k]+weigths[l]) {
								int sum = weigths[i]+weigths[j];
								System.out.println("Balance: "+sum+" with one the left: "+i+ " and "+j+" right: "+k+" "+l);
								count++;
							} else {
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
	}
}
		
		


	


