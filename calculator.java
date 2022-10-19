import java.util.Scanner;

public class calculator {

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
     }
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n; 
        System.out.println("Calculator Menu!");
        System.out.println("========================");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (x)");
        System.out.println("4. Division (:)");
        System.out.println("5. Modulo (%)");
        System.out.println("6. Clear Total");
        System.out.println("7. Exit");
        System.out.println("========================");
        System.out.println("Choose the Menu :"); 
        int menu = num.nextInt();

        System.out.println("Input number :");
        int x = num.nextInt();
        int y = num.nextInt();

        do{
            switch (menu) {
                
                case 1:
                    n = x+y;
                    System.out.printf("Result: %d", n);
                    break;
                case 2 :
                    n = x-y;
                    System.out.printf("Result : %d", n);
                    break;
                case 3 :
                    n = x*y;
                    System.out.printf("Result : %d", n);
                    break;
                case 4 :
                    n = x/y;
                    System.out.printf("Result : %d", n);
                    break;
                case 5 :
                    n = x%y;
                    System.out.printf("Result : %d", n);
                    break;
                case 6 :
                    clearScreen();  
                        ;
                case 7 :
                    System.exit(0);
                default:
                    System.out.println("You Choose The Wrong Menu!");
            }
        } while (menu <=1 && menu >=7);
        num.close();
    // char y,n;
    // System.out.println("Back to Menu?");
    // y = num.next();
    // if(back == y){
    //     system
    // }
    }
}
