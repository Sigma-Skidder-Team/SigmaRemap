package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.security.AccessController;
import java.util.ArrayList;
import org.lwjgl.BufferUtils;

public class class_7501 {
   public static class_1299 field_38269 = class_3980.method_18363();
   private static class_1810 field_38282 = class_3980.method_18361();
   public static int field_38289 = 1;
   public static int field_38275 = 2;
   public static int field_38273 = 3;
   public static int field_38291 = 4;
   public static int field_38276 = 5;
   public static int field_38279 = 6;
   private static final int field_38268 = 50;
   public static class_7501 field_38294 = null;
   public static class_4027 field_38280;
   private float field_38286 = 1.0F;
   private float field_38283 = 1.0F;
   private class_4027 field_38272;
   private class_8709 field_38293 = class_8709.field_44646;
   public int field_38278;
   public int field_38267;
   private boolean field_38287;
   private class_2783 field_38292;
   private DoubleBuffer field_38270 = BufferUtils.createDoubleBuffer(4);
   private ByteBuffer field_38288 = BufferUtils.createByteBuffer(4);
   private boolean field_38274;
   private class_2783 field_38271;
   private int field_38281 = field_38289;
   private float field_38277 = 1.0F;
   private ArrayList field_38284 = new ArrayList();
   private int field_38285;

   public static void method_34199(class_7501 var0) {
      if (field_38294 != var0) {
         if (field_38294 != null) {
            field_38294.method_34146();
         }

         field_38294 = var0;
         field_38294.method_34185();
      }
   }

   public class_7501() {
   }

   public class_7501(int var1, int var2) {
      if (field_38280 == null) {
         AccessController.doPrivileged(new class_1403(this));
      }

      this.field_38272 = field_38280;
      this.field_38278 = var1;
      this.field_38267 = var2;
   }

   public void method_34169(int var1, int var2) {
      this.field_38278 = var1;
      this.field_38267 = var2;
   }

   public void method_34168(int var1) {
      this.method_34195();
      this.field_38281 = var1;
      if (this.field_38281 == field_38289) {
         field_38269.method_5911(3042);
         field_38269.method_5921(true, true, true, true);
         field_38269.method_5927(770, 771);
      }

      if (this.field_38281 == field_38275) {
         field_38269.method_5938(3042);
         field_38269.method_5921(false, false, false, true);
      }

      if (this.field_38281 == field_38273) {
         field_38269.method_5911(3042);
         field_38269.method_5921(true, true, true, false);
         field_38269.method_5927(772, 773);
      }

      if (this.field_38281 == field_38291) {
         field_38269.method_5911(3042);
         field_38269.method_5921(true, true, true, true);
         field_38269.method_5927(769, 768);
      }

      if (this.field_38281 == field_38276) {
         field_38269.method_5911(3042);
         field_38269.method_5921(true, true, true, true);
         field_38269.method_5927(1, 1);
      }

      if (this.field_38281 == field_38279) {
         field_38269.method_5911(3042);
         field_38269.method_5921(true, true, true, true);
         field_38269.method_5927(1, 769);
      }

      this.method_34165();
   }

   public void method_34180() {
      this.method_34163();
      field_38269.method_5912();
      int var3 = this.field_38281;
      this.method_34168(field_38275);
      this.method_34203(new class_8709(0, 0, 0, 0));
      this.method_34134(0.0F, 0.0F, (float)this.field_38278, (float)this.field_38267);
      this.method_34203(this.field_38293);
      this.method_34168(var3);
      this.method_34131();
   }

   private void method_34195() {
      method_34199(this);
   }

   private void method_34165() {
   }

   public void method_34185() {
   }

   public void method_34137() {
      if (field_38294 == this) {
         field_38294.method_34146();
         field_38294 = null;
      }
   }

   public void method_34146() {
   }

   public class_4027 method_34177() {
      return this.field_38272;
   }

   public void method_34142(class_8709 var1) {
      this.method_34195();
      field_38269.method_5916(var1.field_44663, var1.field_44649, var1.field_44648, var1.field_44645);
      this.method_34165();
   }

   public class_8709 method_34139() {
      this.method_34195();
      FloatBuffer var3 = BufferUtils.createFloatBuffer(16);
      field_38269.method_5926(3106, var3);
      this.method_34165();
      return new class_8709(var3);
   }

   public void method_34162() {
      this.method_34195();
      field_38269.method_5925(16384);
      this.method_34165();
   }

