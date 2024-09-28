package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Class3338 extends Item {
   private static String[] field18845;

   public Class3338(Properties var1) {
      super(var1);
   }

   @Override
   public ItemStack onItemUseFinish(ItemStack var1, World var2, LivingEntity var3) {
      ItemStack var6 = super.onItemUseFinish(var1, var2, var3);
      if (!var2.isRemote) {
         double var7 = var3.getPosX();
         double var9 = var3.getPosY();
         double var11 = var3.getPosZ();

         for (int var13 = 0; var13 < 16; var13++) {
            double var14 = var3.getPosX() + (var3.getRNG().nextDouble() - 0.5) * 16.0;
            double var16 = MathHelper.clamp(var3.getPosY() + (double)(var3.getRNG().nextInt(16) - 8), 0.0, (double)(var2.method6998() - 1));
            double var18 = var3.getPosZ() + (var3.getRNG().nextDouble() - 0.5) * 16.0;
            if (var3.isPassenger()) {
               var3.stopRiding();
            }

            if (var3.attemptTeleport(var14, var16, var18, true)) {
               SoundEvent var20 = !(var3 instanceof Class1095) ? SoundEvents.field26457 : SoundEvents.field26598;
               var2.playSound((PlayerEntity)null, var7, var9, var11, var20, Class2266.field14735, 1.0F, 1.0F);
               var3.playSound(var20, 1.0F, 1.0F);
               break;
            }
         }

         if (var3 instanceof PlayerEntity) {
            ((PlayerEntity)var3).method2976().method19638(this, 20);
         }
      }

      return var6;
   }
}
