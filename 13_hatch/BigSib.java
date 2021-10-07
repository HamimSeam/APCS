/*
Gloria Lee and Hamim Seam
APCS
HW13: Where do BigSibs Come From?/Constructors/How to use Constructors with different classes
2021-10-6
DISCO
I kept on getting the error BigSib.java:6: error: illegal start of expression. However, I realized that this was actually because I missed a parenthesis at the end of my code. 
I also got Word Up freshman with a new line starting between Word Up and freshman and I didn't know why. I figured out that this was because I did System.out.println(hellomsg) 
instead of print only
QCC
Would there be any way to get the constructor to take input for example and print out that input. This is because we have to specify in the code that the hellomsg is Word Up 
but what if we want to make it so that any custom message can be input?
*/

class BigSib{
  String hellomsg;
  public BigSib(){
    
    hellomsg = "Word Up";
    System.out.print(hellomsg);
  }
  public String greet(String b){
    b=" "+b;
    return b;
  }
}
