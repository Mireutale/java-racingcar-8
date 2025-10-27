package racingcar;

import racingcar.validation.AttemptCountValidator;
import racingcar.validation.CarNameValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> names = InputView.readCarNames();
        CarNameValidator.validate(names);

        int attemptCount = AttemptCountValidator.parseAndValidate(InputView.readAttemptCount());

        RacingGame game = new RacingGame(names);
        OutputView.printExecutionHeader();
        for (int i = 0; i < attemptCount; i++) {
            game.runOneRound();
            OutputView.printRoundStatus(game.getCars());
        }
        OutputView.printWinners(game.findWinnerNames());
    }
}
