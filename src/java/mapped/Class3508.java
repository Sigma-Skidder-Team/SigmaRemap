package mapped;

import net.minecraft.particles.RedstoneParticleData;

public class Class3508 implements Class3499<RedstoneParticleData> {
   private static String[] field19392;
   private final Class8975 field19393;

   public Class3508(Class8975 var1) {
      this.field19393 = var1;
   }

   public Class4587 method12199(RedstoneParticleData var1, ClientWorld var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      return new Class4621(var2, var3, var5, var7, var9, var11, var13, var1, this.field19393);
   }
}
