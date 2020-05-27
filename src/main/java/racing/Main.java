package racing;

import racing.controller.RacingGame;
import racing.domain.RacingGameResult;
import racing.view.InputView;
import racing.view.ResultView;

public class Main {
    public static void main(String[] args) {

        InputView carCountQuestion = InputView.addQuestion("자동차 대수는 몇 대 인가요?");
        String cars = carCountQuestion.inputString();
        InputView roundQuestion = InputView.addQuestion("시도할 회수는 몇 회 인가요?");
        int round = roundQuestion.inputNumber();

        RacingGame racingGame = new RacingGame(cars, round);
        RacingGameResult gameResult = racingGame.playGame();

        ResultView resultView = new ResultView("실행 결과");
        resultView.print(gameResult.getAllRoundRacingCars());
        resultView.printFinalWinner(gameResult.getWinners());
    }
}
