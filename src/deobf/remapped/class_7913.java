package remapped;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.newdawn.slick.SlickException;

public class class_7913 extends class_8112 {
   public static class_1299 field_40448 = class_3980.method_18363();
   private static class_8112 field_40442;
   private class_8112[][] field_40446;
   private int field_40445;
   private int field_40447;
   private int field_40449;
   private int field_40444;

   public static final int method_35801() {
      IntBuffer var2 = BufferUtils.createIntBuffer(16);
      field_40448.method_5932(3379, var2);
      return var2.get(0);
   }

   private class_7913() {
      this.field_41562 = true;
   }

   public class_7913(String var1) throws SlickException {
      this(var1, 2);
   }

   public class_7913(String var1, int var2) throws SlickException {
      this.method_35796(var1, var2, method_35801());
   }

   public class_7913(String var1, int var2, int var3) throws SlickException {
      this.method_35796(var1, var2, var3);
   }

   public class_7913(class_7411 var1, ByteBuffer var2, int var3) {
      this.method_35797(var1, var2, var3, method_35801());
   }

   public class_7913(class_7411 var1, ByteBuffer var2, int var3, int var4) {
      this.method_35797(var1, var2, var3, var4);
   }

   public class_8112 method_35803(int var1, int var2) {
      return this.field_40446[var1][var2];
   }

   private void method_35796(String var1, int var2, int var3) throws SlickException {
      try {
         class_7411 var6 = class_5449.method_24832(var1);
         ByteBuffer var7 = var6.method_33770(class_8975.method_41153(var1), false, null);
         this.method_35797(var6, var7, var2, var3);
      } catch (IOException var8) {
         throw new class_1162("Failed to load: " + var1, var8);
      }
   }

   private void method_35797(class_7411 var1, ByteBuffer var2, int var3, int var4) {
      int var7 = var1.method_5150();
      int var8 = var1.method_5151();
      this.field_40449 = this.field_41567 = var1.method_5155();
      this.field_40444 = this.field_41548 = var1.method_5153();
      if (var7 <= var4 && var8 <= var4) {
         this.field_40446 = new class_8112[1][1];
         class_3405 var23 = new class_3405(this, var1, var8, var2, var7);
         this.field_40446[0][0] = new class_8112(var23, var3);
         this.field_40445 = 1;
         this.field_40447 = 1;
         this.field_41562 = true;
      } else {
         this.field_40445 = (this.field_40449 - 1) / var4 + 1;
         this.field_40447 = (this.field_40444 - 1) / var4 + 1;
         this.field_40446 = new class_8112[this.field_40445][this.field_40447];
         int var9 = var1.method_5154() / 8;

         for (int var10 = 0; var10 < this.field_40445; var10++) {
            for (int var11 = 0; var11 < this.field_40447; var11++) {
               int var12 = (var10 + 1) * var4;
               int var13 = (var11 + 1) * var4;
               int var14 = Math.min(this.field_40449 - var10 * var4, var4);
               int var15 = Math.min(this.field_40444 - var11 * var4, var4);
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
               class_5785 var24 = new class_5785(this, var1, var15, var14, var18, var17, var16);
               this.field_40446[var10][var11] = new class_8112(var24, var3);
            }
         }

         this.field_41562 = true;
      }
   }

   @Override
   public void method_36849() {
      throw new class_8986("Can't bind big images yet");
   }

   @Override
   public class_8112 method_36876() {
      throw new class_8986("Can't copy big images yet");
   }

   @Override
   public void method_36886() {
      this.method_19475(0.0F, 0.0F);
   }

   @Override
   public void method_36894(float var1, float var2, class_8709 var3) {
      this.method_36892(var1, var2, (float)this.field_41567, (float)this.field_41548, var3);
   }

   @Override
   public void method_36893(float var1, float var2, float var3, class_8709 var4) {
      this.method_36892(var1, var2, (float)this.field_41567 * var3, (float)this.field_41548 * var3, var4);
   }

   @Override
   public void method_36892(float var1, float var2, float var3, float var4, class_8709 var5) {
      float var8 = var3 / (float)this.field_40449;
      float var9 = var4 / (float)this.field_40444;
      field_40448.method_5902(var1, var2, 0.0F);
      field_40448.method_5895(var8, var9, 1.0F);
      float var10 = 0.0F;
      float var11 = 0.0F;

      for (int var12 = 0; var12 < this.field_40445; var12++) {
         var11 = 0.0F;

         for (int var13 = 0; var13 < this.field_40447; var13++) {
            class_8112 var14 = this.field_40446[var12][var13];
            var14.method_36892(var10, var11, (float)var14.method_36877(), (float)var14.method_36856(), var5);
            var11 += (float)var14.method_36856();
            if (var13 == this.field_40447 - 1) {
               var10 += (float)var14.method_36877();
            }
         }
      }

      field_40448.method_5895(1.0F / var8, 1.0F / var9, 1.0F);
      field_40448.method_5902(-var1, -var2, 0.0F);
   }

