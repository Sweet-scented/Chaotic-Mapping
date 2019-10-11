package CML_MAPping;

import java.util.Arrays;

/**
 * 没有添加边缘条件
 * z整数型的CML n 是循环次数 时间上的变化 i 是格子数量 空间上的变化
 */
public class CMLDemo {


	public static void main(String[] args) {
		int i = 3; // 格子数
		int n = 5; // 时间演化，迭代步数
		int[][] mapping_result = new int[i + 1][n + 1]; // 申请结果空间，大一圈
		mapping_result[0][0] = 1;
		mapping_result[1][0] = 2;
		mapping_result[2][0] = 3;
		mapping_result[mapping_result.length-1][0] = 1;
//System.out.println(mapping_result.length-1);
		for (int col = 0; col < n; col++) {
			for (int row = 0; row < i; row++) {
				//mapping_result[row+1][mapping_result[1].length]=mapping_result[col][0];
						
				mapping_result[row][col + 1] = mapping_result[row][col] + mapping_result[row + 1][col];
				
			}
			//边缘条件
			//mapping_result[0][col]=mapping_result[mapping_result.length-1][col];
		}
		for (int row = 0; row < mapping_result.length; row++) {
			for (int col = 0; col < mapping_result[1].length; col++) {
				System.out.print(mapping_result[row][col] + "  ");
			}
			System.out.println();
		}
	}
}
