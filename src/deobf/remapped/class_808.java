package remapped;

public class class_808 extends class_1188 {
   private static String[] field_4309;
   private float field_4311;
   public boolean field_4312;
   private class_6843 field_4310 = null;

   public class_808(int var1, int var2, int var3, int var4, int var5, class_6843 var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.field_4311 = 1.0F;
      this.field_4310 = var6;
      this.field_4311 = var6.method_31404();
      this.method_27121(class_708.method_3265(var6, this.field_36671));
   }

   @Override
   public int method_32684(boolean var1) {
      return 0;
   }

   @Override
   public void method_32706(class_7966 var1, MinecraftClient var2, int var3, int var4) {
      if (this.field_36677) {
         if (this.field_4312 && !Screen.method_1190()) {
            this.field_4311 = (float)(var3 - (this.field_36670 + 4)) / (float)(this.field_36671 - 8);
            this.field_4311 = MathHelper.clamp(this.field_4311, 0.0F, 1.0F);
            this.field_4310.method_31393(this.field_4311);
            this.field_4311 = this.field_4310.method_31404();
            this.method_27121(class_708.method_3265(this.field_4310, this.field_36671));
         }

         var2.getTextureManager().bindTexture(field_36678);
         GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var7 = (!this.method_32703() ? 1 : 2) * 20;
         this.method_9781(var1, this.field_36670 + (int)(this.field_4311 * (float)(this.field_36671 - 8)), this.field_36674, 0, 46 + var7, 4, 20);
         this.method_9781(var1, this.field_36670 + (int)(this.field_4311 * (float)(this.field_36671 - 8)) + 4, this.field_36674, 196, 46 + var7, 4, 20);
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (!super.method_26940(var1, var3, var5)) {
         return false;
      } else {
         this.field_4311 = (float)(var1 - (double)(this.field_36670 + 4)) / (float)(this.field_36671 - 8);
         this.field_4311 = MathHelper.clamp(this.field_4311, 0.0F, 1.0F);
         this.field_4310.method_31393(this.field_4311);
         this.method_27121(class_708.method_3265(this.field_4310, this.field_36671));
         this.field_4312 = true;
         return true;
      }
   }

   @Override
   public boolean method_26941(double var1, double var3, int var5) {
      this.field_4312 = false;
      return true;
   }

   @Override
   public void method_5245() {
      this.field_4311 = this.field_4310.method_31404();
   }

   @Override
   public boolean method_5244() {
      return false;
   }
}
