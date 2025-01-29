package mapped;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import lol.*;
import org.lwjgl.BufferUtils;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.ImageDataFactory;
import org.newdawn.slick.opengl.LoadableImageData;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;


public class Class7390 extends Image {
   public static SGL field31643 = Renderer.get();
   private static Image field31644;
   private Image[][] field31645;
   private int field31646;
   private int field31647;
   private int field31648;
   private int field31649;

   public static final int method23602() {
      IntBuffer var2 = BufferUtils.createIntBuffer(16);
      field31643.glGetInteger(3379, var2);
      return var2.get(0);
   }

   private Class7390() {
      this.field31619 = true;
   }

   public Class7390(String var1) throws Class2451 {
      this(var1, 2);
   }

   public Class7390(String var1, int var2) throws Class2451 {
      this.method23604(var1, var2, method23602());
   }

   public Class7390(String var1, int var2, int var3) throws Class2451 {
      this.method23604(var1, var2, var3);
   }

   public Class7390(LoadableImageData var1, ByteBuffer var2, int var3) {
      this.method23605(var1, var2, var3, method23602());
   }

   public Class7390(LoadableImageData var1, ByteBuffer var2, int var3, int var4) {
      this.method23605(var1, var2, var3, var4);
   }

   public Image method23603(int var1, int var2) {
      return this.field31645[var1][var2];
   }

   private void method23604(String var1, int var2, int var3) throws Class2451 {
      try {
         LoadableImageData var6 = ImageDataFactory.getImageDataFor(var1);
         ByteBuffer var7 = var6.loadImage(ResourceLoader.getResourceAsStream(var1), false, null);
         this.method23605(var6, var7, var2, var3);
      } catch (IOException var8) {
         throw new Class2451("Failed to load: " + var1, var8);
      }
   }

   private void method23605(LoadableImageData var1, ByteBuffer var2, int var3, int var4) {
      int var7 = var1.getTexWidth();
      int var8 = var1.getTexHeight();
      this.field31648 = this.field31610 = var1.getWidth();
      this.field31649 = this.field31611 = var1.getHeight();
      if (var7 <= var4 && var8 <= var4) {
         this.field31645 = new Image[1][1];
         Class6953 var23 = new Class6953(this, var1, var8, var2, var7);
         this.field31645[0][0] = new Image(var23, var3);
         this.field31646 = 1;
         this.field31647 = 1;
         this.field31619 = true;
      } else {
         this.field31646 = (this.field31648 - 1) / var4 + 1;
         this.field31647 = (this.field31649 - 1) / var4 + 1;
         this.field31645 = new Image[this.field31646][this.field31647];
         int var9 = var1.getDepth() / 8;

         for (int var10 = 0; var10 < this.field31646; var10++) {
            for (int var11 = 0; var11 < this.field31647; var11++) {
               int var12 = (var10 + 1) * var4;
               int var13 = (var11 + 1) * var4;
               int var14 = Math.min(this.field31648 - var10 * var4, var4);
               int var15 = Math.min(this.field31649 - var11 * var4, var4);
               int var16 = var4;
               int var17 = var4;
               ByteBuffer var18 = BufferUtils.createByteBuffer(var4 * var4 * var9);
               int var19 = var10 * var4 * var9;
               byte[] var20 = new byte[var4 * var9];

               for (int var21 = 0; var21 < var17; var21++) {
                  int var22 = (var11 * var4 + var21) * var7 * var9;
                  ((Buffer)var2).position(var22 + var19);
                  var2.get(var20, 0, var16 * var9);
                  var18.put(var20);
               }

               ((Buffer)var18).flip();
               Class6956 var24 = new Class6956(this, var1, var15, var14, var18, var17, var16);
               this.field31645[var10][var11] = new Image(var24, var3);
            }
         }

         this.field31619 = true;
      }
   }

   @Override
   public void method23522() {
      throw new Class2477("Can't bind big images yet");
   }

   @Override
   public Image method23560() {
      throw new Class2477("Can't copy big images yet");
   }

   @Override
   public void method23525() {
      this.method23527(0.0F, 0.0F);
   }

   @Override
   public void method23528(float var1, float var2, Color var3) {
      this.method23539(var1, var2, (float)this.field31610, (float)this.field31611, var3);
   }

   @Override
   public void method23535(float var1, float var2, float var3, Color var4) {
      this.method23539(var1, var2, (float)this.field31610 * var3, (float)this.field31611 * var3, var4);
   }

