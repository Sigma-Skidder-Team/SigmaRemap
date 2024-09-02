package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.IParticleData;
import net.minecraft.world.World;

public class Class894 extends Class890 {
   private static String[] field5129;

   public Class894(EntityType<? extends Class894> var1, World var2) {
      super(var1, var2);
   }

   public Class894(World var1, LivingEntity var2) {
      super(EntityType.field41083, var2, var1);
   }

   public Class894(World var1, double var2, double var4, double var6) {
      super(EntityType.field41083, var2, var4, var6, var1);
   }

   @Override
   public Item method3512() {
      return Items.field37888;
   }

   private IParticleData method3516() {
      ItemStack var3 = this.method3513();
      return (IParticleData)(!var3.isEmpty() ? new Class7438(ParticleTypes.field34082, var3) : ParticleTypes.field34084);
   }

   @Override
   public void method2866(byte var1) {
      if (var1 == 3) {
         IParticleData var4 = this.method3516();

         for (int var5 = 0; var5 < 8; var5++) {
            this.world.method6746(var4, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      Entity var4 = var1.getEntity();
      int var5 = !(var4 instanceof Class1103) ? 0 : 3;
      var4.method2741(Class8654.method31123(this, this.method3460()), (float)var5);
   }

   @Override
   public void method3464(RayTraceResult var1) {
      super.method3464(var1);
      if (!this.world.isRemote) {
         this.world.method6786(this, (byte)3);
         this.method2904();
      }
   }
}