   public void method_34161() {
      this.field_38286 = 1.0F;
      this.field_38283 = 1.0F;
      if (this.field_38287) {
         this.method_34195();
         field_38269.method_5900();
         this.field_38287 = false;
         this.method_34165();
      }
   }

   private void method_34136() {
      if (!this.field_38287) {
         this.method_34195();
         field_38269.method_5899();
         this.field_38287 = true;
         this.method_34165();
      }
   }

   public void method_34140(float var1, float var2) {
      this.field_38286 *= var1;
      this.field_38283 *= var2;
      this.method_34136();
      this.method_34195();
      field_38269.method_5895(var1, var2, 1.0F);
      this.method_34165();
   }

   public void method_34172(float var1, float var2, float var3) {
      this.method_34136();
      this.method_34195();
      this.method_34184(var1, var2);
      field_38269.method_5937(var3, 0.0F, 0.0F, 1.0F);
      this.method_34184(-var1, -var2);
      this.method_34165();
   }

   public void method_34184(float var1, float var2) {
      this.method_34136();
      this.method_34195();
      field_38269.method_5902(var1, var2, 0.0F);
      this.method_34165();
   }

   public void method_34147(class_4027 var1) {
      this.field_38272 = var1;
   }

   public void method_34191() {
      this.field_38272 = field_38280;
   }

   public void method_34203(class_8709 var1) {
      if (var1 != null) {
         this.field_38293 = new class_8709(var1);
         this.method_34195();
         this.field_38293.method_40021();
         this.method_34165();
      }
   }

   public class_8709 method_34132() {
      return new class_8709(this.field_38293);
   }

   public void method_34181(float var1, float var2, float var3, float var4) {
      float var7 = this.field_38277 - 1.0F;
      if (field_38282.method_8038()) {
         if (var1 == var3) {
            if (var2 > var4) {
               float var12 = var4;
               var4 = var2;
               var2 = var12;
            }

            float var13 = 1.0F / this.field_38283;
            var7 /= this.field_38283;
            this.method_34134(var1 - var7 / 2.0F, var2 - var7 / 2.0F, var7 + var13, var4 - var2 + var7 + var13);
            return;
         }

         if (var2 == var4) {
            if (var1 > var3) {
               float var8 = var3;
               var3 = var1;
               var1 = var8;
            }

            float var11 = 1.0F / this.field_38286;
            var7 /= this.field_38286;
            this.method_34134(var1 - var7 / 2.0F, var2 - var7 / 2.0F, var3 - var1 + var7 + var11, var7 + var11);
            return;
         }
      }

      this.method_34195();
      this.field_38293.method_40021();
      class_9162.method_42217();
      field_38282.method_8039();
      field_38282.method_8037(var1, var2);
      field_38282.method_8037(var3, var4);
      field_38282.method_8034();
      this.method_34165();
   }

   public void method_34171(class_3316 var1, class_5909 var2) {
      this.method_34195();
      class_9162.method_42217();
      class_7669.method_34751(var1, var2);
      this.field_38293.method_40021();
      this.method_34165();
   }

   public void method_34167(class_3316 var1, class_5909 var2) {
      this.method_34195();
      class_9162.method_42217();
      class_7669.method_34743(var1, var2);
      this.field_38293.method_40021();
      this.method_34165();
   }

   public void method_34170(class_3316 var1) {
      this.method_34195();
      class_9162.method_42217();
      this.field_38293.method_40021();
      class_7669.method_34750(var1);
      this.method_34165();
   }

   public void method_34166(class_3316 var1) {
      this.method_34195();
      class_9162.method_42217();
      this.field_38293.method_40021();
      class_7669.method_34741(var1);
      this.method_34165();
   }

   public void method_34204(class_3316 var1, class_8112 var2) {
      this.method_34207(var1, var2, 0.01F, 0.01F, false);
   }

   public void method_34208(class_3316 var1, class_8112 var2, class_5909 var3) {
      this.method_34206(var1, var2, 0.01F, 0.01F, var3);
   }

   public void method_34209(class_3316 var1, class_8112 var2, boolean var3) {
      if (!var3) {
         this.method_34207(var1, var2, 0.01F, 0.01F, false);
      } else {
         this.method_34207(var1, var2, 1.0F, 1.0F, true);
      }
   }

