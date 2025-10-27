package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class RacingGame {
    private static final int FORWARD_THRESHOLD = 4;

    private final LinkedHashMap<String, Car> carsByName;

    public RacingGame(List<String> names) {
        this.carsByName = new LinkedHashMap<>();
        for (String n : names) {
            this.carsByName.put(n, new Car(n));
        }
    }

    public List<Car> getCars() {
        return new ArrayList<>(carsByName.values());
    }

    public void runOneRound() {
        for (Car car : carsByName.values()) {
            int value = Randoms.pickNumberInRange(0, 9);
            if (value >= FORWARD_THRESHOLD) {
                car.moveForward();
            }
        }
    }

    public List<String> findWinnerNames() {
        int max = carsByName.values().stream().map(Car::getPosition).max(Comparator.naturalOrder()).orElse(0);
        List<String> winners = new ArrayList<>();
        for (Map.Entry<String, Car> e : carsByName.entrySet()) {
            if (e.getValue().getPosition() == max) {
                winners.add(e.getKey());
            }
        }
        return winners;
    }
}


