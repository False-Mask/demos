import java.util.HashMap;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        HashMap<Integer,Integer> a = new HashMap<>();
        new Thread(()->{
            for(int i = 0;i < 1000; i++) {
                a.put(i,i);
            }
        }).start();

        new Thread(()->{
            for(int i = 0;i < 1000; i++) {
                a.put(i,i);
            }
        }).start();




    }

}
