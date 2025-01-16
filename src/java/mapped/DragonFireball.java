package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.particles.IParticleData;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.world.World;

import java.util.List;

public class DragonFireball extends Class901 {
   private static String[] field5146;

   public DragonFireball(EntityType<? extends DragonFireball> var1, World var2) {
      super(var1, var2);
   }

   public DragonFireball(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(EntityType.DRAGON_FIREBALL, var2, var4, var6, var8, var10, var12, var1);
   }

   public DragonFireball(World var1, LivingEntity var2, double var3, double var5, double var7) {
      super(EntityType.DRAGON_FIREBALL, var2, var3, var5, var7, var1);
   }

   @Override
   public void method3464(RayTraceResult var1) {
      super.method3464(var1);
      Entity var4 = this.method3460();
      if ((var1.getType() != RayTraceResult.Type.ENTITY || !((EntityRayTraceResult)var1).getEntity().isEntityEqual(var4)) && !this.world.isRemote) {
         List<LivingEntity> var5 = this.world.getEntitiesWithinAABB(LivingEntity.class, this.getBoundingBox().grow(4.0, 2.0, 4.0));
         AreaEffectCloudEntity var6 = new AreaEffectCloudEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ());
         if (var4 instanceof LivingEntity) {
            var6.method4113((LivingEntity)var4);
         }

         var6.method4105(ParticleTypes.field34056);
         var6.method4097(3.0F);
         var6.method4109(600);
         var6.method4111((7.0F - var6.method4098()) / (float)var6.method4108());
         var6.method4101(new EffectInstance(Effects.INSTANT_DAMAGE, 1, 1));
         if (!var5.isEmpty()) {
            for (LivingEntity var8 : var5) {
               double var9 = this.getDistanceSq(var8);
               if (var9 < 16.0) {
                  var6.setPosition(var8.getPosX(), var8.getPosY(), var8.getPosZ());
                  break;
               }
            }
         }

         this.world.playEvent(2006, this.getPosition(), !this.isSilent() ? 1 : -1);
         this.world.addEntity(var6);
         this.remove();
      }
   }

   @Override
   public boolean canBeCollidedWith() {
      return false;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return false;
   }

   @Override
   public IParticleData method3530() {
      return ParticleTypes.field34056;
   }

   @Override
   public boolean method3529() {
      return false;
   }
}
