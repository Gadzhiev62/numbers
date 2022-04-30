public class Multi {
    public void multiplyMinMax(int a, int b, int c) {
        int min = a < b && a < c ? a : b < a && b < c ? b : c;
        int max = a > b && a > c ? a : b > a && b > c ? b : c;
        System.out.println(min * max);
    }

    public void multiplyMinMax(short a, short b, short c) {
        short min = a < b && a < c ? a : b < a && b < c ? b : c;
        short max = a > b && a > c ? a : b > a && b > c ? b : c;
        System.out.println(min * max);
    }
    public void multiplyMinMax(float a, float b, float c) {
        float min = a < b && a < c ? a : b < a && b < c ? b : c;
        float max = a > b && a > c ? a : b > a && b > c ? b : c;
        System.out.println(min * max);
    }
}
