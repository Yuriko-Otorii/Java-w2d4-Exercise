public class Calculator {
    private double num1;
    private double num2;

    public Calculator(){
    }

 public double add(double num1, double num2){
    return num1 + num2;
 }   

 public double subtract(double num1, double num2){
    return num1 - num2;
 }

 public double multiply(double num1, double num2){
    return num1 * num2;
 }

 public double divide(double num1, double num2){
    return num1 / num2;
 }   

public void askCalculator(){
    System.out.println("Choose an operation: ");
    System.out.println(" >Type + for addition");
    System.out.println(" >Type - for subtraction");
    System.out.println(" >Type * for multiplication");
    System.out.println(" >Type / for division");
}

}
