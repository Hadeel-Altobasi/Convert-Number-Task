import java.util.Scanner;

public class ConvertNumber {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String roman[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int decimal[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }; 
		System.out.println("plz enter number");
		String str = scan.next();
		if (Character.isDigit(str.charAt(0)))
		
			System.out.println(findRoamnNum(Integer.parseInt(str), roman , decimal));	
		else
			System.out.println(findDecimNum(str, roman , decimal));
			
		
		
	}
	private static int findDecimNum(String str , String roman[] , int[] decimal) {
		int deciNum=0 ,j=0;
		String rom;
	  while (str.length()!=0){
	    	rom=roman[j];
	    	while (str.indexOf(rom)!=0)
	    		{j++;
	    		rom=roman[j];}
	    	
	    	deciNum=deciNum+decimal[j];
	    	str=str.replaceFirst(rom, "");
	    	int l=str.length();
	    		
	    	
	    }
	
		
		
		return deciNum;
	
	}
	private static String findRoamnNum(int num , String[] roman, int decimal[]) {
		String romNum = "";
		if (num > 0 && num < 4000) {
			for (int i = 0; i < 13; i++) {
				while (num >= decimal[i]) {
					num = num - decimal[i];
					romNum = romNum + roman[i];
				}
			}

		}
		return romNum;
	
	}
	
}
