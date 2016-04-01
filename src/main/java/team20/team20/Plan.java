package team20.team20

public abstract class Plan{
    
    // Instance var.
    double basicMontlyRate;
    double includedMinutes;
    double ratePerAdditionalMinute;
    double ratePerAdditionalLine;
    double lineCostOver4;
    
    public abstract double getBasicMontlyRate();
    
    public abstract double getIncludedMinutes();
    
    public abstract double getRatePerAdditionalMinutes();
    
    public abstract double getRatePerAdditionalLine();
    
    public double getLineCostOver4() {
        return 5.0;
    }
}

