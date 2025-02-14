package mapped;

import net.minecraft.client.world.ClientWorld;

public class Class4601 extends Class4566 {
   private static String[] field22095;
   public final Class8975 field22096;
   private final float field22097;
   private float field22098 = 0.91F;
   private float field22099;
   private float field22100;
   private float field22101;
   private boolean field22102;

   public Class4601(ClientWorld var1, double var2, double var4, double var6, Class8975 var8, float var9) {
      super(var1, var2, var4, var6);
      this.field22096 = var8;
      this.field22097 = var9;
   }

   public void method14535(int var1) {
      float var4 = (float)((var1 & 0xFF0000) >> 16) / 255.0F;
      float var5 = (float)((var1 & 0xFF00) >> 8) / 255.0F;
      float var6 = (float)((var1 & 0xFF) >> 0) / 255.0F;
      float var7 = 1.0F;
      this.method14514(var4 * 1.0F, var5 * 1.0F, var6 * 1.0F);
   }

   public void method14536(int var1) {
      this.field22099 = (float)((var1 & 0xFF0000) >> 16) / 255.0F;
      this.field22100 = (float)((var1 & 0xFF00) >> 8) / 255.0F;
      this.field22101 = (float)((var1 & 0xFF) >> 0) / 255.0F;
      this.field22102 = true;
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29736;
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         this.method14508(this.field22096);
         if (this.field22055 > this.field22056 / 2) {
            this.method14515(1.0F - ((float)this.field22055 - (float)(this.field22056 / 2)) / (float)this.field22056);
            if (this.field22102) {
               this.field22058 = this.field22058 + (this.field22099 - this.field22058) * 0.2F;
               this.field22059 = this.field22059 + (this.field22100 - this.field22059) * 0.2F;
               this.field22060 = this.field22060 + (this.field22101 - this.field22060) * 0.2F;
            }
         }

         this.field22045 = this.field22045 + (double)this.field22097;
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.field22044 = this.field22044 * (double)this.field22098;
         this.field22045 = this.field22045 * (double)this.field22098;
         this.field22046 = this.field22046 * (double)this.field22098;
         if (this.field22048) {
            this.field22044 *= 0.7F;
            this.field22046 *= 0.7F;
         }
      } else {
         this.method14518();
      }
   }

   @Override
   public int method14499(float var1) {
      return 15728880;
   }

   public void method14537(float var1) {
      this.field22098 = var1;
   }
}
