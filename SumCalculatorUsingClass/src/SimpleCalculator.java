
public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionalResult(){
        return this.firstNumber + this.secondNumber;
    }

    public  double getSubtractionResult(){
        return  this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }
    public double getDivisionResultResult(){
        if(this.secondNumber == 0)
            return 0;
        else
            return this.firstNumber / this.secondNumber;

    }

}
