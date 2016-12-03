package sortandsearch;


public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String para=" here is waht we needz  tiget persistent limited system";
	String [] words=para.split(" ");
	//System.out.println(words[0].compareTo(words[1]));
	
	for (int j = 0; j < words.length-1; j++) {
		
	
	for (int i = 0; i < (words.length)-1; i++) {
		if (words[i].compareTo(words[i+1])>0) {
			String temp= words[i+1];
			words[i+1]=words[i];
			words[i]=temp;
			
		}
	}
	}
	for(String word:words)
	{
		System.out.println(word);
	}
	
	}

}
