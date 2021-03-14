package functions.basic;

import functions.Function;
//арктангенс
public class Atan implements Function {
    @Override
    public double getValueAt(double x) {
        return Math.atan(x);
    }

    @Override
    public String toString() {
        return "arctg(x)";
    }
}
