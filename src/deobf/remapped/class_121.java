package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class class_121 {
   private final Map<class_7727, List<class_265>> field_293 = Maps.newHashMap();

   public void method_356(class_7727 var1, List<class_265> var2) {
      List var5 = this.field_293.put(var1, var2);
      if (var5 != null) {
         throw new IllegalStateException("Value " + var1 + " is already defined");
      }
   }

   public Map<class_7727, List<class_265>> method_361() {
      this.method_358();
      return ImmutableMap.copyOf(this.field_293);
   }

   private void method_358() {
      List var3 = this.method_354();
      Stream var4 = Stream.<class_7727>of(class_7727.method_34970());

      for (class_5019 var6 : var3) {
         var4 = var4.<class_7727>flatMap(var1 -> var6.method_23114().map(var1::method_34967));
      }

      List var7 = var4.filter(var1 -> !this.field_293.containsKey(var1)).collect(Collectors.toList());
      if (!var7.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + var7);
      }
   }

   public abstract List<class_5019<?>> method_354();

   public static <T1 extends Comparable<T1>> class_9823<T1> method_360(class_5019<T1> var0) {
      return new class_9823<T1>(var0, null);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> class_89<T1, T2> method_357(class_5019<T1> var0, class_5019<T2> var1) {
      return new class_89<T1, T2>(var0, var1, null);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> class_5338<T1, T2, T3> method_363(
      class_5019<T1> var0, class_5019<T2> var1, class_5019<T3> var2
   ) {
      return new class_5338<T1, T2, T3>(var0, var1, var2, null);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> class_544<T1, T2, T3, T4> method_359(
      class_5019<T1> var0, class_5019<T2> var1, class_5019<T3> var2, class_5019<T4> var3
   ) {
      return new class_544<T1, T2, T3, T4>(var0, var1, var2, var3, null);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> class_7034<T1, T2, T3, T4, T5> method_355(
      class_5019<T1> var0, class_5019<T2> var1, class_5019<T3> var2, class_5019<T4> var3, class_5019<T5> var4
   ) {
      return new class_7034<T1, T2, T3, T4, T5>(var0, var1, var2, var3, var4, null);
   }
}
