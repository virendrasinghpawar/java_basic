package sortandsearch;

public class reverseWords {
public static void main(String[] args) {
	String para = "welcome to psl";
	String[] words= para.split(" ");
	
	 
	for (int i = 0; i < words.length; i++) {
		words[i]=new StringBuffer().append(words[i]).reverse().toString();
			 
	}
	StringBuffer sb =new StringBuffer();
	for(String word :words){
		sb.append(word +" ");
	}
	System.out.println(sb.toString());
}
}
