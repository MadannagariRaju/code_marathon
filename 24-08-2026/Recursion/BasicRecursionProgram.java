package Recursion;
public class BasicRecursionProgram {

    static int count = 0;
    public static void recursiveMethod() {
        if(count == 3) {
            return ;
        }
        System.err.println("count : " + count);
        count++;
        recursiveMethod();
    }
    public static void main(String args[]) {
        recursiveMethod();
    }
}