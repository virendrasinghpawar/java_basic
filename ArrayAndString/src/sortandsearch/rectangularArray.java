package sortandsearch;

public class rectangularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] [] rectarray=new int[13][13];
		for (int i = 0; i < rectarray.length; i++) {
			for (int j = 0; j < rectarray[i].length; j++) {
				
				  if (i==0 && j==0) {
					//rectarray[i][j]=j;
					
				}
				  if(i!=0&&j==0)
					  rectarray[i][j]=i;
				  else if(i==0&&j!=0)
				  rectarray[i][j]=j;
				  else
				  rectarray[i][j]=i*j;
			}
		}
		
		//System.out.println(rectarray);
		for (int i  = 0;  i< rectarray.length; i++) {
			for (int j = 0; j < rectarray.length; j++) {
				System.out.print(rectarray[i][j]+"	");
			}
			System.out.println();
		}
		
	}

}
