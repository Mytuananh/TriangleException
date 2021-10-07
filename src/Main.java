public class Main {
    public static void main(String[] args) {
        try {
            TriangleException triangleException = new TriangleException(2,-4,6);
        }
        catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
