package entites;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String numberString = "12";
        int number = Integer.parseInt(numberString);
        System.out.println(number);

        int a = 5;
        int b = 8;
        int c = Integer.max(a,b);
        System.out.println(c);
    }
}
