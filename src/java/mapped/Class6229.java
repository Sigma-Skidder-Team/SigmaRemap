package mapped;

public final class Class6229 extends Class6218 {
   private static String[] field27718;
   private final Class6218 field27725 = new Class6218();

   @Override
   public Class8848 method19192(Class2956 var1, Class8848 var2) {
      Class3287 var5 = (Class3287)var2.method32107();
      BlockPos var6 = var1.method11323().method8349(var1.method11324().<Direction>method23463(Class3357.field18899));
      Class1657 var7 = var1.method11326();
      if (!var5.method11825((PlayerEntity)null, var7, var6, (Class8711)null)) {
         return this.field27725.method19196(var1, var2);
      } else {
         var5.method11824(var7, var2, var6);
         return new Class8848(Class8514.field37882);
      }
   }
}
