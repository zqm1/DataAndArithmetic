package com.pc.test.data.sparsearray;

public class SparseArray {
	public static void main(String[] args) {
		// ϡ������

		// ����һ��ԭʼ�Ķ�ά���� 11��11
		// 0����ʾû�����飬1��ʾ���� 2��ʾ����
		// ��ʼ������
		SparseArray sparseArray = new SparseArray();
		int chessArray[][] = sparseArray.initArray();
		for (int i = 0; i < chessArray.length; i++) {
			for (int j = 0; j < chessArray.length; j++) {
				if (j == chessArray.length - 1) {
					System.out.print(chessArray[i][j]);
					System.out.printf("\n");

				} else {
					System.out.print(chessArray[i][j]);
				}
			}
		}
		int sum = 0;
		// �ȱ����ж���ֵ
		for (int i = 0; i < chessArray.length; i++) {
			for (int j = 0; j < chessArray.length; j++) {
				if (chessArray[i][j] != 0) {
					sum++;
				}
			}
		}
		System.out.println(sum);
		
		
		//����ϡ������
		int sparse[][]=new int [sum+1][3];
		int count=0;
		//��ֵ
		sparse[0][0]=11;
		sparse[0][1]=11;
		sparse[0][2]=sum;
		for(int i=0;i<chessArray.length;i++) {
			for(int j=0;j<chessArray.length;j++) {
				if(chessArray[i][j]!=0) {
					count++;
					sparse[count][0]=i;
					sparse[count][1]=j;
					sparse[count][2]=chessArray[i][j];
				}
			}
		}
		System.out.println(sparse.length);
		
		  
		//���ϡ������
		for (int i = 0; i < sparse.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 2) {
					System.out.print(sparse[i][j]);
					System.out.printf("\n");

				} else {
					System.out.print(sparse[i][j]);
				}
			}
		}
		
	}

	// ��ʼ������
	public int[][] initArray() {
		int chessArray[][] = new int[11][11];
		chessArray[1][2] = 1;
		chessArray[2][3] = 1;
		chessArray[3][4] = 1;
		chessArray[1][3] = 2;
		chessArray[1][4] = 2;
		chessArray[1][5] = 2;
		return chessArray;
	}
}
