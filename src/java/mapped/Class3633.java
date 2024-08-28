package mapped;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class Class3633<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends Class3629 {
   private static String[] field19663;
   private final Class8550<T1> field19664;
   private final Class8550<T2> field19665;
   private final Class8550<T3> field19666;

   public Class3633(Class8550<T1> var1, Class8550<T2> var2, Class8550<T3> var3) {
      this.field19664 = var1;
      this.field19665 = var2;
      this.field19666 = var3;
   }

   @Override
   public List<Class8550<?>> method12298() {
      return ImmutableList.of(this.field19664, this.field19665, this.field19666);
   }

   public Class3633<T1, T2, T3> method12325(T1 var1, T2 var2, T3 var3, List<Class5138> var4) {
      Class9262 var7 = Class9262.method34857(
         this.field19664.method30468((T1)var1), this.field19665.method30468((T2)var2), this.field19666.method30468((T3)var3)
      );
      this.method12307(var7, var4);
      return this;
   }

   public Class3633<T1, T2, T3> method12326(T1 var1, T2 var2, T3 var3, Class5138 var4) {
      return this.method12325((T1)var1, (T2)var2, (T3)var3, Collections.<Class5138>singletonList(var4));
   }

   public Class3629 method12327(Class8766<T1, T2, T3, Class5138> var1) {
      this.field19664
         .method30474()
         .forEach(
            var2 -> this.field19665
                  .method30474()
                  .forEach(
                     var3 -> this.field19666
                           .method30474()
                           .forEach(var4 -> this.method12326((T1)var2, (T2)var3, (T3)var4, (Class5138)var1.method31623(var2, var3, var4)))
                  )
         );
      return this;
   }
}
