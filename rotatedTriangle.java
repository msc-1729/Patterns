import java.util.Scanner;
public class rotatedTriangle {

    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the size of the rotated Triangle");
        Integer size = scan.nextInt();
        printrotatedTriangle(size);
        scan.close();
    }
    public static void printrotatedTriangle(int size){
        for(int i=1; i<=size*2-1; i++){
            for(int j =0; j<( i>size ? size*2-i : i);j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
