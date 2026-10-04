public class Fibonocci {

    public static void main(String[] args) {
        int num1 =0,num2=1,fab;
        System.out.print(num1+" "+num2);
        for(int i=1;i<=10;i++) {
           fab = num1 + num2;
            System.out.print(" "+fab);
            num1 = num2;
            num2 = fab;
        }
    }
}
