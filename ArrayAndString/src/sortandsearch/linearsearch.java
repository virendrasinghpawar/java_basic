package sortandsearch;


public class linearsearch {

	static boolean lineraSearch(int[] array ,int no){
		for (int i = 0; i < array.length; i++) {
			if(no==array[i])
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array ={1,2,3};
		int no =2;
		
		
		System.out.println(lineraSearch(array, no));
	}

}
