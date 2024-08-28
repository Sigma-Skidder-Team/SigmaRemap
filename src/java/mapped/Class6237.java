package mapped;

import java.util.List;

public final class Class6237 extends Class6230 {
   private static String[] field27718;

   @Override
   public Class8848 method19192(Class2956 var1, Class8848 var2) {
      BlockPos var5 = var1.method11323().method8349(var1.method11324().<Direction>method23463(Class3357.field18899));
      List var6 = var1.method11326().<Class880>method6772(Class880.class, new Class6488(var5), var0 -> {
         if (!(var0 instanceof Class1069)) {
            return false;
         } else {
            Class1069 var3 = (Class1069)var0;
            return !var3.method4943() && var3.method4901();
         }
      });
      if (var6.isEmpty()) {
         return super.method19192(var1, var2);
      } else {
         ((Class1069)var6.get(0)).method4942(Class2266.field14732);
         var2.method32182(1);
         this.method19204(true);
         return var2;
      }
   }
}
