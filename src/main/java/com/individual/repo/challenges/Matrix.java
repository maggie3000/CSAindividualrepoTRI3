package com.individual.repo.challenges;
/*
Write a Java program to print a formatted matrix in ways shown below,
add to menu. Arrays and nested loops are fundamental to data structures.
Key learning 1: use the toString method to format and output String,
using toString is a common way to see the data inside and object.
Key learning 2: college board requires familiarity with 2D-arrays,
accessing cells using nested for loops is standard way to extract
 data from a matrix.
 */

public class Matrix {
    private final int[][] matrix;

    // store matrix
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // Hack: create toString method using nested for loops to format output of a matrix


    // declare and initialize a matrix for a keypad
    static int[][] keypad() {
        return new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} };
    }

    // declare and initialize a random length arrays
    static int[][] numbers() {
        return new int[][]{ { 0, 1 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
    }

    // tester method for matrix formatting
    public static void main(String[] args) {
        Matrix m0 = new Matrix(keypad());
        System.out.println("Keypad:");
        System.out.println(m0);

        Matrix m1 = new Matrix(numbers());
        System.out.println("Numbers Systems:");
        System.out.println(m1);
    }

}

/*
SAMPLE OUTPUT
=============

Keypad:
1 2 3
4 5 6
7 8 9
  0

  0
9 8 7
6 5 4
3 2 1

Numbers Systems:
0 1
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9 a b c d e f

f e d c b a 9 8 7 6 5 4 3 2 1 0
9 8 7 6 5 4 3 2 1 0
1 0
 */