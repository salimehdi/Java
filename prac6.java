class prac6 {
    public static void main(String[] args) {
      char i1 = 'A';
      int i = 6;
      for (int rows = 0; rows < i; rows++) {

        for (int cols = i-rows-1; cols > 0; cols--) {
          System.out.print("  ");
          }

        for (int cols = 0; cols < 2*rows-1; cols++) {
          System.out.print(i1+" ");
          i1++;
          }
        System.out.println();
      }
    }
  }
  