package mapped;

public class Class1198 extends Class1197 {
   private static String[] field6487;
   private final Class2150 field6488;
   private boolean field6489;
   public final Class1318 field6490;

   public Class1198(Class1318 var1, Class2150 var2, int var3, int var4) {
      super(var3, var4, 25, 25, Class2150.method8863(var2));
      this.field6490 = var1;
      this.field6488 = var2;
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      Minecraft var7 = Minecraft.getInstance();
      this.method5749(var1, var7.getTextureManager());
      Class2150.method8864(this.field6488, this.field6490.field4563, this.field6477 + 5, this.field6478 + 5);
      if (this.field6489) {
         this.method5750(var1, var7.getTextureManager());
      }
   }

   @Override
   public boolean method5737() {
      return super.method5737() || this.field6489;
   }

   public void method5748(boolean var1) {
      this.field6489 = var1;
      this.method5730();
   }

   private void method5749(MatrixStack var1, TextureManager var2) {
      var2.bindTexture(Class1318.method6262());
      var1.push();
      var1.translate((double)this.field6477, (double)this.field6478, 0.0);
      method5699(var1, 0, 0, 0.0F, 75.0F, 25, 25, 128, 128);
      var1.method35295();
   }

   private void method5750(MatrixStack var1, TextureManager var2) {
      var2.bindTexture(Class1318.method6262());
      var1.push();
      var1.translate((double)this.field6477, (double)this.field6478, 0.0);
      method5699(var1, 0, 0, 25.0F, 75.0F, 25, 25, 128, 128);
      var1.method35295();
   }

   // $VF: synthetic method
   public static Class2150 method5751(Class1198 var0) {
      return var0.field6488;
   }
}
