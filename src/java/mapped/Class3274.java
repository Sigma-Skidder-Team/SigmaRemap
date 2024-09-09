package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Class3274 extends Item {
   private static String[] field18774;

   public Class3274(Class5643 var1) {
      super(var1);
   }

   @Override
   public ItemStack method11709(ItemStack var1, World var2, LivingEntity var3) {
      if (var3 instanceof ServerPlayerEntity) {
         ServerPlayerEntity var6 = (ServerPlayerEntity)var3;
         CriteriaTriggers.field44490.method15174(var6, var1);
         var6.addStat(Stats.field40098.method172(this));
      }

      if (var3 instanceof PlayerEntity && !((PlayerEntity)var3).abilities.isCreativeMode) {
         var1.method32182(1);
      }

      if (!var2.isRemote) {
         var3.clearActivePotions();
      }

      return !var1.isEmpty() ? var1 : new ItemStack(Items.field37882);
   }

   @Override
   public int method11728(ItemStack var1) {
      return 32;
   }

   @Override
   public Class2103 method11727(ItemStack var1) {
      return Class2103.field13708;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      return Class8482.method29977(var1, var2, var3);
   }
}
