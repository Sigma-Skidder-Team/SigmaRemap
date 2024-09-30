package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Class3274 extends Item {
   private static String[] field18774;

   public Class3274(Properties var1) {
      super(var1);
   }

   @Override
   public ItemStack onItemUseFinish(ItemStack var1, World var2, LivingEntity var3) {
      if (var3 instanceof ServerPlayerEntity) {
         ServerPlayerEntity var6 = (ServerPlayerEntity)var3;
         CriteriaTriggers.field44490.method15174(var6, var1);
         var6.addStat(Stats.field40098.method172(this));
      }

      if (var3 instanceof PlayerEntity && !((PlayerEntity)var3).abilities.isCreativeMode) {
         var1.shrink(1);
      }

      if (!var2.isRemote) {
         var3.clearActivePotions();
      }

      return !var1.isEmpty() ? var1 : new ItemStack(Items.BUCKET);
   }

   @Override
   public int method11728(ItemStack var1) {
      return 32;
   }

   @Override
   public UseAction method11727(ItemStack var1) {
      return UseAction.field13708;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      return Class8482.method29977(var1, var2, var3);
   }
}
