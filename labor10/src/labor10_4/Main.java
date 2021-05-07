package labor10_4;

public class Main {
    public static void main(String[] args) {
        String[] expressions ={ "1 2 + 3 2 + * ", "1 2 + +", "1 a +", "1,3 a +", "1 2,3 *", "1 3 /" };

        for(String expression:expressions){
            try {
                System.out.println( "Eval("+expression +"): " + IExpression.evaluate(expression));
            } catch (ExpressionException e) {
                System.out.println("Wrong expression: " + expression);
                System.out.println("\t" + e.getMessage());
            }
            System.out.println();
        }
    }
}
