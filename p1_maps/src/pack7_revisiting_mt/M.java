package pack7_revisiting_mt;

public class M extends Thread{
    L l;
    String name;
        
    public M(L l, String name) {       
        this.l = l;
        this.name = name;
    }

    @Override
    public void run() {
        l.fun(name);
    }
}
