package mapped;

public class Class4580 extends Class4566 {
   private static String[] field22025;
   private final double field22026;
   private final double field22027;
   private final double field22028;

   public Class4580(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.field22044 = var8;
      this.field22045 = var10;
      this.field22046 = var12;
      this.field22026 = var2;
      this.field22027 = var4;
      this.field22028 = var6;
      this.field22038 = var2 + var8;
      this.field22039 = var4 + var10;
      this.field22040 = var6 + var12;
      this.field22041 = this.field22038;
      this.field22042 = this.field22039;
      this.field22043 = this.field22040;
      this.field22035 = 0.1F * (this.field22054.nextFloat() * 0.5F + 0.2F);
      float var16 = this.field22054.nextFloat() * 0.6F + 0.4F;
      this.field22058 = 0.9F * var16;
      this.field22059 = 0.9F * var16;
      this.field22060 = var16;
      this.field22049 = false;
      this.field22056 = (int)(Math.random() * 10.0) + 30;
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
         var3 = 1.0F - var3;
         float var4 = 1.0F - var3;
         var4 *= var4;
         var4 *= var4;
         this.field22041 = this.field22026 + this.field22044 * (double)var3;
         this.field22042 = this.field22027 + this.field22045 * (double)var3 - (double)(var4 * 1.2F);
         this.field22043 = this.field22028 + this.field22046 * (double)var3;
      } else {
         this.method14518();
      }
   }
}
