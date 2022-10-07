import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.lang.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Main {
  private static Object List;
  private static Object Integer;
  public static int simpleArraySum(List<Integer> arr) {
    int result = arr.stream().reduce((x,y) -> x + y).get();
    return result;
  }

  public static void main(String[] args){
    List<Integer> arr = new ArrayList<Integer>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    System.out.println(arr);

    System.out.println(simpleArraySum(arr));


  }

}
