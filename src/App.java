public class App {
  
  public static void printTriangle(Object[] arr) {
    StringBuilder myStr = new StringBuilder();
    for (int i = 1; i <= arr.length; i++) {
      for (int j = 0; j < i; j++) {
        myStr.append(arr[j]);
      }
      myStr.append("\n");
    }
    System.out.println(myStr.toString());
    System.out.println();
 }
    
  public static void main(String args[]) {
    printTriangle(new Integer[] {1, 2, 3, 4});
    printTriangle(new Character[] {'A', 'B', 'C', 'D', 'E'});
    printTriangle(new String[] {});
    printTriangle(new String[] {"Hello"});
    printTriangle(new String[] {"Hello", "There", "Friend"});
  }
}