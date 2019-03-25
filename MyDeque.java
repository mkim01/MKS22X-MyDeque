public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked");
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = 0;
    size = 0 ;
   }

  public MyDeque(int initialCapacity){
    data = new int[initialCapacity];
    start = 0;
  }

  public int size(){
    return this.size;
  }

  private void resize(){
    if (size == data.length) {
      int index = 0;
      boolean check = false;
      E[] holder = (E[])new Object[size * 2];
      while (start < data.length && !check) {
        if (start == end) {
          done = true;
        }
        holder[index] = data[start];
        start++;
        index++;
      }
      if (!check) {
        start = 0;
        while (start <= end) {
          holder[index] = data[start];
          index++;
          start++;
        }
      }
      data = holder;
    }
  }

    public String toString(){
      String ans = "{";
      if (start == end){
        return "{}";
      }
      if (end > start){
        for (int i = start; i < end; i++){
          ans += data[i] + " ";
        }
      } else {
        for (int i = start; i < size; i++){
          ans += data[i] + " ";
        }
        for (int i = 0; i < end; i++){
          ans += data[i] + " ";
        }
      }
      ans += "}";
      return ans;
    }


  public void addFirst(E element){
    if (end >= start){
      if (end - start + 1 == data.length){
       resize();
      }
      if (start == 0){
       start = data.length - 1;
      }
      else{
       start--;
      }
     data[start] = element;
     size++;
   }else{
     if (start = end + 1){
       resize();
     }
     if (start == 0){
       start = data.length - 1;
     }
     else{
       start--;
     }
     data[start] = element;
     size++;
    }
  }

  public void addLast(E element){
    (if size >= initialCapacity){
      int=
    }
    end --;
   }

  public E removeFirst(){

  }

  public E removeLast(){

  }

  public E getFirst(){
    return data[start];
  }

  public E getLast(){
    return data[end];
    }
  }

public class Calculator{
      /*Evaluate a postfix expression stored in s.
       *Assume valid postfix notation, separated by spaces.
       */
  public static double eval(String s){


  }


  }
