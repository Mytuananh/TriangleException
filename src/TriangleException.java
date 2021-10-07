public class TriangleException {
    private int a, b, c;

    public TriangleException() {
    }

    public TriangleException(int a, int b, int c) throws IllegalTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Cạnh không thể là số âm");
        } else if (a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalTriangleException("Không phải là tam giác");
        } else System.out.println("Đây là tam giác");
    }
}
