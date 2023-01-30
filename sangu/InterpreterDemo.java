package ge.edu.sangu;

public class InterpreterDemo {

    public static Expression isSingleExpression(){
        Expression robert = new TerminalExpression("Giga");
        Expression john = new TerminalExpression("Davit");
        return new OrExpression(robert, john);
    }

    public static Expression areCommitedExpression(){
        Expression julie = new TerminalExpression("Irakli");
        Expression married = new TerminalExpression("Mari");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isSingle = isSingleExpression();
        Expression areCommited = areCommitedExpression();

        System.out.println("Giga is single? " + isSingle.interpret("Giga"));
        System.out.println("Lazare is single? " + isSingle.interpret("Lazare"));
        System.out.println("Irakli and mari are commited? " + areCommited.interpret("Irakli Mari"));
        System.out.println("Davit and mari are commited? " + areCommited.interpret("Davit Mari"));
    }
}
