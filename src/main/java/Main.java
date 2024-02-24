public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Insufficient arguments");
            return;
        }

        Calculator calculator = new Calculator();

        String command = args[0];
        int result = 0;
        String binaryResult = "";

        switch (command) {
            case "add":
                result = calculator.add(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                System.out.println(result);
                break;
            case "subtract":
                result = calculator.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                System.out.println(result);
                break;
            case "multiply":
                result = calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                System.out.println(result);
                break;
            case "divide":
                result = calculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                System.out.println(result);
                break;
            case "fibonacci":
                result = calculator.fibonacciNumberFinder(Integer.parseInt(args[1]));
                System.out.println(result);
                break;
            case "binary":
                binaryResult = calculator.intToBinaryNumber(Integer.parseInt(args[1]));
                System.out.println(binaryResult);
                break;
            default:
                System.out.println("Invalid command");
        }
    }
}

