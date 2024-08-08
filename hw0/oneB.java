package hw0;

public class oneB {

    public static void drawTriangle(int n) {
        for (int i=1; i<n+1; i++) {
            System.out.println("*".repeat(i));
        }
    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
    
}
