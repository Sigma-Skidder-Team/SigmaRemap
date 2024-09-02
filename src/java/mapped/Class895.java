package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class Class895 extends Class890 {
   private static String[] field5130;

   public Class895(EntityType<? extends Class895> var1, World var2) {
      super(var1, var2);
   }

   public Class895(World var1, LivingEntity var2) {
      super(EntityType.field41090, var2, var1);
   }

   public Class895(World var1, double var2, double var4, double var6) {
      super(EntityType.field41090, var2, var4, var6, var1);
   }

   @Override
   public Item method3512() {
      return Items.field37966;
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      var1.getEntity().method2741(Class8654.method31123(this, this.method3460()), 0.0F);
   }

   @Override
   public void method3464(RayTraceResult var1) {
      super.method3464(var1);
      Entity var4 = this.method3460();

      for (int var5 = 0; var5 < 32; var5++) {
         this.world
            .method6746(
               ParticleTypes.field34090,
               this.getPosX(),
               this.getPosY() + this.rand.nextDouble() * 2.0,
               this.getPosZ(),
               this.rand.nextGaussian(),
               0.0,
               this.rand.nextGaussian()
            );
      }

      if (!this.world.isRemote && !this.removed) {
         if (!(var4 instanceof ServerPlayerEntity)) {
            if (var4 != null) {
               var4.method2793(this.getPosX(), this.getPosY(), this.getPosZ());
               var4.fallDistance = 0.0F;
            }
         } else {
            ServerPlayerEntity var7 = (ServerPlayerEntity)var4;
            if (var7.field4855.getNetworkManager().isChannelOpen() && var7.world == this.world && !var7.isSleeping()) {
               if (this.rand.nextFloat() < 0.05F && this.world.method6789().method17135(Class5462.field24226)) {
                  Class1104 var6 = EntityType.field41026.method33215(this.world);
                  var6.method5298(true);
                  var6.method3273(var4.getPosX(), var4.getPosY(), var4.getPosZ(), var4.rotationYaw, var4.rotationPitch);
                  this.world.method6916(var6);
               }

               if (var4.isPassenger()) {
                  var4.stopRiding();
               }

               var4.method2793(this.getPosX(), this.getPosY(), this.getPosZ());
               var4.fallDistance = 0.0F;
               var4.method2741(Class8654.field39002, 5.0F);
            }
         }

         this.method2904();
      }
   }

   @Override
   public void tick() {
      Entity var3 = this.method3460();
      if (var3 instanceof PlayerEntity && !var3.isAlive()) {
         this.method2904();
      } else {
         super.tick();
      }
   }

   @Nullable
   @Override
   public Entity method2745(ServerWorld var1) {
      Entity var4 = this.method3460();
      if (var4 != null && var4.world.getDimensionKey() != var1.getDimensionKey()) {
         this.setShooter((Entity)null);
      }

      return super.method2745(var1);
   }
}
