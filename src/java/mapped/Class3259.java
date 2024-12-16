package mapped;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.IVanishable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class Class3259 extends Item implements IVanishable {
   private static String[] field18745;

   public Class3259(Properties var1) {
      super(var1);
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      if (var2.field4930 == null) {
         var1.playSound(
            (PlayerEntity)null,
            var2.getPosX(),
            var2.getPosY(),
            var2.getPosZ(),
            SoundEvents.field26586,
            SoundCategory.field14734,
            0.5F,
            0.4F / (field18735.nextFloat() * 0.4F + 0.8F)
         );
         if (!var1.isRemote) {
            int var7 = EnchantmentHelper.method26329(var6);
            int var8 = EnchantmentHelper.method26328(var6);
            var1.addEntity(new Class904(var2, var1, var8, var7));
         }

         var2.addStat(Stats.field40098.method172(this));
      } else {
         if (!var1.isRemote) {
            int var9 = var2.field4930.method3542(var6);
            var6.damageItem(var9, var2, var1x -> var1x.sendBreakAnimation(var3));
         }

         var1.playSound(
            (PlayerEntity)null,
            var2.getPosX(),
            var2.getPosY(),
            var2.getPosZ(),
            SoundEvents.field26584,
            SoundCategory.field14734,
            1.0F,
            0.4F / (field18735.nextFloat() * 0.4F + 0.8F)
         );
      }

      return Class6794.<ItemStack>method20700(var6, var1.isRemote());
   }

   @Override
   public int method11736() {
      return 1;
   }
}
