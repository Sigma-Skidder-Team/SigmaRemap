package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Class3324 extends Class3323 {
   private static String[] field18833;

   public Class3324(Properties var1) {
      super(var1);
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      if (!var1.isRemote) {
         PotionEntity var7 = new PotionEntity(var1, var2);
         var7.method3511(var6);
         var7.method3463(var2, var2.rotationPitch, var2.rotationYaw, -20.0F, 0.5F, 1.0F);
         var1.addEntity(var7);
      }

      var2.addStat(Stats.field40098.method172(this));
      if (!var2.abilities.isCreativeMode) {
         var6.shrink(1);
      }

      return Class6794.<ItemStack>method20700(var6, var1.isRemote());
   }
}
