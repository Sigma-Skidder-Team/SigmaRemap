package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;

public interface Class1023 extends Class1022 {
   void method4535(boolean var1);

   void method4536(LivingEntity var1, ItemStack var2, ProjectileEntity var3, float var4);

   @Nullable
   LivingEntity method4232();

   void method4537();

   default void method4538(LivingEntity var1, float var2) {
      Hand var5 = Class9456.method36389(var1, Items.field38148);
      ItemStack var6 = var1.getHeldItem(var5);
      if (var1.method3092(Items.field38148)) {
         Class3261.method11763(var1.world, var1, var5, var6, var2, (float)(14 - var1.world.method6997().getId() * 4));
      }

      this.method4537();
   }

   default void method4539(LivingEntity var1, LivingEntity var2, ProjectileEntity var3, float var4, float var5) {
      double var8 = var2.getPosX() - var1.getPosX();
      double var10 = var2.getPosZ() - var1.getPosZ();
      double var12 = (double) MathHelper.method37766(var8 * var8 + var10 * var10);
      double var14 = var2.method3440(0.3333333333333333) - var3.getPosY() + var12 * 0.2F;
      Vector3f var16 = this.method4540(var1, new Vector3d(var8, var14, var10), var4);
      var3.shoot(
         (double)var16.method25269(),
         (double)var16.method25270(),
         (double)var16.method25271(),
         var5,
         (float)(14 - var1.world.method6997().getId() * 4)
      );
      var1.method2863(SoundEvents.field26494, 1.0F, 1.0F / (var1.method3013().nextFloat() * 0.4F + 0.8F));
   }

   default Vector3f method4540(LivingEntity var1, Vector3d var2, float var3) {
      Vector3d var6 = var2.method11333();
      Vector3d var7 = var6.method11335(new Vector3d(0.0, 1.0, 0.0));
      if (var7.method11349() <= 1.0E-7) {
         var7 = var6.method11335(var1.method3284(1.0F));
      }

      Quaternion var8 = new Quaternion(new Vector3f(var7), 90.0F, true);
      Vector3f var9 = new Vector3f(var6);
      var9.method25283(var8);
      Quaternion var10 = new Quaternion(var9, var3, true);
      Vector3f var11 = new Vector3f(var6);
      var11.method25283(var10);
      return var11;
   }
}
