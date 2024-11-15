import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] engineLines = drawEngine();
        String[] carLines = drawTrainCar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome! Enter the amount of cars: ");
        int cars = scanner.nextInt();
        scanner.close();
        StringBuilder[] finalLines = new StringBuilder[3];
        for (int i = 0; i < engineLines.length; i++) {
            finalLines[i] = new StringBuilder((engineLines[i]));
        }

        for (int i = 0; i < cars; i++) {
            for (int j = 0; j < carLines.length; j++) {
                finalLines[j].append(carLines[j]);
            }
        }

        drawLines(finalLines);
    }

    public static void drawLines(StringBuilder[] lines) {
        for (StringBuilder line : lines) {
            System.out.println(line);
        }
        return;
    }

    public static String[] drawEngine() {
        return new String[] {
                "  _____ ",
                "<|_____)",
                "  oo oo "
        };
    }
    public static String[] drawTrainCar() {
        return new String[] {
                "  _____ ",
                "_|_____|",
                "  o   o ",
        };
    }
}