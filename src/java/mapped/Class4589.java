package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.math.vector.Vector3d;

public class Class4589 extends Class4588 {
   private static String[] field22065;
   private final Entity field22066;
   private int field22067;
   private final int field22068;
   private final IParticleData field22069;

   public Class4589(ClientWorld var1, Entity var2, IParticleData var3) {
      this(var1, var2, var3, 3);
   }

   public Class4589(ClientWorld var1, Entity var2, IParticleData var3, int var4) {
      this(var1, var2, var3, var4, var2.getVec());
   }

   private Class4589(ClientWorld var1, Entity var2, IParticleData var3, int var4, Vector3d var5) {
      super(var1, var2.getPosX(), var2.method3440(0.5), var2.getPosZ(), var5.x, var5.y, var5.z);
      this.field22066 = var2;
      this.field22068 = var4;
      this.field22069 = var3;
      this.method14500();
   }

   @Override
   public void method14500() {
      for (int var3 = 0; var3 < 16; var3++) {
         double var4 = (double)(this.field22054.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(this.field22054.nextFloat() * 2.0F - 1.0F);
         double var8 = (double)(this.field22054.nextFloat() * 2.0F - 1.0F);
         if (!(var4 * var4 + var6 * var6 + var8 * var8 > 1.0)) {
            double var10 = this.field22066.method3437(var4 / 4.0);
            double var12 = this.field22066.method3440(0.5 + var6 / 4.0);
            double var14 = this.field22066.method3444(var8 / 4.0);
            this.field22037.method6747(this.field22069, false, var10, var12, var14, var4, var6 + 0.2, var8);
         }
      }

      this.field22067++;
      if (this.field22067 >= this.field22068) {
         this.method14518();
      }
   }
}
