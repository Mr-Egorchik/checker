package functions.basic;
//тангенс
public class Tan extends Trig{
    @Override
    public double getValueAt(double x) {
        if (Math.abs(Math.cos(x) - Math.cos(Math.PI/2)) < 1.e-4)
            return Double.POSITIVE_INFINITY;
        return Math.tan(x);
    }

    @Override
    public String toString() {
        return "tg(x)";
    }
}
