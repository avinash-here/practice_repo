package pack7_revisiting_mt;

public class N extends Thread{
    L l;
    String name;
    
    public N(L l, String name) {       
        this.l = l;
        this.name = name;
    }
    
    @Override
    public void run() {
        l.fun(name);
    }
}