<<<<<<< HEAD
public class Customer{
    private Scanner scan;
=======
package team20.team20;

public class Customer{
>>>>>>> 2d37213b57742714dcad97ed0bb46ba963e4b828
    private Plan planInfo;
    private InputClass input;
    private String name;
    private Address addressInfo;

    // Derive from InputClass
    private int minutesUsed;
    private int numberOfLines;
    private String planType;



    Customer(String name){
<<<<<<< HEAD
=======
    	this.input = new InputClass();
    	
>>>>>>> 2d37213b57742714dcad97ed0bb46ba963e4b828
        this.numberOfLines = input.getNumberOfLines();
        this.minutesUsed = input.getUsedAmount();
        this.planType = input.getPlanType();

        this.name = name;
<<<<<<< HEAD
        this.scan = new Scanner();
        this.input = new InputClass();

        if(this.planType == "silver" || "Silver"){
            this.planInfo = new Silver();
        }else if (this.planType = "gold" || "Gold"){
            this.planInfo = new Gold();
        }
        
        this.planInfo = new Plan();
        this.addressInfo = new Address();
=======

        if(this.planType == "silver" || this.planType == "Silver"){
            this.planInfo = new Silver();
        }else if (this.planType == "gold" || this.planType == "Gold"){
            this.planInfo = new Gold();
        }
        
        this.addressInfo = new Address("contry", "city", "StreetNo");
>>>>>>> 2d37213b57742714dcad97ed0bb46ba963e4b828

    }

    public Plan getPlanInfo(){
        return this.planInfo;
    }

    public String getCustomerName(){
        return this.name;
    }

<<<<<<< HEAD
    public string getPlanType(){
=======
    public String getPlanType(){
>>>>>>> 2d37213b57742714dcad97ed0bb46ba963e4b828
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
<<<<<<< HEAD




}
=======
}
>>>>>>> 2d37213b57742714dcad97ed0bb46ba963e4b828
