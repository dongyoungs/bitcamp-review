
package bitcamp.myapp;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("나의 목록 관리 시스템");
    System.out.println("-----------------------------------");

    // 키보드 스케너 준비
    Scanner scanner = new Scanner(System.in);

    System.out.print("번호? ");
    int no = scanner.nextInt();

    System.out.print("이름? ");
    String name = scanner.next();
    System.out.print("나이 ?");
    int age = scanner.nextInt();

    System.out.print("재직중(true/false)? ");
    boolean working = scanner.nextBoolean();

    System.out.print("성별(남자:M, 여자:W)? ");
    String str = scanner.next();
    char gender = str.charAt(0);

    System.out.print("시력(왼쪽, 오른쪽)? ");
    float leftEye = scanner.nextFloat();
    float rightEye = scanner.nextFloat();

    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n", name);
    System.out.printf("나이: %d\n", age);
    System.out.printf("재직자: %b\n", working);
    System.out.printf("성별(남자(M), 여자(W),: %c\n", gender);
    System.out.printf("좌우시력: %.1f,%.1f\n", leftEye, rightEye);
  }
}
