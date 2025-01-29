package org.newdawn.slick.util;

import java.io.PrintStream;
import java.util.Date;

public class DefaultLogSystem implements LogSystem {
   public static PrintStream field29142 = System.out;

   @Override
   public void error(String var1, Throwable var2) {
      this.error(var1);
      this.error(var2);
   }

   @Override
   public void error(Throwable var1) {
      field29142.println(new Date() + " ERROR:" + var1.getMessage());
      var1.printStackTrace(field29142);
   }

   @Override
   public void error(String var1) {
      field29142.println(new Date() + " ERROR:" + var1);
   }

   @Override
   public void warn(String var1) {
      field29142.println(new Date() + " WARN:" + var1);
   }

   @Override
   public void info(String var1) {
      field29142.println(new Date() + " INFO:" + var1);
   }

   @Override
   public void debug(String var1) {
      field29142.println(new Date() + " DEBUG:" + var1);
   }

   @Override
   public void warn(String var1, Throwable var2) {
      this.warn(var1);
      var2.printStackTrace(field29142);
   }
}
