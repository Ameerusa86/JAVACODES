package convertnegative;

public class ConvertNegative {

    public static void main(String[] args) {
        int userNum = 5;

        if (userNum >= 0) {
            System.out.println("Non-negative");
        } else {
            System.out.println("Negative; converting to 0");
            userNum = 0;

        }
        System.out.format("Final: %d", userNum);
        System.out.println("");
    }
}
