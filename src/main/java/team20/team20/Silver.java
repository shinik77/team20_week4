package team20.team20;

/**
 * siver plan extend abstract class plan
 */

public class Silver extends Plan
{
    private double basicMonthlyRate;
    private double includedMinutes;
    private double RatePerAdditionalMinutes;
    private double RatePerAdditionalLine;
    
    public Silver() {
        basicMonthlyRate = 29.95;
        includedMinutes = 500;
        RatePerAdditionalMinutes = 0.54;
        RatePerAdditionalLine = 21.5;
    }
    /*
     * Get basic monthly rate 29.95
     * @return basicMonthlyRate
     */
    public double getBasicMontlyRate() {
        return this.basicMonthlyRate;
    }
    
    /*
     * Get include minutes 500
     * @return includedMinutes
     */
    public double getIncludedMinutes() {
        return this.includedMinutes;
    }
    
    /*
     * Get rate per additional minutes 0.54
     * @return RatePerAdditionalMinutes
     */
    public double getRatePerAdditionalMinutes() {
        return this.RatePerAdditionalMinutes;
    }
    
    /*
     * Get rate per additional line 21.5
     * @return RatePerAdditionalLine
     */
    public double getRatePerAdditionalLine() {
        return this.RatePerAdditionalLine;
    }
}