import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        boolean check = ((a > 0 || b > 0) && (a > 0 || c > 0) && (c > 0 || b > 0));
        
        
        System.out.println(check); 
    }
}
