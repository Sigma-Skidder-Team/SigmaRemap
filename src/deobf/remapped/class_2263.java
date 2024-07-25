package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class class_2263 implements Predicate<class_2522> {
   public static final Predicate<class_2522> field_11260 = var0 -> true;
   private final class_8021<class_6414, class_2522> field_11259;
   private final Map<class_5019<?>, Predicate<Object>> field_11257 = Maps.newHashMap();

   private class_2263(class_8021<class_6414, class_2522> var1) {
      this.field_11259 = var1;
   }

   public static class_2263 method_10400(class_6414 var0) {
      return new class_2263(var0.method_29306());
   }

   public boolean test(class_2522 var1) {
      if (var1 == null || !var1.method_8360().equals(this.field_11259.method_36442())) {
         return false;
      } else if (this.field_11257.isEmpty()) {
         return true;
      } else {
         for (Entry var5 : this.field_11257.entrySet()) {
            if (!this.method_10401(var1, (class_5019)var5.getKey(), (Predicate<Object>)var5.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   public <T extends Comparable<T>> boolean method_10401(class_2522 var1, class_5019<T> var2, Predicate<Object> var3) {
      Comparable var6 = var1.<Comparable>method_10313(var2);
      return var3.test(var6);
   }

   public <V extends Comparable<V>> class_2263 method_10402(class_5019<V> var1, Predicate<Object> var2) {
      if (this.field_11259.method_36444().contains(var1)) {
         this.field_11257.put(var1, var2);
         return this;
      } else {
         throw new IllegalArgumentException(this.field_11259 + " cannot support property " + var1);
      }
   }
}
