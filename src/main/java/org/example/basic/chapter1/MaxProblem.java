package org.example.basic.chapter1;

public class MaxProblem {

    public static void main(String[] args) {
        MaxProblem maxProblem = new MaxProblem();
        int maxResult = maxProblem.firstMaxProblem(10,20,40,30);
        int minResult = maxProblem.minProblem(20,10,40);
        int min4Result = maxProblem.upgradeMinProblem(20,10,40, 5);
        System.out.printf("Max : %d", maxResult);
        System.out.printf("\nMin : %d", minResult);
        System.out.printf("\nMin4 : %d", min4Result);

    }

    public int firstMaxProblem(int a, int b, int c, int d) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        if (d > max) {
            max = d;
        }

        return max;
    }

    public int minProblem(int a, int b, int c) {

        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        return min;
    }

    public int upgradeMinProblem(int a, int b, int c, int d) {
        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        if (d < min) {
            min = d;
        }

        return min;
    }
}
