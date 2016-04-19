public class TimesTable {

  public static void main(String[] args){
  int result;

  System.out.print("  ");
    for (int r = 0; r <= 9; r++) {
    System.out.print("  " + r);
    }
    System.out.println();

  //nested loops o=outer i =inner
    for ( int o = 0; o<=9; o++){
      System.out.print(" " + o);

     
      for( int i =0; i<=9; i++){
        result = o*i;
        
        if (result < 10) {
          System.out.print("  " + result);
        }else{
          System.out.print(" " + result);
        }
      } 
    System.out.println();
   }
  }
}