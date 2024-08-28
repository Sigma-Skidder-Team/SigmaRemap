package mapped;

public class Class3284 extends Class3257 {
   public Class3284(Class5643 var1) {
      super(var1);
   }

   public static void method11816(ItemStack var0, Class7144 var1, int var2) {
      Class39 var5 = var0.method32143();
      Class41 var6 = var5.method131("Effects", 9);
      Class39 var7 = new Class39();
      var7.method100("EffectId", (byte)Class7144.method22288(var1));
      var7.method102("EffectDuration", var2);
      var6.add(var7);
      var5.method99("Effects", var6);
   }

   @Override
   public ItemStack method11709(ItemStack var1, World var2, Class880 var3) {
      ItemStack var6 = super.method11709(var1, var2, var3);
      Class39 var7 = var1.method32142();
      if (var7 != null && var7.method119("Effects", 9)) {
         Class41 var8 = var7.method131("Effects", 10);

         for (int var9 = 0; var9 < var8.size(); var9++) {
            int var10 = 160;
            Class39 var11 = var8.method153(var9);
            if (var11.method119("EffectDuration", 3)) {
               var10 = var11.method122("EffectDuration");
            }

            Class7144 var12 = Class7144.method22287(var11.method120("EffectId"));
            if (var12 != null) {
               var3.method3035(new Class2023(var12, var10));
            }
         }
      }

      return var3 instanceof PlayerEntity && ((PlayerEntity)var3).field4919.field29609 ? var6 : new ItemStack(Class8514.field37836);
   }
}
