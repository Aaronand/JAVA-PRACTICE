import java.util.Random;

public class Welcome {
	static int[][] a;
	static int corner;
	static int n;

	public static void main(String[] args) {
		Random ra = new Random();
		corner = ra.nextInt(4) + 1;
		// corner �������
		// 1: ���Ͻ� 2�����½� 3�� ���Ͻ� 4: ���½�
		System.out.println("Initial Position = " + corner);
		 n = ra.nextInt(3) + 2;
		System.out.println("n = " + n);
		// ��������a[n][n]
		a = new int[n][n];

		int X = 0, Y = 0;
		// ��ʼ������Ԫ��a[X][Y]��ע���ʼλ�ã���1����corner����
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
		a[X][Y] = 1;// ����Ū��
		// ��ʼ����ʱ��˳����д��������
		int round = 0;
		for (int i = 2; i <= (n * n); i++) {
			if (Y == round && X != round)// ����
			{
				if (X == round + 1 && corner == 1) {
					Y++;
					round++;
				} else
					X--;
				a[X][Y] = i;

				continue;
			}
			if (X == (n - 1 - round) && Y != round)// ����
			{
				if (Y == round + 1 && corner == 2) {
					X--;
					round++;
				} else
					Y--;
				a[X][Y] = i;
				continue;
			}
			if (X == round && Y != (n - 1 - round))// ����
			{
				if (Y == (n - round - 2) && corner == 3) {
					X++;
					round++;
				} else
					Y++;
				a[X][Y] = i;
				continue;
			}
			if (Y == (n - 1 - round) && X != (n - 1 - round))// ����
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

		// ��ʾ���
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

	
	  //����Ϊ������ϰ3����������Ĳ��� 
	public static void test() { 
		// ��a, corner, n��Ϊinput,�ж�a[][]�ǲ�����ȷ�Ľ��
		
	  
	  }
	 
}
