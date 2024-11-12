package org.newdawn.slick;

import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class Color implements Serializable {
   private static final long serialVersionUID = 1393939L;
   public transient SGL GL = Renderer.get();
   public static final Color transparent = new Color(0.0F, 0.0F, 0.0F, 0.0F);
   public static final Color white = new Color(1.0F, 1.0F, 1.0F, 1.0F);
   public static final Color yellow = new Color(1.0F, 1.0F, 0.0F, 1.0F);
   public static final Color red = new Color(1.0F, 0.0F, 0.0F, 1.0F);
   public static final Color blue = new Color(0.0F, 0.0F, 1.0F, 1.0F);
   public static final Color green = new Color(0.0F, 1.0F, 0.0F, 1.0F);
   public static final Color black = new Color(0.0F, 0.0F, 0.0F, 1.0F);
   public static final Color gray = new Color(0.5F, 0.5F, 0.5F, 1.0F);
   public static final Color cyan = new Color(0.0F, 1.0F, 1.0F, 1.0F);
   public static final Color darkGray = new Color(0.3F, 0.3F, 0.3F, 1.0F);
   public static final Color lightGray = new Color(0.7F, 0.7F, 0.7F, 1.0F);
   public static final Color pink = new Color(255, 175, 175, 255);
   public static final Color orange = new Color(255, 200, 0, 255);
   public static final Color magenta = new Color(255, 0, 255, 255);
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

   public void bind() {
      this.GL.glColor4f(this.r, this.g, this.b, this.a);
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

   public Color darker() {
      return this.darker(0.5F);
   }

   public Color darker(float var1) {
      var1 = 1.0F - var1;
      return new Color(this.r * var1, this.g * var1, this.b * var1, this.a);
   }

   public Color brighter() {
      return this.brighter(0.2F);
   }

   public int getRed() {
      return (int)(this.r * 255.0F);
   }

   public int getGreen() {
      return (int)(this.g * 255.0F);
   }

   public int getBlue() {
      return (int)(this.b * 255.0F);
   }

   public int getAlpha() {
      return (int)(this.a * 255.0F);
   }

   public int getRedByte() {
      return (int)(this.r * 255.0F);
   }

   public int getGreenByte() {
      return (int)(this.g * 255.0F);
   }

   public int getBlueByte() {
      return (int)(this.b * 255.0F);
   }

   public int getAlphaByte() {
      return (int)(this.a * 255.0F);
   }

   public Color brighter(float var1) {
      return new Color(this.r * ++var1, this.g * var1, this.b * var1, this.a);
   }

   public Color multiply(Color var1) {
      return new Color(
         this.r * var1.r, this.g * var1.g, this.b * var1.b, this.a * var1.a
      );
   }

   public void add(Color var1) {
      this.r = this.r + var1.r;
      this.g = this.g + var1.g;
      this.b = this.b + var1.b;
      this.a = this.a + var1.a;
   }

   public void scale(float var1) {
      this.r *= var1;
      this.g *= var1;
      this.b *= var1;
      this.a *= var1;
   }

   public Color addToCopy(Color var1) {
      Color var4 = new Color(this.r, this.g, this.b, this.a);
      var4.r = var4.r + var1.r;
      var4.g = var4.g + var1.g;
      var4.b = var4.b + var1.b;
      var4.a = var4.a + var1.a;
      return var4;
   }

   public Color scaleCopy(float var1) {
      Color var4 = new Color(this.r, this.g, this.b, this.a);
      var4.r *= var1;
      var4.g *= var1;
      var4.b *= var1;
      var4.a *= var1;
      return var4;
   }
}
