public class Example_01 {
    final static int a = 7;
    final static int b = 7;
    final static int c = 2;
    final static int d = 1;

    public static String FindSolutions(int a, int b, int c, int d){
    StringBuffer sb = new StringBuffer();
    if (a >= b) {
        sb.append("Нет решения");
    }
    else {
        while ((a*c) < b) {
            sb.append("K1");
            a *= c;        
        }
        while (a != b) {
            sb.append("K2");
            a += d;
        }
    }
    return sb.toString();
    }
    public static void main(String[] args) {
        String str = FindSolutions(a, b, c, d);
        System.out.println(str);
    }
}