package mapped;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.LongSupplier;

public class Class9323 {
   private static long field43279 = 0L;
   private static LongSupplier field43280 = method35241(
      new String[][]{
         {"sun.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed"},
         {"jdk.internal.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed"}
      }
   );
   private static LongSupplier field43281 = method35241(new String[][]{{"sun.misc.VM", "maxDirectMemory"}, {"jdk.internal.misc.VM", "maxDirectMemory"}});

   public static long method35236() {
      return field43280 != null ? field43280.getAsLong() : -1L;
   }

   public static long method35237() {
      return field43281 != null ? field43281.getAsLong() : -1L;
   }

   public static synchronized void method35238(Class1806 var0) {
      field43279 = field43279 + var0.method7917();
   }

   public static synchronized void method35239(Class1806 var0) {
      field43279 = field43279 - var0.method7917();
   }

   public static long method35240() {
      return field43279;
   }

   private static LongSupplier method35241(String[][] var0) {
      List<Throwable> var3 = new ArrayList<>();

      for (int var4 = 0; var4 < var0.length; var4++) {
         String[] var5 = var0[var4];

         try {
            return method35242(var5);
         } catch (Throwable var7) {
            var3.add(var7);
         }
      }

      for (Throwable var9 : var3) {
         Class7944.method26811("" + var9.getClass().getName() + ": " + var9.getMessage());
      }

      return null;
   }

   private static LongSupplier method35242(String[] var0) throws Exception {
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

         return new Class9538(var4, var5);
      }
   }
}
