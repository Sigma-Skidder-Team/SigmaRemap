package mapped;

import lol.Renderer;
import lol.SGL;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class Color implements Serializable {
   private static final long field16439 = 1393939L;
   public transient SGL field16440 = Renderer.get();
   public static final Color field16441 = new Color(0.0F, 0.0F, 0.0F, 0.0F);
   public static final Color field16442 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
   public static final Color field16443 = new Color(1.0F, 1.0F, 0.0F, 1.0F);
   public static final Color field16444 = new Color(1.0F, 0.0F, 0.0F, 1.0F);
   public static final Color field16445 = new Color(0.0F, 0.0F, 1.0F, 1.0F);
   public static final Color field16446 = new Color(0.0F, 1.0F, 0.0F, 1.0F);
   public static final Color field16447 = new Color(0.0F, 0.0F, 0.0F, 1.0F);
   public static final Color field16448 = new Color(0.5F, 0.5F, 0.5F, 1.0F);
   public static final Color field16449 = new Color(0.0F, 1.0F, 1.0F, 1.0F);
   public static final Color field16450 = new Color(0.3F, 0.3F, 0.3F, 1.0F);
   public static final Color field16451 = new Color(0.7F, 0.7F, 0.7F, 1.0F);
   public static final Color field16452 = new Color(255, 175, 175, 255);
   public static final Color field16453 = new Color(255, 200, 0, 255);
   public static final Color field16454 = new Color(255, 0, 255, 255);
   public float r;
   public float g;
   public float b;
   public float a = 1.0F;

   public Color(Color var1) {
      this.r = var1.r;
      this.g = var1.g;
      this.b = var1.b;
      this.a = var1.a;
   }

   public Color(FloatBuffer var1) {
      this.r = var1.get();
      this.g = var1.get();
      this.b = var1.get();
      this.a = var1.get();
   }

   public Color(float var1, float var2, float var3) {
      this.r = var1;
      this.g = var2;
      this.b = var3;
      this.a = 1.0F;
   }

   public Color(float var1, float var2, float var3, float var4) {
      this.r = Math.min(var1, 1.0F);
      this.g = Math.min(var2, 1.0F);
      this.b = Math.min(var3, 1.0F);
      this.a = Math.min(var4, 1.0F);
   }

   public Color(int var1, int var2, int var3) {
      this.r = (float)var1 / 255.0F;
      this.g = (float)var2 / 255.0F;
      this.b = (float)var3 / 255.0F;
      this.a = 1.0F;
   }

   public Color(int var1, int var2, int var3, int var4) {
      this.r = (float)var1 / 255.0F;
      this.g = (float)var2 / 255.0F;
      this.b = (float)var3 / 255.0F;
      this.a = (float)var4 / 255.0F;
   }

   public Color(int var1) {
      int var4 = (var1 & 0xFF0000) >> 16;
      int var5 = (var1 & 0xFF00) >> 8;
      int var6 = var1 & 0xFF;
      int var7 = (var1 & 0xFF000000) >> 24;
      if (var7 < 0) {
         var7 += 256;
      }

      if (var7 == 0) {
         var7 = 255;
      }

      this.r = (float)var4 / 255.0F;
      this.g = (float)var5 / 255.0F;
      this.b = (float)var6 / 255.0F;
      this.a = (float)var7 / 255.0F;
   }

   public static Color method10391(String var0) {
      return new Color(Integer.decode(var0));
   }

   public void method10392() {
      this.field16440.method18376(this.r, this.g, this.b, this.a);
   }

   @Override
   public int hashCode() {
      return (int)(this.r + this.g + this.b + this.a) * 255;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Color)) {
         return false;
      } else {
         Color var4 = (Color)var1;
         return var4.r == this.r
            && var4.g == this.g
            && var4.b == this.b
            && var4.a == this.a;
      }
   }

   @Override
   public String toString() {
      return "Color (" + this.r + "," + this.g + "," + this.b + "," + this.a + ")";
   }

   public Color method10393() {
      return this.method10394(0.5F);
   }

   public Color method10394(float var1) {
      var1 = 1.0F - var1;
      return new Color(this.r * var1, this.g * var1, this.b * var1, this.a);
   }

   public Color method10395() {
      return this.method10404(0.2F);
   }

   public int method10396() {
      return (int)(this.r * 255.0F);
   }

   public int method10397() {
      return (int)(this.g * 255.0F);
   }

   public int method10398() {
      return (int)(this.b * 255.0F);
   }

   public int method10399() {
      return (int)(this.a * 255.0F);
   }

   public int method10400() {
      return (int)(this.r * 255.0F);
   }

   public int method10401() {
      return (int)(this.g * 255.0F);
   }

   public int method10402() {
      return (int)(this.b * 255.0F);
   }

   public int method10403() {
      return (int)(this.a * 255.0F);
   }

   public Color method10404(float var1) {
      return new Color(this.r * ++var1, this.g * var1, this.b * var1, this.a);
   }

   public Color method10405(Color var1) {
      return new Color(
         this.r * var1.r, this.g * var1.g, this.b * var1.b, this.a * var1.a
      );
   }

   public void method10406(Color var1) {
      this.r = this.r + var1.r;
      this.g = this.g + var1.g;
      this.b = this.b + var1.b;
      this.a = this.a + var1.a;
   }

   public void method10407(float var1) {
      this.r *= var1;
      this.g *= var1;
      this.b *= var1;
      this.a *= var1;
   }

   public Color method10408(Color var1) {
      Color var4 = new Color(this.r, this.g, this.b, this.a);
      var4.r = var4.r + var1.r;
      var4.g = var4.g + var1.g;
      var4.b = var4.b + var1.b;
      var4.a = var4.a + var1.a;
      return var4;
   }

   public Color method10409(float var1) {
      Color var4 = new Color(this.r, this.g, this.b, this.a);
      var4.r *= var1;
      var4.g *= var1;
      var4.b *= var1;
      var4.a *= var1;
      return var4;
   }
}
