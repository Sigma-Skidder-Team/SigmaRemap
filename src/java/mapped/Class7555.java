package mapped;

import java.util.List;

public class Class7555 extends Class7554 {
   private List<String> field32400;
   private int field32401;
   public int field32402;
   public int field32403;

   public Class7555(List<String> var1, int var2) {
      super(var2);
      this.field32400 = var1;
      this.method24729();
   }

   public void method24727(int var1, String var2) {
      if (var1 < this.field32400.size()) {
         this.field32400.set(var1, var2);
      }
   }

   public void method24728(List<String> var1) {
      this.field32400 = var1;
      if (this.field32402 < 0) {
         this.field32402 = 0;
      }

      if (this.field32402 > this.field32400.size() - 1) {
         this.field32402 = this.field32400.size() - 1;
      }

      this.method24729();
   }

   private void method24729() {
      this.field32401 = 0;

      for (String var4 : this.field32400) {
         this.field32401 = Math.max(this.field32401, this.field32394.method23942(var4));
      }
   }

   @Override
   public void method24718(float var1) {
      Class3192.method11424(
         (float)this.method24720(),
         (float)this.method24721(),
         (float)this.method24719(),
         (float)this.method24725(),
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, var1 * 0.6F)
      );
      this.field32403 = this.field32403 + this.method24733();
      int var4 = this.method24720() + 4;
      int var5 = this.method24721() + this.field32403 + 4;
      int var6 = this.method24719() - 8;
      byte var7 = 25;
      int var8 = -15781024;
      int var9 = -15626304;
      Class3192.method11432(var4, var5, var4 + var6, var5 + var7, var8, var9, var9, var8);
      byte var10 = 6;

      for (String var12 : this.field32400) {
         int var13 = ClientColors.LIGHT_GREYISH_BLUE.getColor;
         if (var12.startsWith("§7")) {
            var12 = var12.substring("§7".length());
            var13 = ClientColors.MID_GREY.getColor;
         }

         Class3192.method11439(
            this.field32394,
            (float)(7 + this.method24720()),
            (float)(this.method24721() + var10),
            var12,
            Class5628.method17688(var13, Math.min(1.0F, var1 * 1.7F))
         );
         var10 += 25;
      }
   }

   @Override
   public int method24719() {
      return Math.max(super.method24719(), this.field32401 + 14);
   }

   @Override
   public int method24725() {
      return this.field32400.size() * 25 + 8;
   }

   public void method24730() {
      this.field32402--;
      if (this.field32402 < 0) {
         this.field32402 = this.field32400.size() - 1;
      }
   }

   public void method24731() {
      this.field32402++;
      if (this.field32402 > this.field32400.size() - 1) {
         this.field32402 = 0;
      }
   }

   public boolean method24732() {
      return this.field32398.calcPercent() == 1.0F;
   }

   public int method24733() {
      float var3 = (float)(this.field32402 * 25);
      float var4 = Math.abs(var3 - (float)this.field32403);
      boolean var5 = var3 - (float)this.field32403 != var4;
      float var6 = 60.0F / (float) Minecraft.getFps();
      float var7 = Math.min(var4 * 0.8F, var4 * 0.3F * var6);
      if (var5) {
         var7 *= -1.0F;
      }

      if (var7 > 0.0F && var7 < 1.0F) {
         var7 = 1.0F;
      }

      if (var7 < 0.0F && var7 > -1.0F) {
         var7 = -1.0F;
      }

      return Math.round(var7);
   }
}
