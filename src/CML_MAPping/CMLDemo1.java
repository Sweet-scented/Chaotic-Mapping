package CML_MAPping;

import java.util.Arrays;
import CML_MAPping.PrintDemo;

/**
 * ��ӱ�Ե����
 * 
 * z�����͵�CML n ��ѭ������ ʱ���ϵı仯 i �Ǹ������� �ռ��ϵı仯
 */
public class CMLDemo1 {
	public static int Mapping(int x) {
		return 1 - 4 * x * x;
	}

	public static void main(String[] args) {
		int i = 3; // ������
		int n = 5; // ʱ���ݻ�����������
		int[][] mapping_result = new int[i + 1][n + 1]; // �������ռ䣬��һȦ
		//��ʼ������    
		mapping_result[0][0] = 1;
		mapping_result[1][0] = 2;
		mapping_result[2][0] = 3;
		mapping_result[mapping_result.length-1][0] = 1;
//System.out.println(mapping_result.length-1);
	//	int index = 0;
		for (int col = 0; col < n; col++) {
			for (int row = 0; row < i; row++) {
				//mapping_result[row+1][mapping_result[1].length]=mapping_result[col][0];
				//��Ե����
				mapping_result[mapping_result.length-1][col] = mapping_result[0][col];
				// û����� Logistic����
				//mapping_result[row][col + 1] = mapping_result[row][col] + mapping_result[row + 1][col];
				//��ʼ���logistic ����
				mapping_result[row][col + 1] = Mapping(mapping_result[row][col]) 
						+ Mapping(mapping_result[row + 1][col]);
				
			}
			
		}
		new PrintDemo(mapping_result);
	}
}
