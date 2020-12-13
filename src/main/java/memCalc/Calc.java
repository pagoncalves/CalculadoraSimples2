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

    public void subt(double n1) {
        display -= n1;
    }

    public void mult(double n1) {
        display *= n1;
    }

    public void divi(double n1) {
        display /= n1;
    }

}
