import java.util.Random;
public class OneOfEachStats {
public static void main(String[] args) {
    int T = Integer.parseInt(args[0]);
    Random rnd = new Random();
    int family2 = 0;
    int family3 = 0;
    int family4More = 0;
    String str = "";
    double p = 0;
    int count = 1;
    double sum = 0;
    
    
    for (int i = 0; i < T; i++){
    
        str = "";
        count = 1;
        p = rnd.nextDouble();
                
        if (p < 0.5){
               
            while ( p < 0.5 ){
                p = rnd.nextDouble();
                count++;
                str += "b "; 
            
            }  
        }else{
    
            while ( p >= 0.5 ){
                p = rnd.nextDouble();
                count++;
                str += "g "; 
            
            }
        }
        if ((str.charAt(str.length()-2) == 'g')){
            str += "b";
        }else {
            str += "g";
    
        }
    
        sum += count;
        if (count == 2) {
            family2++;
        } else if (count == 3) {
            family3++;
        } else if (count >= 4) {
            family4More++;
        } 
                 
    }
            
                        
        
    double Average = sum/T;
            
            
    System.out.println("Average: " + Average  + " children to get at least one of each gender.");
    System.out.println("Number of families with 2 children: " + family2 );
    System.out.println("Number of families with 3 children: " + family3 );
    System.out.println("Number of families with 4 or more children: " + family4More );
    if (family2 > family3 && family2 > family4More ){
        System.out.println("The most common number of children is 2.");
    
    }else if (family3 > family2 && family3 > family4More ){
        System.out.println("The most common number of children is 3.");
            
    
    }else if (family2 >= family3 || family2 >= family4More ){
        System.out.println("The most common number of children is 2.");
    
    }else if (family3 >= family4More){
        System.out.println("The most common number of children is 3.");
    
    }else{
        System.out.println("The most common number of children is 4 or more.");
    
    }
    
    
                
        }
    }
    

