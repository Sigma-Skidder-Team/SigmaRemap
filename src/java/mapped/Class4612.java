package mapped;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.MathHelper;

public class Class4612 extends Class4566 {
   private static String[] field22123;
   private final float field22124;
   private final Class8975 field22125;

   public Class4612(ClientWorld var1, double var2, double var4, double var6, float var8, float var9, float var10, Class8975 var11) {
      super(var1, var2, var4, var6);
      this.field22125 = var11;
      this.field22058 = var8;
      this.field22059 = var9;
      this.field22060 = var10;
      float var14 = 0.9F;
      this.field22035 *= 0.67499995F;
      int var15 = (int)(32.0 / (Math.random() * 0.8 + 0.2));
      this.field22056 = (int)Math.max((float)var15 * 0.9F, 1.0F);
      this.method14508(var11);
      this.field22124 = ((float)Math.random() - 0.5F) * 0.1F;
      this.field22062 = (float)Math.random() * (float) (Math.PI * 2);
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
         this.method14508(this.field22125);
         this.field22063 = this.field22062;
         this.field22062 = this.field22062 + (float) Math.PI * this.field22124 * 2.0F;
         if (this.field22048) {
            this.field22063 = this.field22062 = 0.0F;
         }

         this.method14511(this.field22044, this.field22045, this.field22046);
         this.field22045 -= 0.003F;
         this.field22045 = Math.max(this.field22045, -0.14F);
      } else {
         this.method14518();
      }
   }
}
