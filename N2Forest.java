import java.util.Scanner;
public class n2Forest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("You have these choices for printing the N2 forest:");
        System.out.println("1. Characters");
        System.out.println("2. Numericals");
        System.out.println("3. Repeat Forest");
        System.out.println("4. N2 Reverse Forest");
        System.out.println("5. N2 Reverse Numericals");
        System.out.println("6. N2 Reverse Numericals Reverse Order");
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


// optimized way of implementing this

// import java.util.Scanner;

// public class n2Forest {
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("You have these choices for printing the N2 forest:");
//         System.out.println("1. Characters");
//         System.out.println("2. Numericals");
//         System.out.println("3. Repeat Forest");
//         System.out.println("4. N2 Reverse Forest");
//         System.out.println("5. N2 Reverse Numericals");
//         System.out.println("6. N2 Reverse Numericals Reverse Order");
//         System.out.println("Enter your choice:");
//         int choice = scan.nextInt();
//         System.out.println("Enter the size of the forest:");
//         int size = scan.nextInt();
//         scan.close();
        
//         switch (choice) {
//             case 1:
//                 printForest(size, "*", false, false);
//                 break;
//             case 2:
//                 printForest(size, "numerical", false, false);
//                 break;
//             case 3:
//                 printForest(size, "repeat", false, false);
//                 break;
//             case 4:
//                 printForest(size, "*", true, false);
//                 break;
//             case 5:
//                 printForest(size, "numerical", true, false);
//                 break;
//             case 6:
//                 printForest(size, "reverseNumerical", true, true);
//                 break;
//             default:
//                 System.out.println("Invalid choice.");
//                 break;
//         }
//     }

//     public static void printForest(int size, String type, boolean reverse, boolean reverseOrder) {
//         for (int i = (reverse ? size : 1); (reverse ? i > 0 : i <= size); i = (reverse ? i - 1 : i + 1)) {
//             StringBuilder sb = new StringBuilder();
//             for (int j = 1; j <= i; j++) {
//                 switch (type) {
//                     case "*":
//                         sb.append("*");
//                         break;
//                     case "numerical":
//                         sb.append(j);
//                         break;
//                     case "repeat":
//                         sb.append(i);
//                         break;
//                     case "reverseNumerical":
//                         sb.append(reverseOrder ? i - j + 1 : j);
//                         break;
//                 }
//             }
//             System.out.println(sb.toString());
//         }
//     }
// }

