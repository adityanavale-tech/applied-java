import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] xCorrdinates = new int[N];
        int[] yCorrdinates = new int[N];
        int numberOfLines = (N * (N - 1))/2;
        int[] distanceArray = new int[numberOfLines];
        

        for(int i = 0; i < N; i++){
            xCorrdinates[i] = scanner.nextInt();
        }
        for(int i = 0; i < N; i++){
            yCorrdinates[i] = scanner.nextInt();
        }
        
        //main logiic!!!
        int max_distance = distanceArray[0];
        for(int i = 0; i < N; i++) {
            
            for(int j = i + 1; j < N; j++){
            //First time i = 0, and j advanceds
            int x1 = xCorrdinates[i];
            int x2 = xCorrdinates[j];
            int y1 = yCorrdinates[i];
            int y2 = yCorrdinates[j];
            //Eucildian Distance for. 
            int distance = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
            distanceArray[i] = distance;
            if (distanceArray[i] > max_distance) max_distance = distanceArray[i];
            //Storing max distance

            }

        }


        // System.out.println(Arrays.toString(xCorrdinates));
        // System.out.println(Arrays.toString(yCorrdinates));
        // System.out.println("Amount of Lines = " + numberOfLines);
        System.out.println(max_distance);

    scanner.close();
    }
}