   public void method_34205(class_3316 var1, class_8112 var2, float var3, float var4) {
      this.method_34207(var1, var2, var3, var4, false);
   }

   public void method_34207(class_3316 var1, class_8112 var2, float var3, float var4, boolean var5) {
      this.method_34195();
      class_9162.method_42217();
      this.field_38293.method_40021();
      if (!var5) {
         class_7669.method_34746(var1, var2, var3, var4);
      } else {
         class_7669.method_34740(var1, var2, var3, var4);
      }

      this.method_34165();
   }

   public void method_34206(class_3316 var1, class_8112 var2, float var3, float var4, class_5909 var5) {
      this.method_34195();
      class_9162.method_42217();
      this.field_38293.method_40021();
      class_7669.method_34747(var1, var2, var3, var4, var5);
      this.method_34165();
   }

   public void method_34186(float var1, float var2, float var3, float var4) {
      float var7 = this.method_34190();
      this.method_34181(var1, var2, var1 + var3, var2);
      this.method_34181(var1 + var3, var2, var1 + var3, var2 + var4);
      this.method_34181(var1 + var3, var2 + var4, var1, var2 + var4);
      this.method_34181(var1, var2 + var4, var1, var2);
   }

   public void method_34192() {
      this.field_38292 = null;
      this.method_34195();
      field_38269.method_5938(3089);
      this.method_34165();
   }

   public void method_34188(float var1, float var2, float var3, float var4) {
      this.method_34195();
      this.field_38271 = new class_2783(var1, var2, var3, var4);
      field_38269.method_5911(12288);
      ((Buffer)this.field_38270.put(1.0).put(0.0).put(0.0).put((double)(-var1))).flip();
      field_38269.method_5896(12288, this.field_38270);
      field_38269.method_5911(12289);
      ((Buffer)this.field_38270.put(-1.0).put(0.0).put(0.0).put((double)(var1 + var3))).flip();
      field_38269.method_5896(12289, this.field_38270);
      field_38269.method_5911(12290);
      ((Buffer)this.field_38270.put(0.0).put(1.0).put(0.0).put((double)(-var2))).flip();
      field_38269.method_5896(12290, this.field_38270);
      field_38269.method_5911(12291);
      ((Buffer)this.field_38270.put(0.0).put(-1.0).put(0.0).put((double)(var2 + var4))).flip();
      field_38269.method_5896(12291, this.field_38270);
      this.method_34165();
   }

   public void method_34130() {
      this.method_34195();
      this.field_38271 = null;
      field_38269.method_5938(12288);
      field_38269.method_5938(12289);
      field_38269.method_5938(12290);
      field_38269.method_5938(12291);
      this.method_34165();
   }

   public void method_34189(class_2783 var1) {
      if (var1 != null) {
         this.method_34188(var1.method_15212(), var1.method_15220(), var1.method_15213(), var1.method_15239());
      } else {
         this.method_34130();
      }
   }

   public class_2783 method_34202() {
      return this.field_38271;
   }

   public void method_34159(int var1, int var2, int var3, int var4) {
      this.method_34195();
      if (this.field_38292 != null) {
         this.field_38292.method_12657((float)var1, (float)var2, (float)var3, (float)var4);
      } else {
         field_38269.method_5911(3089);
         this.field_38292 = new class_2783((float)var1, (float)var2, (float)var3, (float)var4);
      }

      field_38269.method_5891(var1, this.field_38267 - var2 - var4, var3, var4);
      this.method_34165();
   }

   public void method_34160(class_2783 var1) {
      if (var1 != null) {
         this.method_34159((int)var1.method_15212(), (int)var1.method_15220(), (int)var1.method_15213(), (int)var1.method_15239());
      } else {
         this.method_34192();
      }
   }

   public class_2783 method_34133() {
      return this.field_38292;
   }

   public void method_34135(float var1, float var2, float var3, float var4, class_8112 var5, float var6, float var7) {
      int var10 = (int)Math.ceil((double)(var3 / (float)var5.method_36877())) + 2;
      int var11 = (int)Math.ceil((double)(var4 / (float)var5.method_36856())) + 2;
      class_2783 var12 = this.method_34202();
      this.method_34188(var1, var2, var3, var4);
      this.method_34195();

      for (int var13 = 0; var13 < var10; var13++) {
         for (int var14 = 0; var14 < var11; var14++) {
            var5.method_19475((float)(var13 * var5.method_36877()) + var1 - var6, (float)(var14 * var5.method_36856()) + var2 - var7);
         }
      }

      this.method_34165();
      this.method_34189(var12);
   }

