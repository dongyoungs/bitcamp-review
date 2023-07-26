
package bitcamp.myapp;

import bitcamp.myapp.handler.MemberHandler;
import bitcamp.util.Prompt;

public class App {

  public static void main(String[] args) {

    // 키보드 스케너 준비

    MemberHandler.printTitle();

    while (MemberHandler.available()) {
      MemberHandler.inputMember();
      if (!MemberHandler.promptContinue()) {
        break;
      }
    }

    MemberHandler.printMember();
    Prompt.close();
  }

}
