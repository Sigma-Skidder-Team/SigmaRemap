package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public abstract class Class893 extends ProjectileEntity {
   public Class893(EntityType<? extends Class893> var1, World var2) {
      super(var1, var2);
   }

   public Class893(EntityType<? extends Class893> var1, double var2, double var4, double var6, World var8) {
      this(var1, var8);
      this.setPosition(var2, var4, var6);
   }

   public Class893(EntityType<? extends Class893> var1, LivingEntity var2, World var3) {
      this(var1, var2.getPosX(), var2.getPosYEye() - 0.1F, var2.getPosZ(), var3);
      this.setShooter(var2);
   }

   @Override
   public boolean isInRangeToRenderDist(double var1) {
      double var5 = this.getBoundingBox().getAverageEdgeLength() * 4.0;
      if (Double.isNaN(var5)) {
         var5 = 4.0;
      }

      var5 *= 64.0;
      return var1 < var5 * var5;
   }

   @Override
   public void tick() {
      super.tick();
      RayTraceResult var3 = ProjectileHelper.method36385(this, this::method3467);
      boolean var4 = false;
      if (var3.getType() == RayTraceResult.Type.BLOCK) {
         BlockPos var5 = ((BlockRayTraceResult)var3).getPos();
         BlockState var13 = this.world.getBlockState(var5);
         if (!var13.isIn(Blocks.field36588)) {
            if (var13.isIn(Blocks.field36886)) {
               TileEntity var14 = this.world.getTileEntity(var5);
               if (var14 instanceof Class957 && Class957.method3871(this)) {
                  ((Class957)var14).method3877(this);
               }

               var4 = true;
            }
         } else {
            this.setPortal(var5);
            var4 = true;
         }
      }

      if (var3.getType() != RayTraceResult.Type.MISS && !var4) {
         this.method3464(var3);
      }

      this.doBlockCollisions();
      Vector3d var17 = this.getMotion();
      double var6 = this.getPosX() + var17.x;
      double var8 = this.getPosY() + var17.y;
      double var10 = this.getPosZ() + var17.z;
      this.method3468();
      float var12;
      if (!this.isInWater()) {
         var12 = 0.99F;
      } else {
         for (int var15 = 0; var15 < 4; var15++) {
            float var16 = 0.25F;
            this.world
               .addParticle(
                  ParticleTypes.BUBBLE,
                  var6 - var17.x * 0.25,
                  var8 - var17.y * 0.25,
                  var10 - var17.z * 0.25,
                  var17.x,
                  var17.y,
                  var17.z
               );
         }

         var12 = 0.8F;
      }

      this.setMotion(var17.scale((double)var12));
      if (!this.method3247()) {
         Vector3d var18 = this.getMotion();
         this.setMotion(var18.x, var18.y - (double)this.method3515(), var18.z);
      }

      this.setPosition(var6, var8, var10);
   }

   public float method3515() {
      return 0.03F;
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnObjectPacket(this);
   }
}
