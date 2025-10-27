package racingcar.validation;

public class AttemptCountValidator {
    public static int parseAndValidate(String input) {
        if (input == null) {
            throw new IllegalArgumentException("입력값이 유효하지 않습니다.");
        }
        String trimmed = input.trim();
        if (!trimmed.matches("^\\d+$")) {
            throw new IllegalArgumentException("시도 횟수는 정수여야 합니다.");
        }
        int value = Integer.parseInt(trimmed);
        if (value <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }
        return value;
    }
}


