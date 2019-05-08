import java.util.Scanner;

public class HelloJAVA {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("문자열을 입력하십시오 : ");
		String str = scn.next();
		System.out.print("문자를 입력하십시오 : ");
		char alpha = scn.next().charAt(0);
		scn.close();
		int num = countChar(str, alpha);
		System.out.println("입력한 문자는 " + num + "번째 문자입니다");
	}

	static int countChar(String s, char c) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != c)
				count++;
			else
				break;
		}
		return count+1;
	}
}
