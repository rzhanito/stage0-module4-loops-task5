package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (height - i) + 1; k++) {
                System.out.print("8");
            }
            System.out.println();
        }

        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (height - i) + 1; k++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
