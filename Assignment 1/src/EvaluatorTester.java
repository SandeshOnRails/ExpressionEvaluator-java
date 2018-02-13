public class EvaluatorTester {
  public static void main(String[] args) {
    Evaluator evaluator = new Evaluator();

    for ( String arg : args ) {
      System.out.format( "%s = %d\n", arg, evaluator.eval( arg ) );
      // System.out.println( arg + " = " + evaluator.eval( arg ) );
    }




String[] test = {"2+(2/2)", "(2/2)/2", "(3+5)*7*6-26", "1*5/6-7", "((2+7)*6)/8-4", "(2/4)", "(3/(5/4))","23^2", "3 * 5 + 13", "46/2", "(3+11)^2", "(6+4)*(9/3)", "3^5*3", "2+(1*8)"};
  for(String s: test)
      System.out.println(evaluator.eval(s));
  


  }
  
  
}
