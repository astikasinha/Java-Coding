public class Triangle {
    private int a, b, c;

    public int getPerimeter(int a, int b, int c) {
        // Calculate the perimeter
        return a + b + c;
    }

    public double getArea(int a, int b, int c) {
        // Calculate the semi-perimeter
        double s = getPerimeter(a, b, c) / 2.0;
        // Calculate the area using Heron's formula
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        int a = 3;
        int b = 4;
        int c = 5;
        System.out.println("Perimeter of the triangle: " + triangle.getPerimeter(a, b, c));
        System.out.println("Area of the triangle: " + triangle.getArea(a, b, c));
    }

}
