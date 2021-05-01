package labor10_4;

public class Main {
    public static void main(String[] args){
        String expression1 = "1 2 + 3 2 + *";
        try {
            System.out.println( "Eval("+expression1 +"): " + IExpression.evaluate(expression1));
        } catch (ExpressionException e) {
            System.out.println("Wrong expression: " + expression1);
            System.out.println(e);
        }

        System.out.println();
        String expression2 = "1 2 + +";
        try {
            System.out.println( "Eval("+expression2 +"): " + IExpression.evaluate(expression2));
        } catch (ExpressionException e) {
            System.out.println("Wrong expression: " + expression2);
            System.out.println(e);
        }

        System.out.println();
        String expression3 = "1 a +";
        try {
            System.out.println( "Eval("+expression3 +"): " + IExpression.evaluate(expression3));
        } catch (ExpressionException e) {
            System.out.println("Wrong expression: " + expression3);
            System.out.println(e);
        }

        System.out.println();
        String expression4 = "1,3 a +";
        try {
            System.out.println( "Eval("+expression4 +"): " + IExpression.evaluate(expression4));
        } catch (ExpressionException e) {
            System.out.println("Wrong expression: " + expression4);
            System.out.println(e);
        }

        System.out.println();
        String expression5 = "-1 2 3 * +";
        try {
            System.out.println( "Eval("+expression5 +"): " + IExpression.evaluate(expression5));
        } catch (ExpressionException e) {
            System.out.println("Wrong expression: " + expression5);
            System.out.println(e);
        }
    }
}
