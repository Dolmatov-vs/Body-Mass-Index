public class BmiService {
    public double calculate(double height, double
            mass) {
        height = height/100;  //  Переводим рост в метры
        double bmi = (mass/(Math.pow(height,2)));
        return bmi;
    }
}
