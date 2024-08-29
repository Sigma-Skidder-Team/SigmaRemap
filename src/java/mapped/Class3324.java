package mapped;

public class Class3324 extends Class3323 {
   private static String[] field18833;

   public Class3324(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      if (!var1.isRemote) {
         Class896 var7 = new Class896(var1, var2);
         var7.method3511(var6);
         var7.method3463(var2, var2.rotationPitch, var2.rotationYaw, -20.0F, 0.5F, 1.0F);
         var1.method6916(var7);
      }

      var2.method2913(Class8876.field40098.method172(this));
      if (!var2.abilities.isCreativeMode) {
         var6.method32182(1);
      }

      return Class6794.<ItemStack>method20700(var6, var1.isRemote());
   }
}
