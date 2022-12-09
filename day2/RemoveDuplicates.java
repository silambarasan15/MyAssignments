package week1.day2;

public class RemoveDuplicates {
	public static void main(String[] args) {
				
		String txt = "We learn java basics as part of java sessions in java week1";
		int count =0;
		String[] txtnew = txt.split(" ");
		for (int i = 0; i < txtnew.length; i++) {
			for (int j = i+1; j < txtnew.length; j++) {
				if(txtnew[i].equalsIgnoreCase(txtnew[j])) {
					count=count+1;					
					}
				
				}
			if(count>1) {
				System.out.println(txt.replace(txtnew[i], ""));
				break;
				
			}
			
		}

}
}
