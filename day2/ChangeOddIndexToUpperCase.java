package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str = "changeoddindextouppercase";
		char[] chrarr = str.toCharArray();
		for (int i = 0; i < chrarr.length; i++) {
			if(i%2!=0) {
				System.out.print(Character.toUpperCase(chrarr[i]));
			}else {
				System.out.print(Character.toLowerCase(chrarr[i]));
			}

		}


	}

	}


