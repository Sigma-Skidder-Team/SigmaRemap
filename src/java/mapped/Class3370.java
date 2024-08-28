package mapped;

public class Class3370 extends Class3241 {
   private static String[] field18958;

   public Class3370(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class960();
   }

   @Override
   public void method11965(Class7380 var1, ServerWorld var2, BlockPos var3, ItemStack var4) {
      super.method11965(var1, var2, var3, var4);
      int var7 = 15 + var2.field9016.nextInt(15) + var2.field9016.nextInt(15);
      this.method11558(var2, var3, var7);
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Override
   public ItemStack method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      return ItemStack.field39973;
   }
}
