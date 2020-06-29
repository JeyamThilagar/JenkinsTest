package conversionpractice;

public class StringSplit {
	public static void main(String[] args) {
		String string = "abcdefg1234hij";
		String finalstring="";
		String digit="";
		char car[] = string.toCharArray();
		for (char iterate : car) {
			if(Character.isDigit(iterate)){
				digit=digit+iterate;
			}else{
				finalstring=finalstring+iterate;
			}	
		}
		System.out.println("Integers:"+digit);
		System.out.println("String:"+finalstring);
	}
}
