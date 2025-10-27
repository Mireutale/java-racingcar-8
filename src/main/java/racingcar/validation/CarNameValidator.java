package racingcar.validation;

import java.util.LinkedHashSet;
import java.util.List;

public class CarNameValidator {
    public static void validate(List<String> names) {
        LinkedHashSet<String> seen = new LinkedHashSet<>();
        for (String raw : names) {
            String name = raw.trim();
            if (name.isEmpty()) {
                throw new IllegalArgumentException("자동차 이름은 비어있을 수 없습니다.");
            }
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
            if (!seen.add(name)) {
                throw new IllegalArgumentException("중복된 자동차 이름이 존재합니다.");
            }
        }
    }
}


