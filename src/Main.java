import java.util.Arrays;

public class Main {

    private static final Solution solution = new Solution();

    public static void main(String[] args) {
        var result = solution.runningSum(new int[]{1, 2, 3, 4});
        System.out.println("result: " + Arrays.toString(result));
    }
}