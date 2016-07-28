import java.util.Random;

public class intArray {
	int[] array;

	intArray(int n) {
		array = new int[n];
	}

	intArray(int a[]) {
			array= a;
		}
	
public void output(){
	for(int i:array)
	{
		System.out.println(i);
	}
	}
	

public boolean isExist(int n) {
		for (int i : array) {
			if (array[i] == n)
				return true;
		}
		return false;
	}
	/*
	 * public boolean add(int n){
	 * }
	 */
public void sort() {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

public int getnthNumber(int n) {
		sort();
		return array[n - 1];
	}

	static int[] nums;
	static int n;

public static void main(String[] args) {
				Random ra = new Random();
				n = ra.nextInt(5) + 10;
				nums = new int[n];
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n - i - 1; j++) {
						if (nums[j] < nums[j + 1]) {
							int temp = nums[j];
							nums[j] = nums[j + 1];
							nums[j + 1] = temp;
						}
					}
				}
				//将随机生成的数组打印在屏幕上
				for (int i = 0; i < n; i++) {
					nums[i] = ra.nextInt(n * n) + 1;
					System.out.println(nums[i] + " ");
				}
				System.out.println();
				intArray arr=new intArray(nums);
				System.out.println("2是否存在："+arr.isExist(2));
				System.out.println("排序之后：");
				arr.sort();
				for(int i:nums)
				{
					System.out.println(i);}
				}
				//System.out.println("数组中第5大的数为："+arr.getnthNumber(5));
				
			
	}


