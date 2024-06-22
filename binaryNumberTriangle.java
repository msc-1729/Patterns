import java.util.Scanner;
public class binaryNumberTriangle {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the binary number triangle");
        Integer size = scan.nextInt();
        printBinaryNumberTriangle(size);
        scan.close();
    }
    public static void printBinaryNumberTriangle(int size){
        for(int i=1; i<=size; i++){
            for(int j=0; j<i; j++){
                System.out.print(i%2==1 ? j%2==0 ? "1": "0" : j%2==0 ? "0" : "1");
            }
            System.out.println();
        }
    }
}
