import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для вычисления площади:");
        selectFigure(scanner);
    }

    private static void selectFigure(Scanner scanner) {
        String input = scanner.nextLine().trim();
        String[] num = input.split(" ");
        if (num.length == 1){
            calculateCircle(num);
        }
        else if (num.length == 3) {
            calculateTriangle(num);
        }
        else {
            System.out.println("неверный ввод");
        }
    }

    private static void calculateTriangle(String[] num) {
        double a = Double.parseDouble(num[0]);
        double b = Double.parseDouble(num[1]);
        double c = Double.parseDouble(num[2]);
        if (a > 0 && b > 0 && c > 0 && isTriangle(a,b,c)) {
            double triangleArea = findTriangleArea(a, b, c);
            System.out.println("Площадь треугольника с длинами сторон " + a + ", " + b + ", " +
                    c + " равна: " + triangleArea);
            if (isRightTriangle(a, b, c)){
                System.out.println("Этот треугольник прямоугольный");
            }
            else {
                System.out.println("Этот треугольник не прямоугольный");
            }
        }
        else {
            System.out.println("неверный ввод");
        }
    }

    private static void calculateCircle(String[] num) {
        double radius = Double.parseDouble(num[0]);
        if (radius > 0) {
            double circleArea = findCircleArea(radius);
            System.out.println("Площадь круга радиусом " + radius + " равна: " + circleArea);
        }
        else {
            System.out.println("неверный ввод");
        }
    }

    public static double findCircleArea(double radius){
        return Math.PI * radius * radius;
    }

    public static double findTriangleArea(double a, double b, double c){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static boolean isTriangle(double a, double b, double c){
        return (a + b) > c && (b + c) > a && (c + a) > b;
    }

    public static boolean isRightTriangle(double a, double b, double c){
        double hypotenuse = Math.max(a, Math.max(b, c));
        double pifagor = a * a + b * b + c * c - hypotenuse * hypotenuse;
        return pifagor == hypotenuse * hypotenuse;
    }
}

