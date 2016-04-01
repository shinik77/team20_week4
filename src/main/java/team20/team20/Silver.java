package team20.team20;

/**
 * siver plan extend abstract class plan
 */

public class Silver extends Plan
{
    private double basicMonthlyRate = 29.95;
    private double includedMinutes = 500;
    private double RatePerAdditionalMinutes = 0.54;
    private double RatePerAdditionalLine = 21.5;
    
    /*
     * Get basic monthly rate 29.95
     * @return basicMonthlyRate
     */
    protected double getBasicMontlyRate() {
        return this.basicMonthlyRate;
    }
    
    /*
     * Get include minutes 500
     * @return includedMinutes
     */
    protected double getIncludeMinutes() {
        return this.includedMinutes;
    }
    
    /*
     * Get rate per additional minutes 0.54
     * @return RatePerAdditionalMinutes
     */
    protected double getRatePerAdditionalMinutes() {
        return this.RatePerAdditionalMinutes;
    }
    
    /*
     * Get rate per additional line 21.5
     * @return RatePerAdditionalLine
     */
    protected double getRatePerAdditionalLine() {
        return this.RatePerAdditionalLine;
    }
}
