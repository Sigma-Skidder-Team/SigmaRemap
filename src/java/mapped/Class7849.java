package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class7849 {
   private static String[] field33658;
   private static final Map<String, Class6069> field33659 = new HashMap<String, Class6069>();

   public static Class6069 method26306(String var0) {
      Class6069 var3 = field33659.get(var0);
      if (var3 == null) {
         ResourceLocation var4 = new ResourceLocation(var0);
         if (Class2348.field16073.method9193(var4)) {
            var3 = Class2348.field16073.method9184(var4);
         }

         field33659.put(var0, var3);
      }

      return var3;
   }

   public static Class6069 method26307(ResourceLocation var0) {
      return Class2348.field16073.method9193(var0) ? Class2348.field16073.method9184(var0) : null;
   }
}
