import java.util.Scanner;

public class BOJ_02564 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		int[][] location = new int[n][2];
		int[] res = new int[n];
		
		for (int i = 0; i < n; i++) {
			location[i][0] = sc.nextInt();
			location[i][1] = sc.nextInt();
		}
		
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = location[i][0];
			int y = location[i][1];
			if (x == d1) {
				res[i] = Math.abs(y - d2);
			} else {
				int a = 0, b = 0;
				if (d1 == 1) {
					if (x == 2) {
						a = d2 + c + y;
						b = (r-d2) + c + (r-y);
					} else if (x == 3) {
						a = d2 + y;
						b = r-d2 + c + r + c-y;
					} else if (x == 4) {
						a = r-d2 + y;
						b = d2 + c + r + c-y;
					}
					
				} else if (d1 == 2) {
					if (x == 1) {
						a = y + c + d2;
						b = r-y + c + r-d2;
					} else if (x == 3) {
						a = c-y + d2;
						b = y + r + c + r-d2;
					} else if (x == 4) {
						a = c-y + r-d2;
						b = d2 + c + r + y;
					}
					
				} else if (d1 == 3) {
					if (x == 1) {
						a = d2 + y;
						b = c-d2 + r + c + r-y;
					} else if (x == 2) {
						a = c-d2 + y;
						b = d2 + r + c + r-y;
					} else if (x == 4) {
						a = d2 + r + y;
						b = c-d2 + r + c-y;
					}
					
				} else if (d1 == 4) {
					if (x == 1) {
						a = r-y + d2;
						b = y + c + r + c-d2;
					} else if (x == 2) {
						a = r-y + c-d2;
						b = y + c + r + d2;
					} else if (x == 3) {
						a = y + r + d2;
						b = c-y + r + c-d2;
					}
				}
				res[i] = Math.min(a, b);
			}
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += res[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
