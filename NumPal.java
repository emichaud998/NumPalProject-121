public class NumPal{

   private String curString; //current forwards string value
   private String revString; //current reverse string value
   private long cur; //number version of current forward value
   private long rev; //number version of current reverse value
   
   public NumPal(String start){ //constructor of NumPal object
      curString=start;
      revString=reverseString(start);
      cur=getCur();
      rev=getRev();
   }
   
   public boolean pal(){ //checks if the forward value is same as its reverse
      if (getCur()==getRev()){
         return true;
      }
      else{
         return false;
      }
   }
      
   public String toString(){
      return (curString+" reverse-> "+ revString);
   }
   
   public long getCur(){ //returns current forward value as a number
      cur= Long.parseLong(curString);
      return cur;
   }
   
   public long getRev(){ //returns current reverse value as a number
      rev= Long.parseLong(reverseString(curString));
      return rev;
   }     
   
   public String reverseString(String forward){ //returns the reverse of the parameter 
      StringBuilder s= new StringBuilder(forward);
      s.reverse();
      return s.toString();

   }
   
   public String add(){ //returns the String of the sum of the forward and reverse value
      long sum= getCur()+getRev();
      return Long.toString(sum); 
   }
   
   public NumPal next(){ //returns a new object with the next values as its attribute values
      NumPal q= new NumPal(add()); //uses the added sum as the parameter for next curString
      return q;
   }

}