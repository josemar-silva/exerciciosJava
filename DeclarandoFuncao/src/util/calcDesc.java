
package util;


public class calcDesc {
    private double BONUS = 20;
       
    public double descontoTotal (double produto){
    return 0.10 * produto + getBONUS();
    }

    /**
     * @return the BONUS
     */
    public double getBONUS() {
        return BONUS;
    }

    /**
     * @param BONUS the BONUS to set
     */
    public void setBONUS(double BONUS) {
        this.BONUS = BONUS;
    }
}
