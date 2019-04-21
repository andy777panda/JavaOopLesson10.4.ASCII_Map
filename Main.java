package net.ukr.andy777;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*
 Lesson10
 4. Реализуйте программу, которая сопоставит каждой букве ее представление в виде ASCII - art, например
 .      *
 .     * *
 .    *   *
 А=  *******
 .  *       *
 . *         *
 Ваша программа должна дать возможность вывода произвольного текста на экран в виде его ASCII-art представления. 
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ASCIIletters ascii = new ASCIIletters();
		int[] ch;
		
		System.out.print("input word: ");
		String word = sc.next();
		char[] letters = word.toUpperCase().toCharArray();
		for (int i = 0; i < 8; i++) {
			for (char letter : letters) {
				if(ascii.getAsciiLetters().containsKey(letter))
					ch = ascii.getAsciiLetters().get(letter);
				else ch=ascii.getOtherLetter();
				System.out.print(String.format("%8s", Integer.toBinaryString(ch[i])).replace('0', ' ').replace('1', '#')+"  ");
			}
			System.out.println();
		}
	}
}
