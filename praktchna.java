
package rabota;
import java.util.Scanner;


public class praktchna {
    public static void main(String[] args) {
        System.out.println("Тип byte Розмір = " + Byte.BYTES + " байт, Діапазон = від " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.println("Тип short Розмір = " + Short.BYTES + " байт, Діапазон = від " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
        System.out.println("Тип int Розмір = " + Integer.BYTES + " байт, Діапазон = від " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println("Тип long Розмір = " + Long.BYTES + " байт, Діапазон = від " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
        System.out.println("Тип float Розмір = " + Float.BYTES + " байт, Діапазон = від " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
        System.out.println("Тип double Розмір = " + Double.BYTES + " байт, Діапазон = від " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);
        System.out.println("Тип char Розмір = " + Character.BYTES + " байт, Діапазон = від " + (int) Character.MIN_VALUE + " до " + (int) Character.MAX_VALUE);
        System.out.println("Тип boolean Розмір = 1 біт, Можливі значення = true, false");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число типу byte: ");
        byte byteValue = scanner.nextByte();
        System.out.println("Введене число типу byte: " + byteValue);

        System.out.print("Введіть число типу short: ");
        short shortValue = scanner.nextShort();
        System.out.println("Введене число типу short: " + shortValue);

        System.out.print("Введіть число типу int: ");
        int intValue = scanner.nextInt();
        System.out.println("Введене число типу int: " + intValue);

        System.out.print("Введіть число типу long: ");
        long longValue = scanner.nextLong();
        System.out.println("Введене число типу long: " + longValue);

        System.out.print("Введіть число типу float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("Введене число типу float: " + floatValue);

        System.out.print("Введіть число типу double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Введене число типу double: " + doubleValue);

        System.out.print("Введіть символ типу char: ");
        char charValue = scanner.next().charAt(0);
        System.out.println("Введений символ типу char: " + charValue);

        System.out.print("Введіть значення типу boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("Введене значення типу boolean: " + booleanValue);

        scanner.close();
    }
}
