import java.util.Scanner;
public class BronzeTeamPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = scanner.nextInt();
        int numberOfproblems = 0;
        //the amount of lines next
        for(int i = 0; i<loop;i++){
            int penya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();
            if((penya + vasya + tonya) >= 2){
                numberOfproblems += 1;
            }
        }
        System.out.println(numberOfproblems);
    }
}
