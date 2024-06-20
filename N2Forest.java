import java.util.Scanner;
public class N2Forest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the forest");
        Integer size = scan.nextInt();
        scan.close();
        for(int i=1; i<=size; i++){
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
