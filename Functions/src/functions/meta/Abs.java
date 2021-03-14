package functions.meta;
//модуль
import functions.Function;

public class Abs implements Function {
    private final Function f;
    public Abs(Function f1) {
        f = f1;
    }
    @Override
    public double getValueAt(double x) {
        return Math.abs(f.getValueAt(x));
    }

    @Override
    public String toString() {
        return "|" + f.toString() + "|";
    }
}
