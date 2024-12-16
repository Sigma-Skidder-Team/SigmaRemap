package mapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.IVanishable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntityPickupStatus;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class Class3272 extends Item implements IVanishable {
   private final Multimap<Attribute, AttributeModifier> field18772;

   public Class3272(Properties var1) {
      super(var1);
      Builder var4 = ImmutableMultimap.builder();
      var4.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 8.0, AttributeModifier.Operation.ADDITION));
      var4.put(Attributes.ATTACK_SPEED, new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -2.9F, AttributeModifier.Operation.ADDITION));
      this.field18772 = var4.build();
   }

   @Override
   public boolean canPlayerBreakBlockWhileHolding(BlockState var1, World var2, BlockPos var3, PlayerEntity var4) {
      return !var4.isCreative();
   }

   @Override
   public UseAction method11727(ItemStack var1) {
      return UseAction.SPEAR;
   }

   @Override
   public int method11728(ItemStack var1) {
      return 72000;
   }

   @Override
   public void method11729(ItemStack var1, World var2, LivingEntity var3, int var4) {
      if (var3 instanceof PlayerEntity) {
         PlayerEntity var7 = (PlayerEntity)var3;
         int var8 = this.method11728(var1) - var4;
         if (var8 >= 10) {
            int var9 = EnchantmentHelper.method26337(var1);
            if (var9 <= 0 || var7.method3253()) {
               if (!var2.isRemote) {
                  var1.damageItem(1, var7, var1x -> var1x.sendBreakAnimation(var3.getActiveHand()));
                  if (var9 == 0) {
                     Class886 var10 = new Class886(var2, var7, var1);
                     var10.method3463(var7, var7.rotationPitch, var7.rotationYaw, 0.0F, 2.5F + (float)var9 * 0.5F, 1.0F);
                     if (var7.abilities.isCreativeMode) {
                        var10.pickupStatus = AbstractArrowEntityPickupStatus.field14333;
                     }

                     var2.addEntity(var10);
                     var2.playSoundFromEntity((PlayerEntity)null, var10, SoundEvents.field27154, Class2266.field14735, 1.0F, 1.0F);
                     if (!var7.abilities.isCreativeMode) {
                        var7.inventory.method4048(var1);
                     }
                  }
               }

               var7.addStat(Stats.field40098.method172(this));
               if (var9 > 0) {
                  float var18 = var7.rotationYaw;
                  float var11 = var7.rotationPitch;
                  float var12 = -MathHelper.sin(var18 * (float) (Math.PI / 180.0)) * MathHelper.cos(var11 * (float) (Math.PI / 180.0));
                  float var13 = -MathHelper.sin(var11 * (float) (Math.PI / 180.0));
                  float var14 = MathHelper.cos(var18 * (float) (Math.PI / 180.0)) * MathHelper.cos(var11 * (float) (Math.PI / 180.0));
                  float var15 = MathHelper.sqrt(var12 * var12 + var13 * var13 + var14 * var14);
                  float var16 = 3.0F * ((1.0F + (float)var9) / 4.0F);
                  var12 *= var16 / var15;
                  var13 *= var16 / var15;
                  var14 *= var16 / var15;
                  var7.addVelocity((double)var12, (double)var13, (double)var14);
                  var7.method3129(20);
                  if (var7.isOnGround()) {
                     float var17 = 1.1999999F;
                     var7.move(MoverType.SELF, new Vector3d(0.0, 1.1999999F, 0.0));
                  }

                  SoundEvent var22;
                  if (var9 < 3) {
                     if (var9 != 2) {
                        var22 = SoundEvents.field27151;
                     } else {
                        var22 = SoundEvents.field27152;
                     }
                  } else {
                     var22 = SoundEvents.field27153;
                  }

                  var2.playSoundFromEntity((PlayerEntity)null, var7, var22, Class2266.field14735, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      if (var6.method32117() < var6.method32119() - 1) {
         if (EnchantmentHelper.method26337(var6) > 0 && !var2.method3253()) {
            return Class6794.<ItemStack>method20699(var6);
         } else {
            var2.setActiveHand(var3);
            return Class6794.<ItemStack>method20697(var6);
         }
      } else {
         return Class6794.<ItemStack>method20699(var6);
      }
   }

   @Override
   public boolean hitEntity(ItemStack var1, LivingEntity var2, LivingEntity var3) {
      var1.damageItem(1, var3, var0 -> var0.sendBreakAnimation(EquipmentSlotType.MAINHAND));
      return true;
   }

   @Override
   public boolean onBlockDestroyed(ItemStack var1, World var2, BlockState var3, BlockPos var4, LivingEntity var5) {
      if ((double)var3.getBlockHardness(var2, var4) != 0.0) {
         var1.damageItem(2, var5, var0 -> var0.sendBreakAnimation(EquipmentSlotType.MAINHAND));
      }

      return true;
   }

   @Override
   public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType var1) {
      return var1 != EquipmentSlotType.MAINHAND ? super.getAttributeModifiers(var1) : this.field18772;
   }

   @Override
   public int method11736() {
      return 1;
   }
}
