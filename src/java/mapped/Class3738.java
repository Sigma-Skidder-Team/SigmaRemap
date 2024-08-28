package mapped;

import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.function.Predicate;

public class Class3738 extends Class3676<Class880> {
   private static String[] field19860;
   private final Predicate<Class880> field19861;
   private final float field19862;

   public Class3738(Class179 var1, float var2) {
      this(var1x -> var1.equals(var1x.method3204().method33209()), var2);
   }

   public Class3738(Class8992<?> var1, float var2) {
      this(var1x -> var1.equals(var1x.method3204()), var2);
   }

   public Class3738(float var1) {
      this(var0 -> true, var1);
   }

   public Class3738(Predicate<Class880> var1, float var2) {
      super(ImmutableMap.of(Class8830.field39825, Class2217.field14485, Class8830.field39819, Class2217.field14484));
      this.field19861 = var1;
      this.field19862 = var2 * var2;
   }

   @Override
   public boolean method12508(Class1657 var1, Class880 var2) {
      return var2.method2992().<List<Class880>>method21410(Class8830.field39819).get().stream().anyMatch(this.field19861);
   }

   @Override
   public void method12502(Class1657 var1, Class880 var2, long var3) {
      Class6947<?> var7 = var2.method2992();
      var7.<List<Class880>>method21410(Class8830.field39819)
         .ifPresent(
            var3x -> var3x.stream()
                  .filter(this.field19861)
                  .filter(var2xx -> var2xx.method3277(var2) <= (double)this.field19862)
                  .findFirst()
                  .ifPresent(var1xx -> var7.method21406(Class8830.field39825, new Class7865(var1xx, true)))
         );
   }
}
