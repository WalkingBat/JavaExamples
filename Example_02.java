public class Example_02 {
    public static int FindMax (int lenght, int count) throws NumberFormatException {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < lenght;  i++){
            sb.append(count - 1);
        }
        return Integer.parseInt(sb.toString());
    }
    public static boolean ValidNumbers(int n, int count){
        boolean que = true;
        while (n > 0){
            if (n % 10 >= count){
                que = false;
            }
            n /= 10;
        }
    return que;
    }
    public static String GenNum(int lenght, int count){
        StringBuffer sb = new StringBuffer();
        int MaxN = FindMax(lenght, count);
        for(int i = 0; i <= MaxN; i++) {
            if (ValidNumbers(i, count)) {
                sb.append(i).append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String ex = GenNum(2, 6);
        System.out.println(ex);
    }
}