   @Override
   public void method_36890(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var11 = (int)(var7 - var5);
      int var12 = (int)(var8 - var6);
      class_8112 var13 = this.method_36858((int)var5, (int)var6, var11, var12);
      int var14 = (int)(var3 - var1);
      int var15 = (int)(var4 - var2);
      var13.method_36888(var1, var2, (float)var14, (float)var15);
   }

   @Override
   public void method_36889(float var1, float var2, float var3, float var4, float var5, float var6) {
      int var9 = (int)(var5 - var3);
      int var10 = (int)(var6 - var4);
      this.method_36890(var1, var2, (float)var9, (float)var10, var3, var4, var5, var6);
   }

   @Override
   public void method_36888(float var1, float var2, float var3, float var4) {
      this.method_36892(var1, var2, var3, var4, class_8709.field_44646);
   }

   @Override
   public void method_36887(float var1, float var2, float var3) {
      this.method_36893(var1, var2, var3, class_8709.field_44646);
   }

   @Override
   public void method_19475(float var1, float var2) {
      this.method_36894(var1, var2, class_8709.field_44646);
   }

   @Override
   public void method_36903(float var1, float var2, float var3, float var4) {
      float var7 = var3 / (float)this.field_40449;
      float var8 = var4 / (float)this.field_40444;
      float var9 = 0.0F;
      float var10 = 0.0F;

      for (int var11 = 0; var11 < this.field_40445; var11++) {
         var10 = 0.0F;

         for (int var12 = 0; var12 < this.field_40447; var12++) {
            class_8112 var13 = this.field_40446[var11][var12];
            if (field_40442 == null || var13.method_36897() != field_40442.method_36897()) {
               if (field_40442 != null) {
                  field_40442.method_36878();
               }

               field_40442 = var13;
               field_40442.method_36880();
            }

            var13.method_36903(var9 + var1, var10 + var2, (float)var13.method_36877(), (float)var13.method_36856());
            var10 += (float)var13.method_36856();
            if (var12 == this.field_40447 - 1) {
               var9 += (float)var13.method_36877();
            }
         }
      }
   }

   @Override
   public void method_36847(float var1, float var2, float var3, float var4) {
      float var7 = var3 / (float)this.field_40449;
      float var8 = var4 / (float)this.field_40444;
      field_40448.method_5902(var1, var2, 0.0F);
      field_40448.method_5895(var7, var8, 1.0F);
      float var9 = 0.0F;
      float var10 = 0.0F;

      for (int var11 = 0; var11 < this.field_40445; var11++) {
         var10 = 0.0F;

         for (int var12 = 0; var12 < this.field_40447; var12++) {
            class_8112 var13 = this.field_40446[var11][var12];
            var13.method_36847(var9, var10, (float)var13.method_36877(), (float)var13.method_36856());
            var10 += (float)var13.method_36856();
            if (var12 == this.field_40447 - 1) {
               var9 += (float)var13.method_36877();
            }
         }
      }

      field_40448.method_5895(1.0F / var7, 1.0F / var8, 1.0F);
      field_40448.method_5902(-var1, -var2, 0.0F);
   }

   @Override
   public void method_36846(float var1, float var2) {
      this.method_36847(var1, var2, (float)this.field_41567, (float)this.field_41548);
   }

   @Override
   public void method_36878() {
      if (field_40442 != null) {
         field_40442.method_36878();
      }

      field_40442 = null;
   }

   @Override
   public void method_36880() {
   }

   @Override
   public void method_36870() {
      throw new class_8986("Doesn't make sense for tiled operations");
   }

   @Override
   public class_8709 method_36885(int var1, int var2) {
      throw new class_8986("Can't use big images as buffers");
   }

   @Override
   public class_8112 method_36902(boolean var1, boolean var2) {
      class_7913 var5 = new class_7913();
      var5.field_40446 = this.field_40446;
      var5.field_40445 = this.field_40445;
      var5.field_40447 = this.field_40447;
      var5.field_41567 = this.field_41567;
      var5.field_41548 = this.field_41548;
      var5.field_40449 = this.field_40449;
      var5.field_40444 = this.field_40444;
      if (var1) {
         class_8112[][] var6 = var5.field_40446;
         var5.field_40446 = new class_8112[this.field_40445][this.field_40447];

         for (int var7 = 0; var7 < this.field_40445; var7++) {
            for (int var8 = 0; var8 < this.field_40447; var8++) {
               var5.field_40446[var7][var8] = var6[this.field_40445 - 1 - var7][var8].method_36902(true, false);
            }
         }
      }

      if (var2) {
         class_8112[][] var9 = var5.field_40446;
         var5.field_40446 = new class_8112[this.field_40445][this.field_40447];

         for (int var10 = 0; var10 < this.field_40445; var10++) {
            for (int var11 = 0; var11 < this.field_40447; var11++) {
               var5.field_40446[var10][var11] = var9[var10][this.field_40447 - 1 - var11].method_36902(false, true);
            }
         }
      }

      return var5;
   }

