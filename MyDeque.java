import java.util.*;

public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = 0;
    size = 0;
   }
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = 0;
    end = 0;
    size = 0 ;
  }

  public int size(){
    return size;
  }

  @SuppressWarnings("unchecked")
  private void resize(){
    if (size == data.length) {
      int index = 0;
      boolean check = false;
      E[] holder = (E[])new Object[data.length * 2 + 1];
      while (start < data.length && !check) {
        if (start == end) {
          check = true;
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
      start = 0 ;
      end = size - 1;
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
        }
        else {
          for (int i = start; i < data.length; i++){
            ans += data[i] + " ";
          }
          for (int i = 0; i < end; i++){
            ans += data[i] + " ";
          }
        }
        return ans + "}";
      }
/// [ a, b, c, d, e, f, g, h, i, j , k]
///  start        end

  public void addFirst(E element){
    if (element == null){
      throw new NullPointerException();
    }
    if (size == data.length){
      resize();
    }
    if (size == 0){
      data[0] = element;
      size++;
      start = 0;
      end = 0;
    }
    else if (start == 0){
      start = data.length - 1;
      data[start] = element;
      size++;
    }
    else{
      start--;
      data[start] = element;
      size++;
    }
  }

  public void addLast(E element){
    if (element == null){
      throw new NullPointerException();
    }
    if (size == data.length){
      resize();
    }
    if (end == data.length){
      data[0] = element;
      end = 1;
      }
      else{
        data[end] = element;
        end++;
      }
    // data[end] = element;
    size++;
  }
//   ****ES**
    //
    // else{
    //   if(end + 1 == start){
    //     resize();
    //   }
    //   // if(end == ){
    //   //   end = ;
    //   // }
    //   else{
    //     end++;
    //   }
    //   data[end] = element;
    //   size++;
    // }

  public E removeFirst(){
    if(size == 0){
      throw new NoSuchElementException();
    }
    E value = data[start];
    if (start != data.length - 1){
      start++;
    }
    else{
      start = 0;
    }
    size--;
    return value;
  }

  public E removeLast(){
    if(size == 0){
      throw new NoSuchElementException();
    }
    E value = data[end];
    if (end != 0){
      end--;
    }
    else{
      // if (size != 0){
        end = data.length - 1;
      }
      size--;
      if (size ==0){
        start = 0;
        end = 0;
      }
    return value;
  }

  public E getFirst(){
    if(size == 0){
      throw new NoSuchElementException();
    }
    return data[start];
  }

  public E getLast(){
    if(size == 0){
      throw new NoSuchElementException();
    }
    return data[end ];
    }

  public static void main(String[] args){
    MyDeque data = new MyDeque(5);
    System.out.println(data);
    data.addLast(1);
    System.out.println(data);
    // data.addFirst(0);
    // System.out.println(data);
    // data.addFirst(2);
    // System.out.println(data);
    // data.addFirst(5);
    // System.out.println(data);
    // data.addLast(5);
    // System.out.println(data);
    // data.addFirst(3);
    // System.out.println(data);

    // data.addFirst(5);
    // System.out.println(data);
    // data.removeLast();
    // System.out.println(data);
  }
  }

// public class Calculator{
//       /*Evaluate a postfix expression stored in s.
//        *Assume valid postfix notation, separated by spaces.
//        */
//   public static double eval(String s){
//     ArrayList<Double> stack = new ArrayList<Double>;
//     String[] word = s.split(" ");
//     for (int i = 0; i < s.length; i++){
//       if (ary[i].equals("+") || ary[i].equals("+") || ary[i].equals("+")|| ary[i].equals("+")){
//         stack.addLast(Double.parseDouble(word[i]));
//         }
//       }
//     }
//
//   public static void perform(String s, MyDeque<Double> Stack){
//
//   }
//
//
// }
