package remapped;

public class class_4699 extends class_2451 {
   public class_4699(class_317 var1) {
      super(var1);
   }

   public static void method_21671(ItemStack var0, class_1425 var1, int var2) {
      CompoundNBT var5 = var0.method_27994();
      class_3416 var6 = var5.method_25927("Effects", 9);
      CompoundNBT var7 = new CompoundNBT();
      var7.method_25921("EffectId", (byte)class_1425.method_6536(var1));
      var7.method_25931("EffectDuration", var2);
      var6.add(var7);
      var5.put("Effects", var6);
   }

   @Override
   public ItemStack method_11242(ItemStack var1, World var2, class_5834 var3) {
      ItemStack var6 = super.method_11242(var1, var2, var3);
      CompoundNBT var7 = var1.method_27990();
      if (var7 != null && var7.contains("Effects", 9)) {
         class_3416 var8 = var7.method_25927("Effects", 10);

         for (int var9 = 0; var9 < var8.size(); var9++) {
            int var10 = 160;
            CompoundNBT var11 = var8.method_15764(var9);
            if (var11.contains("EffectDuration", 3)) {
               var10 = var11.method_25947("EffectDuration");
            }

            class_1425 var12 = class_1425.method_6538(var11.method_25950("EffectId"));
            if (var12 != null) {
               var3.method_26558(new class_2250(var12, var10));
            }
         }
      }

      return var3 instanceof PlayerEntity && ((PlayerEntity)var3).playerAbilities.isCreativeMode ? var6 : new ItemStack(class_4897.field_24454);
   }
}
