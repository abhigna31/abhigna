package ab;
import java.util.*;
public class PriorityDemo {
    public static void main(String []args)
    {
     PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(); 


     pQueue.add(10); 
     pQueue.add(20); 
     pQueue.add(15); 
     pQueue.add(14); 
    
     System.out.println(pQueue.peek()); 

   
     System.out.println(pQueue.poll()); 

  
     System.out.println(pQueue.peek()); 
 } 
}