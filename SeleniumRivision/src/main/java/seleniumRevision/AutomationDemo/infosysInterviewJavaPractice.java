package seleniumRevision.AutomationDemo;

import java.util.Arrays;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class infosysInterviewJavaPractice {

	// reverse string
	public void ReverseString(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);
		System.out.println("--------------");
		StringBuffer sb = new StringBuffer("shubham");
		System.out.println(sb.reverse());

	}

	// reverse  senetence
	public void ReverseSentence() {
		String s = "jony jony yes papa";
		String arr[] = s.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");

		}
	}
	//reverse each word in sentence
	public void ReverseEachWordInSentence() {
		String s = "jony jony yes papa";
		
		String arr []= s.split(" ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(" ");
			for(int j = arr[i].length()-1;j>=0;j--){
				System.out.print(arr[i].charAt(j));
				
				
			}
		}
		
	}
	
	//occurence of each word in String
	public void OccurenceOfeachword() {
		String s = "jai mata di jor se bolo jai mata di jai jai jai bajrangwali ";
		String arr [] = s.split(" ");
		Map<String ,Integer> map = new LinkedHashMap<String, Integer>();
		for(String smap :arr) {
			if(!map.containsKey(smap)) {
				map.put(smap,1);
			}
			else {
				int i = map.get(smap);
				map.put(smap,i+1);
			}
		}
		System.out.println(map);
	}
	
	//occurence of each char in string
	public void OccurenceOfEachCharInString() {
		
		String s = "shubhamsaurabh";
		char schar[] = s.toCharArray();
		
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		for(char c :schar) {
			if(!map.containsKey(c)) {
				map.put(c,1);
				
			}
			else {
				int i = map.get(c);
				map.put(c,i+1);
			}
			
		}
		System.out.println(map);
		
	}
	
	public void RemoveDuplicatechar() {
		
		String s = "shubhamsaurabh";
		char sarr [] = s.toCharArray();
		Set<Character> duplicate = new LinkedHashSet<Character>();
		for(char c:sarr) {
			duplicate.add(c);
		
			
		}
		//System.out.println(duplicate);
		StringBuilder sb = new StringBuilder();
		for(Character c:duplicate) {
			sb.append(c);
			
		}
		
		System.out.println(sb);
		
	}
	
	// reverse number
	public void reverseNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to reverse  ");
		int a = sc.nextInt();

		int rev = 0;
		while (a != 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;
		}
		System.out.println(rev);

	}

	// check number is even or odd
	public void checkEvenOrOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check even or odd ");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

	// check given number is prime or not

	public void checkPrimeNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check prime or not ");
		int a = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= a; i++) {

			if (a % i == 0) {
				count++;
			}

		}
		if (count > 2) {
			System.out.println("not prime");

		} else {
			System.out.println("prime");
		}

	}

	// count prime numbers between two number
	public void countPrime(int a, int b) {
		int finalcount = 0;
		for (int i = a; i <= b; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i + ",");
				finalcount++;
			}
		}
		System.out.println();
		System.out.println("finalcount " + finalcount);
	}

	// .factorials
	public void factorials(int a) {
		int fact = 1;
		for (int i = a; i >= 1; i--) {
			fact = fact * i;

		}
		System.out.println(fact);
	}

	// to check string is palindrome or not
	public void CheckPlaindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(s);
		System.out.println(rev);
		if (s.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}

	}

	// find duplicate elements in a array
	public void findDuplicateElementsInArray() {

		int arr2[] = { 5, 4, 6, 8, 5, 8 };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] == arr2[j]) {
					System.out.print(arr2[i] + ",");
					System.out.println();

				}

			}

		}

	}

	// arrange arrays in ascending order
	public void ArrayAscendingOrder() {
		int arr[] = { 5, 4, 6, 8, 7, 2 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}
	// find max and min element in array

	public void FindMaxAndMinElementInArray() {
		int arr[] = { 5, 6, 8, 7, 3, 1 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("max :-" + max);
		System.out.println("min:-" + min);

	}

	public static void main(String[] args) {

		infosysInterviewJavaPractice i = new infosysInterviewJavaPractice();
		// i.checkPrimeNumber();
		// i.checkEvenOrOdd();
		// i.reverseNumber();
		// i.countPrime(5,100);
		// i.factorials(5);
		// i.CheckPlaindrome("aiojoia");
		// i.findDuplicateElementsInArray();
		// i.ArrayAscendingOrder();
		// i.ReverseString("diojdkn");
		// i.FindMaxAndMinElementInArray();
		//i.ReverseSentence();
		//i.ReverseEachWordInSentence();
		//i.OccurenceOfeachword();
		//i.OccurenceOfEachCharInString();
		i.RemoveDuplicatechar();
		

	}

}
