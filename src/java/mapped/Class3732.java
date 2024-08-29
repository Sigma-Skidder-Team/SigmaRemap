package mapped;

import com.google.common.collect.ImmutableMap;

import java.util.Optional;

public class Class3732<E extends Class1034> extends Class3676<E> {
   private static String[] field19842;
   private final int field19843;
   private final int field19844;

   public Class3732(int var1, int var2) {
      super(
         ImmutableMap.of(
            Class8830.field39851,
            Class2217.field14484,
            Class8830.field39847,
            Class2217.field14484,
            Class8830.field39852,
            Class2217.field14486,
            Class8830.field39853,
            Class2217.field14486
         )
      );
      this.field19843 = var1;
      this.field19844 = var2;
   }

   public boolean method12508(ServerWorld var1, E var2) {
      return var2.method3091().isEmpty();
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      Class6947 var7 = var2.method2992();
      Optional var8 = var7.<Integer>method21410(Class8830.field39852);
      if (var8.isPresent()) {
         int var9 = (Integer)var8.get();
         if (var9 <= this.field19843) {
            var7.method21406(Class8830.field39852, var9 + 1);
         } else {
            var7.method21405(Class8830.field39851);
            var7.method21405(Class8830.field39852);
            var7.method21407(Class8830.field39853, true, (long)this.field19844);
         }
      } else {
         var7.method21406(Class8830.field39852, 0);
      }
   }
}
