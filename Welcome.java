import java.util.Random;

public class Welcome {
	static int[][] a;
	static int corner;
	static int n;

	public static void main(String[] args) {
		Random ra = new Random();
		corner = ra.nextInt(4) + 1;
		// corner 代表角落
		// 1: 左上角 2：左下角 3： 右上角 4: 右下角
		System.out.println("Initial Position = " + corner);
		 n = ra.nextInt(3) + 2;
		System.out.println("n = " + n);
		// 创建数组a[n][n]
		a = new int[n][n];

		int X = 0, Y = 0;
		// 开始填数组元素a[X][Y]，注意初始位置（填1）由corner决定
		switch (corner) {
		case 1: {
			X = 0;
			Y = 0;
			break;
		}
		case 2: {
			X = n - 1;
			Y = 0;
			break;
		}
		case 3: {
			X = 0;
			Y = n - 1;
			break;
		}
		case 4: {
			X = n - 1;
			Y = n - 1;
			break;
		}
		}
		a[X][Y] = 1;// 行列弄反
		// 开始按逆时针顺序填写整个数组
		int round = 0;
		for (int i = 2; i <= (n * n); i++) {
			if (Y == round && X != round)// 向上
			{
				if (X == round + 1 && corner == 1) {
					Y++;
					round++;
				} else
					X--;
				a[X][Y] = i;

				continue;
			}
			if (X == (n - 1 - round) && Y != round)// 向左
			{
				if (Y == round + 1 && corner == 2) {
					X--;
					round++;
				} else
					Y--;
				a[X][Y] = i;
				continue;
			}
			if (X == round && Y != (n - 1 - round))// 向右
			{
				if (Y == (n - round - 2) && corner == 3) {
					X++;
					round++;
				} else
					Y++;
				a[X][Y] = i;
				continue;
			}
			if (Y == (n - 1 - round) && X != (n - 1 - round))// 向下
			{
				if (X == (n - round - 2) && corner == 4) {
					Y--;
					round++;
				} else
					X++;
				a[X][Y] = i;

				continue;
			}
		}

		// 显示结果
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.println(a[j][i]);
			}
			System.out.println('\n');
		}

		for (int j = 0; j < n; j++) {
			for (int i : a[n]) {
				System.out.print(i);
			}
			System.out.println();
		}

		// test();
	}

	
	  //以下为课堂练习3：螺旋程序的测试 
	public static void test() { 
		// 将a, corner, n作为input,判断a[][]是不是正确的结果
		
	  
	  }
	 
}
