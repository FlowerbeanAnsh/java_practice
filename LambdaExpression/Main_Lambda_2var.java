package LambdaExpression;

public class Main_Lambda_2var {
    public static void main(String[] args) {
        // dont need to write datatype(automatically)
        // dont need to write return for a single statement
        /*FuncInterface_Lambda2 element = (a,b) ->
                a+b;

        System.out.println(element.sum(12, 23));
*/

        FuncInterface_Lambda2 element = (int a ,int b) ->
        {
            System.out.println("sum of two digits are:");
            return a+b;


        };
        System.out.println(element.sum(80, 2888));

    }

}
