package corejava;

import java.util.Scanner;

public class MCQTest {
    public static void main(String[] args) {
        // Create a scanner object for taking input from user
        Scanner scanner = new Scanner(System.in);

        // Variable to store the score
        int score = 0;

        // Array of questions and options
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal on Earth?",
            "Who wrote 'Hamlet'?",
            "What is the boiling point of water in Celsius?",
            "Who painted the Mona Lisa?",
            "What is the currency of Japan?",
            "Which country is known as the Land of the Rising Sun?",
            "What is the chemical symbol for gold?",
            "Who was the first president of the United States?",
            "What is the tallest mountain in the world?",
            "Which element has the chemical symbol 'O'?",
            "What is the square root of 64?",
            "What is the largest ocean on Earth?",
            "Which country is the largest by area?",
            "Who discovered gravity?",
            "What is the main language spoken in Brazil?",
            "Who was the first woman to win a Nobel Prize?",
            "What is the smallest prime number?",
            "In which continent is Egypt located?",
            "What is the longest river in the world?",
            "What is the largest desert in the world?",
            "Which animal is known as the 'King of the Jungle'?",
            "What is the speed of light in a vacuum?",
            "Which instrument is used to measure temperature?",
            "Which gas do plants absorb during photosynthesis?"
        };

        // Array of answer choices
        String[][] options = {
            {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
            {"1. Earth", "2. Mars", "3. Venus", "4. Jupiter"},
            {"1. Elephant", "2. Blue Whale", "3. Giraffe", "4. Shark"},
            {"1. Shakespeare", "2. Dickens", "3. Tolstoy", "4. Austen"},
            {"1. 90°C", "2. 100°C", "3. 110°C", "4. 120°C"},
            {"1. Van Gogh", "2. Picasso", "3. Da Vinci", "4. Dali"},
            {"1. Yen", "2. Dollar", "3. Euro", "4. Pound"},
            {"1. China", "2. Japan", "3. South Korea", "4. Thailand"},
            {"1. Fe", "2. Au", "3. Ag", "4. Cu"},
            {"1. Lincoln", "2. Washington", "3. Jefferson", "4. Roosevelt"},
            {"1. K2", "2. Everest", "3. Kilimanjaro", "4. Makalu"},
            {"1. Nitrogen", "2. Oxygen", "3. Carbon", "4. Hydrogen"},
            {"1. 6", "2. 7", "3. 8", "4. 9"},
            {"1. Atlantic", "2. Indian", "3. Arctic", "4. Pacific"},
            {"1. Russia", "2. Canada", "3. USA", "4. China"},
            {"1. Einstein", "2. Newton", "3. Galileo", "4. Darwin"},
            {"1. Spanish", "2. Portuguese", "3. English", "4. French"},
            {"1. Curie", "2. Franklin", "3. Nightingale", "4. Austen"},
            {"1. 1", "2. 2", "3. 3", "4. 4"},
            {"1. Africa", "2. Asia", "3. Europe", "4. America"},
            {"1. Nile", "2. Amazon", "3. Yangtze", "4. Ganges"},
            {"1. Sahara", "2. Gobi", "3. Arabian", "4. Kalahari"},
            {"1. Lion", "2. Elephant", "3. Tiger", "4. Leopard"},
            {"1. 299,792 km/s", "2. 150,000 km/s", "3. 300,000 km/s", "4. 400,000 km/s"},
            {"1. Thermometer", "2. Barometer", "3. Hygrometer", "4. Manometer"},
            {"1. Carbon dioxide", "2. Oxygen", "3. Nitrogen", "4. Hydrogen"}
        };

        // Array of correct answers
        int[] answers = {
            3, 2, 2, 1, 2, 3, 1, 2, 2, 2, 2, 2, 3, 4, 1, 2, 1, 1, 2, 1, 2, 1, 3, 1, 1
        };

        // Loop through each question
        for (int i = 0; i < 25; i++) {
            // Display the question and options
            System.out.println((i + 1) + ". " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Get the user's answer
            System.out.print("Enter your answer (1/2/3/4): ");
            int userAnswer = scanner.nextInt();

            // Check if the answer is correct
            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;  // Increment score for correct answer
            } else {
                System.out.println("Incorrect. The correct answer was " + answers[i] + ".\n");
            }
        }

        // Display the final score
        System.out.println("Your final score: " + score + "/25");

        // Close the scanner
        scanner.close();
    }
}

