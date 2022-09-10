package com.icp.exceptions;

// import java.io.NumberFormatException;

public class UnCheckedExceptions {
  public static void main(String args[]) {
    try{
      int number = Integer.parseInt ("Number");
      System.out.println(number); 
    } catch (NumberFormatException ne) {
      System.out.println(ne.getMessage());
    }
  }
}