package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String str="madam";
		String strrev="";
		char[] str1 = str.toCharArray();
		for (int i = str1.length-1; i >= 0; i--) {
			strrev=strrev+str1[i];		
		}
		if(str.equalsIgnoreCase(strrev)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
			
		}

	}

}
