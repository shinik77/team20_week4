package team20.team20;

public class Customer{
    private Plan planInfo;
    private InputClass input;
    private String name;
    private Address addressInfo;

    // Derive from InputClass
    private int minutesUsed;
    private int numberOfLines;
    private String planType;



    Customer(String name){
    	this.input = new InputClass();
    	
        this.numberOfLines = input.getNumberOfLines();
        this.minutesUsed = input.getUsedAmount();
        this.planType = input.getPlanType();

        this.name = name;

        if(this.planType == "silver" || this.planType == "Silver"){
            this.planInfo = new Silver();
        }else if (this.planType == "gold" || this.planType == "Gold"){
            this.planInfo = new Gold();
        }
        
        this.addressInfo = new Address("contry", "city", "StreetNo");

    }

    public Plan getPlanInfo(){
        return this.planInfo;
    }

    public String getCustomerName(){
        return this.name;
    }

    public String getPlanType(){
        return this.planType;
    }

    public Address getAddressInfo(){
        return this.addressInfo;
    }

    public int getMinutesUsed(){
        return this.minutesUsed;
    }

    public int getNumberOfLines(){
        return this.numberOfLines;
    }
}