import java.util.ArrayList;

public class hilos extends Thread{

    public int id=0, it=0;
    public Principal pri;

    public hilos(int id, Principal pri){
        this.id=id;
        this.pri=pri;
    }

    @Override
    public void run() {
        try{
            for(int i=1; i<pri.Num; i++){
                this.it=i;
                ArrayList<Integer> Lista = new ArrayList<Integer>();
                sleep(dormir);
                lista.add(it);
                lista.add(id);
                lista.add((int) dormir);
                pri.hiloF(lista);
                pri.iteraciones(i);
            }
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

