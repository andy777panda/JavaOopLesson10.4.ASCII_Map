package net.ukr.andy777;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

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
		File file = new File (".\\src\\net\\ukr\\andy777\\asciiLetters.txt");
		Scanner sc = new Scanner(System.in);
		ASCIIletters ascii = new ASCIIletters(file);
		System.out.print("input word: ");
		String word = sc.next();
		ascii.printASCIIString(word);
	}
}
