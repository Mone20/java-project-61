package hexlet.code.utils;

import hexlet.code.Constants;

public class Utils {

    public static int generateRandomInt(int start, int end) {
        return Constants.RANDOM.nextInt(start, end);
    }
}
