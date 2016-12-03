package hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.Box.Filler;

public class hangman {
	static public void Guessing(String word){
		Scanner s= new Scanner(System.in);


		int life=6;




		char[] Filer=new char[word.length()];
		char[] charWord=word.toCharArray();
		ArrayList<Character> selectedChars=new ArrayList<Character>();
		List<Integer> position=new ArrayList<Integer>();
		
		for (int i = 0; i < charWord.length; i++) {
			if(charWord[i]==' '){
				Filer[i]=' ';
				
			}else if(charWord[i]=='-'){
				Filer[i]='-';
			}

		}
		while (life>0) {
			//ISystem.out.println("Next character");
			
			char c;
			c=s.nextLine().charAt(0);;
			
			while (selectedChars.contains(Character.valueOf(c))) {
				System.out.println("already entered Please try something diffrent ");
				 c=s.nextLine().charAt(0);
			}
			
			

				selectedChars.add(c);

				
				
				int flagContain=0;
				position.clear();
				for (int i = 0; i < charWord.length; i++) {
					if(charWord[i]==c){
						position.add(i);
						flagContain=1;
					}

				}
				if (flagContain==0) {
					life--;
					System.out.println("life remain"+life);
				}
				
			
				for (Integer fillIndex : position) {
					Filer[fillIndex]=c;


				}
				if (String.valueOf(Filer).equals(word)) {
					System.out.println("CONGRATULATIONyou won ");
				}
				System.out.println(Filer);


			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String GuessWord="INDIA-IINDORE";
		Guessing(GuessWord);

	}

}
