package remapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class class_1302 extends class_2451 implements class_1538 {
   private final Multimap<class_225, class_9343> field_7217;

   public class_1302(class_317 var1) {
      super(var1);
      Builder var4 = ImmutableMultimap.builder();
      var4.put(Attributes.ATTACK_DAMAGE, new class_9343(field_12168, "Tool modifier", 8.0, class_9342.field_47679));
      var4.put(Attributes.field_37466, new class_9343(field_12167, "Tool modifier", -2.9F, class_9342.field_47679));
      this.field_7217 = var4.build();
   }

   @Override
   public boolean method_11203(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4) {
      return !var4.method_3186();
   }

   @Override
   public class_6209 method_11233(ItemStack var1) {
      return class_6209.field_31736;
   }

   @Override
   public int method_11230(ItemStack var1) {
      return 72000;
   }

   @Override
   public void method_11206(ItemStack var1, World var2, LivingEntity var3, int var4) {
      if (var3 instanceof PlayerEntity) {
         PlayerEntity var7 = (PlayerEntity)var3;
         int var8 = this.method_11230(var1) - var4;
         if (var8 >= 10) {
            int var9 = class_2931.method_13415(var1);
            if (var9 <= 0 || var7.method_37363()) {
               if (!var2.field_33055) {
                  var1.method_28003(1, var7, var1x -> var1x.method_26447(var3.method_26500()));
                  if (var9 == 0) {
                     class_3348 var10 = new class_3348(var2, var7, var1);
                     var10.method_26158(var7, var7.rotationPitch, var7.rotationYaw, 0.0F, 2.5F + (float)var9 * 0.5F, 1.0F);
                     if (var7.playerAbilities.isCreativeMode) {
                        var10.field_34835 = class_4237.field_20565;
                     }

                     var2.method_7509(var10);
                     var2.method_29540((PlayerEntity)null, var10, SoundEvents.field_2050, class_562.field_3335, 1.0F, 1.0F);
                     if (!var7.playerAbilities.isCreativeMode) {
                        var7.inventory.method_32419(var1);
                     }
                  }
               }

               var7.method_3211(class_6234.field_31907.method_43790(this));
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
                  var7.method_37186((double)var12, (double)var13, (double)var14);
                  var7.method_26445(20);
                  if (var7.method_37360()) {
                     float var17 = 1.1999999F;
                     var7.method_37226(class_7412.field_37839, new class_1343(0.0, 1.1999999F, 0.0));
                  }

                  SoundEvent var22;
                  if (var9 < 3) {
                     if (var9 != 2) {
                        var22 = SoundEvents.field_2258;
                     } else {
                        var22 = SoundEvents.field_2171;
                     }
                  } else {
                     var22 = SoundEvents.field_2408;
                  }

                  var2.method_29540((PlayerEntity)null, var7, var22, class_562.field_3335, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.method_26617(var3);
      if (var6.method_28026() < var6.method_27957() - 1) {
         if (class_2931.method_13415(var6) > 0 && !var2.method_37363()) {
            return class_954.<ItemStack>method_4202(var6);
         } else {
            var2.method_26462(var3);
            return class_954.<ItemStack>method_4206(var6);
         }
      } else {
         return class_954.<ItemStack>method_4202(var6);
      }
   }

   @Override
   public boolean method_11246(ItemStack var1, LivingEntity var2, LivingEntity var3) {
      var1.method_28003(1, var3, var0 -> var0.method_26448(class_6943.field_35707));
      return true;
   }

   @Override
   public boolean method_11209(ItemStack var1, World var2, class_2522 var3, BlockPos var4, LivingEntity var5) {
      if ((double)var3.method_8341(var2, var4) != 0.0) {
         var1.method_28003(2, var5, var0 -> var0.method_26448(class_6943.field_35707));
      }

      return true;
   }

   @Override
   public Multimap<class_225, class_9343> method_11205(class_6943 var1) {
      return var1 != class_6943.field_35707 ? super.method_11205(var1) : this.field_7217;
   }

   @Override
   public int method_11213() {
      return 1;
   }
}
