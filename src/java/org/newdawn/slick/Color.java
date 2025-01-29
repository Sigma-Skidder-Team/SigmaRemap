package org.newdawn.slick;

import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

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
   public float field16455;
   public float field16456;
   public float field16457;
   public float field16458 = 1.0F;

   public Color(Color var1) {
      this.field16455 = var1.field16455;
      this.field16456 = var1.field16456;
      this.field16457 = var1.field16457;
      this.field16458 = var1.field16458;
   }

   public Color(FloatBuffer var1) {
      this.field16455 = var1.get();
      this.field16456 = var1.get();
      this.field16457 = var1.get();
      this.field16458 = var1.get();
   }

   public Color(float var1, float var2, float var3) {
      this.field16455 = var1;
      this.field16456 = var2;
      this.field16457 = var3;
      this.field16458 = 1.0F;
   }

   public Color(float var1, float var2, float var3, float var4) {
      this.field16455 = Math.min(var1, 1.0F);
      this.field16456 = Math.min(var2, 1.0F);
      this.field16457 = Math.min(var3, 1.0F);
      this.field16458 = Math.min(var4, 1.0F);
   }

   public Color(int var1, int var2, int var3) {
      this.field16455 = (float)var1 / 255.0F;
      this.field16456 = (float)var2 / 255.0F;
      this.field16457 = (float)var3 / 255.0F;
      this.field16458 = 1.0F;
   }

   public Color(int var1, int var2, int var3, int var4) {
      this.field16455 = (float)var1 / 255.0F;
      this.field16456 = (float)var2 / 255.0F;
      this.field16457 = (float)var3 / 255.0F;
      this.field16458 = (float)var4 / 255.0F;
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

      this.field16455 = (float)var4 / 255.0F;
      this.field16456 = (float)var5 / 255.0F;
      this.field16457 = (float)var6 / 255.0F;
      this.field16458 = (float)var7 / 255.0F;
   }

   public static Color method10391(String var0) {
      return new Color(Integer.decode(var0));
   }

   public void bind() {
      this.field16440.glColor4f(this.field16455, this.field16456, this.field16457, this.field16458);
   }

   @Override
   public int hashCode() {
      return (int)(this.field16455 + this.field16456 + this.field16457 + this.field16458) * 255;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Color)) {
         return false;
      } else {
         Color var4 = (Color)var1;
         return var4.field16455 == this.field16455
            && var4.field16456 == this.field16456
            && var4.field16457 == this.field16457
            && var4.field16458 == this.field16458;
      }
   }

   @Override
   public String toString() {
      return "Color (" + this.field16455 + "," + this.field16456 + "," + this.field16457 + "," + this.field16458 + ")";
   }

   public Color method10393() {
      return this.method10394(0.5F);
   }

   public Color method10394(float var1) {
      var1 = 1.0F - var1;
      return new Color(this.field16455 * var1, this.field16456 * var1, this.field16457 * var1, this.field16458);
   }

   public Color method10395() {
      return this.method10404(0.2F);
   }

   public int method10396() {
      return (int)(this.field16455 * 255.0F);
   }

   public int method10397() {
      return (int)(this.field16456 * 255.0F);
   }

   public int method10398() {
      return (int)(this.field16457 * 255.0F);
   }

   public int method10399() {
      return (int)(this.field16458 * 255.0F);
   }

   public int method10400() {
      return (int)(this.field16455 * 255.0F);
   }

   public int method10401() {
      return (int)(this.field16456 * 255.0F);
   }

   public int method10402() {
      return (int)(this.field16457 * 255.0F);
   }

   public int method10403() {
      return (int)(this.field16458 * 255.0F);
   }

   public Color method10404(float var1) {
      return new Color(this.field16455 * ++var1, this.field16456 * var1, this.field16457 * var1, this.field16458);
   }

   public Color method10405(Color var1) {
      return new Color(
         this.field16455 * var1.field16455, this.field16456 * var1.field16456, this.field16457 * var1.field16457, this.field16458 * var1.field16458
      );
   }

   public void method10406(Color var1) {
      this.field16455 = this.field16455 + var1.field16455;
      this.field16456 = this.field16456 + var1.field16456;
      this.field16457 = this.field16457 + var1.field16457;
      this.field16458 = this.field16458 + var1.field16458;
   }

   public void method10407(float var1) {
      this.field16455 *= var1;
      this.field16456 *= var1;
      this.field16457 *= var1;
      this.field16458 *= var1;
   }

   public Color method10408(Color var1) {
      Color var4 = new Color(this.field16455, this.field16456, this.field16457, this.field16458);
      var4.field16455 = var4.field16455 + var1.field16455;
      var4.field16456 = var4.field16456 + var1.field16456;
      var4.field16457 = var4.field16457 + var1.field16457;
      var4.field16458 = var4.field16458 + var1.field16458;
      return var4;
   }

   public Color method10409(float var1) {
      Color var4 = new Color(this.field16455, this.field16456, this.field16457, this.field16458);
      var4.field16455 *= var1;
      var4.field16456 *= var1;
      var4.field16457 *= var1;
      var4.field16458 *= var1;
      return var4;
   }
}
