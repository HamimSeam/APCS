public class Cereal{

  private String _name;
  private char _type;
  private int _cal;
  private int _protein;
  private int _fat;
  private int _sodium;
  private double _fiber;
  private double _carbs;
  private int _sugar;
  private int _potas;
  private int _vita;
  private int _shelf;
  private double _weight;
  private double _cups;
  private double _rating;


  public Cereal(String name, 
      char type,
     int cal,
     int protein,
    int fat,
   int sodium,
    double fiber,
    double carbs,
    int sugar,
    int potas,
    int vita,
    int shelf,
    double weight,
    double cups,
    double rating){
      this._name = name;
        this._type = type;
        this._cal = cal;
        this._protein = protein;
        this._fat = fat;
        this._sodium = sodium;
        this._fiber = fiber;
        this._carbs = carbs;
        this._sugar = sugar;
        this._potas = potas;
        this._vita = vita;
        this._shelf = shelf;
        this._weight = weight;
        this._cups = cups;
        this._rating = rating;

  }


  public String getName() {
    return _name;
  }

  public char getType() {
    return _type;
  }

  public int getCal() {
    return _cal;
  }

  public int getProtein() {
    return _protein;
  }

  public int getFat() {
    return _fat;
  }

  public int getSodium() {
    return _sodium;
  }

  public double getFiber() {
    return _fiber;
  }

  public double getCarbs() {
    return _carbs;
  }

  public double getSugar() {
    return _sugar;
  }

  public int getPotas() {
    return _potas;
  }

  public int getVita() {
    return _vita;
  }

  public int getShelf() {
    return _shelf;
  }

  public double getWeight() {
    return _weight;
  }

  public double getCups() {
    return _cups;
  }

  public double getRating() {
    return _rating;
  }


  public String toString(){
    String output  = " ";
  output += "Name: " + _name +": \n";
  
  output += "\n type: " + _type;
  output += "\n cal: " + _cal;
  output += "\n protein: " + _protein;
  output += "\n fat: " + _fat;
  output += "\n sodium: " + _sodium;
  output += "\n fiber: " + _fiber;
  output += "\n carbs: " + _carbs;
  output += "\n sugar: " + _sugar;
  output += "\n potassium: " + _potas;
  output += "\n vitamins: " + _vita;
  output += "\n shelf: " + _shelf;
  output += "\n weight: " + _weight;
  output += "\n cups: " + _cups;
  output += "\n rating: " + _rating;
  return output;
  }

public static void main (String[]args) {
   Cereal raisinBran = new Cereal("Raisin Bran", 'C', 100, 4, 0, 100, 8, 6, 100, 25, 25, 3, 1, 0.75, 41.93123);
   System.out.println(raisinBran);
   System.out.println(raisinBran.getName());
   System.out.println(raisinBran.getVita());


   Cereal cheerios = new Cereal("Cheerios", 'C', 110, 6, 2, 290, 2, 17, 1, 105, 25, 1, 1.2, 1.2, 69.420);
   System.out.println(cheerios);
   System.out.println(cheerios.getCal());
}





}
