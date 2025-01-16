package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.world.World;

public class SnowballEntity extends Class890 {
   private static String[] field5129;

   public SnowballEntity(EntityType<? extends SnowballEntity> var1, World var2) {
      super(var1, var2);
   }

   public SnowballEntity(World var1, LivingEntity var2) {
      super(EntityType.SNOWBALL, var2, var1);
   }

   public SnowballEntity(World var1, double var2, double var4, double var6) {
      super(EntityType.SNOWBALL, var2, var4, var6, var1);
   }

   @Override
   public Item method3512() {
      return Items.SNOWBALL;
   }

   private IParticleData method3516() {
      ItemStack var3 = this.method3513();
      return (IParticleData)(!var3.isEmpty() ? new Class7438(ParticleTypes.field34082, var3) : ParticleTypes.field34084);
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 == 3) {
         IParticleData var4 = this.method3516();

         for (int var5 = 0; var5 < 8; var5++) {
            this.world.addParticle(var4, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      Entity var4 = var1.getEntity();
      int var5 = !(var4 instanceof BlazeEntity) ? 0 : 3;
      var4.attackEntityFrom(DamageSource.method31123(this, this.method3460()), (float)var5);
   }

   @Override
   public void method3464(RayTraceResult var1) {
      super.method3464(var1);
      if (!this.world.isRemote) {
         this.world.setEntityState(this, (byte)3);
         this.remove();
      }
   }
}
