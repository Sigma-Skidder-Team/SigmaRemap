package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Class3315 extends Class3314 {
   private static String[] field18824;

   public Class3315(Properties var1) {
      super(var1);
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = Class3316.method11859(var1, MathHelper.floor(var2.getPosX()), MathHelper.floor(var2.getPosZ()), (byte)0, true, false);
      ItemStack var7 = var2.getHeldItem(var3);
      if (!var2.abilities.isCreativeMode) {
         var7.shrink(1);
      }

      var2.addStat(Stats.field40098.method172(this));
      var2.playSound(SoundEvents.field27179, 1.0F, 1.0F);
      if (!var7.isEmpty()) {
         if (!var2.inventory.method4045(var6.copy())) {
            var2.dropItem(var6, false);
         }

         return Class6794.<ItemStack>method20700(var7, var1.isRemote());
      } else {
         return Class6794.<ItemStack>method20700(var6, var1.isRemote());
      }
   }
}
