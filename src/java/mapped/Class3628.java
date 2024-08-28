package mapped;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class Class3628<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends Class3629 {
   private static String[] field19646;
   private final Class8550<T1> field19647;
   private final Class8550<T2> field19648;

   public Class3628(Class8550<T1> var1, Class8550<T2> var2) {
      this.field19647 = var1;
      this.field19648 = var2;
   }

   @Override
   public List<Class8550<?>> method12298() {
      return ImmutableList.of(this.field19647, this.field19648);
   }

   public Class3628<T1, T2> method12299(T1 var1, T2 var2, List<Class5138> var3) {
      Class9262 var6 = Class9262.method34857(this.field19647.method30468((T1)var1), this.field19648.method30468((T2)var2));
      this.method12307(var6, var3);
      return this;
   }

   public Class3628<T1, T2> method12300(T1 var1, T2 var2, Class5138 var3) {
      return this.method12299((T1)var1, (T2)var2, Collections.<Class5138>singletonList(var3));
   }

   public Class3629 method12301(BiFunction<T1, T2, Class5138> var1) {
      this.field19647
         .method30474()
         .forEach(var2 -> this.field19648.method30474().forEach(var3 -> this.method12300((T1)var2, (T2)var3, (Class5138)var1.apply(var2, var3))));
      return this;
   }

   public Class3629 method12302(BiFunction<T1, T2, List<Class5138>> var1) {
      this.field19647
         .method30474()
         .forEach(var2 -> this.field19648.method30474().forEach(var3 -> this.method12299((T1)var2, (T2)var3, (List<Class5138>)var1.apply(var2, var3))));
      return this;
   }
}
