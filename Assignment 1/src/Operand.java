public class Operand {

    private String token;

  public Operand( String token ) {
      this.token = token;

  }

  public String getToken(){

      return this.token;
  }

  public Operand( int value ) {
      this.token = Integer.toString(value);

  }

  public int getValue() {

      try {

          int value = Integer.parseInt(this.token);

          return value;

      }

      catch (NumberFormatException e){

          return 0;

      }



  }

  public static boolean check( String token ) {
      try {
          double value = Double.parseDouble(token);
          return true;
      }

      catch (NumberFormatException e) {

          return false;
      }
  }
}
