package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class InputView {
    public static List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String line = Console.readLine();
        return Arrays.stream(line.split(",")).map(String::trim).toList();
    }

    public static String readAttemptCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String line = Console.readLine();
        return line;
    }
}


