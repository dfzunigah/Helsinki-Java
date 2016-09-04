public class PrintingLikeBoss {

    public static void printStars(int amount) {
        int A=0;
            while(A<amount){
                System.out.print("*");
                 A++;
            }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int A=0;
        while(A<amount){
           System.out.print(" "); 
           A++;
        }
    }

    public static void printTriangle(int size) {
        int spaces=size;
        int B=1;
        while(spaces!=0){
            printWhitespaces(spaces-1);
            spaces--;
            printStars(B);
            B++;
        }
        
        
    }

    public static void xmasTree(int height) {
        int spaces=height;
        int triangle=1;
        while(spaces!=0){
            printWhitespaces(spaces-1);
            spaces--;
            printStars(triangle);
            triangle+=2;
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
