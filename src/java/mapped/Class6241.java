package mapped;

public final class Class6241 extends Class6230 {
   private static String[] field27732;

   @Override
   public Class8848 method19192(Class2956 var1, Class8848 var2) {
      this.method19204(true);
      Class1657 var5 = var1.method11326();
      BlockPos var6 = var1.method11323().method8349(var1.method11324().<Direction>method23463(Class3357.field18899));
      if (!Class3336.method11883(var2, var5, var6) && !Class3336.method11884(var2, var5, var6, (Direction)null)) {
         this.method19204(false);
      } else if (!var5.field9020) {
         var5.method6999(2005, var6, 0);
      }

      return var2;
   }
}
