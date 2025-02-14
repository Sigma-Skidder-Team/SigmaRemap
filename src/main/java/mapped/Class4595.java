package mapped;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.Fluid;
import net.minecraft.particles.IParticleData;

public class Class4595 extends Class4594 {
   private static String[] field22089;
   private final IParticleData field22090;

   public Class4595(ClientWorld var1, double var2, double var4, double var6, Fluid var8, IParticleData var9) {
      super(var1, var2, var4, var6, var8);
      this.field22090 = var9;
      this.field22057 *= 0.02F;
      this.field22056 = 40;
   }

   @Override
   public void method14533() {
      if (this.field22056-- <= 0) {
         this.method14518();
         this.field22037.addParticle(this.field22090, this.field22041, this.field22042, this.field22043, this.field22044, this.field22045, this.field22046);
      }
   }

   @Override
   public void method14534() {
      this.field22044 *= 0.02;
      this.field22045 *= 0.02;
      this.field22046 *= 0.02;
   }
}
