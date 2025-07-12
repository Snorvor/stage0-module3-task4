package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        int a = 97, b = 98;

        int formulaFirstPart = (9 * a * a - 5 * b + 2 + a - 7);

        int formulaSecondPart = (a + b - 4 * a * b) / 2;

        int result = formulaFirstPart * formulaSecondPart;

        System.out.println(result);
    }
}
