public class Factorial {
    public static int factorial(int n){
        int result =1;
        if(n == 0 || n == 1){
            return result;
        }
        for(int i = 2; i <= n; i++){
          result = result * i;
        }
        return result;
    }

    public static int recursiveFactorial(int n){
        int result =1;
        if(n == 0 || n == 1){
            return result;
        }
        else{
            return n*recursiveFactorial(n-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(recursiveFactorial(4));
}}
