package cleancode.minesweeper.tobe.mineswepper.user;

public enum UserAction {

  OPEN("셀 열기"),
  FLAG("깃발 꽂기"),
  UNKOWN("알 수 없음");

  private final String description;

  UserAction(String description) {
    this.description = description;
  }
}
