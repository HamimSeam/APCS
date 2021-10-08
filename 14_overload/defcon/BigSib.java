/*
Hamim Seam, Gloria Lee, and Kevin Li
APCS
HW 14 --  Customize Your Creation (Alternate BigSib Constructors)
2021-10-07

DISCO
My teammates helped me realize that I wasn't writing variable names in camel case.
I have an issue with forgetting semicolons and saving code frequently it seems.
You can create constructors that set a default value for instance variables

QCC
I was confused as to how to get the same output in Greet.java using BigSib() without parameters, since the hello message needed to be specified. I ended up making them have the same one.
I wasn't sure if we needed different BigSib classes for each Greet.java, but I just made one with two constructors and put it on both.
*/

class BigSib{
  String helloMsg;

  public BigSib(){
    helloMsg = "Pleased to make your acquaintance";
  }

  public BigSib(String msg){
    helloMsg = msg;
  }


  public String greet(String ent){
    return helloMsg + " " + ent;
  }

}
