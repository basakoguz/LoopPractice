public class LoopPractice {

  public static void practiceWhileLoop(){
    int x = 0;
    while(x<5){
      System.out.println("The value of x is " + x);
      x++;
    }
  }

  public static void practiceDoWhile(){
    int x = 0;
    do {
      System.out.println("The value of x is " + x);
      x++;
    }while (x < 10);
  }

  public static void practiceForLoop(){
    //Prints coordinates from 0 to 9 in the form of (x,y)
    for (int x=0; x<10; x++){
      for (int y=0; y<10;y++){
        System.out.println("("+x+","+y+")");
      }
    }
  }

  public static void main(String[] args){
    practiceForLoop();
  }
}
