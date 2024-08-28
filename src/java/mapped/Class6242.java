package mapped;

public final class Class6242 extends Class6230 {
   private static String[] field27718;

   @Override
   public Class8848 method19192(Class2956 var1, Class8848 var2) {
      BlockPos var5 = var1.method11323().method8349(var1.method11324().<Direction>method23463(Class3357.field18899));

      for (Class1068 var7 : var1.method11326().<Class1068>method6772(Class1068.class, new Class6488(var5), var0 -> var0.method3066() && var0.method4898())) {
         if (var7.method4900(var2) && !var7.method4899() && var7.method4932()) {
            var7.method2963(401, var2.method32106(1));
            this.method19204(true);
            return var2;
         }
      }

      return super.method19192(var1, var2);
   }
}
