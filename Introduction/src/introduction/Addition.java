package introduction;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner tuna = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("enter first number");
		fnum = tuna.nextDouble();
		System.out.println("enter second number");
		snum = tuna.nextDouble();
		answer = fnum+snum;
				System.out.println(answer);
		
	}

}
