package com.group.libraryapp.controller.assignment3;

import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        // 사용자에게 주사위 면의 수를 입력하도록 요청
        System.out.println("주사위 면의 수를 입력하세요:");
        Scanner scanner = new Scanner(System.in);
        int numOfFaces = scanner.nextInt();

        // 각 주사위 숫자의 출현 횟수를 저장할 변수 초기화
        int[] faceCounts = new int[numOfFaces];

        // 주사위를 던져서 각 숫자의 출현 횟수 계산
        for (int i = 0; i < numOfFaces; i++) {
            double randomValue = Math.random() * numOfFaces;
            int face = (int) randomValue; // 주사위의 눈은 1부터 시작하므로 0 ~ (numOfFaces-1) 사이의 값으로 변환
            faceCounts[face]++;
        }

        // 각 숫자의 출현 횟수 출력
        for (int i = 0; i < numOfFaces; i++) {
            System.out.printf("%d은(는) %d번 나왔습니다.\n", i + 1, faceCounts[i]);
        }
    }
}

