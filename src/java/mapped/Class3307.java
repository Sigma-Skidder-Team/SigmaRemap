package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.potion.Effects;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class Class3307 extends Item {
   private static String[] field18814;

   public Class3307(Properties var1) {
      super(var1);
   }

   @Override
   public ItemStack onItemUseFinish(ItemStack var1, World var2, LivingEntity var3) {
      super.onItemUseFinish(var1, var2, var3);
      if (var3 instanceof ServerPlayerEntity) {
         ServerPlayerEntity var6 = (ServerPlayerEntity)var3;
         CriteriaTriggers.field44490.method15174(var6, var1);
         var6.addStat(Stats.field40098.method172(this));
      }

      if (!var2.isRemote) {
         var3.removeEffects(Effects.POISON);
      }

      if (!var1.isEmpty()) {
         if (var3 instanceof PlayerEntity && !((PlayerEntity)var3).abilities.isCreativeMode) {
            ItemStack var8 = new ItemStack(Items.field37972);
            PlayerEntity var7 = (PlayerEntity)var3;
            if (!var7.inventory.method4045(var8)) {
               var7.dropItem(var8, false);
            }
         }

         return var1;
      } else {
         return new ItemStack(Items.field37972);
      }
   }

   @Override
   public int method11728(ItemStack var1) {
      return 40;
   }

   @Override
   public UseAction method11727(ItemStack var1) {
      return UseAction.DRINK;
   }

   @Override
   public SoundEvent method11746() {
      return SoundEvents.field26666;
   }

   @Override
   public SoundEvent method11747() {
      return SoundEvents.field26666;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      return Class8482.method29977(var1, var2, var3);
   }
}
