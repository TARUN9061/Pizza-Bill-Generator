public class Test{
    public static void main(String[] args) {
        /*BasePizza base=new BasePizza(true);
        base.addExtraChees();
        base.addExtraTopping();
        base.Takeaway();
        base.getBill();*/

        DeluxPizza delux=new DeluxPizza(false);
        delux.addExtraChees();
        delux.addExtraTopping();
        delux.getBill();
    }
}


class BasePizza{
    private float price;
    private boolean veg;

    private int extraCheesPrice=100;
    private int extraToppingPrice=150;
    private int packingPrice=20;

    private float PizzaPrice;

    private boolean isExtraCheesAdded=false;
    private boolean isExtraToppingAdded=false;
    private boolean isOptedTakeaway=false;

    public BasePizza(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        PizzaPrice=this.price;
    }
    
    public void addExtraChees(){
        isExtraCheesAdded=true;
        this.price+=this.extraCheesPrice;
    }

    public void addExtraTopping(){
        isExtraToppingAdded=true;
        this.price+=extraToppingPrice;
    }

    public void Takeaway(){
        isOptedTakeaway=true;
        this.price+=packingPrice;
    }

    public void getBill(){
        String Bill="";
        System.out.println("Pizza: "+PizzaPrice);
        if(isExtraCheesAdded){
            Bill+="Extra chees added: "+extraCheesPrice+"\n";
        }
        if(isExtraToppingAdded){
            Bill+="Extra topping added: "+extraToppingPrice+"\n";
        }
        if(isOptedTakeaway){
            Bill+="Take away opted: "+packingPrice+"\n";
        }
        Bill+="Bill: "+this.price+"\n";
        System.out.println(Bill);
        
    }
}

class DeluxPizza extends BasePizza{
    DeluxPizza(boolean veg){
        super(veg);
        super.addExtraChees();
        super.addExtraTopping();
    }

    @Override
    public void addExtraChees(){}

    @Override
    public void addExtraTopping(){}
}

