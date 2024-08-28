package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Class3629 {
   private final Map<Class9262, List<Class5138>> field19649 = Maps.newHashMap();

   public void method12307(Class9262 var1, List<Class5138> var2) {
      List var5 = this.field19649.put(var1, var2);
      if (var5 != null) {
         throw new IllegalStateException("Value " + var1 + " is already defined");
      }
   }

   public Map<Class9262, List<Class5138>> method12308() {
      this.method12309();
      return ImmutableMap.copyOf(this.field19649);
   }

   private void method12309() {
      List<Class8550<?>> var3 = this.method12298();
      Stream<Class9262> var4 = Stream.of(Class9262.method34856());

      for (Class8550<?> var6 : var3) {
         var4 = var4.flatMap(var1 -> var6.method30470().map(var1::method34854));
      }

      List<Class9262> var7 = var4.filter(var1 -> !this.field19649.containsKey(var1)).collect(Collectors.toList());
      if (!var7.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + var7);
      }
   }

   public abstract List<Class8550<?>> method12298();

   public static <T1 extends Comparable<T1>> Class3631<T1> method12310(Class8550<T1> var0) {
      return new Class3631<T1>(var0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> Class3628<T1, T2> method12311(Class8550<T1> var0, Class8550<T2> var1) {
      return new Class3628<T1, T2>(var0, var1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> Class3633<T1, T2, T3> method12312(
      Class8550<T1> var0, Class8550<T2> var1, Class8550<T3> var2
   ) {
      return new Class3633<T1, T2, T3>(var0, var1, var2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> Class3632<T1, T2, T3, T4> method12313(
      Class8550<T1> var0, Class8550<T2> var1, Class8550<T3> var2, Class8550<T4> var3
   ) {
      return new Class3632<T1, T2, T3, T4>(var0, var1, var2, var3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> Class3630<T1, T2, T3, T4, T5> method12314(
      Class8550<T1> var0, Class8550<T2> var1, Class8550<T3> var2, Class8550<T4> var3, Class8550<T5> var4
   ) {
      return new Class3630<T1, T2, T3, T4, T5>(var0, var1, var2, var3, var4);
   }
}
