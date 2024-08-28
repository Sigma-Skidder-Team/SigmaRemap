package mapped;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class Class166 implements Predicate<Class7380> {
   public static final Predicate<Class7380> field534 = var0 -> true;
   private final Class9348<Class3209, Class7380> field535;
   private final Map<Class8550<?>, Predicate<Object>> field536 = Maps.newHashMap();

   private Class166(Class9348<Class3209, Class7380> var1) {
      this.field535 = var1;
   }

   public static Class166 method497(Class3209 var0) {
      return new Class166(var0.method11577());
   }

   public boolean test(Class7380 var1) {
      if (var1 == null || !var1.method23383().equals(this.field535.method35394())) {
         return false;
      } else if (this.field536.isEmpty()) {
         return true;
      } else {
         for (Entry var5 : this.field536.entrySet()) {
            if (!this.method498(var1, (Class8550)var5.getKey(), (Predicate<Object>)var5.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   public <T extends Comparable<T>> boolean method498(Class7380 var1, Class8550<T> var2, Predicate<Object> var3) {
      Comparable var6 = var1.method23463(var2);
      return var3.test(var6);
   }

   public <V extends Comparable<V>> Class166 method499(Class8550<V> var1, Predicate<Object> var2) {
      if (this.field535.method35395().contains(var1)) {
         this.field536.put(var1, var2);
         return this;
      } else {
         throw new IllegalArgumentException(this.field535 + " cannot support property " + var1);
      }
   }
}
