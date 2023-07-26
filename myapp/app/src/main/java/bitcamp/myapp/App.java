
package bitcamp.myapp;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    // 키보드 스케너 준비
    Scanner scanner = new Scanner(System.in);
    int userId = 1;
    int length = 0;

    final int SIZE = 100;
    int[] no = new int[SIZE];
    String[] name = new String[SIZE];
    String[] email = new String[SIZE];
    String[] password = new String[SIZE];
    char[] gender = new char[SIZE];

    printTitle();

    for (int i = 0; i < SIZE; i++) {
      inputMember(scanner, i, name, email, password, gender, no, userId++);
      length++;
      if (!promptContinue(scanner)) {
        break;
      }

    }
    printMember(length, no, name, email, gender);
    scanner.close();
  }

  static void inputMember(Scanner scanner,
      int i, String[] name, String[] email, String[] password, char[] gender, int[] no, int userId) {
    System.out.print("번호? ");
    no[i] = scanner.nextInt();
    System.out.print("이름 ?");
    name[i] = scanner.next();
    System.out.print("이메일? ");
    email[i] = scanner.next();

    loop: while (true) {
      System.out.println("성별 ");
      System.out.println("1. 남자 ");
      System.out.println("2. 여자 ");
      System.out.print("> ");
      String genderString = scanner.next();

      switch (genderString) {
        case "1":
          gender[i] = 'M';
          break loop;
        case "2":
          gender[i] = 'W';
          break loop;
        default:
          System.out.println("잘못된 번호입니다");
      }
    }
    no[i] = userId++;
  }

  static boolean promptContinue(Scanner scanner) {
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

  static void printMember(int length, int[] no, String[] name, String[] email, char[] gender) {
    System.out.println("---------------------------------");

    System.out.println("번호, 이름, 이메일, 성별");
    System.out.println("---------------------------------");

    for (int i = 0; i < length; i++) {
      System.out.printf("%d, %s, %s, %c\n", no[i], name[i], email[i], gender[i]);
    }
  }
}
