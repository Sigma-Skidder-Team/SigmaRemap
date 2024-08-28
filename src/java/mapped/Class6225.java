package mapped;

public class Class6225 extends Class6218 {
   private static String[] field27718;
   private final Class6218 field27720 = new Class6218();
   private final Class2099 field27721;

   public Class6225(Class2099 var1) {
      this.field27721 = var1;
   }

   @Override
   public Class8848 method19192(Class2956 var1, Class8848 var2) {
      Direction var5 = var1.method11324().<Direction>method23463(Class3357.field18899);
      Class1657 var6 = var1.method11326();
      double var7 = var1.method11320() + (double)((float)var5.method539() * 1.125F);
      double var9 = var1.method11321() + (double)((float)var5.method540() * 1.125F);
      double var11 = var1.method11322() + (double)((float)var5.method541() * 1.125F);
      BlockPos var13 = var1.method11323().method8349(var5);
      double var14;
      if (!var6.method6739(var13).method23486(Class8953.field40469)) {
         if (!var6.method6738(var13).method23393() || !var6.method6739(var13.method8313()).method23486(Class8953.field40469)) {
            return this.field27720.method19196(var1, var2);
         }

         var14 = 0.0;
      } else {
         var14 = 1.0;
      }

      Class1002 var16 = new Class1002(var6, var7, var9 + var14, var11);
      var16.method4171(this.field27721);
      var16.field5031 = var5.method551();
      var6.method6916(var16);
      var2.method32182(1);
      return var2;
   }

   @Override
   public void method19193(Class2956 var1) {
      var1.method11326().method6999(1000, var1.method11323(), 0);
   }
}
