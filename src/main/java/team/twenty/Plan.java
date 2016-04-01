package team20.team20;
public abstract class Plan{

    // Instance var.
    double basicMontlyRate;
    double includedMinutes;
    double ratePerAdditionalMinute;
    double ratePerAdditionalLine;
    public static final double lineCostOver4 = 5.0;

    // getters
    public abstract double getBasicMontlyRate();

    public abstract double getIncludedMinutes();

    public abstract double getRatePerAdditionalMinutes();

    public abstract double getRatePerAdditionalLine();

}
