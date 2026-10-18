import java.util.*;

public class ShellGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int score = 0;
        int shell1 = 0, shell2 = 0, shell3 = 0;
        //If the pebble is under shell 1
        for(int i = 0; i<lines;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int g = scanner.nextInt();
            //logic here
            // SHELL 1 has the pebble
            int[] array = {a,b,g};
            if(shell3 == 1){
                
            }
            //swaps to b
            if(shell2 == 1){
                shell2 -= 2;
                shell3 += 1;
            }
            shell2 += 1;
            //If it transfered from a -> b and guess b + 1 score
            if(g == b){
                score += 1;
            }
            //Done
        }

        
        System.out.println(score);

        
    }
}