package mapped;

public class Class6251 extends Class6217 {
   private static String[] field27739;
   public final Class6228 field27740;

   public Class6251(Class6228 var1) {
      this.field27740 = var1;
   }

   @Override
   public Class882 method19191(World var1, Class2955 var2, ItemStack var3) {
      return Util.method38508(new Class896(var1, var2.method11320(), var2.method11321(), var2.method11322()), var1x -> var1x.method3511(var3));
   }

   @Override
   public float method19194() {
      return super.method19194() * 0.5F;
   }

   @Override
   public float method19195() {
      return super.method19195() * 1.25F;
   }
}
