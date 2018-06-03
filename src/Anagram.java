import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Anagram {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("src/wordi things.txt"));
			String word = JOptionPane.showInputDialog("enter word: ");
			String thing = "";
			String newword = "";
			String remainingletters = "";
			int combototry = 0;
			int repeatsletter = 0;
			boolean repeatsletters;
			ArrayList<String> hello = new ArrayList<String>();
			combototry = word.length();
			for (int i = 0; i < word.length(); i++) {
				char letter = word.charAt(i);
				for (int j = 0; j < word.length(); j++) {
					if (word.charAt(j) == letter) {
						repeatsletter++;
					}
				}
			}
			if (repeatsletter > word.length()) {
				repeatsletters = true;
			} else {
				repeatsletters = false;
			}
			System.out.println(repeatsletters);
			if (repeatsletters == false) {
				System.out.println("hello");
				
				for (int i = 0; i < combototry; i++) {
					remainingletters = "";
					newword = Character.toString(word.charAt(i));
					System.out.println("newword = " + newword);
					
					for (int j = 0; j < word.length(); j++) {
						
						if (word.charAt(j) == word.charAt(i)) {

						} else {
							remainingletters += word.charAt(j);
							//System.out.println(remainingletters);
							
						}
					}

					System.out.println(remainingletters);
				}
			}

			while (in.hasNextLine()) {
				thing = in.nextLine();

				// take character @ 0
				// leave it
				// rearrange remaining letters however possible
				// take character @ 1
				// leave it
				// rearrange remaining letters however possible

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
