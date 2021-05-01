package labor10_4;

public interface IExpression {
    public static double evaluate(String postfixExpression) throws ExpressionException{
        String[] items=postfixExpression.split(" ");
        Stack stack=new Stack(items.length);

        double operand1,operand2;
        for(String item:items){
            if(isOperator(item.trim())){
                try {
                    operand2= (double) stack.top();
                    stack.pop();
                    operand1= (double) stack.top();
                    stack.pop();

                    switch (item) {
                        case "+" -> stack.push(operand1 + operand2);
                        case "-" -> stack.push(operand1 - operand2);
                        case "*" -> stack.push(operand1 * operand2);
                        case "/" -> stack.push(operand1 / operand2);
                    }

                } catch (StackException e) {
                    throw new ExpressionException("Wrong postfix expression");
                }
                continue;
            }

            try {
                stack.push(Double.parseDouble(item.trim()));
            } catch (NumberFormatException e1) {
                throw new ExpressionException("Wrong operand: "+item.trim());
            } catch (StackException e2){
                throw new ExpressionException("Wrong postfix expression");
            }
        }
        if(stack.getSize()!=1){
            throw new ExpressionException("Wrong postfix expression");
        }

        try {
            return (double)stack.top();
        } catch (StackException e) {
            throw new ExpressionException("Wrong postfix expression");
        }
    }

    public static boolean isOperator(String op){
        return "+-*/".contains(op);
    }
}