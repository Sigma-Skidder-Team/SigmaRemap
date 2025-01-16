package mapped;

import net.minecraft.block.AbstractBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class LlamaSpitEntity extends ProjectileEntity {
   private static String[] field5096;

   public LlamaSpitEntity(EntityType<? extends LlamaSpitEntity> var1, World var2) {
      super(var1, var2);
   }

   public LlamaSpitEntity(World var1, LlamaEntity var2) {
      this(EntityType.LLAMA_SPIT, var1);
      super.setShooter(var2);
      this.setPosition(
         var2.getPosX() - (double)(var2.getWidth() + 1.0F) * 0.5 * (double) MathHelper.sin(var2.renderYawOffset * (float) (Math.PI / 180.0)),
         var2.getPosYEye() - 0.1F,
         var2.getPosZ() + (double)(var2.getWidth() + 1.0F) * 0.5 * (double) MathHelper.cos(var2.renderYawOffset * (float) (Math.PI / 180.0))
      );
   }

   public LlamaSpitEntity(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(EntityType.LLAMA_SPIT, var1);
      this.setPosition(var2, var4, var6);

      for (int var16 = 0; var16 < 7; var16++) {
         double var17 = 0.4 + 0.1 * (double)var16;
         var1.addParticle(ParticleTypes.field34094, var2, var4, var6, var8 * var17, var10, var12 * var17);
      }

      this.setMotion(var8, var10, var12);
   }

   @Override
   public void tick() {
      super.tick();
      Vector3d var3 = this.getMotion();
      RayTraceResult var4 = ProjectileHelper.method36385(this, this::method3467);
      if (var4 != null) {
         this.method3464(var4);
      }

      double var5 = this.getPosX() + var3.x;
      double var7 = this.getPosY() + var3.y;
      double var9 = this.getPosZ() + var3.z;
      this.method3468();
      float var11 = 0.99F;
      float var12 = 0.06F;
      if (!this.world.method7035(this.getBoundingBox()).noneMatch(AbstractBlock.AbstractBlockState::isAir)) {
         if (!this.method3255()) {
            this.setMotion(var3.scale(0.99F));
            if (!this.method3247()) {
               this.setMotion(this.getMotion().add(0.0, -0.06F, 0.0));
            }

            this.setPosition(var5, var7, var9);
         } else {
            this.remove();
         }
      } else {
         this.remove();
      }
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      Entity var4 = this.method3460();
      if (var4 instanceof LivingEntity) {
         var1.getEntity().attackEntityFrom(DamageSource.method31116(this, (LivingEntity)var4).method31130(), 1.0F);
      }
   }

   @Override
   public void method3466(BlockRayTraceResult var1) {
      super.method3466(var1);
      if (!this.world.isRemote) {
         this.remove();
      }
   }

   @Override
   public void registerData() {
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnObjectPacket(this);
   }
}
