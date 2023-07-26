
package bitcamp.myapp;

import java.util.Scanner;

public class App {
  static Scanner scanner = new Scanner(System.in);
  static int userId = 1;
  static int length = 0;

  static final int SIZE = 100;
  static int[] no = new int[SIZE];
  static String[] name = new String[SIZE];
  static String[] email = new String[SIZE];
  static String[] password = new String[SIZE];
  static char[] gender = new char[SIZE];

  public static void main(String[] args) {

    // 키보드 스케너 준비

    printTitle();

    for (int i = 0; i < SIZE; i++) {
      inputMember();
      length++;
      if (!promptContinue()) {
        break;
      }

    }
    printMember();
    scanner.close();
  }

  static void inputMember() {
    System.out.print("번호? ");
    no[length] = scanner.nextInt();
    System.out.print("이름 ?");
    name[length] = scanner.next();
    System.out.print("이메일? ");
    email[length] = scanner.next();

    loop: while (true) {
      System.out.println("성별 ");
      System.out.println("1. 남자 ");
      System.out.println("2. 여자 ");
      System.out.print("> ");
      String genderString = scanner.next();

      switch (genderString) {
        case "1":
          gender[length] = 'M';
          break loop;
        case "2":
          gender[length] = 'W';
          break loop;
        default:
          System.out.println("잘못된 번호입니다");
      }
    }
    no[length] = userId++;
  }

  static boolean promptContinue() {
    System.out.print("계속하시겠습니까?(Y/n) ");
    scanner.nextLine();
    String response = scanner.nextLine();
    if (!response.equals("") && !response.equalsIgnoreCase("Y")) {
      return false;
    }
    return true;
  }

  static void printTitle() {
    System.out.println("나의 목록 관리 시스템");
    System.out.println("-----------------------------------");
  }

  static void printMember() {
    System.out.println("---------------------------------");
    System.out.println("번호, 이름, 이메일, 성별");
    System.out.println("---------------------------------");

    for (int i = 0; i < length; i++) {
      System.out.printf("%d, %s, %s, %c\n", no[i], name[i], email[i], gender[i]);
    }
  }

  static String prompt(String title) {
    System.out.print(title);
    return scanner.nextLine();
  }
}
