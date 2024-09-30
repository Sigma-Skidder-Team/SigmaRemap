package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.world.World;

public class Class892 extends Class890 {
   private static String[] field5128;

   public Class892(EntityType<? extends Class892> var1, World var2) {
      super(var1, var2);
   }

   public Class892(World var1, LivingEntity var2) {
      super(EntityType.field41089, var2, var1);
   }

   public Class892(World var1, double var2, double var4, double var6) {
      super(EntityType.field41089, var2, var4, var6, var1);
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 == 3) {
         double var4 = 0.08;

         for (int var6 = 0; var6 < 8; var6++) {
            this.world
               .addParticle(
                  new Class7438(ParticleTypes.field34082, this.method3509()),
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  ((double)this.rand.nextFloat() - 0.5) * 0.08,
                  ((double)this.rand.nextFloat() - 0.5) * 0.08,
                  ((double)this.rand.nextFloat() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      var1.getEntity().attackEntityFrom(DamageSource.method31123(this, this.method3460()), 0.0F);
   }

   @Override
   public void method3464(RayTraceResult var1) {
      super.method3464(var1);
      if (!this.world.isRemote) {
         if (this.rand.nextInt(8) == 0) {
            byte var4 = 1;
            if (this.rand.nextInt(32) == 0) {
               var4 = 4;
            }

            for (int var5 = 0; var5 < var4; var5++) {
               Class1089 var6 = EntityType.field41014.create(this.world);
               var6.method4770(-24000);
               var6.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, 0.0F);
               this.world.addEntity(var6);
            }
         }

         this.world.setEntityState(this, (byte)3);
         this.remove();
      }
   }

   @Override
   public Item method3512() {
      return Items.field37904;
   }
}
