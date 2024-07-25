package remapped;

public class class_3670 extends class_7038 {
   private static String[] field_17895;
   public float field_17892;
   public float field_17893;
   public float field_17898;
   public float field_17887;
   public float field_17889 = -9999.0F;
   public float field_17888 = -9999.0F;
   public float field_17894;
   public int field_17890 = 0;
   public int field_17896;
   public int field_17891;
   public int field_17897 = 114;

   public class_3670(class_7038 var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var5);
      this.field_17892 = this.field_17898 = (float)var6;
      this.field_17893 = this.field_17887 = (float)var7;
      this.field_17889 = (float)var3;
      this.field_17888 = (float)var4;
   }

   @Override
   public void method_32145(int var1, int var2) {
      if (this.field_17889 == -9999.0F || this.field_17888 == -9999.0F) {
         this.field_17889 = (float)this.field_36270;
         this.field_17888 = (float)this.field_36261;
      }

      this.field_17889 = this.field_17889 + this.field_17892 * ExitScreenMenu.field_32966;
      this.field_17888 = this.field_17888 + this.field_17893 * ExitScreenMenu.field_32966;
      this.field_36270 = Math.round(this.field_17889);
      this.field_36261 = Math.round(this.field_17888);
      if (!(this.field_17889 + (float)this.field_36278 < 0.0F)) {
         if (this.field_17889 > (float) MinecraftClient.getInstance().window.method_43166()) {
            this.field_17889 = (float)(0 - this.field_36278);
         }
      } else {
         this.field_17889 = (float) MinecraftClient.getInstance().window.method_43166();
      }

      if (!(this.field_17888 + (float)this.field_36257 < 0.0F)) {
         if (this.field_17888 > (float) MinecraftClient.getInstance().window.method_43163()) {
            this.field_17888 = (float)(0 - this.field_36257);
         }
      } else {
         this.field_17888 = (float) MinecraftClient.getInstance().window.method_43163();
      }

      float var5 = (float)(var1 - this.method_32155());
      float var6 = (float)(var2 - this.method_32093());
      this.field_17894 = (float)(1.0 - Math.sqrt((double)(var5 * var5 + var6 * var6)) / (double)this.field_17897);
      if (!(Math.sqrt((double)(var5 * var5 + var6 * var6)) < (double)this.field_17897)) {
         this.field_17892 = this.field_17892 - (this.field_17892 - this.field_17898) * 0.05F * ExitScreenMenu.field_32966;
         this.field_17893 = this.field_17893 - (this.field_17893 - this.field_17887) * 0.05F * ExitScreenMenu.field_32966;
      } else {
         float var7 = this.field_17889 - (float)var1;
         float var8 = this.field_17888 - (float)var2;
         float var9 = (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
         float var10 = var9 / 2.0F;
         float var11 = var7 / var10;
         float var12 = var8 / var10;
         this.field_17892 = this.field_17892 + var11 / (1.0F + this.field_17894) * ExitScreenMenu.field_32966;
         this.field_17893 = this.field_17893 + var12 / (1.0F + this.field_17894) * ExitScreenMenu.field_32966;
      }

      this.field_17896 = var1;
      this.field_17891 = var2;
   }

   @Override
   public void method_32178(float var1) {
      float var4 = 0.07F;
      float var5 = 0.3F;
      class_73.method_124(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)this.method_32109(),
         class_314.method_1444(class_1255.field_6918.field_6917, 0.07F + (!(this.field_17894 > 0.0F) ? 0.0F : this.field_17894 * 0.3F))
      );
      float var6 = (float)(this.field_17896 - this.method_32155());
      float var7 = (float)(this.field_17891 - this.method_32093());
      super.method_32178(var1);
   }
}
