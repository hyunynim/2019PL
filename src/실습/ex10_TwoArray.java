package �ǽ�;

public class ex10_TwoArray {
	public static void main(String[] args) {
		int two_array[][] = new int[4][5];
		int i, j, k = 0;
		for (i = 0; i < 4; i++){
			for(j = 0; j < 5; j++){
				two_array[i][j] = k;
				k++;
			}
		}
		for(i = 0; i < 4; i++){
			for(j = 0; j < 5; j++)
				System.out.print(two_array[i][j] + " ");
			System.out.println();
		}
	}
}
