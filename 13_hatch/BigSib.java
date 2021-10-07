/*
Hamim Seam and Gloria Lee
APCS
HW #13 -- Where do BigSibs Come From? Using Instance Variables
2021-10-06

DISCO:
I saw that instead of printing within BigSib itself, I could just combine all the string components together and return them when printing in Greet.java.
I tried making Greet.java print richard.greet("freshman") directly instead of using an instance variable as a middleman. The code didnt compile.

QCC:
If you change an instance variable value inside a method, will that change the value only for the purpose of that method or for the entire class?
Why are you not able to print richard.greet("freshman") directly? Or rather, was there an issue in my procedure?

*/

class BigSib{
  String hellomsg;

  public BigSib(){
    hellomsg = "Word Up";
  }

  public String greet(String ent){
    return hellomsg + " " + ent;
  }

}
