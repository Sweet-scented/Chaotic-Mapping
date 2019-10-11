package CML_MAPping;

public class PrintDemo {
public PrintDemo(int[][] mapping_result) {
	// TODO Auto-generated constructor stub
	for (int row = 0; row < mapping_result.length; row++) {
		for (int col = 0; col < mapping_result[1].length; col++) {
			System.out.print(mapping_result[row][col] + "  ");
		}
		System.out.println();
	}
}

	public PrintDemo(double[][] mapping_result) {
		// TODO Auto-generated constructor stub
		for (int row = 0; row < mapping_result.length; row++) {
			for (int col = 0; col < mapping_result[1].length; col++) {
				System.out.print(mapping_result[row][col] + "  ");
			}
			System.out.println();
		}
	}

}
