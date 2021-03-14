package functions.basic;
//косинус
public class Cos extends Trig{
    @Override
    public double getValueAt(double x) {
        return Math.cos(x);
    }

    @Override
    public String toString() {
        return "cos(x)";
    }
}
