package mapped;

public class Class3315 extends Class3314 {
   private static String[] field18824;

   public Class3315(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class6794<ItemStack> method11700(Class1655 var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = Class3316.method11859(var1, MathHelper.method37769(var2.getPosX()), MathHelper.method37769(var2.getPosZ()), (byte)0, true, false);
      ItemStack var7 = var2.method3094(var3);
      if (!var2.field4919.field29609) {
         var7.method32182(1);
      }

      var2.method2913(Class8876.field40098.method172(this));
      var2.method2863(Class6067.field27179, 1.0F, 1.0F);
      if (!var7.method32105()) {
         if (!var2.field4902.method4045(var6.method32126())) {
            var2.method2882(var6, false);
         }

         return Class6794.<ItemStack>method20700(var7, var1.method6714());
      } else {
         return Class6794.<ItemStack>method20700(var6, var1.method6714());
      }
   }
}
