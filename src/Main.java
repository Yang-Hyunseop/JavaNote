
public class Main {
    public static void main(String[] args) {
        System.out.println("더하기 결과 : " + Plus(10, 20));
        System.out.println("뺴기 결과 : " + Minus(10, 20));
    }

    public static int Plus(int a, int b)
    {
        return a + b;
    }

    public static int Minus(int a, int b)
    {
        return a - b;
    }
}
