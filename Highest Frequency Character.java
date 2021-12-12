import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
      
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    HashMap <Character, Integer> hm = new HashMap<>();
    for (int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      if (hm.containsKey(ch))
      {
        int oldFreq = hm.get(ch);
        int newFreq = oldFreq + 1;
        hm.put(ch, newFreq);
      }
      else
      {
        hm.put(ch, 1);
      }
    }

    char maxFreqChar = str.charAt(0);
    for (Character key : hm.keySet())
    {
      if (hm.get(key) > hm.get(maxFreqChar))
      {
        maxFreqChar = key;
      }
    }

    System.out.println(maxFreqChar);

  }

}
