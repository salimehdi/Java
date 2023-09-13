import java.util.ArrayList;
class prac7 {
    public static void main(String[] args) {
      ArrayList<String> s = new ArrayList<>();
      for (int i = 0; i < args.length; i++) {
        s.add(args [i]) ;
      }
      System.out.println(s);
    }
  }
  