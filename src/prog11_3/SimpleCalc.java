package prog11_3;

public class SimpleCalc {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: SimpleCalc <number1> <operator> <number2>");
            return;
        }

        int a = Integer.parseInt(args[0]);
        String operator = args[1];
        int b = Integer.parseInt(args[2]);

        Calc[] operations = {
                new Sum(),
                new Subtract(),
                new Multiply(),
                new Divide(),
                new Modulus()
        };

        for (Calc operation : operations) {
            if (operation.getOperator().equals(operator)) {
                int result = operation.calc(a, b);
                System.out.println(a + operator + b + "=" + result);
                return;
            }
        }

        System.out.println("Unsupported operator: " + operator);
    }
}
