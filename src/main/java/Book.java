import java.util.Scanner;

public class Book {
    public static String name;
    public static int page_number;
    public static float price;
    public static boolean inStock;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        page_number = sc.nextInt();
        price = sc.nextFloat();
        inStock = sc.nextBoolean();
        System.out.println("Книга\nНазвание: " +  name + "\nЦена: " +
                price + "\nКоличество страниц: " + page_number + "\nЕсть в наличии: " + inStock);
    }
}
