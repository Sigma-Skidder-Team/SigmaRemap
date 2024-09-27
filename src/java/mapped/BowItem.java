package mapped;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.IVanishable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.AbstractArrowEntityPickupStatus;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import java.util.function.Predicate;

public class BowItem extends Class3262 implements IVanishable {
   private static String[] field18750;

   public BowItem(Properties var1) {
      super(var1);
   }

   @Override
   public void method11729(ItemStack var1, World var2, LivingEntity var3, int var4) {
      if (var3 instanceof PlayerEntity) {
         PlayerEntity var7 = (PlayerEntity)var3;
         boolean var8 = var7.abilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, var1) > 0;
         ItemStack var9 = var7.findAmmo(var1);
         if (!var9.isEmpty() || var8) {
            if (var9.isEmpty()) {
               var9 = new ItemStack(Items.field37797);
            }

            int var10 = this.method11728(var1) - var4;
            float var11 = method11777(var10);
            if (!((double)var11 < 0.1)) {
               boolean var12 = var8 && var9.getItem() == Items.field37797;
               if (!var2.isRemote) {
                  Class3308 var13 = (Class3308)(!(var9.getItem() instanceof Class3308) ? Items.field37797 : var9.getItem());
                  AbstractArrowEntity var14 = var13.method11850(var2, var9, var7);
                  var14.method3463(var7, var7.rotationPitch, var7.rotationYaw, 0.0F, var11 * 3.0F, 1.0F);
                  if (var11 == 1.0F) {
                     var14.method3484(true);
                  }

                  int var15 = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, var1);
                  if (var15 > 0) {
                     var14.method3481(var14.method3482() + (double)var15 * 0.5 + 0.5);
                  }

                  int var16 = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, var1);
                  if (var16 > 0) {
                     var14.method3483(var16);
                  }

                  if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, var1) > 0) {
                     var14.setFire(100);
                  }

                  var1.damageItem(1, var7, var1x -> var1x.sendBreakAnimation(var7.getActiveHand()));
                  if (var12 || var7.abilities.isCreativeMode && (var9.getItem() == Items.field38116 || var9.getItem() == Items.field38117)) {
                     var14.pickupStatus = AbstractArrowEntityPickupStatus.field14333;
                  }

                  var2.addEntity(var14);
               }

               var2.method6743(
                  (PlayerEntity)null,
                  var7.getPosX(),
                  var7.getPosY(),
                  var7.getPosZ(),
                  SoundEvents.field26363,
                  Class2266.field14735,
                  1.0F,
                  1.0F / (field18735.nextFloat() * 0.4F + 1.2F) + var11 * 0.5F
               );
               if (!var12 && !var7.abilities.isCreativeMode) {
                  var9.shrink(1);
                  if (var9.isEmpty()) {
                     var7.inventory.method4048(var9);
                  }
               }

               var7.addStat(Stats.field40098.method172(this));
            }
         }
      }
   }

   public static float method11777(int var0) {
      float var3 = (float)var0 / 20.0F;
      var3 = (var3 * var3 + var3 * 2.0F) / 3.0F;
      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return var3;
   }

   @Override
   public int method11728(ItemStack var1) {
      return 72000;
   }

   @Override
   public UseAction method11727(ItemStack var1) {
      return UseAction.BOW;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      boolean var7 = !var2.findAmmo(var6).isEmpty();
      if (!var2.abilities.isCreativeMode && !var7) {
         return Class6794.<ItemStack>method20699(var6);
      } else {
         var2.setActiveHand(var3);
         return Class6794.<ItemStack>method20697(var6);
      }
   }

   @Override
   public Predicate<ItemStack> method11752() {
      return field18748;
   }

   @Override
   public int method11771() {
      return 15;
   }
}
