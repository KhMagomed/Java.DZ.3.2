public class BmiService {
    public int calculate(float meters, int kilograms) {
        float meters2 = meters * meters;
        float index = kilograms / meters2;
        return (int)index;
    }
}
