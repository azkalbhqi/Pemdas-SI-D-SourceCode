package com.TugasPemdasSID;

import java.util.Scanner;

public class BauKetek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        int row = sc.nextInt();
        int column = sc.nextInt();
        char[][] arr = new char[row][column];
        char[][] arrFix = new char[row][column];

        // Reading the grid
        for (int i = 0; i < row; i++) {
            arr[i] = sc.next().toCharArray();
        }

        // Directions to check adjacent cells
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        // Processing the grid
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrFix[i][j] = (arr[i][j] == 'm' || arr[i][j] == 'k') ? '0' : arrFix[i][j];
                
                if (arr[i][j] == 'p') {
                    arrFix[i][j] = '1';

                    // Check adjacent cells and mark 't' as '1'
                    for (int[] dir : directions) {
                        int newRow = i + dir[0], newCol = j + dir[1];
                        if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < column && arr[newRow][newCol] == 't') {
                            arrFix[newRow][newCol] = '1';
                        }
                    }
                }
            }
        }

        // Output the result
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arrFix[i][j] == '1' ? '1' : '0');
            }
            System.out.println();
        }
    }
}