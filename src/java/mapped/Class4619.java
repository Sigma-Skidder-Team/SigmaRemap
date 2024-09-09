package mapped;

import net.minecraft.entity.player.PlayerEntity;

public class Class4619 extends Class4566 {
   private static String[] field22132;
   private final Class8975 field22133;

   public Class4619(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, Class8975 var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field22133 = var14;
      float var17 = 2.5F;
      this.field22044 *= 0.1F;
      this.field22045 *= 0.1F;
      this.field22046 *= 0.1F;
      this.field22044 += var8;
      this.field22045 += var10;
      this.field22046 += var12;
      float var18 = 1.0F - (float)(Math.random() * 0.3F);
      this.field22058 = var18;
      this.field22059 = var18;
      this.field22060 = var18;
      this.field22035 *= 1.875F;
      int var19 = (int)(8.0 / (Math.random() * 0.8 + 0.3));
      this.field22056 = (int)Math.max((float)var19 * 2.5F, 1.0F);
      this.field22049 = false;
      this.method14508(var14);
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29736;
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
         this.method14508(this.field22133);
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.field22044 *= 0.96F;
         this.field22045 *= 0.96F;
         this.field22046 *= 0.96F;
         PlayerEntity var3 = this.field22037.method7186(this.field22041, this.field22042, this.field22043, 2.0, false);
         if (var3 != null) {
            double var4 = var3.getPosY();
            if (this.field22042 > var4) {
               this.field22042 = this.field22042 + (var4 - this.field22042) * 0.2;
               this.field22045 = this.field22045 + (var3.getMotion().y - this.field22045) * 0.2;
               this.method14520(this.field22041, this.field22042, this.field22043);
            }
         }

         if (this.field22048) {
            this.field22044 *= 0.7F;
            this.field22046 *= 0.7F;
         }
      } else {
         this.method14518();
      }
   }
}
