public class Love6{

  public static void main(String[] args) {

    int[][] testCases = new int[][] {
      {6,4},
      {4,5},
      {1,5},
      {1,6},
      {1,8},
      {1,7},
      {7,5},
      {8,2},
      {6,6},
      {-6,2},
      {-4,-10},
      {-7,1},
      {7,-1},
      {-6,12},
      {-2,-4},
      {7,1},
      {0,9},
      {8,3},
      {3,3},
      {3,4}
    };

    boolean[] expectedResults = {
      true,
      false,
      true,
      true,
      false,
      true,
      false,
      true,
      true,
      false,
      true,
      false,
      true,
      true,
      false,
      true,
      false,
      false,
      true,
      false
    };

    for (int i=0; i<20; i++) {
      System.out.print("Numbers tested: " + testCases[i][0] + "," + testCases[i][1] + "; Expected result: " + expectedResults[i] + ";");
      System.out.println(" Actual result: " + love6(testCases[i][0], testCases[i][1]));
    }
  }

  public static boolean love6(int a, int b) {
    int sum1 = a + b;
    int dif1 = a - b;
    int absSum1 = Math.abs(a+b);
    int absDif1 = Math.abs(a-b);
    if (a == 6 || b ==6) {
      return true;
    }
    if (sum1 == 6 || dif1 == 6 || absSum1 == 6 || absDif1 == 6) {
      return true;
    }
    return false;
  }
}
