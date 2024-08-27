package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int nine = 9;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum += nine;
            nine = nine * 10 + 9;
        }
        System.out.println(sum);
    }
}
