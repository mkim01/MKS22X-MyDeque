
public class Calculator{
      /*Evaluate a postfix expression stored in s.
       *Assume valid postfix notation, separated by spaces.
       */
  public static double eval(String s){
    String[] exp = s.split(" ");
    MyDeque<Double> stack = new MYDeque<Double>();
    for (int i = 0; i < exp.length; i++){
      if (exp[i].equals("+") || exp[i].equals("+") || exp[i].equals("+")|| exp[i].equals("+")){
        Double operator = Double.parseDouble(exp[i]);
        stack.addLast(operator);
      // else{
      //   if(exp[i].equals)
      // }

    }

      return stack.getLast();
    }

  public static void main(String[] args){
  }