   public void method_34134(float var1, float var2, float var3, float var4) {
      this.method_34195();
      class_9162.method_42217();
      this.field_38293.method_40021();
      field_38269.method_5934(7);
      field_38269.method_5919(var1, var2);
      field_38269.method_5919(var1 + var3, var2);
      field_38269.method_5919(var1 + var3, var2 + var4);
      field_38269.method_5919(var1, var2 + var4);
      field_38269.method_5940();
      this.method_34165();
   }

   public void method_34178(float var1, float var2, float var3, float var4) {
      this.method_34179(var1, var2, var3, var4, 50);
   }

   public void method_34179(float var1, float var2, float var3, float var4, int var5) {
      this.method_34149(var1, var2, var3, var4, var5, 0.0F, 360.0F);
   }

   public void method_34148(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_34149(var1, var2, var3, var4, 50, var5, var6);
   }

   public void method_34149(float var1, float var2, float var3, float var4, int var5, float var6, float var7) {
      this.method_34195();
      class_9162.method_42217();
      this.field_38293.method_40021();

      while (var7 < var6) {
         var7 += 360.0F;
      }

      float var10 = var1 + var3 / 2.0F;
      float var11 = var2 + var4 / 2.0F;
      field_38282.method_8039();
      int var12 = 360 / var5;

      for (int var13 = (int)var6; var13 < (int)(var7 + (float)var12); var13 += var12) {
         float var14 = (float)var13;
         if (var14 > var7) {
            var14 = var7;
         }

         float var15 = (float)((double)var10 + class_215.method_933(Math.toRadians((double)var14)) * (double)var3 / 2.0);
         float var16 = (float)((double)var11 + class_215.method_932(Math.toRadians((double)var14)) * (double)var4 / 2.0);
         field_38282.method_8037(var15, var16);
      }

      field_38282.method_8034();
      this.method_34165();
   }

   public void method_34143(float var1, float var2, float var3, float var4) {
      this.method_34144(var1, var2, var3, var4, 50);
   }

   public void method_34144(float var1, float var2, float var3, float var4, int var5) {
      this.method_34198(var1, var2, var3, var4, var5, 0.0F, 360.0F);
   }

   public void method_34197(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_34198(var1, var2, var3, var4, 50, var5, var6);
   }

   public void method_34198(float var1, float var2, float var3, float var4, int var5, float var6, float var7) {
      this.method_34195();
      class_9162.method_42217();
      this.field_38293.method_40021();

      while (var7 < var6) {
         var7 += 360.0F;
      }

      float var10 = var1 + var3 / 2.0F;
      float var11 = var2 + var4 / 2.0F;
      field_38269.method_5934(6);
      int var12 = 360 / var5;
      field_38269.method_5919(var10, var11);

      for (int var13 = (int)var6; var13 < (int)(var7 + (float)var12); var13 += var12) {
         float var14 = (float)var13;
         if (var14 > var7) {
            var14 = var7;
         }

         float var15 = (float)((double)var10 + class_215.method_933(Math.toRadians((double)var14)) * (double)var3 / 2.0);
         float var16 = (float)((double)var11 + class_215.method_932(Math.toRadians((double)var14)) * (double)var4 / 2.0);
         field_38269.method_5919(var15, var16);
      }

      field_38269.method_5940();
      if (this.field_38274) {
         field_38269.method_5934(6);
         field_38269.method_5919(var10, var11);
         if (var7 != 360.0F) {
            var7 -= 10.0F;
         }

         for (int var17 = (int)var6; var17 < (int)(var7 + (float)var12); var17 += var12) {
            float var18 = (float)var17;
            if (var18 > var7) {
               var18 = var7;
            }

            float var19 = (float)((double)var10 + class_215.method_933(Math.toRadians((double)(var18 + 10.0F))) * (double)var3 / 2.0);
            float var20 = (float)((double)var11 + class_215.method_932(Math.toRadians((double)(var18 + 10.0F))) * (double)var4 / 2.0);
            field_38269.method_5919(var19, var20);
         }

         field_38269.method_5940();
      }

      this.method_34165();
   }

   public void method_34157(float var1, float var2, float var3, float var4, int var5) {
      this.method_34158(var1, var2, var3, var4, var5, 50);
   }

