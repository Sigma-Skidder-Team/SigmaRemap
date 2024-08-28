package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.function.BiPredicate;

public class Class3705 extends Class3676<Class880> {
   private static String[] field19766;
   private final int field19767;
   private final BiPredicate<Class880, Class880> field19768;

   public Class3705(int var1, BiPredicate<Class880, Class880> var2) {
      super(
         ImmutableMap.of(
            Class8830.field39826,
            Class2217.field14484,
            Class8830.field39849,
            Class2217.field14486,
            Class8830.field39856,
            Class2217.field14485,
            Class8830.field39857,
            Class2217.field14486
         )
      );
      this.field19767 = var1;
      this.field19768 = var2;
   }

   @Override
   public boolean method12508(ServerWorld var1, Class880 var2) {
      return this.method12584(var2).method3044();
   }

   @Override
   public void method12502(ServerWorld var1, Class880 var2, long var3) {
      Class880 var7 = this.method12584(var2);
      if (this.field19768.test(var2, var7)) {
         var2.method2992().method21407(Class8830.field39857, true, (long)this.field19767);
      }

      var2.method2992().method21407(Class8830.field39856, var7.method3432(), (long)this.field19767);
      if (var7.method3204() != Class8992.field41111 || var1.method6789().method17135(Class5462.field24254)) {
         var2.method2992().method21405(Class8830.field39826);
         var2.method2992().method21405(Class8830.field39849);
      }
   }

   private Class880 method12584(Class880 var1) {
      return var1.method2992().<Class880>method21410(Class8830.field39826).get();
   }
}
