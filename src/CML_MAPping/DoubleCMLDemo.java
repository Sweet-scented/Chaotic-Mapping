package CML_MAPping;
import CML_MAPping.Map;
/**
 * 一维CML
 * z整数型的CML
 * n 是循环次数  时间上的变化
 * i 是格子数量  空间上的变化
 * 0.5 是变化系数
 * */
public class DoubleCMLDemo {
	public static double Mapping(double x) {
		return 4*x - 4 * x * x;
	}

	public static void main(String[] args) {
		int i = 3; // 格子数
		int n = 5; // 时间演化，迭代步数
		double[][] mapping_result = new double[i + 1][n + 1]; // 申请结果空间，大一圈
		mapping_result[0][0] = 0.1;
		mapping_result[1][0] = 0.2;
		mapping_result[2][0] = 0.3;
		//mapping_result[mapping_result.length-1][0] = 0.1;
//System.out.println(mapping_result.length-1);
	//	int index = 0;
		for (int col = 0; col < n; col++) {
			for (int row = 0; row < i; row++) {
				//mapping_result[row+1][mapping_result[1].length]=mapping_result[col][0];
				
				//边缘条件
				mapping_result[mapping_result.length-1][col] = mapping_result[0][col];
				
				// 没有添加 Logistic方程
				//mapping_result[row][col + 1] = mapping_result[row][col] + mapping_result[row + 1][col];
				
				//开始添加logistic 方程
			/*	mapping_result[row][col + 1] = Mapping(mapping_result[row][col]) 
						+  Mapping(mapping_result[row + 1][col]);*/
				
				// 开始添加系数
				mapping_result[row][col + 1] = 0.3 * Map.Mapping(mapping_result[row][col]) 
								+0.7 * Map.Mapping(mapping_result[row + 1][col]);
				
			}
			
		}
		new PrintDemo(mapping_result);
	}
}
