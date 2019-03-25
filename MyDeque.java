public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked");
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end - 0;
    size = 0 ;
   }

  public MyDeque(int initialCapacity){
    data = new int[initialCapacity];
    start = 0;
  }

  public int size(){
    return this.size;
   }

  public String toString(){
    String output = "{";
    for(int i = 0; i < data.length; i++){
      output += data[i] + " ";
    }
    return output + "}";
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

  public void addFirst(E element){
    if ()
    start++;

   }
  public void addLast(E element){
    (if size >= initialCapacity){
      int=
    }
    end --;
   }

  public E removeFirst(){
  }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }
}
