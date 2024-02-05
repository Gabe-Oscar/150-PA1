// Example MiniJava program demonstrating all possible tokens
class Main {
    public static void main(String[] args) {
        System.out.println(new Test().testMethod(10, 20, true));
    }
}
/*
 * 
 * dsf
 * df
 */
class Test {
    public int testMethod(int a, int b, boolean condition) {
        int result = 0;
        if (condition && a < b) {
            result = a + b; // Demonstrates use of operators and literals
        } else {
            result = a * b; // Demonstrates more operators
        }
        return result;
    }
    
    public boolean checkCondition() {
        return !false; // Demonstrates use of literal and operator
    }
}
