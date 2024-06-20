import java.util.Scanner;
public class N2Forest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("You have two choices for printing the N2 forest:");
        System.out.println("1. Characters , 2. Numericals , 3.repeatForest, 4.n2ReverseForest, 5.n2ReverseNumerical, 6.n2ReverseNumericalReverseOrder");
        System.out.println("Enter your choice");
        Integer choice = scan.nextInt();
        System.out.println("Enter the size of the forest");
        Integer size = scan.nextInt();
        scan.close();
        switch (choice) {
            case 1:
                n2ForestCharacter(size);
                break;
            case 2:
                n2ForestNumerical(size);
                break;
            case 3:
                repeatForest(size);
                break;
            case 4:
                n2ReverseForest(size);
                break;
            case 5:
                n2ReverseNumerical(size);
                break;
            case 6:
                n2ReverseNumericalReverseOrder(size);
                break;
            default:
                break;
        }
    }

    public static void n2ForestCharacter(int size){
        for(int i=1; i<=size; i++){
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void n2ForestNumerical(int size){
        for(int i=1; i<=size; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void repeatForest(int size){
        for(int i=1; i<=size; i++){
            for(int j=0; j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void n2ReverseForest(int size){
        for(int i=size; i>0; i-- ){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void n2ReverseNumerical(int size){
        for(int i=size; i>0; i--){
            for(int j=1; j<=i; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void n2ReverseNumericalReverseOrder(int size){
        for(int i=size; i>0; i--){
            for(int j=i; j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
