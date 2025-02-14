package mapped;

import net.minecraft.client.renderer.texture.NativeImage;

public final class Class2055 implements Class2051 {
   private static String[] field13383;
   private final float field13384;
   private final NativeImage field13385;
   private final int field13386;
   private final int field13387;
   private final int field13388;
   private final int field13389;
   private final int field13390;
   private final int field13391;
   private float field13392 = 1.0F;

   public Class2055(float var1, NativeImage var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.field13384 = var1;
      this.field13385 = var2;
      this.field13386 = var3;
      this.field13387 = var4;
      this.field13388 = var5;
      this.field13389 = var6;
      this.field13390 = var7;
      this.field13391 = var8;
   }

   @Override
   public float method8690() {
      return 1.0F / this.field13384;
   }

   @Override
   public int method8687() {
      return this.field13388;
   }

   @Override
   public int method8688() {
      return this.field13389;
   }

   @Override
   public float method8689() {
      return (float)this.field13390;
   }

   @Override
   public float method8698() {
      return Class2051.super.method8698() + 7.0F - (float)this.field13391;
   }

   @Override
   public void method8691(int var1, int var2) {
      this.field13385.method7894(0, var1, var2, this.field13386, this.field13387, this.field13388, this.field13389, false, false);
   }

   @Override
   public boolean method8692() {
      return this.field13385.method7888().getPixelSize() > 1;
   }

   @Override
   public float method8701() {
      return this.field13392;
   }

   // $VF: synthetic method
   public static float method8704(Class2055 var0, float var1) {
      return var0.field13392 = var1;
   }
}
