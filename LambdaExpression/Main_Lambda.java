package LambdaExpression;

public class Main_Lambda {
    public static void main(String[] args) {
        FuncInterface_Lambda i = () ->
                System.out.println("Hello lambda");
        // dont need to put { } for a single line
        i.sayHello();




    }
}
