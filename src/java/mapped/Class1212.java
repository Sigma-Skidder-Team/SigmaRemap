package mapped;

public class Class1212 extends Class1210 {
   public Class1212(int var1, int var2, int var3) {
      super(var1, var2, var3, 22, 20, "");
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      if (this.field6483) {
         super.method1923(var1, var2, var3, var4);
         ResourceLocation var7 = new ResourceLocation("optifine/textures/icons.png");
         Class7944.method26861().bindTexture(var7);
         Class7414.method23843(1.0F, 1.0F, 1.0F, 1.0F);
         this.method5696(var1, this.field6477 + 3, this.field6478 + 2, 0, 0, 16, 16);
      }
   }
}
