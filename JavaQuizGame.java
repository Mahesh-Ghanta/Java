import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Who invented Java programming language?",
            "2. Which keyword is used to inherit a class in Java?",
            "3. Which of the following is not a Java primitive type?",
            "4. What is the default value of a boolean variable in Java?",
            "5. Which method is the entry point of a Java program?"
        };

        String[][] options = {
            {"A. James Gosling", "B. Dennis Ritchie", "C. Bjarne Stroustrup", "D. Guido van Rossum"},
            {"A. this", "B. super", "C. extends", "D. implements"},
            {"A. int", "B. float", "C. String", "D. double"},
            {"A. true", "B. false", "C. 0", "D. null"},
            {"A. start()", "B. main()", "C. run()", "D. init()"}
        };

        char[] answers = {'A', 'C', 'C', 'B', 'B'};

        int score = 0;
        System.out.println("Welcome to the Java Basics Quiz");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char guess = Character.toUpperCase(sc.next().charAt(0));

            if (guess == answers[i]) {
                System.out.println("Correct\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + answers[i] + "\n");
            }
        }

        System.out.println("Your final score is " + score + " out of " + questions.length);
        if (score == questions.length)
            System.out.println("Excellent! You’re a Java Pro!");
        else if (score >= 3)
            System.out.println("Good job! Keep practicing.");
        else
            System.out.println("You need more practice on Java basics.");

        sc.close();
    }
}
