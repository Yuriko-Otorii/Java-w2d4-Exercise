public class Calculator {
    private double num1;
    private double num2;

    public Calculator(){

    }
    
    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

 public double add(){
    return num1 + num2;
 }   

 public double subtract(){
    return num1 - num2;
 }

 public double multiply(){
    return num1 * num2;
 }

 public double divide(){
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
