
public class Calculator{
      /*Evaluate a postfix expression stored in s.
       *Assume valid postfix notation, separated by spaces.
       */
  public static double eval(String s){
    String[] exp = s.split(" ");
    MyDeque<Double> stack = new MyDeque<Double>();
    for (int i = 0; i < exp.length; i++){
      if (exp[i].equals("+") || exp[i].equals("-") || exp[i].equals("/")|| exp[i].equals("%")){
        Double operator = Double.parseDouble(exp[i]);
        stack.addLast(operator);
      }
      else{
        if(exp[i].equals("+")){
          double s2 = stack.getLast();
          stack.removeLast();
          double s1 = stack.getLast();
          stack.removeLast();
          stack.addLast(s1 + s1);
        }
        else if (exp[i].equals("-")){
          double s2 = stack.getLast();
          stack.removeLast();
          double s1 = stack.getLast();
          stack.removeLast();
          stack.addLast(s1 - s2);
        }
        else if (exp[i].equals("/")){
          double s2 = stack.getLast();
          stack.removeLast();
          double s1 = stack.getLast();
          stack.removeLast();
          stack.addLast(s1 / s2);
        }
        else if (exp[i].equals("%")){
          double s2 = stack.getLast();
          stack.removeLast();
          double s1 = stack.getLast();
          stack.removeLast();
          stack.addLast(s1 % s2);
          }
        }
      }
      return stack.getLast();
    }

  public static void main(String[] args){
    System.out.println(eval("5 6.0 +"));
  }
}
