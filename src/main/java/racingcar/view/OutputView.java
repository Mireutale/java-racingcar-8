package racingcar.view;

import racingcar.Car;
import java.util.List;
import java.util.StringJoiner;

public class OutputView {
    public static void printExecutionHeader() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public static void printRoundStatus(List<Car> cars) {
        for (Car car : cars) {
            StringBuilder sb = new StringBuilder();
            sb.append(car.getName()).append(" : ");
            sb.append("-".repeat(Math.max(0, car.getPosition())));
            System.out.println(sb.toString());
        }
        System.out.println();
    }

    public static void printWinners(List<String> winnerNames) {
        StringJoiner joiner = new StringJoiner(", ");
        for (String name : winnerNames) {
            joiner.add(name);
        }
        System.out.println("최종 우승자 : " + joiner.toString());
    }
}


