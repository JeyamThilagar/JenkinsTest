package mock;

public class Practice {

        public static void main(String[] args) {
			String str="God";
			System.out.println("The permutations of string are:");
			int length=str.length();
			permuation(str,0,length);
		}
        public static void permuation(String str, int start, int end) {
        	if(start==end-1) {
        		System.out.println(str);
        	} else {
        		for(int i=start;i<end;i++) {
        			str=swapstring(str,start,i);
        			permuation(str,start+1,end);
        			str=swapstring(str,start,i);
        		}
        	}
        }
		private static String swapstring(String str, int start, int end) {
			char ch[]=str.toCharArray();
			char c;
			c=ch[start];
			ch[start]=ch[end];
			ch[end]=c;
			return String.valueOf(ch);
		}
}
