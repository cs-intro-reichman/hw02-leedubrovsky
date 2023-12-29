public class Divisors {
    public static void main(String[] args) {
        
	int num1 = Integer.parseInt (args[0]);
    int i = 1; 
    while (i <= num1){
        if ((num1 % i) == 0){
            System.out.println(i);

        }
        i++;

    }


    }
}