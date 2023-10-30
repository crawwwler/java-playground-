
public class Checker {

    public boolean isDayOfWeek(String string) {
        String regex = "mon|tue|wed|thu|fri|sat|sun";

        if (string.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean allVowels(String string) {
        String regex = "(a|i|o|u|e)*";

        if (string.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean timeOfDay(String string) {
        String regex = "[0-2]{1}[0-9]{1}:[0-5]{1}[0-9]{1}:[0-5]{1}[0-9]{1}";
        String regexAlt = "[0-2]{1}[0-3]{1}:[0-5]{1}[0-9]{1}:[0-5]{1}[0-9]{1}";
        if (string.charAt(0) == '2') {
            if (string.matches(regexAlt)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (string.matches(regex)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
