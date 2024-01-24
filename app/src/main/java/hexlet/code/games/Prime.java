package hexlet.code.games;
import hexlet.code.Engine;
public class Prime {
    private static String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String correctAnswer;
    public static String getTask() {
        return task;
    }

    public static String getQuestion() {
        boolean isPrime = true;
        int a = Math.toIntExact(Math.round(Math.random() * Engine.getMaxRandomNumber()));
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return String.valueOf(a);
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

/*    public static boolean round() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        System.out.print("Question: ");
        boolean isPrime = true;
        int maxNum = 99;
        int a = Math.toIntExact(Math.round(Math.random() * maxNum));
        System.out.println(a);
        System.out.print("Your answer: ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime & answer.equalsIgnoreCase("yes")) {
            System.out.println("Correct!");
            return true;
        }
        if (!isPrime & answer.equalsIgnoreCase("no")) {
            System.out.println("Correct!");
            return true;
        }
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
        } else {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
        }
        System.out.println("Let's try again, " + App.getPlayerName() + "!");
        return false;
    }*/
}
