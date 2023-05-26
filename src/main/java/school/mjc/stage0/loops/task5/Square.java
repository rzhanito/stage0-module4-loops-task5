package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        // Print the top row of the square
        for (int i = 0; i < sideLength; i++) {
            System.out.print("8");
        }
        System.out.println();

        // Print the middle rows of the square
        for (int i = 0; i < sideLength - 2; i++) {
            System.out.print("8");
            for (int j = 0; j < sideLength - 2; j++) {
                System.out.print("   ");
            }
            System.out.println("8");
        }

        // Print the bottom row of the square
        for (int i = 0; i < sideLength; i++) {
            System.out.print("8");
        }
        System.out.println();
    }
}
