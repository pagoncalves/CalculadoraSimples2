package memCalc;

public class Calc {

    private double display;

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public void soma(double n1) {
        display += n1;
    }

}
