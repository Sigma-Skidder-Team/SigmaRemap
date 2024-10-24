package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class Class3304 extends Item {
   private static String[] field18809;

   public Class3304(Properties var1) {
      super(var1);
   }

   @Override
   public boolean method11732(ItemStack var1) {
      return true;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      var1.playSound(
         (PlayerEntity)null,
         var2.getPosX(),
         var2.getPosY(),
         var2.getPosZ(),
         SoundEvents.field26568,
         SoundCategory.field14734,
         0.5F,
         0.4F / (field18735.nextFloat() * 0.4F + 0.8F)
      );
      if (!var1.isRemote) {
         Class891 var7 = new Class891(var1, var2);
         var7.method3511(var6);
         var7.method3463(var2, var2.rotationPitch, var2.rotationYaw, -20.0F, 0.7F, 1.0F);
         var1.addEntity(var7);
      }

      var2.addStat(Stats.field40098.method172(this));
      if (!var2.abilities.isCreativeMode) {
         var6.shrink(1);
      }

      return Class6794.<ItemStack>method20700(var6, var1.isRemote());
   }
}
