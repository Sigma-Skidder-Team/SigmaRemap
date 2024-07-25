package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

public class class_9524 {
   private static String[] field_48474;
   private final Map<class_2522, class_7373> field_48475 = Maps.newIdentityHashMap();
   private final class_7458 field_48476;

   public class_9524(class_7458 var1) {
      this.field_48476 = var1;
   }

   public class_5155 method_43938(class_2522 var1) {
      return this.method_43946(var1).method_33587();
   }

   public class_7373 method_43946(class_2522 var1) {
      class_7373 var4 = this.field_48475.get(var1);
      if (var4 == null) {
         var4 = this.field_48476.method_33942();
      }

      return var4;
   }

   public class_7458 method_43945() {
      return this.field_48476;
   }

   public void method_43943() {
      this.field_48475.clear();

      for (class_6414 var4 : class_8669.field_44462) {
         var4.method_29306().method_36441().forEach(var1 -> {
            class_7373 var4x = this.field_48475.put(var1, this.field_48476.method_33943(method_43941(var1)));
         });
      }
   }

   public static class_454 method_43941(class_2522 var0) {
      return method_43942(class_8669.field_44462.method_39797(var0.method_8360()), var0);
   }

   public static class_454 method_43942(Identifier var0, class_2522 var1) {
      return new class_454(var0, method_43939(var1.method_10316()));
   }

   public static String method_43939(Map<class_5019<?>, Comparable<?>> var0) {
      StringBuilder var3 = new StringBuilder();

      for (Entry var5 : var0.entrySet()) {
         if (var3.length() != 0) {
            var3.append(',');
         }

         class_5019 var6 = (class_5019)var5.getKey();
         var3.append(var6.method_23109());
         var3.append('=');
         var3.append(method_43940(var6, (Comparable<?>)var5.getValue()));
      }

      return var3.toString();
   }

   private static <T extends Comparable<T>> String method_43940(class_5019<T> var0, Comparable<?> var1) {
      return var0.method_23110((T)var1);
   }
}
