package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Class133 extends Class128 {
   private static String[] field452;
   private final Map<Class7144, Class6872> field453;

   public Class133(Class122[] var1, Map<Class7144, Class6872> var2) {
      super(var1);
      this.field453 = ImmutableMap.copyOf(var2);
   }

   @Override
   public Class7128 method368() {
      return Class8585.field38628;
   }

   @Override
   public Class8848 method371(Class8848 var1, Class7812 var2) {
      if (var1.method32107() == Class8514.field38149 && !this.field453.isEmpty()) {
         Random var5 = var2.method26088();
         int var6 = var5.nextInt(this.field453.size());
         Entry var7 = (Entry)Iterables.get(this.field453.entrySet(), var6);
         Class7144 var8 = (Class7144)var7.getKey();
         int var9 = ((Class6872)var7.getValue()).method20914(var5);
         if (!var8.method22292()) {
            var9 *= 20;
         }

         Class3284.method11816(var1, var8, var9);
         return var1;
      } else {
         return var1;
      }
   }

   public static Class5883 method389() {
      return new Class5883();
   }

   // $VF: synthetic method
   public static Map<Class7144, Class6872> method390(Class133 var0) {
      return var0.field453;
   }
}
