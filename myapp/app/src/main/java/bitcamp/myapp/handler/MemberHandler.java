package bitcamp.myapp.handler;

import bitcamp.util.Prompt;

public class MemberHandler {

  static int userId = 1;
  static int length = 0;

  static final int MAX_SIZE = 100;
  static int[] no = new int[MAX_SIZE];
  static String[] name = new String[MAX_SIZE];
  static String[] email = new String[MAX_SIZE];
  static String[] password = new String[MAX_SIZE];
  static char[] gender = new char[MAX_SIZE];

  public static void inputMember() {

    name[length] = Prompt.inputString("이름? ");
    email[length] = Prompt.inputString("이메일? ");
    password[length] = Prompt.inputString("암호? ");

    loop: while (true) {
      String genderString = Prompt.inputString("성별:\n" +
          " 1. 남자\n" +
          " 2. 여자\n" +
          "> ");

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
    length++;
  }

  public static boolean promptContinue() {
    String response = Prompt.inputString("계속하시겠습니까?(Y/n) ");
    if (!response.equals("") && !response.equalsIgnoreCase("Y")) {
      return false;
    }
    return true;
  }

  public static void printTitle() {
    System.out.println("나의 목록 관리 시스템");
    System.out.println("-----------------------------------");
  }

  public static void printMember() {
    System.out.println("---------------------------------");
    System.out.println("번호, 이름, 이메일, 성별");
    System.out.println("---------------------------------");

    for (int i = 0; i < length; i++) {
      System.out.printf("%d, %s, %s, %c\n", no[i], name[i], email[i], gender[i]);
    }
  }

  public static boolean available() {
    return length < MAX_SIZE;
  }
}