   @Override
   public void method23539(float var1, float var2, float var3, float var4, Color var5) {
      float var8 = var3 / (float)this.field31648;
      float var9 = var4 / (float)this.field31649;
      field31643.glTranslatef(var1, var2, 0.0F);
      field31643.glScalef(var8, var9, 1.0F);
      float var10 = 0.0F;
      float var11 = 0.0F;

      for (int var12 = 0; var12 < this.field31646; var12++) {
         var11 = 0.0F;

         for (int var13 = 0; var13 < this.field31647; var13++) {
            Image var14 = this.field31645[var12][var13];
            var14.method23539(var10, var11, (float)var14.method23558(), (float)var14.method23559(), var5);
            var11 += (float)var14.method23559();
            if (var13 == this.field31647 - 1) {
               var10 += (float)var14.method23558();
            }
         }
      }

      field31643.glScalef(1.0F / var8, 1.0F / var9, 1.0F);
      field31643.glTranslatef(-var1, -var2, 0.0F);
   }

   @Override
   public void method23553(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var11 = (int)(var7 - var5);
      int var12 = (int)(var8 - var6);
      Image var13 = this.method23551((int)var5, (int)var6, var11, var12);
      int var14 = (int)(var3 - var1);
      int var15 = (int)(var4 - var2);
      var13.method23536(var1, var2, (float)var14, (float)var15);
   }

   @Override
   public void method23552(float var1, float var2, float var3, float var4, float var5, float var6) {
      int var9 = (int)(var5 - var3);
      int var10 = (int)(var6 - var4);
      this.method23553(var1, var2, (float)var9, (float)var10, var3, var4, var5, var6);
   }

   @Override
   public void method23536(float var1, float var2, float var3, float var4) {
      this.method23539(var1, var2, var3, var4, Color.field16442);
   }

   @Override
   public void method23534(float var1, float var2, float var3) {
      this.method23535(var1, var2, var3, Color.field16442);
   }

   @Override
   public void method23527(float var1, float var2) {
      this.method23528(var1, var2, Color.field16442);
   }

   @Override
   public void method23529(float var1, float var2, float var3, float var4) {
      float var7 = var3 / (float)this.field31648;
      float var8 = var4 / (float)this.field31649;
      float var9 = 0.0F;
      float var10 = 0.0F;

      for (int var11 = 0; var11 < this.field31646; var11++) {
         var10 = 0.0F;

         for (int var12 = 0; var12 < this.field31647; var12++) {
            Image var13 = this.field31645[var11][var12];
            if (field31644 == null || var13.method23565() != field31644.method23565()) {
               if (field31644 != null) {
                  field31644.method23508();
               }

               field31644 = var13;
               field31644.method23509();
            }

            var13.method23529(var9 + var1, var10 + var2, (float)var13.method23558(), (float)var13.method23559());
            var10 += (float)var13.method23559();
            if (var12 == this.field31647 - 1) {
               var9 += (float)var13.method23558();
            }
         }
      }
   }

   @Override
   public void method23540(float var1, float var2, float var3, float var4) {
      float var7 = var3 / (float)this.field31648;
      float var8 = var4 / (float)this.field31649;
      field31643.glTranslatef(var1, var2, 0.0F);
      field31643.glScalef(var7, var8, 1.0F);
      float var9 = 0.0F;
      float var10 = 0.0F;

      for (int var11 = 0; var11 < this.field31646; var11++) {
         var10 = 0.0F;

         for (int var12 = 0; var12 < this.field31647; var12++) {
            Image var13 = this.field31645[var11][var12];
            var13.method23540(var9, var10, (float)var13.method23558(), (float)var13.method23559());
            var10 += (float)var13.method23559();
            if (var12 == this.field31647 - 1) {
               var9 += (float)var13.method23558();
            }
         }
      }

      field31643.glScalef(1.0F / var7, 1.0F / var8, 1.0F);
      field31643.glTranslatef(-var1, -var2, 0.0F);
   }

   @Override
   public void method23545(float var1, float var2) {
      this.method23540(var1, var2, (float)this.field31610, (float)this.field31611);
   }

   @Override
   public void method23508() {
      if (field31644 != null) {
         field31644.method23508();
      }

      field31644 = null;
   }

   @Override
   public void method23509() {
   }

   @Override
   public void method23563() {
      throw new Class2477("Doesn't make sense for tiled operations");
   }

   @Override
   public Color method23567(int var1, int var2) {
      throw new Class2477("Can't use big images as buffers");
   }

