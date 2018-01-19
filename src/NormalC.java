
import javax.swing.ImageIcon;


public class NormalC extends Customer{

    public NormalC(){
        super();
        image = new ImageIcon(getClass().getResource("Customer.png"));
    }
    
    public NormalC(int p, int t, String o, String c){
        super(p,t,o,c);
    }
    
    public void setPay(int p) {
        pay = p;
    }

    public void setTip() {
        tip = (int)(Math.random() * 3) + 1; // give tip amount a random value between 1 to 3
    }

    @Override
    public void setPay() {
        pay = 5;
    }

    @Override
    public void setOrder() {
        int r = (int)((Math.random() * 3) + 1); //have 3 random orders
        //set 3 order options
        if(r == 1){
            order = "Chocolate,\nVanilla,\nStrawberry";
        }
        else if(r == 2){
            order = "Vanilla,\nVanilla,\nStrawberry";
        }
        else{
            order = "Strawberry,\nChocolate,\nVanilla";
        }
    }
/*
    @Override
    public int getType() {
        return 1;
    }
*/  
}
