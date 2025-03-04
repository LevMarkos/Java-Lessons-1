import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean foundMultipleOfFive = false;
        StringBuilder multiplesOfFive = new StringBuilder();

        if (a % 5 == 0) {
            multiplesOfFive.append("a=").append(a).append(", ");
            foundMultipleOfFive = true;
        }
        if (b % 5 == 0) {
            multiplesOfFive.append("b=").append(b).append(", ");
            foundMultipleOfFive = true;
        }
        if (c % 5 == 0) {
            multiplesOfFive.append("c=").append(c).append(", ");
            foundMultipleOfFive = true;
        }
        if (foundMultipleOfFive) {
            multiplesOfFive.setLength(multiplesOfFive.length() - 2);
            System.out.println(multiplesOfFive);
        } else {
            System.out.println("нет значений, кратных 5");
        }
        System.out.println("Результат целочисленного деление a на b: " + (a / b));
        System.out.println("Результат деления a на b: " + ((double) a / b));
        System.out.println("Результат деления a на b с округлением в большую сторону: " + (int) Math.ceil((double) a / b));
        System.out.println("Результат деления a на b с округлением в меньшую сторону: " + (int) Math.floor((double) a / b));
        System.out.println("Результат деления a на b с математическим округлением: " + Math.round((double) a / b));
        System.out.println("Остаток от деления b на c: " + (b % c));
        System.out.println("Наименьшее значение из a и b: " + Math.min(a, b));
        System.out.println("Наибольшее значение из b и c: " + Math.max(b, c));
        scanner.close();
    }
}
