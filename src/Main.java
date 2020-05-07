public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 81.5;  // Масса в килограммах
        int height = 175; // Рост в сантиметрах
        double bmi = service.calculate(height, mass);
                System.out.println(bmi);
    }
}
