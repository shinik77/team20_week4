public abstract class Plan{

    // Instance var.
    double basicMontlyRate;
    double includedMinutes;
    double ratePerAdditionalMinute;
    double ratePerAdditionalLine;
    double lineCostOver4;

    protected abstract double getBasicMontlyRate();

    protected abstract double getIncludedMinutes();

    protected abstract double getRatePerAddition();

    protected abstract double getRatePerAdditionalLine();

    protected abstract double getLineCostOver4();


}
