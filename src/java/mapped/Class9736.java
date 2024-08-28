package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

public class Class9736 {
   private static String[] field45467;
   private final Map<Class7380, Class7202> field45468 = Maps.newIdentityHashMap();
   private final Class280 field45469;

   public Class9736(Class280 var1) {
      this.field45469 = var1;
   }

   public Class1713 method38152(Class7380 var1) {
      return this.method38153(var1).method22624();
   }

   public Class7202 method38153(Class7380 var1) {
      Class7202 var4 = this.field45468.get(var1);
      if (var4 == null) {
         var4 = this.field45469.method1024();
      }

      return var4;
   }

   public Class280 method38154() {
      return this.field45469;
   }

   public void method38155() {
      this.field45468.clear();

      for (Block var4 : Class2348.field16072) {
         var4.method11577().method35392().forEach(var1 -> {
            Class7202 var4x = this.field45468.put(var1, this.field45469.method1023(method38156(var1)));
         });
      }
   }

   public static Class1997 method38156(Class7380 var0) {
      return method38157(Class2348.field16072.method9181(var0.method23383()), var0);
   }

   public static Class1997 method38157(ResourceLocation var0, Class7380 var1) {
      return new Class1997(var0, method38158(var1.method23468()));
   }

   public static String method38158(Map<Class8550<?>, Comparable<?>> var0) {
      StringBuilder var3 = new StringBuilder();

      for (Entry var5 : var0.entrySet()) {
         if (var3.length() != 0) {
            var3.append(',');
         }

         Class8550 var6 = (Class8550)var5.getKey();
         var3.append(var6.method30472());
         var3.append('=');
         var3.append(method38159(var6, (Comparable<?>)var5.getValue()));
      }

      return var3.toString();
   }

   private static <T extends Comparable<T>> String method38159(Class8550<T> var0, Comparable<?> var1) {
      return var0.method30475((T)var1);
   }
}