   public void method_34158(float var1, float var2, float var3, float var4, int var5, int var6) {
      if (var5 >= 0) {
         if (var5 != 0) {
            int var9 = (int)Math.min(var3, var4) / 2;
            if (var5 > var9) {
               var5 = var9;
            }

            this.method_34181(var1 + (float)var5, var2, var1 + var3 - (float)var5, var2);
            this.method_34181(var1, var2 + (float)var5, var1, var2 + var4 - (float)var5);
            this.method_34181(var1 + var3, var2 + (float)var5, var1 + var3, var2 + var4 - (float)var5);
            this.method_34181(var1 + (float)var5, var2 + var4, var1 + var3 - (float)var5, var2 + var4);
            float var10 = (float)(var5 * 2);
            this.method_34149(var1 + var3 - var10, var2 + var4 - var10, var10, var10, var6, 0.0F, 90.0F);
            this.method_34149(var1, var2 + var4 - var10, var10, var10, var6, 90.0F, 180.0F);
            this.method_34149(var1 + var3 - var10, var2, var10, var10, var6, 270.0F, 360.0F);
            this.method_34149(var1, var2, var10, var10, var6, 180.0F, 270.0F);
         } else {
            this.method_34186(var1, var2, var3, var4);
         }
      } else {
         throw new IllegalArgumentException("corner radius must be > 0");
      }
   }

   public void method_34200(float var1, float var2, float var3, float var4, int var5) {
      this.method_34201(var1, var2, var3, var4, var5, 50);
   }

   public void method_34201(float var1, float var2, float var3, float var4, int var5, int var6) {
      if (var5 >= 0) {
         if (var5 != 0) {
            int var9 = (int)Math.min(var3, var4) / 2;
            if (var5 > var9) {
               var5 = var9;
            }

            float var10 = (float)(var5 * 2);
            this.method_34134(var1 + (float)var5, var2, var3 - var10, (float)var5);
            this.method_34134(var1, var2 + (float)var5, (float)var5, var4 - var10);
            this.method_34134(var1 + var3 - (float)var5, var2 + (float)var5, (float)var5, var4 - var10);
            this.method_34134(var1 + (float)var5, var2 + var4 - (float)var5, var3 - var10, (float)var5);
            this.method_34134(var1 + (float)var5, var2 + (float)var5, var3 - var10, var4 - var10);
            this.method_34198(var1 + var3 - var10, var2 + var4 - var10, var10, var10, var6, 0.0F, 90.0F);
            this.method_34198(var1, var2 + var4 - var10, var10, var10, var6, 90.0F, 180.0F);
            this.method_34198(var1 + var3 - var10, var2, var10, var10, var6, 270.0F, 360.0F);
            this.method_34198(var1, var2, var10, var10, var6, 180.0F, 270.0F);
         } else {
            this.method_34134(var1, var2, var3, var4);
         }
      } else {
         throw new IllegalArgumentException("corner radius must be > 0");
      }
   }

   public void method_34196(float var1) {
      this.method_34195();
      this.field_38277 = var1;
      field_38282.method_8041(var1);
      field_38269.method_5910(var1);
      this.method_34165();
   }

   public float method_34190() {
      return this.field_38277;
   }

   public void method_34138() {
      this.method_34195();
      class_3980.method_18361().method_8041(1.0F);
      field_38269.method_5905(1.0F);
      field_38269.method_5910(1.0F);
      this.method_34165();
   }

   public void method_34141(boolean var1) {
      this.method_34195();
      this.field_38274 = var1;
      field_38282.method_8035(var1);
      if (!var1) {
         field_38269.method_5938(2881);
      } else {
         field_38269.method_5911(2881);
      }

      this.method_34165();
   }

   public boolean method_34156() {
      return this.field_38274;
   }

   public void method_34182(String var1, float var2, float var3) {
      this.method_34195();
      this.field_38272.method_18545(var2, var3, var1, this.field_38293);
      this.method_34165();
   }

   public void method_34155(class_8112 var1, float var2, float var3, class_8709 var4) {
      this.method_34195();
      var1.method_36894(var2, var3, var4);
      this.field_38293.method_40021();
      this.method_34165();
   }

   public void method_34175(class_3270 var1, float var2, float var3) {
      this.method_34176(var1, var2, var3, class_8709.field_44646);
   }

