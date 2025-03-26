package cleancode.minesweeper.tobe.mineswepper.board.cell;

public interface Cell {

  boolean isLandMine();

  boolean hasLandMineCount();

  CellSnapshot getSnapshot();

  void flagAt();

  void open();

  boolean isChecked();

  boolean isOpened();
}
