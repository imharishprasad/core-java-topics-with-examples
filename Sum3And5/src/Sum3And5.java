
public class Sum3And5 {

    public static void main(String[] args) {

        int summation = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                summation += i;
                System.out.println(i+" is divisible by 3 and 5 ");
                count++;
                if(count == 5)
                    break;
            }
        }
        System.out.println("Summation of numbers divisible by 3 and 5  is "+ summation);
    }

}