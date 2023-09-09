public class Main {

    public static void main(String[] args) {
        Matrix m1 = new Matrix(new double[][] {{ 1.0, 2.0 }, { 3.0, 4.0 }});
        Matrix m2 = new Matrix(new double[][] {{ 5.0, 6.0 }, { 7.0, 8.0 }});
        Matrix m3 = m1.sum(m2);
        Matrix m4 = m1.subtract(m2);
        Matrix m5 = m1.multiply(2.0);
        Matrix m6 = m1.multiply(m2);
        Matrix m7 = m1.power(2);

        System.out.println("Матрица 1:\n" + m1.toString());
        System.out.println("Матрица 2:\n" + m2.toString());
        System.out.println("Сумма матриц\n" + m3.toString());
        System.out.println("Разница между 1 и 2:\n" + m4.toString());
        System.out.println("Перемножение на число:\n" + m5.toString());
        System.out.println("Перемножение матриц:\n" + m6.toString());
        System.out.println("Возведение в степень:\n" + m7.toString());
    }
}
    