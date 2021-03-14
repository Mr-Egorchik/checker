package functions.basic;
//гиперболический тангенс
public class Tanh extends Hyper{
    @Override
    public double getValueAt(double x) {
        return Math.tanh(x);
    }

    @Override
    public String toString() {
        return "th(x)";
    }
}
