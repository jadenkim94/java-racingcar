package racing;

import java.util.List;
import racing.module.UserInput;

public class RacingGame {

    private static final String GAME_RESULT = "실행 결과";

    public static void main(String[] args) {
        RacingGame.start();
    }

    public static void start(){
        UserInput userInput = new UserInput();
        List<Car> cars = userInput.settingCarsByUserInput();
        int turnTime = userInput.settingTurnCountByUserInput();

        OutputView outputView = new OutputView(cars, turnTime);
        outputView.printResult();
    }

}
