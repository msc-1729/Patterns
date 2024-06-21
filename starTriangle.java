import java.util.Scanner;
public class starTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("You have these options for printing the star Triangle");
        System.out.println("1. Star Triangle");
        System.out.println("2. Reverse Star Triangle");
        Integer choice = scan.nextInt();
        System.out.println("Enter the size of the Triangle");
        Integer size = scan.nextInt();
        scan.close();
        switch (choice){
            case 1:
                printTriangle(size);
                break;
            case 2:
                printReverseTriangle(size);
                break;
            default:
            System.out.println("Invalid Choice");
                break;
        }
    }
    public static void printTriangle(int size){
        for(int i=0; i<size; i++){
            for(int j=1; j<=size+i; j++){
                System.out.print(j<size-i ? " " : "*");
            }
            System.out.println();
        }
    }
    public static void printReverseTriangle(int size){
        for(int i=size; i>0; i--){
            for(int j=0; j<size+i-1; j++){
                System.out.print(j<size-i ? " " : "*");
            }
            System.out.println();
        }
    }

}

//optimized Solution
// public class starTriangle {
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("You have these options for printing the star Triangle");
//         System.out.println("1. Star Triangle");
//         System.out.println("2. Reverse Star Triangle");
//         Integer choice = scan.nextInt();
//         System.out.println("Enter the size of the Triangle");
//         Integer size = scan.nextInt();
//         scan.close();
//         switch (choice){
//             case 1:
//                 optimized(size,false);
//                 break;
//             case 2:
//                 optimized(size,true);
//                 break;
//             default:
//             System.out.println("Invalid Choice");
//                 break;
//         }
//     }

//     public static void optimized(int size, boolean reverse){
//         for(int i = ( reverse ? size-1 : 0); (reverse ? i>=0: i<size) ; i = (reverse ? i-1 : i+1) ){
//             for(int j=1; j<=size+i; j++){
//                 System.out.print(j<size-i? " ":"*");
//             }
//             System.out.println();
//         }
//     }
// }