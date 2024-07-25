package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_7344 {
   private static String[] field_37558;
   private final List<class_9111> field_37559 = Lists.newArrayList();

   private class_7344() {
   }

   public static class_7344 method_33475() {
      return new class_7344();
   }

   public class_7344 method_33478(class_5019<?> var1, String var2) {
      this.field_37559.add(new class_9817(var1.method_23109(), var2));
      return this;
   }

   public class_7344 method_33480(class_5019<Integer> var1, int var2) {
      return this.method_33478(var1, Integer.toString(var2));
   }

   public class_7344 method_33477(class_5019<Boolean> var1, boolean var2) {
      return this.method_33478(var1, Boolean.toString(var2));
   }

   public <T extends Comparable<T> & class_4530> class_7344 method_33479(class_5019<T> var1, T var2) {
      return this.method_33478(var1, ((class_4530)var2).method_21049());
   }

   public class_1827 method_33476() {
      return new class_1827(this.field_37559, null);
   }
}
