package fizzbuzz;

public class FizzBuzz {

    public static String FizzConvert(int number){
        if (number==0){
            return "";
        }
       else if(number%3==0 && number%5==0){
            return "FizzBuzz";
        }
        else if(number%3==0){
            return "Fizz";
        }
        else if(number%5==0){
            return "Buzz";
        }

        return String.valueOf((number));
}

    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
           System.out.println(FizzConvert(i));
        }
    }

}
