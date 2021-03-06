package functions.meta;
// частное функций
import functions.Function;

public class Div implements Function {
    private final Function f, g;
    public Div(Function f1, Function g1) {
        f = f1;
        g = g1;
    }
    public Function getG() {
        return g;
    }
    @Override
    public double getValueAt(double x) {
        if (g.getValueAt(x) != 0)
            return f.getValueAt(x) / g.getValueAt(x);
        else {
            System.out.println("Деление на 0! (Division by zero)");
            return f.getValueAt(x) < 0? Double.NEGATIVE_INFINITY: Double.POSITIVE_INFINITY;
        }

    }

    @Override
    public String toString() {
        return "(" + f.toString() + ")" + " / " + "(" + g.toString() + ")";
    }
}
