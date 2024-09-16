package mapped;

import net.minecraft.util.math.MathHelper;

public class Class4567 extends Class4566 {
   private static String[] field22005;

   public Class4567(ClientWorld var1, double var2, double var4, double var6, double var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field22044 *= 0.01F;
      this.field22045 *= 0.01F;
      this.field22046 *= 0.01F;
      this.field22045 += 0.2;
      this.field22058 = Math.max(0.0F, MathHelper.sin(((float)var8 + 0.0F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.field22059 = Math.max(0.0F, MathHelper.sin(((float)var8 + 0.33333334F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.field22060 = Math.max(0.0F, MathHelper.sin(((float)var8 + 0.6666667F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.field22035 *= 1.5F;
      this.field22056 = 6;
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
         this.method14511(this.field22044, this.field22045, this.field22046);
         if (this.field22042 == this.field22039) {
            this.field22044 *= 1.1;
            this.field22046 *= 1.1;
         }

         this.field22044 *= 0.66F;
         this.field22045 *= 0.66F;
         this.field22046 *= 0.66F;
         if (this.field22048) {
            this.field22044 *= 0.7F;
            this.field22046 *= 0.7F;
         }
      } else {
         this.method14518();
      }
   }
}
