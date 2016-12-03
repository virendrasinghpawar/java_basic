package sortandsearch;



public class sort {

	static int[] swap(int[] array , int i, int j){
		 int temp= array[i];
		 array[i]=array[j];
		 array[j]=temp;
		 return array;
		 
		 
	}
	static int[] bubblesort(int[] array){
		for (int i = 0; i < (array.length); i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i]<array[j])
					swap(array,i,j);
				
					
					
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array ={1,4,2,66,5,3};
		
		for(int i:bubblesort(array))
		{
			System.out.println(i);
		}
	}

}
