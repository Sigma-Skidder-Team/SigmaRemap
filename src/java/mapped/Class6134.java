package mapped;

import org.newdawn.slick.Color;
import org.newdawn.slick.util.Log;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Class6134 implements Class6135 {
   private static String field27482 =  "";
   public Class7089 field27483 = new Class7089(this, 100.0F, 100.0F);
   public Class7089 field27484 = new Class7089(this, 5.0F, 5.0F);
   public Class7089 field27485 = new Class7089(this, 1000.0F, 1000.0F);
   public Class7089 field27486 = new Class7089(this, 10.0F, 10.0F);
   public Class7089 field27487 = new Class7089(this, 0.0F, 0.0F);
   public Class7089 field27488 = new Class7089(this, 0.0F, 0.0F);
   public Class7688 field27489 = new Class7688(this, 360.0F);
   public Class7687 field27490 = new Class7687(this, 0.0F);
   public Class7089 field27491 = new Class7089(this, 0.0F, 0.0F);
   public Class7089 field27492 = new Class7089(this, 50.0F, 50.0F);
   public Class7687 field27493 = new Class7687(this, 0.0F);
   public Class7687 field27494 = new Class7687(this, 0.0F);
   public Class7687 field27495 = new Class7687(this, 0.0F);
   public Class7089 field27496 = new Class7089(this, 1000.0F, 1000.0F);
   public ArrayList field27497 = new ArrayList();
   public Class7687 field27498 = new Class7687(this, 255.0F);
   public Class7687 field27499 = new Class7687(this, 0.0F);
   public Class7685 field27500;
   public Class7685 field27501;
   public Class7685 field27502;
   public Class7685 field27503;
   public Class7089 field27504 = new Class7089(this, 1000.0F, 1000.0F);
   public int field27505 = 1;
   public boolean field27506 = false;
   public boolean field27507 = false;
   public String field27508;
   public String field27509 = "";
   private Image field27510;
   private boolean field27511;
   private boolean field27512 = true;
   private float field27513;
   private float field27514;
   private int field27515 = 0;
   private int field27516;
   private int field27517;
   private Class9365 field27518;
   private int field27519;
   public boolean field27520 = false;
   public boolean field27521 = false;
   public boolean field27522;
   public float field27523;
   public float field27524;

   public static void method18935(String var0) {
      if (!var0.endsWith("/")) {
         var0 = var0 + "/";
      }

      field27482 = var0;
   }

   public Class6134(String var1) {
      this.field27508 = var1;
      this.field27519 = (int)this.field27504.method22061();
      this.field27516 = (int)this.field27496.method22061();
      this.field27497.add(new Class9745(this, 0.0F, Color.field16442));
      this.field27497.add(new Class9745(this, 1.0F, Color.field16444));
      ArrayList var4 = new ArrayList();
      var4.add(new Class2532(0.0F, 0.0F));
      var4.add(new Class2532(1.0F, 255.0F));
      this.field27500 = new Class7685(this, var4, 0, 255);
      var4 = new ArrayList();
      var4.add(new Class2532(0.0F, 0.0F));
      var4.add(new Class2532(1.0F, 255.0F));
      this.field27501 = new Class7685(this, var4, 0, 255);
      var4 = new ArrayList();
      var4.add(new Class2532(0.0F, 0.0F));
      var4.add(new Class2532(1.0F, 1.0F));
      this.field27502 = new Class7685(this, var4, 0, 1);
      var4 = new ArrayList();
      var4.add(new Class2532(0.0F, 0.0F));
      var4.add(new Class2532(1.0F, 1.0F));
      this.field27503 = new Class7685(this, var4, 0, 1);
   }

   public void method18936(String var1) {
      if (var1.length() == 0) {
         var1 = null;
      }

      this.field27509 = var1;
      if (var1 != null) {
         this.field27511 = true;
      } else {
         this.field27510 = null;
      }
   }

   public String method18937() {
      return this.field27509;
   }

   @Override
   public String toString() {
      return "[" + this.field27508 + "]";
   }

   public void method18938(float var1, float var2) {
      this.method18939(var1, var2, true);
   }

   public void method18939(float var1, float var2, boolean var3) {
      if (var3) {
         this.field27522 = true;
         this.field27523 = this.field27523 - (this.field27513 - var1);
         this.field27524 = this.field27524 - (this.field27514 - var2);
      }

      this.field27513 = var1;
      this.field27514 = var2;
   }

   public float method18940() {
      return this.field27513;
   }

   public float method18941() {
      return this.field27514;
   }

   @Override
   public boolean method18942() {
      return this.field27512;
   }

   @Override
   public void method18943(boolean var1) {
      this.field27512 = var1;
   }

   @Override
   public void method18944(Class9365 var1, int var2) {
      this.field27518 = var1;
      if (!this.field27522) {
         this.field27523 = 0.0F;
         this.field27524 = 0.0F;
      } else {
         this.field27522 = false;
      }

      if (this.field27511) {
         this.field27511 = false;

         try {
            this.field27510 = new Image(field27482 + this.field27509);
         } catch (Class2451 var16) {
            this.field27510 = null;
            Log.error(var16);
         }
      }

      if ((this.field27520 || this.field27496.method22062() && this.field27516 < 0 || this.field27504.method22062() && this.field27519 <= 0)
         && this.field27517 == 0) {
         this.field27521 = true;
      }

      this.field27517 = 0;
      if (!this.field27520) {
         if (this.field27496.method22062()) {
            if (this.field27516 < 0) {
               return;
            }

            this.field27516 -= var2;
         }

         if (!this.field27504.method22062() || this.field27519 > 0) {
            this.field27515 -= var2;
            if (this.field27515 < 0) {
               this.field27515 = (int)this.field27483.method22061();
               int var5 = (int)this.field27484.method22061();

               for (int var6 = 0; var6 < var5; var6++) {
                  Class4536 var7 = var1.method35488(this, this.field27485.method22061());
                  var7.method14477(this.field27486.method22061());
                  var7.method14483(this.field27513 + this.field27487.method22061(), this.field27514 + this.field27488.method22061());
                  var7.method14484(0.0F, 0.0F, 0.0F);
                  float var8 = this.field27491.method22061();
                  float var9 = this.field27492.method22061();
                  if (var8 != 0.0F || var9 != 0.0F) {
                     float var10 = this.field27489.method25298(0.0F);
                     float var11 = var10 + this.field27490.method25298(0.0F) - this.field27489.method25307() / 2.0F - 90.0F;
                     float var12 = (float)Class4835.method14957(Math.toRadians((double)var11)) * var8;
                     float var13 = (float)Class4835.method14956(Math.toRadians((double)var11)) * var8;
                     var7.method14487(var12, var13);
                     float var14 = (float)Class4835.method14957(Math.toRadians((double)var11));
                     float var15 = (float)Class4835.method14956(Math.toRadians((double)var11));
                     var7.method14484(var14, var15, var9 * 0.001F);
                  }

                  if (this.field27510 != null) {
                     var7.method14467(this.field27510);
                  }

                  Class9745 var17 = (Class9745)this.field27497.get(0);
                  var7.method14482(
                     var17.field45495.field16455, var17.field45495.field16456, var17.field45495.field16457, this.field27498.method25298(0.0F) / 255.0F
                  );
                  var7.method14475(this.field27505);
                  var7.method14493(this.field27506);
                  if (this.field27504.method22062()) {
                     this.field27519--;
                     if (this.field27519 <= 0) {
                        break;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void method18945(Class4536 var1, int var2) {
      this.field27517++;
      var1.field21859 = var1.field21859 + this.field27523;
      var1.field21860 = var1.field21860 + this.field27524;
      var1.method14490(this.field27495.method25298(0.0F) * 5.0E-5F * (float)var2, this.field27494.method25298(0.0F) * 5.0E-5F * (float)var2);
      float var5 = var1.method14469() / var1.method14468();
      float var6 = 1.0F - var5;
      float var7 = 0.0F;
      float var8 = 1.0F;
      Color var9 = null;
      Color var10 = null;

      for (int var11 = 0; var11 < this.field27497.size() - 1; var11++) {
         Class9745 var12 = (Class9745)this.field27497.get(var11);
         Class9745 var13 = (Class9745)this.field27497.get(var11 + 1);
         if (var6 >= var12.field45494 && var6 <= var13.field45494) {
            var9 = var12.field45495;
            var10 = var13.field45495;
            float var14 = var13.field45494 - var12.field45494;
            float var15 = var6 - var12.field45494;
            float var16 = var15 / var14;
            var7 = 1.0F - var16;
            var8 = 1.0F - var7;
         }
      }

      if (var9 != null) {
         float var17 = var9.field16455 * var7 + var10.field16455 * var8;
         float var19 = var9.field16456 * var7 + var10.field16456 * var8;
         float var20 = var9.field16457 * var7 + var10.field16457 * var8;
         float var21;
         if (!this.field27500.method25299()) {
            var21 = this.field27498.method25298(0.0F) / 255.0F * var5 + this.field27499.method25298(0.0F) / 255.0F * var6;
         } else {
            var21 = this.field27500.method25298(var6) / 255.0F;
         }

         var1.method14482(var17, var19, var20, var21);
      }

      if (!this.field27501.method25299()) {
         var1.method14478((float)var2 * this.field27493.method25298(0.0F) * 0.001F);
      } else {
         float var18 = this.field27501.method25298(var6);
         var1.method14477(var18);
      }

      if (this.field27502.method25299()) {
         var1.method14485(this.field27502.method25298(var6));
      }

      if (this.field27503.method25299()) {
         var1.method14495(this.field27503.method25298(var6));
      }
   }

   @Override
   public boolean method18946() {
      if (this.field27518 != null) {
         if (!this.field27496.method22062()) {
            if (!this.field27504.method22062()) {
               return !this.field27520 ? false : this.field27521;
            } else {
               return this.field27519 <= 0 ? this.field27521 : false;
            }
         } else {
            return this.field27516 <= 0 ? this.field27521 : false;
         }
      } else {
         return false;
      }
   }

   public void method18947() {
      this.method18948();
      this.field27515 = 0;
      this.field27519 = (int)this.field27504.method22061();
      this.field27516 = (int)this.field27496.method22061();
   }

   public void method18948() {
      this.field27521 = false;
      if (this.field27518 != null) {
         this.field27518.method35490(this);
      }
   }

   public void method18949() {
      if (this.method18946() && this.field27518 != null && this.field27518.method35487() == 0) {
         this.method18947();
      }
   }

   public Class6134 method18950() {
      Object var3 = null;

      try {
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         Class8273.method28900(var4, this);
         ByteArrayInputStream var5 = new ByteArrayInputStream(var4.toByteArray());
         return Class8273.method28895(var5);
      } catch (IOException var6) {
         Log.error("Slick: ConfigurableEmitter.duplicate(): caught exception " + var6.toString());
         return null;
      }
   }

   public void method18951(float var1, Color var2) {
      this.field27497.add(new Class9745(this, var1, var2));
   }

   @Override
   public boolean method18952() {
      return this.field27507;
   }

   @Override
   public boolean method18953() {
      return this.field27506;
   }

   @Override
   public boolean method18954(Class9365 var1) {
      return this.field27505 == 1 && var1.method35470() || this.field27505 == 2;
   }

   @Override
   public Image method18955() {
      return this.field27510;
   }

   @Override
   public void method18956() {
      this.field27520 = true;
   }

   @Override
   public void method18957() {
      this.field27520 = false;
      this.method18947();
   }
}
