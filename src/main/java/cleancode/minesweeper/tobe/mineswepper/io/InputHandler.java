package cleancode.minesweeper.tobe.mineswepper.io;

import cleancode.minesweeper.tobe.mineswepper.board.position.CellPosition;
import cleancode.minesweeper.tobe.mineswepper.user.UserAction;

public interface InputHandler {

  UserAction getUserActionFromUser();

  CellPosition getCellPositionFromUser();

}