   public class_7501 method_35798() throws SlickException {
      throw new class_8986("Can't use big images as offscreen buffers");
   }

   @Override
   public class_8112 method_36881(float var1) {
      return this.method_36882((int)(var1 * (float)this.field_41567), (int)(var1 * (float)this.field_41548));
   }

   @Override
   public class_8112 method_36882(int var1, int var2) {
      class_7913 var5 = new class_7913();
      var5.field_40446 = this.field_40446;
      var5.field_40445 = this.field_40445;
      var5.field_40447 = this.field_40447;
      var5.field_41567 = var1;
      var5.field_41548 = var2;
      var5.field_40449 = this.field_40449;
      var5.field_40444 = this.field_40444;
      return var5;
   }

   @Override
   public class_8112 method_36858(int var1, int var2, int var3, int var4) {
      class_7913 var7 = new class_7913();
      var7.field_41567 = var3;
      var7.field_41548 = var4;
      var7.field_40449 = var3;
      var7.field_40444 = var4;
      var7.field_40446 = new class_8112[this.field_40445][this.field_40447];
      float var8 = 0.0F;
      float var9 = 0.0F;
      int var10 = var1 + var3;
      int var11 = var2 + var4;
      int var12 = 0;
      int var13 = 0;
      boolean var14 = false;

      for (int var15 = 0; var15 < this.field_40445; var15++) {
         var9 = 0.0F;
         var13 = 0;
         var14 = false;

         for (int var16 = 0; var16 < this.field_40447; var16++) {
            class_8112 var17 = this.field_40446[var15][var16];
            int var18 = (int)(var8 + (float)var17.method_36877());
            int var19 = (int)(var9 + (float)var17.method_36856());
            int var20 = (int)Math.max((float)var1, var8);
            int var21 = (int)Math.max((float)var2, var9);
            int var22 = Math.min(var10, var18);
            int var23 = Math.min(var11, var19);
            int var24 = var22 - var20;
            int var25 = var23 - var21;
            if (var24 > 0 && var25 > 0) {
               class_8112 var26 = var17.method_36858((int)((float)var20 - var8), (int)((float)var21 - var9), var22 - var20, var23 - var21);
               var14 = true;
               var7.field_40446[var12][var13] = var26;
               var7.field_40447 = Math.max(var7.field_40447, ++var13);
            }

            var9 += (float)var17.method_36856();
            if (var16 == this.field_40447 - 1) {
               var8 += (float)var17.method_36877();
            }
         }

         if (var14) {
            var12++;
            var7.field_40445++;
         }
      }

      return var7;
   }

   @Override
   public class_8343 method_36897() {
      throw new class_8986("Can't use big images as offscreen buffers");
   }

   @Override
   public void method_36868() {
      throw new class_8986("Can't use big images as offscreen buffers");
   }

   @Override
   public void method_36860() {
      throw new class_8986("Can't use big images as offscreen buffers");
   }

   @Override
   public void method_36845(class_8343 var1) {
      throw new class_8986("Can't use big images as offscreen buffers");
   }

   public class_8112 method_35800(int var1, int var2) {
      return this.field_40446[var1][var2];
   }

   public int method_35799() {
      return this.field_40445;
   }

   public int method_35802() {
      return this.field_40447;
   }

   @Override
   public String toString() {
      return "[BIG IMAGE]";
   }

   @Override
   public void method_36857() throws SlickException {
      for (int var3 = 0; var3 < this.field_40445; var3++) {
         for (int var4 = 0; var4 < this.field_40447; var4++) {
            class_8112 var5 = this.field_40446[var3][var4];
            var5.method_36857();
         }
      }
   }

   @Override
   public void method_36891(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, class_8709 var9) {
      int var12 = (int)(var7 - var5);
      int var13 = (int)(var8 - var6);
      class_8112 var14 = this.method_36858((int)var5, (int)var6, var12, var13);
      int var15 = (int)(var3 - var1);
      int var16 = (int)(var4 - var2);
      var14.method_36892(var1, var2, (float)var15, (float)var16, var9);
   }

   @Override
   public void method_36861(float var1, float var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void method_36905(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, class_8709 var9) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void method_36904(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void method_36848(float var1, float var2, float var3, float var4, class_8709 var5) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void method_36851(float var1, float var2, float var3, float var4) {
      throw new UnsupportedOperationException();
   }
}
