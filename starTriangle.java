import java.util.Scanner;
public class starTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Triangle");
        Integer size = scan.nextInt();
        scan.close();
        printTriangle(size);
    }
    public static void printTriangle(int size){
        for(int i=0; i<size; i++){
            for(int j=1; j<=size+i; j++){
                System.out.print(j<size-i ? " " : "*");
            }
            System.out.println();
        }
    }

}
