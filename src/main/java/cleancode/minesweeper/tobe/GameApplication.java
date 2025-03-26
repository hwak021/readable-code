package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.mineswepper.Minesweeper;
import cleancode.minesweeper.tobe.mineswepper.config.GameConfig;
import cleancode.minesweeper.tobe.mineswepper.gamelevel.Advanced;
import cleancode.minesweeper.tobe.mineswepper.gamelevel.Beginner;
import cleancode.minesweeper.tobe.mineswepper.gamelevel.VeryBeginner;
import cleancode.minesweeper.tobe.mineswepper.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.mineswepper.io.ConsoleOutputhandler;

public class GameApplication {

  public static void main(String[] args) {
    GameConfig gameConfig = new GameConfig(
      new Advanced(),
      new ConsoleInputHandler(),
      new ConsoleOutputhandler()
    );

    Minesweeper minesweeper = new Minesweeper(gameConfig);
    minesweeper.initialize();
    minesweeper.run();
  }

}
