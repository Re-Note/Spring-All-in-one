package com.group.libraryapp.controller.assignment3;

import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {
        int numOfFaces = getNumOfFaces(); // 주사위 면의 수를 입력 받음
        int[] faceCounts = rollDice(numOfFaces); // 주사위를 던져 각 숫자의 출현 횟수를 계산
        printResult(faceCounts); // 결과 출력
    }

    // 사용자로부터 주사위 면의 수를 입력받는 메소드
    private static int getNumOfFaces() {
        System.out.println("주사위 면의 수를 입력하세요:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // 주사위를 던져 각 숫자의 출현 횟수를 계산하는 메소드
    private static int[] rollDice(int numOfFaces) {
        int[] faceCounts = new int[numOfFaces];
        for (int i = 0; i < numOfFaces; i++) {
            double randomValue = Math.random() * numOfFaces;
            int face = (int) randomValue;
            faceCounts[face]++;
        }
        return faceCounts;
    }

    // 결과를 출력하는 메소드
    private static void printResult(int[] faceCounts) {
        for (int i = 0; i < faceCounts.length; i++) {
            System.out.printf("%d은(는) %d번 나왔습니다.\n", i + 1, faceCounts[i]);
        }
    }
}
