package Medium;

import java.util.Scanner;

public class MazePathD2Count {
	static Scanner scn = new Scanner(System.in);
	static int count = 0;

	public static void MazePath(int cr, int cc, int er, int ec, String ans) {
//		+vebc
		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			count++;
			return;
		}
//		-vebc
		if (cr > er || cc > ec) {
			return;
		}
		MazePath(cr + 1, cc, er, ec, ans + "V");
		MazePath(cr, cc + 1, er, ec, ans + "H");
		if (cr == cc || (cr + cc) == er)
			MazePath(cr + 1, cc + 1, er, ec, ans + "D");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = scn.nextInt();

		MazePath(0, 0, row - 1, row - 1, "");
		System.out.println();
		System.out.print(count);
	}

}
