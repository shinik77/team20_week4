package team20.team20

public abstract class Plan{
    
    // Instance var.
    double basicMontlyRate;
    double includedMinutes;
    double ratePerAdditionalMinute;
    double ratePerAdditionalLine;
    double lineCostOver4;
    
    protected abstract double getBasicMontlyRate();
    
    protected abstract double getIncludedMinutes();
    
    protected abstract double getRatePerAdditionalMinutes();
    
    protected abstract double getRatePerAdditionalLine();
    
    protected double getLineCostOver4() {
        return 5.0;
    }
}

