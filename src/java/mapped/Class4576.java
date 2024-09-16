package mapped;

import net.minecraft.util.math.MathHelper;

public class Class4576 extends Class4566 {
   private static String[] field22018;

   public Class4576(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field22044 *= 0.1F;
      this.field22045 *= 0.1F;
      this.field22046 *= 0.1F;
      this.field22044 += var8 * 0.4;
      this.field22045 += var10 * 0.4;
      this.field22046 += var12 * 0.4;
      float var16 = (float)(Math.random() * 0.3F + 0.6F);
      this.field22058 = var16;
      this.field22059 = var16;
      this.field22060 = var16;
      this.field22035 *= 0.75F;
      this.field22056 = Math.max((int)(6.0 / (Math.random() * 0.8 + 0.6)), 1);
      this.field22049 = false;
      this.method14500();
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
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.field22059 = (float)((double)this.field22059 * 0.96);
         this.field22060 = (float)((double)this.field22060 * 0.9);
         this.field22044 *= 0.7F;
         this.field22045 *= 0.7F;
         this.field22046 *= 0.7F;
         this.field22045 -= 0.02F;
         if (this.field22048) {
            this.field22044 *= 0.7F;
            this.field22046 *= 0.7F;
         }
      } else {
         this.method14518();
      }
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }
}
