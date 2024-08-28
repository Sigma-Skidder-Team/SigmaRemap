package mapped;

public class Class3300 extends Class3298 {
   private static String[] field18806;

   public Class3300(Class5643 var1, Block var2, Block var3) {
      super(var2, var3, var1);
   }

   @Override
   public boolean method11837(BlockPos var1, Class1655 var2, PlayerEntity var3, ItemStack var4, Class7380 var5) {
      boolean var8 = super.method11837(var1, var2, var3, var4, var5);
      if (!var2.field9020 && !var8 && var3 != null) {
         var3.method2764((Class954)var2.method6759(var1));
      }

      return var8;
   }
}
