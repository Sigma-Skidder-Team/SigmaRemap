package remapped;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class class_487 implements class_3377 {
   private static String field_3047 = field_3016[1];
   public class_1368 field_3053 = new class_1368(this, 100.0F, 100.0F, null);
   public class_1368 field_3048 = new class_1368(this, 5.0F, 5.0F, null);
   public class_1368 field_3018 = new class_1368(this, 1000.0F, 1000.0F, null);
   public class_1368 field_3041 = new class_1368(this, 10.0F, 10.0F, null);
   public class_1368 field_3021 = new class_1368(this, 0.0F, 0.0F, null);
   public class_1368 field_3045 = new class_1368(this, 0.0F, 0.0F, null);
   public class_7526 field_3049 = new class_7526(this, 360.0F, null);
   public class_7202 field_3044 = new class_7202(this, 0.0F, null);
   public class_1368 field_3024 = new class_1368(this, 0.0F, 0.0F, null);
   public class_1368 field_3050 = new class_1368(this, 50.0F, 50.0F, null);
   public class_7202 field_3043 = new class_7202(this, 0.0F, null);
   public class_7202 field_3031 = new class_7202(this, 0.0F, null);
   public class_7202 field_3023 = new class_7202(this, 0.0F, null);
   public class_1368 field_3035 = new class_1368(this, 1000.0F, 1000.0F, null);
   public ArrayList field_3032 = new ArrayList();
   public class_7202 field_3037 = new class_7202(this, 255.0F, null);
   public class_7202 field_3039 = new class_7202(this, 0.0F, null);
   public class_2437 field_3017;
   public class_2437 field_3015;
   public class_2437 field_3026;
   public class_2437 field_3020;
   public class_1368 field_3027 = new class_1368(this, 1000.0F, 1000.0F, null);
   public int field_3013 = 1;
   public boolean field_3054 = false;
   public boolean field_3046 = false;
   public String field_3014;
   public String field_3040 = "";
   private class_8112 field_3025;
   private boolean field_3036;
   private boolean field_3055 = true;
   private float field_3019;
   private float field_3029;
   private int field_3028 = 0;
   private int field_3042;
   private int field_3052;
   private class_8095 field_3034;
   private int field_3033;
   public boolean field_3022 = false;
   public boolean field_3038 = false;
   public boolean field_3030;
   public float field_3051;
   public float field_3056;

   public static void method_2295(String var0) {
      if (!var0.endsWith("/")) {
         var0 = var0 + "/";
      }

      field_3047 = var0;
   }

   public class_487(String var1) {
      this.field_3014 = var1;
      this.field_3033 = (int)this.field_3027.method_6336();
      this.field_3042 = (int)this.field_3035.method_6336();
      this.field_3032.add(new class_9551(this, 0.0F, class_8709.field_44646));
      this.field_3032.add(new class_9551(this, 1.0F, class_8709.field_44643));
      ArrayList var4 = new ArrayList();
      var4.add(new class_1440(0.0F, 0.0F));
      var4.add(new class_1440(1.0F, 255.0F));
      this.field_3017 = new class_2437(this, var4, 0, 255);
      var4 = new ArrayList();
      var4.add(new class_1440(0.0F, 0.0F));
      var4.add(new class_1440(1.0F, 255.0F));
      this.field_3015 = new class_2437(this, var4, 0, 255);
      var4 = new ArrayList();
      var4.add(new class_1440(0.0F, 0.0F));
      var4.add(new class_1440(1.0F, 1.0F));
      this.field_3026 = new class_2437(this, var4, 0, 1);
      var4 = new ArrayList();
      var4.add(new class_1440(0.0F, 0.0F));
      var4.add(new class_1440(1.0F, 1.0F));
      this.field_3020 = new class_2437(this, var4, 0, 1);
   }

   public void method_2305(String var1) {
      if (var1.length() == 0) {
         var1 = null;
      }

      this.field_3040 = var1;
      if (var1 != null) {
         this.field_3036 = true;
      } else {
         this.field_3025 = null;
      }
   }

   public String method_2299() {
      return this.field_3040;
   }

   @Override
   public String toString() {
      return "[" + this.field_3014 + "]";
   }

   public void method_2302(float var1, float var2) {
      this.method_2303(var1, var2, true);
   }

   public void method_2303(float var1, float var2, boolean var3) {
      if (var3) {
         this.field_3030 = true;
         this.field_3051 = this.field_3051 - (this.field_3019 - var1);
         this.field_3056 = this.field_3056 - (this.field_3029 - var2);
      }

      this.field_3019 = var1;
      this.field_3029 = var2;
   }

   public float method_2304() {
      return this.field_3019;
   }

   public float method_2307() {
      return this.field_3029;
   }

   @Override
   public boolean method_15577() {
      return this.field_3055;
   }

   @Override
   public void method_15575(boolean var1) {
      this.field_3055 = var1;
   }

   @Override
   public void method_15576(class_8095 var1, int var2) {
      this.field_3034 = var1;
      if (!this.field_3030) {
         this.field_3051 = 0.0F;
         this.field_3056 = 0.0F;
      } else {
         this.field_3030 = false;
      }

      if (this.field_3036) {
         this.field_3036 = false;

         try {
            this.field_3025 = new class_8112(field_3047 + this.field_3040);
         } catch (class_1162 var16) {
            this.field_3025 = null;
            class_2598.method_11785(var16);
         }
      }

      if ((this.field_3022 || this.field_3035.method_6331() && this.field_3042 < 0 || this.field_3027.method_6331() && this.field_3033 <= 0)
         && this.field_3052 == 0) {
         this.field_3038 = true;
      }

      this.field_3052 = 0;
      if (!this.field_3022) {
         if (this.field_3035.method_6331()) {
            if (this.field_3042 < 0) {
               return;
            }

            this.field_3042 -= var2;
         }

         if (!this.field_3027.method_6331() || this.field_3033 > 0) {
            this.field_3028 -= var2;
            if (this.field_3028 < 0) {
               this.field_3028 = (int)this.field_3053.method_6336();
               int var5 = (int)this.field_3048.method_6336();

               for (int var6 = 0; var6 < var5; var6++) {
                  class_168 var7 = var1.method_36765(this, this.field_3018.method_6336());
                  var7.method_692(this.field_3041.method_6336());
                  var7.method_681(this.field_3019 + this.field_3021.method_6336(), this.field_3029 + this.field_3045.method_6336());
                  var7.method_669(0.0F, 0.0F, 0.0F);
                  float var8 = this.field_3024.method_6336();
                  float var9 = this.field_3050.method_6336();
                  if (var8 != 0.0F || var9 != 0.0F) {
                     float var10 = this.field_3049.method_31784(0.0F);
                     float var11 = var10 + this.field_3044.method_31784(0.0F) - this.field_3049.method_34296() / 2.0F - 90.0F;
                     float var12 = (float)class_215.method_933(Math.toRadians((double)var11)) * var8;
                     float var13 = (float)class_215.method_932(Math.toRadians((double)var11)) * var8;
                     var7.method_683(var12, var13);
                     float var14 = (float)class_215.method_933(Math.toRadians((double)var11));
                     float var15 = (float)class_215.method_932(Math.toRadians((double)var11));
                     var7.method_669(var14, var15, var9 * 0.001F);
                  }

                  if (this.field_3025 != null) {
                     var7.method_674(this.field_3025);
                  }

                  class_9551 var17 = (class_9551)this.field_3032.get(0);
                  var7.method_690(
                     var17.field_48594.field_44663, var17.field_48594.field_44649, var17.field_48594.field_44648, this.field_3037.method_31784(0.0F) / 255.0F
                  );
                  var7.method_679(this.field_3013);
                  var7.method_693(this.field_3054);
                  if (this.field_3027.method_6331()) {
                     this.field_3033--;
                     if (this.field_3033 <= 0) {
                        break;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void method_15574(class_168 var1, int var2) {
      this.field_3052++;
      var1.field_512 = var1.field_512 + this.field_3051;
      var1.field_523 = var1.field_523 + this.field_3056;
      var1.method_687(this.field_3023.method_31784(0.0F) * 5.0E-5F * (float)var2, this.field_3031.method_31784(0.0F) * 5.0E-5F * (float)var2);
      float var5 = var1.method_673() / var1.method_700();
      float var6 = 1.0F - var5;
      float var7 = 0.0F;
      float var8 = 1.0F;
      class_8709 var9 = null;
      class_8709 var10 = null;

      for (int var11 = 0; var11 < this.field_3032.size() - 1; var11++) {
         class_9551 var12 = (class_9551)this.field_3032.get(var11);
         class_9551 var13 = (class_9551)this.field_3032.get(var11 + 1);
         if (var6 >= var12.field_48593 && var6 <= var13.field_48593) {
            var9 = var12.field_48594;
            var10 = var13.field_48594;
            float var14 = var13.field_48593 - var12.field_48593;
            float var15 = var6 - var12.field_48593;
            float var16 = var15 / var14;
            var7 = 1.0F - var16;
            var8 = 1.0F - var7;
         }
      }

      if (var9 != null) {
         float var17 = var9.field_44663 * var7 + var10.field_44663 * var8;
         float var19 = var9.field_44649 * var7 + var10.field_44649 * var8;
         float var20 = var9.field_44648 * var7 + var10.field_44648 * var8;
         float var21;
         if (!this.field_3017.method_11108()) {
            var21 = this.field_3037.method_31784(0.0F) / 255.0F * var5 + this.field_3039.method_31784(0.0F) / 255.0F * var6;
         } else {
            var21 = this.field_3017.method_31784(var6) / 255.0F;
         }

         var1.method_690(var17, var19, var20, var21);
      }

      if (!this.field_3015.method_11108()) {
         var1.method_688((float)var2 * this.field_3043.method_31784(0.0F) * 0.001F);
      } else {
         float var18 = this.field_3015.method_31784(var6);
         var1.method_692(var18);
      }

      if (this.field_3026.method_11108()) {
         var1.method_676(this.field_3026.method_31784(var6));
      }

      if (this.field_3020.method_11108()) {
         var1.method_694(this.field_3020.method_31784(var6));
      }
   }

   @Override
   public boolean method_15569() {
      if (this.field_3034 != null) {
         if (!this.field_3035.method_6331()) {
            if (!this.field_3027.method_6331()) {
               return !this.field_3022 ? false : this.field_3038;
            } else {
               return this.field_3033 <= 0 ? this.field_3038 : false;
            }
         } else {
            return this.field_3042 <= 0 ? this.field_3038 : false;
         }
      } else {
         return false;
      }
   }

   public void method_2296() {
      this.method_2297();
      this.field_3028 = 0;
      this.field_3033 = (int)this.field_3027.method_6336();
      this.field_3042 = (int)this.field_3035.method_6336();
   }

   public void method_2297() {
      this.field_3038 = false;
      if (this.field_3034 != null) {
         this.field_3034.method_36754(this);
      }
   }

   public void method_2300() {
      if (this.method_15569() && this.field_3034 != null && this.field_3034.method_36779() == 0) {
         this.method_2296();
      }
   }

   public class_487 method_2298() {
      Object var3 = null;

      try {
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         class_4125.method_19145(var4, this);
         ByteArrayInputStream var5 = new ByteArrayInputStream(var4.toByteArray());
         return class_4125.method_19148(var5);
      } catch (IOException var6) {
         class_2598.method_11783("Slick: ConfigurableEmitter.duplicate(): caught exception " + var6.toString());
         return null;
      }
   }

   public void method_2306(float var1, class_8709 var2) {
      this.field_3032.add(new class_9551(this, var1, var2));
   }

   @Override
   public boolean method_15572() {
      return this.field_3046;
   }

   @Override
   public boolean method_15573() {
      return this.field_3054;
   }

   @Override
   public boolean method_15568(class_8095 var1) {
      return this.field_3013 == 1 && var1.method_36760() || this.field_3013 == 2;
   }

   @Override
   public class_8112 method_15570() {
      return this.field_3025;
   }

   @Override
   public void method_15571() {
      this.field_3022 = true;
   }

   @Override
   public void method_15567() {
      this.field_3022 = false;
      this.method_2296();
   }
}
