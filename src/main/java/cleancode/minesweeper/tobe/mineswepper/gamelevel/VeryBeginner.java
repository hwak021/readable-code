package cleancode.minesweeper.tobe.mineswepper.gamelevel;

public class VeryBeginner implements GameLevel {

  @Override
  public int getRowSize() {
    return 4;
  }

  @Override
  public int getColSize() {
    return 4;
  }

  @Override
  public int getLandMineCount() {
    return 2;
  }
}
