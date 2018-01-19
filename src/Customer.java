
import javax.swing.ImageIcon;

abstract public class Customer {
    protected ImageIcon image;
    protected int pay, tip; //store the customer's payment and tip
    protected String order, comment; //store the customer's order and a nice comment
    static protected int total; // store the total customers served
            
    public Customer(){
        //basic customer
        pay = 5;
        tip = 1;
        order = "Chocolate";
        comment = null;
    }
    public Customer(int p, int t, String o, String c){
        //specific customer
        pay = p;
        tip = t;
        order = o;
        comment = c;
    }
    
    //GETTERS
    final public ImageIcon getImage() {
        return image;
    }

    public int getPay() {
        return pay;
    }

    public int getTip() {
        return tip;
    }

    public String getOrder() {
        return order;
    }

    final public String getComment() {
        return comment;
    }

    //SETTERS
    abstract public void setPay(int p);
    abstract public void setPay();
    abstract public void setOrder();
    
    public void setTip(){
        tip = 0;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    //increase number of customers served
    public void count(){
        total++;
    }
    
}
