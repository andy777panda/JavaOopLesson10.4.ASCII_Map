package net.ukr.andy777;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ASCIIletters {

	private Map<Character, int[]> asciiLetters = new TreeMap<Character, int[]>();
	private int[] otherLetter = new int[] { 0, 0, 0, 0, 0, 66, 126, 0 };

	public ASCIIletters(File file) {
		super();
		// symbole-codes from http://arduino.on.kg/matrix-font
		loadMapFromFile(file);
	}

	public void loadMapFromFile(File file) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String symbol = "";
			for (; (symbol = br.readLine()) != null;) {
				String[] arr = symbol.split(", ");
				asciiLetters.put(arr[0].charAt(0), new int[] { Integer.parseInt(arr[1]), Integer.parseInt(arr[2]),
					Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]),
					Integer.parseInt(arr[6]), Integer.parseInt(arr[7]), Integer.parseInt(arr[8]) });
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void printASCIIString(String word) {
		int[] ch;
		char[] letters = word.toUpperCase().toCharArray();
		for (int i = 0; i < 8; i++) {
			for (char letter : letters) {
				if (asciiLetters.containsKey(letter))
					ch = asciiLetters.get(letter);
				else
					ch = otherLetter;
				System.out.print(String.format("%8s", Integer.toBinaryString(ch[i])).replace('0', ' ')
						.replace('1', '#')
						+ "  ");
			}
			System.out.println();
		}
	}
}
