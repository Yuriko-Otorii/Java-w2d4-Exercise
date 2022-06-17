import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();
        Scanner s = new Scanner(System.in);
        String answer = "";
        while(answer.equals("")){

            System.out.print("Type the first nuber: ");
            double input1 = s.nextInt();
        
            c.askCalculator();
            String calc = s.next();
    
            System.out.print("Please type the second nuber: ");
            double input2 = s.nextInt();
    
            if(calc.equals("/")){
                if(input2 == 0){
                    System.out.println("Cannot divide by ZERO");
                    System.out.println("Do you want to continue or quit?");
                    answer = s.next();
                    if(answer.toLowerCase().equals("continue")){
    
                        System.out.print("Type the first nuber: ");
                        input1 = s.nextInt();
                        
                        c.askCalculator();
    
                        calc = s.next();
                        System.out.print("Please type the second nuber: ");
                        input2 = s.nextInt();
    
                        double result = c.divide(input1, input2);
                        System.out.printf("%s%.2f%n", "The result is ", result);

                    }else{
                        System.out.println("Bye!");
                        s.close();
                        System.exit(0);
                    }
                }
            }    
    
            if(calc.equals("+")){
                double result = c.add(input1, input2);
                System.out.printf("%s%.2f%n", "The result is ", result);
    
            }else if(calc.equals("-")){
                double result = c.subtract(input1, input2);
                System.out.printf("%s%.2f%n", "The result is ", result);
    
            }else if(calc.equals("*")){
                double result = c.multiply(input1, input2);
                System.out.printf("%s%.2f%n", "The result is ", result);

            }else if(calc.equals("/")){
                double result = c.divide(input1, input2);
                System.out.printf("%s%.2f%n", "The result is ", result);
            }

        System.out.println("Do you want to continue or quit?");
        answer = s.next();
        }
        
        System.out.println("Bye!");
        s.close();
        System.exit(0);
    }
}
