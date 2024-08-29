package mapped;

import com.google.common.collect.ImmutableMap;

public class Class3719 extends Class3676<Class880> {
   private static String[] field19803;

   public Class3719() {
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
      if (var8 == null || var8.method25391() || var8.method25393()) {
         var7.method21424(Class8890.field40220);
         var7.method21422(var1.method6784(), var1.method6783());
      }
   }
}
