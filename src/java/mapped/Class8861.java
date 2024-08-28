package mapped;

import java.util.Arrays;
import java.util.List;

public class Class8861 {
   private static String[] field40047;
   private static boolean field40048;
   private static final Class4510[] field40049 = new Class4510[Class4520.method14365()];

   public static void method32252(List<Class4510> var0) {
      if (!field40048) {
         var0.forEach(Class4510::method14231);
      } else {
         method32254(var0);
      }
   }

   public static void method32253(List<Class4510> var0) {
      if (!field40048) {
         var0.forEach(Class4510::method14232);
      } else {
         method32255(var0);
      }
   }

   private static void method32254(List<Class4510> var0) {
      for (int var3 = 0; var3 < var0.size(); var3++) {
         Class4510 var4 = (Class4510)var0.get(var3);
         method32256(var4, var3);
      }
   }

   private static void method32255(List<Class4510> var0) {
      for (int var3 = 0; var3 < var0.size(); var3++) {
         Class4510 var4 = (Class4510)var0.get(var3);
         method32257(var4, var3);
      }
   }

   private static void method32256(Class4510 var0, int var1) {
      Class4510 var4 = field40049[var1];
      if (var4 != null) {
         if (var0 == var4) {
            field40049[var1] = null;
            return;
         }

         var4.method14232();
         field40049[var1] = null;
      }

      var0.method14231();
   }

   private static void method32257(Class4510 var0, int var1) {
      Class4510 var4 = field40049[var1];
      if (var4 != null) {
         var4.method14232();
      }

      field40049[var1] = var0;
   }

   public static void method32258() {
      if (!field40048) {
         field40048 = true;
         Arrays.fill(field40049, null);
      }
   }

   public static void method32259() {
      if (field40048) {
         field40048 = false;

         for (int var2 = 0; var2 < field40049.length; var2++) {
            Class4510 var3 = field40049[var2];
            if (var3 != null) {
               var3.method14232();
            }
         }

         Arrays.fill(field40049, null);
      }
   }
}
