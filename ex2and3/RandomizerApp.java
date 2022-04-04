package ex2and3;

import java.util.Random;

public class RandomizerApp {

    public static void main(String[] args) {

        Random r = new Random();
        Random r1 = new Random();

        while (true){
        for (int i = 1; i<25; i++);
            int x = r.nextInt(10);
            int y = r1.nextInt(10);


            if(x > y)
                 System.out.println(x + ">" + y);
             else if(x < y)
                 System.out.println(x + "<" + y);
             else
                 System.out.println(x + "=" + y);



    }}
}

