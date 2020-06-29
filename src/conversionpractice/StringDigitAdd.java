package conversionpractice;

public class StringDigitAdd {
public static void main(String[] args) {
	String string="xyoi1hfo45hvd778";
	int digits=0;
	String digit="";
	String finalstring="";
	char character[]=string.toCharArray();
	for(int i=0;i<character.length;i++){
		if(Character.isDigit(character[i])){
			digit=digit+character[i];
		} else
		if(digit!="") {
			digits=digits+Integer.parseInt(digit);
			digit="";
		}
		}
	digits=digits+(Integer.parseInt(digit));
	System.out.println(finalstring);
	System.out.println(digits);
	}
}