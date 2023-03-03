package net.greg.examples.salient;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

/**
  https://bit.ly/3tB1xjl | POM MODS-11
 */
public class PilotAware {

  public static void main(String ... args) {

    final String ctx = args[0];

    System.err.println(
      GRN + "\n Pilot app, JDK " + ctx + NC);


    Map<String,String> anyone = new ConcurrentHashMap();

    anyone.put("one","1");
    anyone.put("two","2");
    anyone.put("three","3");

    /*
      var anytwo = new ConcurrentHashMap<String,String>();

      anytwo.put("one","1");
      anytwo.put("two","2");
      anytwo.put("three","3");
   */

    System.err.println(
      GRN + "\n anyone " + NC + anyone +
    ///  GRN + "\n anytwo "  + NC + anytwo +
      "\n\n\t ...  ...  ...\n\n");
  }


  public static final String RED = "\033[1;91m";
  public static final String GRN = "\033[1;92m";
  public static final String YLW = "\033[1;93m";
  public static final String NC = "\u001B[0m";
}
