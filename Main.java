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
		
		System.out.print("input word: ");
		String word = sc.next();
		ascii.printASCIIString(word);
	}
}
