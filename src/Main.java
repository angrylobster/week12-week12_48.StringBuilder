
public class Main {

    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder str = new StringBuilder();
        str.append("{");
        for (int i = 0; i < t.length; i++) {
            if (i % 4 == 0) {
                str.append("\n ");
            }
            str.append(t[i]);
            if (i != t.length - 1) {
                str.append(", ");
            }
        }
        str.append("\n}");
        return str.toString();
    }
}
