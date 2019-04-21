package net.ukr.andy777;

import java.util.Map;
import java.util.TreeMap;

public class ASCIIletters {

	private Map<Character, int[]> asciiLetters = new TreeMap<Character, int[]>();
	private int[] otherLetter = new int[] { 0, 0, 0, 0, 0, 66, 126, 0 };

	public ASCIIletters() {
		super();
		asciiLetters.put('A', new int[] { 24, 60, 102, 102, 126, 102, 102, 0 });
		asciiLetters.put('B', new int[] { 124, 102, 102, 124, 102, 102, 124, 0 });
		asciiLetters.put('C', new int[] { 60, 102, 192, 192, 192, 102, 60, 0 });
		asciiLetters.put('D', new int[] { 120, 108, 102, 102, 102, 108, 120, 0 });
		asciiLetters.put('E', new int[] { 126, 96, 96, 120, 96, 96, 126, 0 });
		asciiLetters.put('F', new int[] { 126, 96, 96, 120, 96, 96, 96, 0 });
		asciiLetters.put('G', new int[] { 60, 102, 192, 192, 206, 102, 62, 0 });
		asciiLetters.put('H', new int[] { 102, 102, 102, 126, 102, 102, 102, 0 });
		asciiLetters.put('I', new int[] { 24, 24, 24, 24, 24, 24, 24, 0 });
		asciiLetters.put('J', new int[] { 6, 6, 6, 6, 102, 102, 60, 0 });
		asciiLetters.put('K', new int[] { 102, 102, 108, 120, 108, 102, 102, 0 });
		asciiLetters.put('L', new int[] { 96, 96, 96, 96, 96, 96, 126, 0 });
		asciiLetters.put('M', new int[] { 198, 238, 254, 254, 214, 198, 198, 0 });
		asciiLetters.put('N', new int[] { 198, 230, 246, 222, 206, 198, 198, 0 });
		asciiLetters.put('O', new int[] { 60, 102, 102, 102, 102, 102, 60, 0 });
		asciiLetters.put('P', new int[] { 124, 102, 102, 124, 96, 96, 96, 0 });
		asciiLetters.put('Q', new int[] { 60, 102, 102, 102, 110, 60, 14, 0 });
		asciiLetters.put('R', new int[] { 124, 102, 102, 124, 108, 102, 102, 0 });
		asciiLetters.put('S', new int[] { 60, 102, 112, 56, 14, 102, 60, 0 });
		asciiLetters.put('T', new int[] { 126, 24, 24, 24, 24, 24, 24, 0 });
		asciiLetters.put('U', new int[] { 102, 102, 102, 102, 102, 102, 62, 0 });
		asciiLetters.put('V', new int[] { 102, 102, 102, 102, 102, 60, 24, 0 });
		asciiLetters.put('W', new int[] { 198, 198, 198, 214, 254, 238, 198, 0 });
		asciiLetters.put('X', new int[] { 102, 102, 60, 24, 60, 102, 102, 0 });
		asciiLetters.put('Y', new int[] { 102, 102, 102, 60, 24, 24, 24, 0 });
		asciiLetters.put('Z', new int[] { 254, 6, 12, 24, 48, 96, 254, 0 });
	}

	public Map<Character, int[]> getAsciiLetters() {
		return asciiLetters;
	}

	public int[] getOtherLetter() {
		return otherLetter;
	}

}
