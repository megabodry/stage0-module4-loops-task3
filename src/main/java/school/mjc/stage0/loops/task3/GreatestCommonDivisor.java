package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int result;
        if (first == 0) {
            result = second;
        } else if (second == 0) {
            result = first;
        } else {
            result = 1;
            int max = second;
            if (second > first) {
                max = first;
            }
            for (int i = 1; i <= max; i++) {
                if (first % i == 0 && second % i == 0) {
                    result = i;
                }
            }
        }
        System.out.println(result);
    }
}
