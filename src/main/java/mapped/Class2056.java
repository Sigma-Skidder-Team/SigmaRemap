package mapped;

import net.minecraft.client.renderer.texture.NativeImage;

public class Class2056 implements Class2051 {
   private static String[] field13393;
   private final int field13394;
   private final int field13395;
   private final float field13396;
   private final float field13397;
   private final float field13398;
   private final int field13399;
   public final Class1769 field13400;

   public Class2056(Class1769 var1, int var2, int var3, int var4, int var5, float var6, float var7, int var8) {
      this.field13400 = var1;
      this.field13394 = var3 - var2;
      this.field13395 = var4 - var5;
      this.field13398 = var6 / Class1769.method7737(var1);
      this.field13396 = (var7 + (float)var2 + Class1769.method7738(var1)) / Class1769.method7737(var1);
      this.field13397 = (Class1769.method7739(var1) - (float)var4 + Class1769.method7740(var1)) / Class1769.method7737(var1);
      this.field13399 = var8;
   }

   @Override
   public int method8687() {
      return this.field13394;
   }

   @Override
   public int method8688() {
      return this.field13395;
   }

   @Override
   public float method8690() {
      return Class1769.method7737(this.field13400);
   }

   @Override
   public float method8689() {
      return this.field13398;
   }

   @Override
   public float method8700() {
      return this.field13396;
   }

   @Override
   public float method8698() {
      return this.field13397;
   }

   @Override
   public void method8691(int var1, int var2) {
      NativeImage var5 = new NativeImage(NativeImage.PixelFormat.field14629, this.field13394, this.field13395, false);
      var5.method7899(
         Class1769.method7741(this.field13400),
         this.field13399,
         this.field13394,
         this.field13395,
         Class1769.method7742(this.field13400),
         Class1769.method7742(this.field13400),
         Class1769.method7738(this.field13400),
         Class1769.method7740(this.field13400),
         0,
         0
      );
      var5.method7894(0, var1, var2, 0, 0, this.field13394, this.field13395, false, true);
   }

   @Override
   public boolean method8692() {
      return false;
   }
}
