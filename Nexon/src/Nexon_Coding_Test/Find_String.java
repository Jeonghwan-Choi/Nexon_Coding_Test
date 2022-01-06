package Nexon_Coding_Test;

public class Find_String {

	public static void main(String[] args) {
		String[] phone_book = {"123","456","789","1334" };
		boolean answer = true;
		for(int i=1; i<phone_book.length; i++) {
			if(phone_book[i].contains(phone_book[0])) {
				answer = false;
			}			
		}
		System.out.println(answer);
	}
}
