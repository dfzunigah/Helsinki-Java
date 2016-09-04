
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister=1000; 
    }

    public double payEconomical(double cashGiven) {
        if(cashGiven>=2.50){
            this.cashInRegister+=2.50;
            this.economicalSold++;
            return cashGiven - 2.50;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if(cashGiven>=4.00){
            this.cashInRegister+=4.00;
            this.gourmetSold++;
            return cashGiven - 4.00;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        if(card.balance()>=2.50){
            this.economicalSold++;
            card.pay(2.50);
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if(card.balance()>=4.00){
            this.gourmetSold++;
            card.pay(4.00);
            return true;
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum>=0){
            card.loadMoney(sum);
            this.cashInRegister+=sum;
        }
    }
    
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}