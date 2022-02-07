public class Calculate {
    private final String add = "+";
    private final String subtract = "-";
    private final String divide = "/";
    private final String multiply = "*";


    public double calculate(double a, double b, String operation){
        switch (operation){
            case add:
                return a+b;

            case subtract:
                return a-b;

            case divide:
                if(b == 0){
                    System.out.println("Unable to divide by 0");
                    return 0;
                }else{
                    return a/b;
                }

            case multiply:
                return a*b;

            default:
                System.out.println("No option choose");
                return 0;
        }
    }
}
