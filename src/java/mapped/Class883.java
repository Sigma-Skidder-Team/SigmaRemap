package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ProjectileEntity;

public class Class883 extends ProjectileEntity {
   private static String[] field5096;

   public Class883(EntityType<? extends Class883> var1, World var2) {
      super(var1, var2);
   }

   public Class883(World var1, Class1064 var2) {
      this(EntityType.field41048, var1);
      super.setShooter(var2);
      this.setPosition(
         var2.getPosX() - (double)(var2.method3429() + 1.0F) * 0.5 * (double) MathHelper.sin(var2.field4965 * (float) (Math.PI / 180.0)),
         var2.method3442() - 0.1F,
         var2.getPosZ() + (double)(var2.method3429() + 1.0F) * 0.5 * (double) MathHelper.cos(var2.field4965 * (float) (Math.PI / 180.0))
      );
   }

   public Class883(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(EntityType.field41048, var1);
      this.setPosition(var2, var4, var6);

      for (int var16 = 0; var16 < 7; var16++) {
         double var17 = 0.4 + 0.1 * (double)var16;
         var1.method6746(Class7940.field34094, var2, var4, var6, var8 * var17, var10, var12 * var17);
      }

      this.method3435(var8, var10, var12);
   }

   @Override
   public void tick() {
      super.tick();
      Vector3d var3 = this.method3433();
      RayTraceResult var4 = Class9456.method36385(this, this::method3467);
      if (var4 != null) {
         this.method3464(var4);
      }

      double var5 = this.getPosX() + var3.x;
      double var7 = this.getPosY() + var3.y;
      double var9 = this.getPosZ() + var3.z;
      this.method3468();
      float var11 = 0.99F;
      float var12 = 0.06F;
      if (!this.world.method7035(this.getBoundingBox()).noneMatch(Class7377::isAir)) {
         if (!this.method3255()) {
            this.method3434(var3.method11344(0.99F));
            if (!this.method3247()) {
               this.method3434(this.method3433().method11339(0.0, -0.06F, 0.0));
            }

            this.setPosition(var5, var7, var9);
         } else {
            this.method2904();
         }
      } else {
         this.method2904();
      }
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      Entity var4 = this.method3460();
      if (var4 instanceof LivingEntity) {
         var1.getEntity().method2741(Class8654.method31116(this, (LivingEntity)var4).method31130(), 1.0F);
      }
   }

   @Override
   public void method3466(BlockRayTraceResult var1) {
      super.method3466(var1);
      if (!this.world.isRemote) {
         this.method2904();
      }
   }

   @Override
   public void registerData() {
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this);
   }
}
