public class Reverse {
    public static void main(String[] args) {
      String str = args[0];
      for (int i = 0; i < str.length(); i++){
        
        System.out.print(str.charAt(str.length() - i -1));
      }  
        System.out.println();

      if ( str.length() % 2 != 0){
            System.out.println("The middle character is " + str.charAt((str.length() - 1 ) / 2));

        }else {
            System.out.println("The middle character is " + str.charAt((str.length() ) / 2));//


        }
        
    
    
        
    }
}
