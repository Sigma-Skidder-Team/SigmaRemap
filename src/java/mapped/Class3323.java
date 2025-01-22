package mapped;

import java.util.List;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class Class3323 extends Item {
   public Class3323(Properties var1) {
      super(var1);
   }

   @Override
   public ItemStack method11742() {
      return PotionUtils.method38187(super.method11742(), Potions.WATER);
   }

   @Override
   public ItemStack onItemUseFinish(ItemStack var1, World var2, LivingEntity var3) {
      PlayerEntity var6 = !(var3 instanceof PlayerEntity) ? null : (PlayerEntity)var3;
      if (var6 instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44490.method15174((ServerPlayerEntity)var6, var1);
      }

      if (!var2.isRemote) {
         for (EffectInstance var8 : PotionUtils.method38176(var1)) {
            if (!var8.getPotion().isInstant()) {
               var3.addPotionEffect(new EffectInstance(var8));
            } else {
               var8.getPotion().affectEntity(var6, var6, var3, var8.getAmplifier(), 1.0);
            }
         }
      }

      if (var6 != null) {
         var6.addStat(Stats.field40098.method172(this));
         if (!var6.abilities.isCreativeMode) {
            var1.shrink(1);
         }
      }

      if (var6 == null || !var6.abilities.isCreativeMode) {
         if (var1.isEmpty()) {
            return new ItemStack(Items.field37972);
         }

         if (var6 != null) {
            var6.inventory.method4045(new ItemStack(Items.field37972));
         }
      }

      return var1;
   }

   @Override
   public int method11728(ItemStack var1) {
      return 32;
   }

   @Override
   public UseAction method11727(ItemStack var1) {
      return UseAction.DRINK;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      return Class8482.method29977(var1, var2, var3);
   }

   @Override
   public String method11720(ItemStack var1) {
      return PotionUtils.method38185(var1).method31815(this.getTranslationKey() + ".effect.");
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      PotionUtils.method38189(var1, var3, 1.0F);
   }

   @Override
   public boolean method11732(ItemStack var1) {
      return super.method11732(var1) || !PotionUtils.method38176(var1).isEmpty();
   }

   @Override
   public void fillItemGroup(ItemGroup var1, NonNullList<ItemStack> var2) {
      if (this.method11738(var1)) {
         for (Potion var6 : Registry.POTION) {
            if (var6 != Potions.EMPTY) {
               var2.add(PotionUtils.method38187(new ItemStack(this), var6));
            }
         }
      }
   }
}
