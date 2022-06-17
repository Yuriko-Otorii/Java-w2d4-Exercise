import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {        
        Scanner s = new Scanner(System.in);
        String answer = "continue";
        while(answer.equals("continue")){

            System.out.print("Type the first nuber: ");
            double input1 = s.nextInt();
        
            System.out.println("Choose an operation: ");
            System.out.println(" >Type + for addition");
            System.out.println(" >Type - for subtraction");
            System.out.println(" >Type * for multiplication");
            System.out.println(" >Type / for division");
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
                        
                        System.out.println("Choose an operation: ");
                        System.out.println(" >Type + for addition");
                        System.out.println(" >Type - for subtraction");
                        System.out.println(" >Type * for multiplication");
                        System.out.println(" >Type / for division");
    
                        calc = s.next();
                        System.out.print("Please type the second nuber: ");
                        input2 = s.nextInt();
                        
                        Calculator c2 = new Calculator(input1, input2);
                        double result = c2.divide();
                        System.out.printf("%s%.2f%n", "The result is ", result);

                    }else{
                        System.out.println("Bye!");
                        s.close();
                        System.exit(0);
                    }
                }
            }    
            
            Calculator c3 = new Calculator(input1, input2);

            if(calc.equals("+")){
                double result = c3.add();
                System.out.printf("%s%.2f%n", "The result is ", result);
    
            }else if(calc.equals("-")){
                double result = c3.subtract();
                System.out.printf("%s%.2f%n", "The result is ", result);
    
            }else if(calc.equals("*")){
                double result = c3.multiply();
                System.out.printf("%s%.2f%n", "The result is ", result);

            }else if(calc.equals("/")){
                double result = c3.divide();
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
