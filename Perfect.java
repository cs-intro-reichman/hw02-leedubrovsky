public class Perfect {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum = 1;
        String str = num + " is a perfect number since " + num + " = 1";
    
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    sum += i;
                    str += " + " + i ;
                }
            }
                if (num == sum){
                    System.out.print(str);
    
                }else {
                    System.out.print(num + " is not a perfect number");
    
                }
    
            
    
          
        
    }
    
}
