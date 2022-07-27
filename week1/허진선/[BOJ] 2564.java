import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2564 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // 가로
		int n = sc.nextInt(); // 세로
		int cnt = sc.nextInt(); // 상점의 개수
		
		// 좌표 계산
		int[][] map = new int[cnt+1][2];
		int[][] temp = new int[cnt+1][2];
		for (int i = 0; i < cnt+1; i++) {
			temp[i][0] = sc.nextInt();
			temp[i][1] = sc.nextInt(); // 블록의 북/남쪽에 위치한 경우 블록의 왼쪽 경계로부터의 거리를 나타내고,블록의 동/서쪽에 위치한 경우 블록의 위쪽 경계로부터의 거리를 나타낸다.
			
			if(temp[i][0] == 1) // 북
			{
				map[i][0] = 0;
				map[i][1] = temp[i][1];
			}
			else if(temp[i][0] == 2) //남
			{
				map[i][0] = n;
				map[i][1] = temp[i][1];
			}
			else if(temp[i][0] == 3) // 서
			{
				map[i][0] = temp[i][1];
				map[i][1] = 0;
			}
			else // 동
			{
				map[i][0] = temp[i][1];
				map[i][0] = m;
			}
			//System.out.println(Arrays.toString(map[i]));
		}
		
		// 거리 계산
		
		for (int i = 0; i < cnt; i++) {
			int len1 = map[i][0]+map[i][1];
			int len2 = 0;
			if(temp[i][0] == 1) // 북
			{
				len1 += temp[i][1]; 
			}
			else if(temp[i][0] == 2) //남
			{
			}
			else if(temp[i][0] == 3) // 서
			{
				
			}
			else // 동
			{
			}
		}
	}
}
