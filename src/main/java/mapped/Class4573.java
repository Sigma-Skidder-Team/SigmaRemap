package mapped;

import net.minecraft.client.world.ClientWorld;

public class Class4573 extends Class4566 {
   private static String[] field22013;
   private final double field22014;
   private final double field22015;
   private final double field22016;

   public Class4573(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.field22044 = var8;
      this.field22045 = var10;
      this.field22046 = var12;
      this.field22041 = var2;
      this.field22042 = var4;
      this.field22043 = var6;
      this.field22014 = this.field22041;
      this.field22015 = this.field22042;
      this.field22016 = this.field22043;
      this.field22035 = 0.1F * (this.field22054.nextFloat() * 0.2F + 0.5F);
      float var16 = this.field22054.nextFloat() * 0.6F + 0.4F;
      this.field22058 = var16 * 0.9F;
      this.field22059 = var16 * 0.3F;
      this.field22060 = var16;
      this.field22056 = (int)(Math.random() * 10.0) + 40;
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }

   @Override
   public void method14511(double var1, double var3, double var5) {
      this.method14524(this.method14523().offset(var1, var3, var5));
      this.method14521();
   }

   @Override
   public float method14509(float var1) {
      float var4 = ((float)this.field22055 + var1) / (float)this.field22056;
      var4 = 1.0F - var4;
      var4 *= var4;
      var4 = 1.0F - var4;
      return this.field22035 * var4;
   }

   @Override
   public int method14499(float var1) {
      int var4 = super.method14499(var1);
      float var5 = (float)this.field22055 / (float)this.field22056;
      var5 *= var5;
      var5 *= var5;
      int var6 = var4 & 0xFF;
      int var7 = var4 >> 16 & 0xFF;
      var7 += (int)(var5 * 15.0F * 16.0F);
      if (var7 > 240) {
         var7 = 240;
      }

      return var6 | var7 << 16;
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         float var3 = (float)this.field22055 / (float)this.field22056;
         float var4 = -var3 + var3 * var3 * 2.0F;
         float var5 = 1.0F - var4;
         this.field22041 = this.field22014 + this.field22044 * (double)var5;
         this.field22042 = this.field22015 + this.field22045 * (double)var5 + (double)(1.0F - var3);
         this.field22043 = this.field22016 + this.field22046 * (double)var5;
      } else {
         this.method14518();
      }
   }
}
