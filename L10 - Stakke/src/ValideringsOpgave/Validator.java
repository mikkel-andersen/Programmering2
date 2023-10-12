package ValideringsOpgave;

import StakkeOpgave.ArrayListStack;
import StakkeOpgave.ArrayStack;
import StakkeOpgave.StackI;

public class Validator {
    StackI bracketStack;

    public Validator() {
        bracketStack = new ArrayListStack();
    }

    public boolean validateBrackets(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '[' || expression.charAt(i) == '{') {
                bracketStack.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')' || expression.charAt(i) == ']' || expression.charAt(i) == '}') {
                if (bracketStack.isEmpty()) {
                    return false;
                }
                char top = (char) bracketStack.pop();
                if (expression.charAt(i) == ')' && top != '(') {
                    return false;
                }
                if (expression.charAt(i) == ']' && top != '[') {
                    return false;
                }
                if (expression.charAt(i) == '}' && top != '{') {
                    return false;
                }
            }
        }
        return true;
    }


}
