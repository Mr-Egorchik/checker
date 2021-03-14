package functions.basic;
//синус
public class Sin extends Trig{
    @Override
    public double getValueAt(double x) {
        return Math.sin(x);
    }

    @Override
    public String toString() {
        return "sin(x)";
    }
}
