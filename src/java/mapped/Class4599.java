package mapped;

import net.minecraft.particles.IParticleData;

public class Class4599 extends Class4598 {
   private static String[] field22092;
   public final IParticleData field22093;

   public Class4599(ClientWorld var1, double var2, double var4, double var6, Fluid var8, IParticleData var9) {
      super(var1, var2, var4, var6, var8);
      this.field22093 = var9;
   }

   @Override
   public void method14534() {
      if (this.field22048) {
         this.method14518();
         this.field22037.method6746(this.field22093, this.field22041, this.field22042, this.field22043, 0.0, 0.0, 0.0);
      }
   }
}
