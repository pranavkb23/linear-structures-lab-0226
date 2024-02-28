package cs207.linear;

import java.io.PrintWriter;
import java.util.Comparator;

public class AnonComparator {

  public static void main(String[] args) throws Exception {
    BuiltinPriorityQueue<String> queue = new BuiltinPriorityQueue<String>(10, new Comparator<String>() {
      @Override
      public int compare(String c1, String c2) {
        if (c1.length() < c2.length()) {
          return -1;
        } // if()
        if (c1.length() > c2.length()) {
          return 1;
        } // if()
        return c1.compareTo(c2);
      } // compare(String, String)
    });

    PrintWriter pen = new PrintWriter(System.out, true);
    ReportingLinearStructure<String> expt = new ReportingLinearStructure<String>(queue, pen, "pq");


    expt.put("Hello 1");
    expt.put("Hello 2");
    expt.get();
    expt.put("Hello 3");
    expt.get();
    expt.get();
  } // main(String[])
} // class AnonComparator