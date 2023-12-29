public class InOrder {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10);
        int temp = num;
       
        System.out.print(num + " ");
        do{
            temp = num;
            num = (int)(Math.random()*10);
            if (temp <= num){
                System.out.print(num + " ");
            }
        }while (temp <= num);

        

      
    }
}
