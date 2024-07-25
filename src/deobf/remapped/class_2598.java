package remapped;

import java.security.AccessController;

public final class class_2598 {
   private static String[] field_12836;
   private static boolean field_12833 = true;
   private static boolean field_12834 = false;
   private static final String field_12837 = "org.newdawn.slick.forceVerboseLog";
   private static final String field_12835 = "true";
   private static class_7940 field_12832 = new class_811();

   private class_2598() {
   }

   public static void method_11780(class_7940 var0) {
      field_12832 = var0;
   }

   public static void method_11775(boolean var0) {
      if (!field_12834) {
         field_12833 = var0;
      }
   }

   public static void method_11776() {
      try {
         AccessController.doPrivileged(new class_4083());
      } catch (Throwable var3) {
      }
   }

   public static void method_11786() {
      field_12834 = true;
      field_12833 = true;
   }

   public static void method_11784(String var0, Throwable var1) {
      field_12832.method_35911(var0, var1);
   }

   public static void method_11785(Throwable var0) {
      field_12832.method_35912(var0);
   }

   public static void method_11783(String var0) {
      field_12832.method_35910(var0);
   }

   public static void method_11777(String var0) {
      field_12832.method_35908(var0);
   }

   public static void method_11778(String var0, Throwable var1) {
      field_12832.method_35909(var0, var1);
   }

   public static void method_11779(String var0) {
      if (field_12833 || field_12834) {
         field_12832.method_35914(var0);
      }
   }

   public static void method_11781(String var0) {
      if (field_12833 || field_12834) {
         field_12832.method_35913(var0);
      }
   }
}
