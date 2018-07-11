public class Triangle {

    public static void main(String[] args) {

    }

    public void printOneStar() {
        System.out.println("*");
    }

    public String printHorizontalLine(int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += "*";
        }
        return res;
    }

    public void printVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public void printRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(printHorizontalLine(i+1));
        }
    }
}
