package functions.basic;
//гиперболический синус
public class Sinh extends Hyper{
    @Override
    public double getValueAt(double x) {
        return Math.sinh(x);
    }

    @Override
    public String toString() {
        return "sh(x)";
    }
}
