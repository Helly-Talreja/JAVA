package Prac;
import java.util.*;
public class Exp32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first String");
		
		String str=sc.nextLine();
		
		System.out.println("Character at indx  3 is "+str.charAt(3));
		System.out.println("Length of string is "+str.length());
		System.out.println("String in uppercase is "+str.toUpperCase());
		System.out.println("String in lowercase is "+str.toLowerCase());
		System.out.println("String after adding another string "+ str.concat(" welcome all"));

	}

}
