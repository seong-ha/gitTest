package co.edu.reference;

public class ArrayExample04 {

	public static void main(String[] args) {
		int[][] banArr = new int[][] { { 80, 85, 83 }, { 79, 84, 90 } };
//		banArr[0][0] = 80;
//		banArr[0][1] = 85;
//		banArr[0][2] = 83;
//		banArr[1][0] = 79;
//		banArr[1][1] = 84;
//		banArr[1][2] = 90;

		for (int i = 0; i < banArr.length; i++) {
			int sum = 0;
			
			for (int j = 0; j < banArr[i].length; j++) {
				sum += banArr[i][j];
			}

			String ban =  (i == 0) ? "A" : "B";

			System.out.printf("%s반 총점은 %d점이고, 평균은 %.1f입니다.\n"
							, ban, sum, (double) sum / banArr[i].length);
		}

	}

}