   @Override
   public Image method23564(boolean var1, boolean var2) {
      Class7390 var5 = new Class7390();
      var5.field31645 = this.field31645;
      var5.field31646 = this.field31646;
      var5.field31647 = this.field31647;
      var5.field31610 = this.field31610;
      var5.field31611 = this.field31611;
      var5.field31648 = this.field31648;
      var5.field31649 = this.field31649;
      if (var1) {
         Image[][] var6 = var5.field31645;
         var5.field31645 = new Image[this.field31646][this.field31647];

         for (int var7 = 0; var7 < this.field31646; var7++) {
            for (int var8 = 0; var8 < this.field31647; var8++) {
               var5.field31645[var7][var8] = var6[this.field31646 - 1 - var7][var8].method23564(true, false);
            }
         }
      }

      if (var2) {
         Image[][] var9 = var5.field31645;
         var5.field31645 = new Image[this.field31646][this.field31647];

         for (int var10 = 0; var10 < this.field31646; var10++) {
            for (int var11 = 0; var11 < this.field31647; var11++) {
               var5.field31645[var10][var11] = var9[var10][this.field31647 - 1 - var11].method23564(false, true);
            }
         }
      }

      return var5;
   }

   public Class9219 method23606() throws Class2451 {
      throw new Class2477("Can't use big images as offscreen buffers");
   }

   @Override
   public Image method23561(float var1) {
      return this.method23562((int)(var1 * (float)this.field31610), (int)(var1 * (float)this.field31611));
   }

   @Override
   public Image method23562(int var1, int var2) {
      Class7390 var5 = new Class7390();
      var5.field31645 = this.field31645;
      var5.field31646 = this.field31646;
      var5.field31647 = this.field31647;
      var5.field31610 = var1;
      var5.field31611 = var2;
      var5.field31648 = this.field31648;
      var5.field31649 = this.field31649;
      return var5;
   }

   @Override
   public Image method23551(int var1, int var2, int var3, int var4) {
      Class7390 var7 = new Class7390();
      var7.field31610 = var3;
      var7.field31611 = var4;
      var7.field31648 = var3;
      var7.field31649 = var4;
      var7.field31645 = new Image[this.field31646][this.field31647];
      float var8 = 0.0F;
      float var9 = 0.0F;
      int var10 = var1 + var3;
      int var11 = var2 + var4;
      int var12 = 0;
      int var13 = 0;
      boolean var14 = false;

      for (int var15 = 0; var15 < this.field31646; var15++) {
         var9 = 0.0F;
         var13 = 0;
         var14 = false;

         for (int var16 = 0; var16 < this.field31647; var16++) {
            Image var17 = this.field31645[var15][var16];
            int var18 = (int)(var8 + (float)var17.method23558());
            int var19 = (int)(var9 + (float)var17.method23559());
            int var20 = (int)Math.max((float)var1, var8);
            int var21 = (int)Math.max((float)var2, var9);
            int var22 = Math.min(var10, var18);
            int var23 = Math.min(var11, var19);
            int var24 = var22 - var20;
            int var25 = var23 - var21;
            if (var24 > 0 && var25 > 0) {
               Image var26 = var17.method23551((int)((float)var20 - var8), (int)((float)var21 - var9), var22 - var20, var23 - var21);
               var14 = true;
               var7.field31645[var12][var13] = var26;
               var7.field31647 = Math.max(var7.field31647, ++var13);
            }

            var9 += (float)var17.method23559();
            if (var16 == this.field31647 - 1) {
               var8 += (float)var17.method23558();
            }
         }

         if (var14) {
            var12++;
            var7.field31646++;
         }
      }

      return var7;
   }

   @Override
   public Texture method23565() {
      throw new Class2477("Can't use big images as offscreen buffers");
   }

   @Override
   public void method23502() {
      throw new Class2477("Can't use big images as offscreen buffers");
   }

   @Override
   public void method23523() {
      throw new Class2477("Can't use big images as offscreen buffers");
   }

   @Override
   public void method23510(Texture var1) {
      throw new Class2477("Can't use big images as offscreen buffers");
   }

   public Image method23503(int var1, int var2) {
      return this.field31645[var1][var2];
   }

   public int method23607() {
      return this.field31646;
   }

   public int method23608() {
      return this.field31647;
   }

   @Override
   public String toString() {
      return "[BIG IMAGE]";
   }

   @Override
   public void method23569() throws Class2451 {
      for (int var3 = 0; var3 < this.field31646; var3++) {
         for (int var4 = 0; var4 < this.field31647; var4++) {
            Image var5 = this.field31645[var3][var4];
            var5.method23569();
         }
      }
   }

   @Override
   public void method23554(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, Color var9) {
      int var12 = (int)(var7 - var5);
      int var13 = (int)(var8 - var6);
      Image var14 = this.method23551((int)var5, (int)var6, var12, var13);
      int var15 = (int)(var3 - var1);
      int var16 = (int)(var4 - var2);
      var14.method23539(var1, var2, (float)var15, (float)var16, var9);
   }

   @Override
   public void method23526(float var1, float var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void method23556(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, Color var9) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void method23555(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void method23544(float var1, float var2, float var3, float var4, Color var5) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void method23537(float var1, float var2, float var3, float var4) {
      throw new UnsupportedOperationException();
   }
}
