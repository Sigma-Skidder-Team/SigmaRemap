package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

public class Class3284 extends Item {
   public Class3284(Class5643 var1) {
      super(var1);
   }

   public static void method11816(ItemStack var0, Effect var1, int var2) {
      CompoundNBT var5 = var0.getOrCreateTag();
      ListNBT var6 = var5.method131("Effects", 9);
      CompoundNBT var7 = new CompoundNBT();
      var7.method100("EffectId", (byte) Effect.method22288(var1));
      var7.method102("EffectDuration", var2);
      var6.add(var7);
      var5.put("Effects", var6);
   }

   @Override
   public ItemStack method11709(ItemStack var1, World var2, LivingEntity var3) {
      ItemStack var6 = super.method11709(var1, var2, var3);
      CompoundNBT var7 = var1.method32142();
      if (var7 != null && var7.contains("Effects", 9)) {
         ListNBT var8 = var7.method131("Effects", 10);

         for (int var9 = 0; var9 < var8.size(); var9++) {
            int var10 = 160;
            CompoundNBT var11 = var8.method153(var9);
            if (var11.contains("EffectDuration", 3)) {
               var10 = var11.method122("EffectDuration");
            }

            Effect var12 = Effect.method22287(var11.method120("EffectId"));
            if (var12 != null) {
               var3.method3035(new Class2023(var12, var10));
            }
         }
      }

      return var3 instanceof PlayerEntity && ((PlayerEntity)var3).abilities.isCreativeMode ? var6 : new ItemStack(Items.field37836);
   }
}
