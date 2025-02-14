package mapped;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.util.math.MathHelper;

public class Class4621 extends Class4566 {
   private static String[] field22136;
   private final Class8975 field22137;

   public Class4621(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, RedstoneParticleData var14, Class8975 var15) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field22137 = var15;
      this.field22044 *= 0.1F;
      this.field22045 *= 0.1F;
      this.field22046 *= 0.1F;
      float var18 = (float)Math.random() * 0.4F + 0.6F;
      this.field22058 = ((float)(Math.random() * 0.2F) + 0.8F) * var14.getRed() * var18;
      this.field22059 = ((float)(Math.random() * 0.2F) + 0.8F) * var14.getGreen() * var18;
      this.field22060 = ((float)(Math.random() * 0.2F) + 0.8F) * var14.getBlue() * var18;
      this.field22035 = this.field22035 * 0.75F * var14.getAlpha();
      int var19 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.field22056 = (int)Math.max((float)var19 * var14.getAlpha(), 1.0F);
      this.method14508(var15);
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }

   @Override
   public float method14509(float var1) {
      return this.field22035 * MathHelper.clamp(((float)this.field22055 + var1) / (float)this.field22056 * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         this.method14508(this.field22137);
         this.method14511(this.field22044, this.field22045, this.field22046);
         if (this.field22042 == this.field22039) {
            this.field22044 *= 1.1;
            this.field22046 *= 1.1;
         }

         this.field22044 *= 0.96F;
         this.field22045 *= 0.96F;
         this.field22046 *= 0.96F;
         if (this.field22048) {
            this.field22044 *= 0.7F;
            this.field22046 *= 0.7F;
         }
      } else {
         this.method14518();
      }
   }
}
