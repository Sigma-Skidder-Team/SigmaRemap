package mapped;

import com.google.common.collect.ImmutableMap;

public class Class3701<E extends Class1006> extends Class3676<E> {
   private static String[] field19756;

   public Class3701() {
      super(ImmutableMap.of(Class8830.field39849, Class2217.field14484));
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      Class6983.method21586(var2, Class8830.field39849).ifPresent(var2x -> {
         if (var2x.getShouldBeDead() && (var2x.method3204() != Class8992.field41111 || var1.method6789().method17135(Class5462.field24254))) {
            var2.method2992().method21405(Class8830.field39849);
         }
      });
   }
}
