import java.util.ArrayList;

public class OrderedArrayList {

  private ArrayList<Integer> _data;

  public OrderedArrayList() {
    _data = new ArrayList<Integer>();
  }

  // O(1) time --- constant time to print out the list
  public String toString() {
    return _data.toString();
  }

  // O(n) time --- If you remove the 0th element and move each element back, that would be on the order of n operations
  public Integer remove( int i ) {
    return _data.remove(i);
  }

    // O(1) time --- determining size is a constant time
  public int size() {
    return _data.size();
  }

    // O(1) time --- given the index, there is a constant time required to find the element at that index
  public Integer get( int i ) {
    if (i < 0 || i >= this.size()) throw new IndexOutOfBoundsException("Out of bounds");
    return _data.get(i);
  }

// O(n) time --- if the element is appended to the end of the list, then n comparisons must have had to been made
  public boolean addLinear(Integer newVal) {
    boolean isAdded = false;

    for (int i = 0; i < this.size() && !isAdded; i++) {
      if (newVal <= this.get(i)) {
        isAdded = true;
        _data.add(i, newVal);
      }
    }
    if (!isAdded) {
      _data.add(newVal);
    }
    return true;

  }

    // O(logn) time --- log_2(n) operations need to be carried out at most in order to find where to
 // insert the element
 
  public void addBinary(Integer newVal) {
    if (this.size() == 0) {
      _data.add(newVal);
    } else {
      _data.add(binary(0, this.size()-1, newVal), newVal);
    }
  }
  

 // Helper method for above - O(logn) time
  public int binary(int left, int right, int target) {
    int middle = (left + right) / 2;
    if (this.get(middle) == target) {
      return middle;
    }
    if (left - right >= 1) {
      return this.size () - 1;
    }
    if (right - left <= 1 && this.get(middle) > target) {
      return left;
    }
    if (right - left < 1) {
      return right + 1;
    }


    if (this.get(middle) > target) {
      return  binary(left, middle - 1, target);

    }
    return binary(middle+1, right, target);
  }
  
  public static void main(String[] args) {
    OrderedArrayList e = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      e.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( e );

  }


}
