public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(175, 75.5);
                System.out.printf("Индекс массы тела = %.2f", bmi);
    }
}