   public void method_34176(class_3270 var1, float var2, float var3, class_8709 var4) {
      this.method_34195();
      var1.method_14927(var2, var3, var4);
      this.field_38293.method_40021();
      this.method_34165();
   }

   public void method_34150(class_8112 var1, float var2, float var3) {
      this.method_34155(var1, var2, var3, class_8709.field_44646);
   }

   public void method_34152(class_8112 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.method_34195();
      var1.method_36890(var2, var3, var4, var5, var6, var7, var8, var9);
      this.field_38293.method_40021();
      this.method_34165();
   }

   public void method_34151(class_8112 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_34152(var1, var2, var3, var2 + (float)var1.method_36877(), var3 + (float)var1.method_36856(), var4, var5, var6, var7);
   }

   public void method_34164(class_8112 var1, int var2, int var3) {
      int var6 = !var1.method_36897().method_38412() ? 6407 : 6408;
      var1.method_36849();
      field_38269.method_5892(
         3553, 0, var6, var2, this.field_38267 - (var3 + var1.method_36856()), var1.method_36897().method_38420(), var1.method_36897().method_38422(), 0
      );
      var1.method_36870();
   }

   private int method_34183(byte var1) {
      return var1 >= 0 ? var1 : 256 + var1;
   }

   public class_8709 method_34174(int var1, int var2) {
      this.method_34195();
      field_38269.method_5889(var1, this.field_38267 - var2, 1, 1, 6408, 5121, this.field_38288);
      this.method_34165();
      return new class_8709(
         this.method_34183(this.field_38288.get(0)),
         this.method_34183(this.field_38288.get(1)),
         this.method_34183(this.field_38288.get(2)),
         this.method_34183(this.field_38288.get(3))
      );
   }

   public void method_34145(int var1, int var2, int var3, int var4, ByteBuffer var5) {
      if (var5.capacity() >= var3 * var4 * 4) {
         this.method_34195();
         field_38269.method_5889(var1, this.field_38267 - var2 - var4, var3, var4, 6408, 5121, var5);
         this.method_34165();
      } else {
         throw new IllegalArgumentException("Byte buffer provided to get area is not big enough");
      }
   }

   public void method_34153(class_8112 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, class_8709 var10) {
      this.method_34195();
      var1.method_36891(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.field_38293.method_40021();
      this.method_34165();
   }

   public void method_34154(class_8112 var1, float var2, float var3, float var4, float var5, float var6, float var7, class_8709 var8) {
      this.method_34153(var1, var2, var3, var2 + (float)var1.method_36877(), var3 + (float)var1.method_36856(), var4, var5, var6, var7, var8);
   }

   public void method_34193(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12
   ) {
      this.method_34195();
      class_9162.method_42217();
      field_38269.method_5934(1);
      field_38269.method_5906(var3, var4, var5, var6);
      field_38269.method_5919(var1, var2);
      field_38269.method_5906(var9, var10, var11, var12);
      field_38269.method_5919(var7, var8);
      field_38269.method_5940();
      this.method_34165();
   }

   public void method_34194(float var1, float var2, class_8709 var3, float var4, float var5, class_8709 var6) {
      this.method_34195();
      class_9162.method_42217();
      field_38269.method_5934(1);
      var3.method_40021();
      field_38269.method_5919(var1, var2);
      var6.method_40021();
      field_38269.method_5919(var4, var5);
      field_38269.method_5940();
      this.method_34165();
   }

   public void method_34163() {
      this.method_34195();
      FloatBuffer var3;
      if (this.field_38285 < this.field_38284.size()) {
         var3 = (FloatBuffer)this.field_38284.get(this.field_38285);
      } else {
         var3 = BufferUtils.createFloatBuffer(18);
         this.field_38284.add(var3);
      }

      field_38269.method_5926(2982, var3);
      var3.put(16, this.field_38286);
      var3.put(17, this.field_38283);
      this.field_38285++;
      this.method_34165();
   }

   public void method_34131() {
      if (this.field_38285 != 0) {
         this.method_34195();
         this.field_38285--;
         FloatBuffer var3 = (FloatBuffer)this.field_38284.get(this.field_38285);
         field_38269.method_5917(var3);
         this.field_38286 = var3.get(16);
         this.field_38283 = var3.get(17);
         this.method_34165();
      } else {
         throw new RuntimeException("Attempt to pop a transform that hasn't be pushed");
      }
   }

   public void method_34173() {
   }
}
