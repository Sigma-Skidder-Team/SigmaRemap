package mapped;

import java.security.AccessController;

public final class Log {
   private static String[] field33258;
   private static boolean field33259 = true;
   private static boolean field33260 = false;
   private static final String field33261 = "org.newdawn.slick.forceVerboseLog";
   private static final String field33262 = "true";
   private static Class6623 field33263 = new Class6622();

   private Log() {
   }

   public static void method25656(Class6623 var0) {
      field33263 = var0;
   }

   public static void method25657(boolean var0) {
      if (!field33260) {
         field33259 = var0;
      }
   }

   public static void method25658() {
      try {
         AccessController.doPrivileged(new Class2540());
      } catch (Throwable var3) {
      }
   }

   public static void method25659() {
      field33260 = true;
      field33259 = true;
   }

   public static void method25660(String var0, Throwable var1) {
      field33263.method20185(var0, var1);
   }

   public static void method25661(Throwable var0) {
      field33263.method20186(var0);
   }

   public static void method25662(String var0) {
      field33263.method20187(var0);
   }

   public static void method25663(String var0) {
      field33263.method20188(var0);
   }

   public static void method25664(String var0, Throwable var1) {
      field33263.method20191(var0, var1);
   }

   public static void method25665(String var0) {
      if (field33259 || field33260) {
         field33263.method20189(var0);
      }
   }

   public static void method25666(String var0) {
      if (field33259 || field33260) {
         field33263.method20190(var0);
      }
   }
}
