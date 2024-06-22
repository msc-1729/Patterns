import java.util.Scanner;
public class numberCrown {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the size of the number crown");
        Integer size = scan.nextInt();
        scan.close();
        printnumberCrown(size);
    }
    public static void printnumberCrown(int size){
        for(int i=1; i<=size; i++){
            for(int j=1; j<=2*size;j++){
 

                if(j<=size && j<=i){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
                if(j>size && (((2*size)%j)+1)<=i){
                    System.out.print(((2*size)%j)+1);
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

}
}

               // System.out.print(( j<=i || j>i && j>size &&(((2*size)%j+1)<=i) )? (j<=size? j: ((size*2)%j+1)):" ");
                // if(j<=i){
                //     System.out.print(j);
                // }
                // else if (j>i && ((((2*size)%j)+1) > i)){
                //     System.out.print(" ");
                // }
                // else{
                //     System.out.print(((2*size)%j)+1);
                // }