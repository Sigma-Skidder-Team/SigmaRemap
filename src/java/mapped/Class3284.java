package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

public class Class3284 extends Item {
   public Class3284(Properties var1) {
      super(var1);
   }

   public static void method11816(ItemStack var0, Effect var1, int var2) {
      CompoundNBT var5 = var0.getOrCreateTag();
      ListNBT var6 = var5.getList("Effects", 9);
      CompoundNBT var7 = new CompoundNBT();
      var7.putByte("EffectId", (byte) Effect.getId(var1));
      var7.putInt("EffectDuration", var2);
      var6.add(var7);
      var5.put("Effects", var6);
   }

   @Override
   public ItemStack onItemUseFinish(ItemStack var1, World var2, LivingEntity var3) {
      ItemStack var6 = super.onItemUseFinish(var1, var2, var3);
      CompoundNBT var7 = var1.getTag();
      if (var7 != null && var7.contains("Effects", 9)) {
         ListNBT var8 = var7.getList("Effects", 10);

         for (int var9 = 0; var9 < var8.size(); var9++) {
            int var10 = 160;
            CompoundNBT var11 = var8.getCompound(var9);
            if (var11.contains("EffectDuration", 3)) {
               var10 = var11.getInt("EffectDuration");
            }

            Effect var12 = Effect.get(var11.getByte("EffectId"));
            if (var12 != null) {
               var3.addPotionEffect(new EffectInstance(var12, var10));
            }
         }
      }

      return var3 instanceof PlayerEntity && ((PlayerEntity)var3).abilities.isCreativeMode ? var6 : new ItemStack(Items.field37836);
   }
}
