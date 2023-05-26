package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 1; i <= length; i++) {
            System.out.print("8");
        }
        System.out.println();
        for (int i = 2; i <= height - 1; i++) {
            System.out.print("8");
            for (int j = 2; j <= length - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("8");
        }
        for (int i = 1; i <= length; i++) {
            System.out.print("8");
        }
        System.out.println();
    }
}
