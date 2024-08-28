package mapped;

import com.google.common.collect.ImmutableMap;

public class Class3680<E extends Class1034> extends Class3676<E> {
   private static String[] field19692;

   public Class3680() {
      super(ImmutableMap.of(Class8830.field39826, Class2217.field14484, Class8830.field39855, Class2217.field14486));
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      if (this.method12515((E)var2)) {
         Class4388.method13861(var2);
      }
   }

   private boolean method12515(E var1) {
      Class880 var4 = var1.method2992().<Class880>method21410(Class8830.field39826).get();
      return var4.method3204() == Class8992.field41037 && var4.method3044();
   }
}
