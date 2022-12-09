package week1.day2;

public class ReverseEvenWords {
	String text = "We learn java basics as part of java sessions in java week1";
	int count =0;
	String[] textnew = text.split(" ");
	for (int i = 0; i < textnew.length; i++) {
		for (int j = i+1; j < textnew.length; j++) {
			if(textnew[i].equalsIgnoreCase(textnew[j])) {
				count=count+1;					
				}
			
			}
		if(count>1) {
			System.out.println(text.replace(textnew[i], ""));
			break;
			
		}
		
	}
	

}

}
