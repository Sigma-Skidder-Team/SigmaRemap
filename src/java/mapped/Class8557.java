package mapped;

import net.minecraft.util.Direction;

public class Class8557 {
   public int[] field38456;
   public final int field38457;
   public Direction field38458;
   public TextureAtlasSprite field38459;
   private final boolean field38460;
   private int[] field38461 = null;
   private Class9190 field38462;
   private boolean field38463;
   private Class8557 field38464;

   public Class8557(int[] var1, int var2, Direction var3, TextureAtlasSprite var4, boolean var5) {
      this.field38456 = var1;
      this.field38457 = var2;
      this.field38458 = var3;
      this.field38459 = var4;
      this.field38460 = var5;
      this.method30522();
   }

   public int[] method30511() {
      this.method30522();
      return this.field38456;
   }

   public boolean method30512() {
      return this.field38457 != -1;
   }

   public int method30513() {
      return this.field38457;
   }

   public Direction method30514() {
      if (this.field38458 == null) {
         this.field38458 = Class9155.method34184(this.method30511());
      }

      return this.field38458;
   }

   public boolean method30515() {
      return this.field38460;
   }

   public TextureAtlasSprite method30516() {
      if (this.field38459 == null) {
         this.field38459 = method30521(this.method30511());
      }

      return this.field38459;
   }

   public int[] method30517() {
      if (this.field38461 == null) {
         this.field38461 = method30518(this.method30511(), this.method30516());
      }

      return this.field38461;
   }

   private static int[] method30518(int[] var0, TextureAtlasSprite var1) {
      int[] var4 = (int[])var0.clone();
      int var5 = var4.length / 4;

      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = var6 * var5;
         float var8 = Float.intBitsToFloat(var4[var7 + 4]);
         float var9 = Float.intBitsToFloat(var4[var7 + 4 + 1]);
         float var10 = var1.method7486(var8);
         float var11 = var1.method7487(var9);
         var4[var7 + 4] = Float.floatToRawIntBits(var10);
         var4[var7 + 4 + 1] = Float.floatToRawIntBits(var11);
      }

      return var4;
   }

   public void method30519(Class8462 var1) {
      Class9299.method35055(Class9299.field42963, var1, this);
   }

   public TextureAtlasSprite method30520() {
      return this.field38459;
   }

   private static TextureAtlasSprite method30521(int[] var0) {
      float var3 = 1.0F;
      float var4 = 1.0F;
      float var5 = 0.0F;
      float var6 = 0.0F;
      int var7 = var0.length / 4;

      for (int var8 = 0; var8 < 4; var8++) {
         int var9 = var8 * var7;
         float var10 = Float.intBitsToFloat(var0[var9 + 4]);
         float var11 = Float.intBitsToFloat(var0[var9 + 4 + 1]);
         var3 = Math.min(var3, var10);
         var4 = Math.min(var4, var11);
         var5 = Math.max(var5, var10);
         var6 = Math.max(var6, var11);
      }

      float var12 = (var3 + var5) / 2.0F;
      float var13 = (var4 + var6) / 2.0F;
      return Class7944.method26969().method1116((double)var12, (double)var13);
   }

   public void method30522() {
      if (!Class7944.method26921()) {
         if (this.field38456.length == DefaultVertexFormats.field43339) {
            this.field38456 = method30524(this.field38456);
         }
      } else if (this.field38456.length == DefaultVertexFormats.field43338) {
         this.field38456 = method30523(this.field38456);
      }
   }

   private static int[] method30523(int[] var0) {
      int var3 = var0.length / 4;
      int var4 = var3 * 2;
      int[] var5 = new int[var4 * 4];

      for (int var6 = 0; var6 < 4; var6++) {
         System.arraycopy(var0, var6 * var3, var5, var6 * var4, var3);
      }

      return var5;
   }

   private static int[] method30524(int[] var0) {
      int var3 = var0.length / 4;
      int var4 = var3 / 2;
      int[] var5 = new int[var4 * 4];

      for (int var6 = 0; var6 < 4; var6++) {
         System.arraycopy(var0, var6 * var3, var5, var6 * var4, var4);
      }

      return var5;
   }

   public Class9190 method30525() {
      if (this.field38462 == null) {
         this.field38462 = new Class9190(this.method30511());
      }

      return this.field38462;
   }

   public float method30526() {
      Class9190 var3 = this.method30525();
      return (var3.method34408() + var3.method34405()) / 2.0F;
   }

   public double method30527() {
      Class9190 var3 = this.method30525();
      return (double)((var3.method34409() + var3.method34406()) / 2.0F);
   }

   public double method30528() {
      Class9190 var3 = this.method30525();
      return (double)((var3.method34410() + var3.method34407()) / 2.0F);
   }

   public boolean method30529() {
      Class9190 var3 = this.method30525();
      return var3.method34411(this.field38458);
   }

   public boolean method30530() {
      Class9190 var3 = this.method30525();
      return var3.method34412(this.field38458);
   }

   public boolean method30531() {
      return this.method30530() && this.method30529();
   }

   public Class8557 method30532() {
      if (!this.field38463) {
         if (this.field38464 == null && this.field38459 != null && this.field38459.field9352 != null) {
            this.field38464 = new Class8558(this, this.field38459.field9352);
         }

         this.field38463 = true;
         return this.field38464;
      } else {
         return this.field38464;
      }
   }

   @Override
   public String toString() {
      return "vertexData: " + this.field38456.length + ", tint: " + this.field38457 + ", facing: " + this.field38458 + ", sprite: " + this.field38459;
   }
}
