package functions.meta;

import functions.Function;
//произведение функций
public class Mult implements Function {
    private final Function f, g;
    public Mult(Function f1, Function g1) {
        f = f1;
        g = g1;
    }
    @Override
    public double getValueAt(double x) {
        return f.getValueAt(x) * g.getValueAt(x);
    }

    @Override
    public String toString() {
        return "(" + f.toString() + ")" + " * " + "(" + g.toString() + ")";
    }
}
