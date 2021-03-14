package functions.meta;

import functions.Function;
//возведение в степень
public class Pow implements Function {
    private final Function f, g;
    public Pow(Function f1, Function g1) {
        f = f1;
        g = g1;
    }
    @Override
    public double getValueAt(double x) {
        return Math.pow(f.getValueAt(x), g.getValueAt(x));
    }

    @Override
    public String toString() {
        return "(" + f.toString() + ")" + "^" + "(" + g.toString() + ")";
    }
}
