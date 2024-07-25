package remapped;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public class class_2203<O, S extends class_2243<O, S>> {
   private final O field_10925;
   private final Map<String, class_5019<?>> field_10927 = Maps.newHashMap();

   public class_2203(O var1) {
      this.field_10925 = (O)var1;
   }

   public class_2203<O, S> method_10162(class_5019<?>... var1) {
      for (class_5019 var7 : var1) {
         this.method_10163(var7);
         this.field_10927.put(var7.method_23109(), var7);
      }

      return this;
   }

   private <T extends Comparable<T>> void method_10163(class_5019<T> var1) {
      String var4 = var1.method_23109();
      if (!class_8021.method_36439().matcher(var4).matches()) {
         throw new IllegalArgumentException(this.field_10925 + " has invalidly named property: " + var4);
      } else {
         Collection var5 = var1.method_23105();
         if (var5.size() <= 1) {
            throw new IllegalArgumentException(this.field_10925 + " attempted use property " + var4 + " with <= 1 possible values");
         } else {
            for (Comparable var7 : var5) {
               String var8 = var1.method_23110((T)var7);
               if (!class_8021.method_36439().matcher(var8).matches()) {
                  throw new IllegalArgumentException(this.field_10925 + " has property: " + var4 + " with invalidly named value: " + var8);
               }
            }

            if (this.field_10927.containsKey(var4)) {
               throw new IllegalArgumentException(this.field_10925 + " has duplicate property: " + var4);
            }
         }
      }
   }

   public class_8021<O, S> method_10164(Function<O, S> var1, class_1177<O, S> var2) {
      return new class_8021<O, S>(var1, this.field_10925, var2, this.field_10927);
   }
}
