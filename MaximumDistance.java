import java.util.*;


public class MaximumDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] xCorrdinates = new int[N];
        int[] yCorrdinates = new int[N];
        int choose = (N * (N - 1))/2;
        int[] distanceArray = new int[choose];
        

        for(int i = 0; i < N; i++){
            xCorrdinates[i] = scanner.nextInt();
            //System.out.println(xCorrdinates[i])
        }
        for(int i = 0; i < N; i++){
            yCorrdinates[i] = scanner.nextInt();
            //System.out.println(yCorrdinates[i])
        }
        
        //main logiic!!!
        int max_distace = distanceArray[0];
        for(int i = 0; i < N - 1; i++){
            int x1 = xCorrdinates[i];
            int x2 = xCorrdinates[i + 1];
            int y1 = yCorrdinates[i];
            int y2 = yCorrdinates[i + 1];

            //Eucildian Distance for. 
            int distance = Math.powExact(x2 - x1, 2) + Math.powExact(y2 - y1, 2);
            distanceArray[i] = distance;
            if (distanceArray[i] > max_distace) max_distace = distanceArray[i];

            System.out.println(distance);
        }

        System.out.println(Arrays.toString(xCorrdinates));
        System.out.println(Arrays.toString(yCorrdinates));
        System.out.println("Amount of Lines = " + choose);
        System.out.println(Arrays.toString(distanceArray));
        System.out.println("Max Distance(Not Optimized..Yet: " + max_distace);

    }
}