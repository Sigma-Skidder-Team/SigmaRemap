package remapped;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.function.LongSupplier;

public class class_7949 {
   private static long field_40677 = 0L;
   private static LongSupplier field_40676 = method_35987(
      new String[][]{
         {"sun.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed"},
         {"jdk.internal.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed"}
      }
   );
   private static LongSupplier field_40675 = method_35987(new String[][]{{"sun.misc.VM", "maxDirectMemory"}, {"jdk.internal.misc.VM", "maxDirectMemory"}});

   public static long method_35984() {
      return field_40676 != null ? field_40676.getAsLong() : -1L;
   }

   public static long method_35981() {
      return field_40675 != null ? field_40675.getAsLong() : -1L;
   }

   public static synchronized void method_35982(class_5797 var0) {
      field_40677 = field_40677 + var0.method_26263();
   }

   public static synchronized void method_35985(class_5797 var0) {
      field_40677 = field_40677 - var0.method_26263();
   }

   public static long method_35988() {
      return field_40677;
   }

   private static LongSupplier method_35987(String[][] var0) {
      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < var0.length; var4++) {
         String[] var5 = var0[var4];

         try {
            return method_35986(var5);
         } catch (Throwable var7) {
            var3.add(var7);
         }
      }

      for (Throwable var9 : var3) {
         Config.method_14317("" + var9.getClass().getName() + ": " + var9.getMessage());
      }

      return null;
   }

   private static LongSupplier method_35986(String[] var0) throws Exception {
      if (var0.length < 2) {
         return null;
      } else {
         Class var3 = Class.forName(var0[0]);
         Method var4 = var3.getMethod(var0[1]);
         var4.setAccessible(true);
         Object var5 = null;

         for (int var6 = 2; var6 < var0.length; var6++) {
            String var7 = var0[var6];
            var5 = var4.invoke(var5);
            var4 = var5.getClass().getMethod(var7);
            var4.setAccessible(true);
         }

         return new class_8766(var4, var5);
      }
   }
}
