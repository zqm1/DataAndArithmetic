package com.pc.test.data.sparsearray;

public class SparseArray {
	public static void main(String[] args) {
		// 稀疏数组

		// 创建一个原始的二维数组 11×11
		// 0：表示没有数组，1表示黑子 2表示蓝子
		// 初始化数组
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
		// 先遍历有多少值
		for (int i = 0; i < chessArray.length; i++) {
			for (int j = 0; j < chessArray.length; j++) {
				if (chessArray[i][j] != 0) {
					sum++;
				}
			}
		}
		System.out.println(sum);
		
		
		//创建稀疏数组
		int sparse[][]=new int [sum+1][3];
		int count=0;
		//赋值
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
		
		  
		//输出稀疏数组
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

	// 初始化数组
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
