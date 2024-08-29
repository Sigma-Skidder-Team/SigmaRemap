package mapped;

import com.google.common.collect.ImmutableMap;

public class Class3745 extends Class3676<Class880> {
   private static String[] field19884;

   public Class3745() {
      super(ImmutableMap.of());
   }

   @Override
   public boolean method12508(ServerWorld var1, Class880 var2) {
      return var1.field9016.nextInt(20) == 0;
   }

   @Override
   public void method12502(ServerWorld var1, Class880 var2, long var3) {
      Class6947 var7 = var2.method2992();
      Class7699 var8 = var1.method6957(var2.getPosition());
      if (var8 != null) {
         if (var8.method25390() && !var8.method25389()) {
            var7.method21424(Class8890.field40226);
            var7.method21419(Class8890.field40226);
         } else {
            var7.method21424(Class8890.field40227);
            var7.method21419(Class8890.field40227);
         }
      }
   }
}
