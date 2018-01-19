
import javax.swing.ImageIcon;


public class Robber extends Customer{

    public Robber(){
        super();
    }
    
    public Robber(int p, int t, String o, String c){
        super(p,t,o,c);
        image = new ImageIcon(getClass().getResource("Robber.png"));
    }
    
    @Override
    public void setPay() {
        this.steal();
    }
    
    public void steal(){
        pay = -5;
    }

    @Override
    public void setPay(int p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/*
    @Override
    public int getType() {
        return -1;
    }
*/
    
    
    
}
