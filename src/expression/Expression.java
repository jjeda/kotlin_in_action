package expression;

public class Expression {

    public int max(int a, int b) {
        int max;

        // statement
        if( a > b ) {
            max = a;
        } else {
            max = b;
        }

        max = a > b ? a : b;
        return max;
    }
}
