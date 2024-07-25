package remapped;

import java.nio.FloatBuffer;
import java.util.Random;

public final class class_8107 {
   public float field_41531;
   public float field_41518;
   public float field_41521;
   public float field_41517;
   public float field_41520;
   public float field_41519;
   public float field_41528;
   public float field_41516;
   public float field_41523;
   public float field_41525;
   public float field_41522;
   public float field_41532;
   public float field_41524;
   public float field_41526;
   public float field_41530;
   public float field_41527;

   public class_8107() {
   }

   public class_8107(class_8107 var1) {
      this.field_41531 = var1.field_41531;
      this.field_41518 = var1.field_41518;
      this.field_41521 = var1.field_41521;
      this.field_41517 = var1.field_41517;
      this.field_41520 = var1.field_41520;
      this.field_41519 = var1.field_41519;
      this.field_41528 = var1.field_41528;
      this.field_41516 = var1.field_41516;
      this.field_41523 = var1.field_41523;
      this.field_41525 = var1.field_41525;
      this.field_41522 = var1.field_41522;
      this.field_41532 = var1.field_41532;
      this.field_41524 = var1.field_41524;
      this.field_41526 = var1.field_41526;
      this.field_41530 = var1.field_41530;
      this.field_41527 = var1.field_41527;
   }

   public class_8107(Quaternion var1) {
      float var4 = var1.method_24653();
      float var5 = var1.method_24647();
      float var6 = var1.method_24648();
      float var7 = var1.method_24656();
      float var8 = 2.0F * var4 * var4;
      float var9 = 2.0F * var5 * var5;
      float var10 = 2.0F * var6 * var6;
      this.field_41531 = 1.0F - var9 - var10;
      this.field_41519 = 1.0F - var10 - var8;
      this.field_41522 = 1.0F - var8 - var9;
      this.field_41527 = 1.0F;
      float var11 = var4 * var5;
      float var12 = var5 * var6;
      float var13 = var6 * var4;
      float var14 = var4 * var7;
      float var15 = var5 * var7;
      float var16 = var6 * var7;
      this.field_41520 = 2.0F * (var11 + var16);
      this.field_41518 = 2.0F * (var11 - var16);
      this.field_41523 = 2.0F * (var13 - var15);
      this.field_41521 = 2.0F * (var13 + var15);
      this.field_41525 = 2.0F * (var12 + var14);
      this.field_41528 = 2.0F * (var12 - var14);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_8107 var4 = (class_8107)var1;
         return Float.compare(var4.field_41531, this.field_41531) == 0
            && Float.compare(var4.field_41518, this.field_41518) == 0
            && Float.compare(var4.field_41521, this.field_41521) == 0
            && Float.compare(var4.field_41517, this.field_41517) == 0
            && Float.compare(var4.field_41520, this.field_41520) == 0
            && Float.compare(var4.field_41519, this.field_41519) == 0
            && Float.compare(var4.field_41528, this.field_41528) == 0
            && Float.compare(var4.field_41516, this.field_41516) == 0
            && Float.compare(var4.field_41523, this.field_41523) == 0
            && Float.compare(var4.field_41525, this.field_41525) == 0
            && Float.compare(var4.field_41522, this.field_41522) == 0
            && Float.compare(var4.field_41532, this.field_41532) == 0
            && Float.compare(var4.field_41524, this.field_41524) == 0
            && Float.compare(var4.field_41526, this.field_41526) == 0
            && Float.compare(var4.field_41530, this.field_41530) == 0
            && Float.compare(var4.field_41527, this.field_41527) == 0;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_41531 == 0.0F ? 0 : Float.floatToIntBits(this.field_41531);
      var3 = 31 * var3 + (this.field_41518 == 0.0F ? 0 : Float.floatToIntBits(this.field_41518));
      var3 = 31 * var3 + (this.field_41521 == 0.0F ? 0 : Float.floatToIntBits(this.field_41521));
      var3 = 31 * var3 + (this.field_41517 == 0.0F ? 0 : Float.floatToIntBits(this.field_41517));
      var3 = 31 * var3 + (this.field_41520 == 0.0F ? 0 : Float.floatToIntBits(this.field_41520));
      var3 = 31 * var3 + (this.field_41519 == 0.0F ? 0 : Float.floatToIntBits(this.field_41519));
      var3 = 31 * var3 + (this.field_41528 == 0.0F ? 0 : Float.floatToIntBits(this.field_41528));
      var3 = 31 * var3 + (this.field_41516 == 0.0F ? 0 : Float.floatToIntBits(this.field_41516));
      var3 = 31 * var3 + (this.field_41523 == 0.0F ? 0 : Float.floatToIntBits(this.field_41523));
      var3 = 31 * var3 + (this.field_41525 == 0.0F ? 0 : Float.floatToIntBits(this.field_41525));
      var3 = 31 * var3 + (this.field_41522 == 0.0F ? 0 : Float.floatToIntBits(this.field_41522));
      var3 = 31 * var3 + (this.field_41532 == 0.0F ? 0 : Float.floatToIntBits(this.field_41532));
      var3 = 31 * var3 + (this.field_41524 == 0.0F ? 0 : Float.floatToIntBits(this.field_41524));
      var3 = 31 * var3 + (this.field_41526 == 0.0F ? 0 : Float.floatToIntBits(this.field_41526));
      var3 = 31 * var3 + (this.field_41530 == 0.0F ? 0 : Float.floatToIntBits(this.field_41530));
      return 31 * var3 + (this.field_41527 == 0.0F ? 0 : Float.floatToIntBits(this.field_41527));
   }

   private static int method_36811(int var0, int var1) {
      return var1 * 4 + var0;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append("Matrix4f:\n");
      var3.append(this.field_41531);
      var3.append(" ");
      var3.append(this.field_41518);
      var3.append(" ");
      var3.append(this.field_41521);
      var3.append(" ");
      var3.append(this.field_41517);
      var3.append("\n");
      var3.append(this.field_41520);
      var3.append(" ");
      var3.append(this.field_41519);
      var3.append(" ");
      var3.append(this.field_41528);
      var3.append(" ");
      var3.append(this.field_41516);
      var3.append("\n");
      var3.append(this.field_41523);
      var3.append(" ");
      var3.append(this.field_41525);
      var3.append(" ");
      var3.append(this.field_41522);
      var3.append(" ");
      var3.append(this.field_41532);
      var3.append("\n");
      var3.append(this.field_41524);
      var3.append(" ");
      var3.append(this.field_41526);
      var3.append(" ");
      var3.append(this.field_41530);
      var3.append(" ");
      var3.append(this.field_41527);
      var3.append("\n");
      return var3.toString();
   }

   public void method_36827(FloatBuffer var1) {
      var1.put(method_36811(0, 0), this.field_41531);
      var1.put(method_36811(0, 1), this.field_41518);
      var1.put(method_36811(0, 2), this.field_41521);
      var1.put(method_36811(0, 3), this.field_41517);
      var1.put(method_36811(1, 0), this.field_41520);
      var1.put(method_36811(1, 1), this.field_41519);
      var1.put(method_36811(1, 2), this.field_41528);
      var1.put(method_36811(1, 3), this.field_41516);
      var1.put(method_36811(2, 0), this.field_41523);
      var1.put(method_36811(2, 1), this.field_41525);
      var1.put(method_36811(2, 2), this.field_41522);
      var1.put(method_36811(2, 3), this.field_41532);
      var1.put(method_36811(3, 0), this.field_41524);
      var1.put(method_36811(3, 1), this.field_41526);
      var1.put(method_36811(3, 2), this.field_41530);
      var1.put(method_36811(3, 3), this.field_41527);
   }

   public void method_36817() {
      this.field_41531 = 1.0F;
      this.field_41518 = 0.0F;
      this.field_41521 = 0.0F;
      this.field_41517 = 0.0F;
      this.field_41520 = 0.0F;
      this.field_41519 = 1.0F;
      this.field_41528 = 0.0F;
      this.field_41516 = 0.0F;
      this.field_41523 = 0.0F;
      this.field_41525 = 0.0F;
      this.field_41522 = 1.0F;
      this.field_41532 = 0.0F;
      this.field_41524 = 0.0F;
      this.field_41526 = 0.0F;
      this.field_41530 = 0.0F;
      this.field_41527 = 1.0F;
   }

   public boolean method_36810() {
      return this.field_41531 == 1.0F
         && this.field_41518 == 0.0F
         && this.field_41521 == 0.0F
         && this.field_41517 == 0.0F
         && this.field_41520 == 0.0F
         && this.field_41519 == 1.0F
         && this.field_41528 == 0.0F
         && this.field_41516 == 0.0F
         && this.field_41523 == 0.0F
         && this.field_41525 == 0.0F
         && this.field_41522 == 1.0F
         && this.field_41532 == 0.0F
         && this.field_41524 == 0.0F
         && this.field_41526 == 0.0F
         && this.field_41530 == 0.0F
         && this.field_41527 == 1.0F;
   }

   public float method_36821() {
      float var3 = this.field_41531 * this.field_41519 - this.field_41518 * this.field_41520;
      float var4 = this.field_41531 * this.field_41528 - this.field_41521 * this.field_41520;
      float var5 = this.field_41531 * this.field_41516 - this.field_41517 * this.field_41520;
      float var6 = this.field_41518 * this.field_41528 - this.field_41521 * this.field_41519;
      float var7 = this.field_41518 * this.field_41516 - this.field_41517 * this.field_41519;
      float var8 = this.field_41521 * this.field_41516 - this.field_41517 * this.field_41528;
      float var9 = this.field_41523 * this.field_41526 - this.field_41525 * this.field_41524;
      float var10 = this.field_41523 * this.field_41530 - this.field_41522 * this.field_41524;
      float var11 = this.field_41523 * this.field_41527 - this.field_41532 * this.field_41524;
      float var12 = this.field_41525 * this.field_41530 - this.field_41522 * this.field_41526;
      float var13 = this.field_41525 * this.field_41527 - this.field_41532 * this.field_41526;
      float var14 = this.field_41522 * this.field_41527 - this.field_41532 * this.field_41530;
      float var15 = this.field_41519 * var14 - this.field_41528 * var13 + this.field_41516 * var12;
      float var16 = -this.field_41520 * var14 + this.field_41528 * var11 - this.field_41516 * var10;
      float var17 = this.field_41520 * var13 - this.field_41519 * var11 + this.field_41516 * var9;
      float var18 = -this.field_41520 * var12 + this.field_41519 * var10 - this.field_41528 * var9;
      float var19 = -this.field_41518 * var14 + this.field_41521 * var13 - this.field_41517 * var12;
      float var20 = this.field_41531 * var14 - this.field_41521 * var11 + this.field_41517 * var10;
      float var21 = -this.field_41531 * var13 + this.field_41518 * var11 - this.field_41517 * var9;
      float var22 = this.field_41531 * var12 - this.field_41518 * var10 + this.field_41521 * var9;
      float var23 = this.field_41526 * var8 - this.field_41530 * var7 + this.field_41527 * var6;
      float var24 = -this.field_41524 * var8 + this.field_41530 * var5 - this.field_41527 * var4;
      float var25 = this.field_41524 * var7 - this.field_41526 * var5 + this.field_41527 * var3;
      float var26 = -this.field_41524 * var6 + this.field_41526 * var4 - this.field_41530 * var3;
      float var27 = -this.field_41525 * var8 + this.field_41522 * var7 - this.field_41532 * var6;
      float var28 = this.field_41523 * var8 - this.field_41522 * var5 + this.field_41532 * var4;
      float var29 = -this.field_41523 * var7 + this.field_41525 * var5 - this.field_41532 * var3;
      float var30 = this.field_41523 * var6 - this.field_41525 * var4 + this.field_41522 * var3;
      this.field_41531 = var15;
      this.field_41520 = var16;
      this.field_41523 = var17;
      this.field_41524 = var18;
      this.field_41518 = var19;
      this.field_41519 = var20;
      this.field_41525 = var21;
      this.field_41526 = var22;
      this.field_41521 = var23;
      this.field_41528 = var24;
      this.field_41522 = var25;
      this.field_41530 = var26;
      this.field_41517 = var27;
      this.field_41516 = var28;
      this.field_41532 = var29;
      this.field_41527 = var30;
      return var3 * var14 - var4 * var13 + var5 * var12 + var6 * var11 - var7 * var10 + var8 * var9;
   }

   public void method_36807() {
      float var3 = this.field_41520;
      this.field_41520 = this.field_41518;
      this.field_41518 = var3;
      var3 = this.field_41523;
      this.field_41523 = this.field_41521;
      this.field_41521 = var3;
      var3 = this.field_41525;
      this.field_41525 = this.field_41528;
      this.field_41528 = var3;
      var3 = this.field_41524;
      this.field_41524 = this.field_41517;
      this.field_41517 = var3;
      var3 = this.field_41526;
      this.field_41526 = this.field_41516;
      this.field_41516 = var3;
      var3 = this.field_41530;
      this.field_41530 = this.field_41532;
      this.field_41532 = var3;
   }

   public boolean method_36809() {
      float var3 = this.method_36821();
      if (!(Math.abs(var3) > 1.0E-6F)) {
         return false;
      } else {
         this.method_36830(var3);
         return true;
      }
   }

   public void method_36832(class_8107 var1) {
      float var4 = this.field_41531 * var1.field_41531
         + this.field_41518 * var1.field_41520
         + this.field_41521 * var1.field_41523
         + this.field_41517 * var1.field_41524;
      float var5 = this.field_41531 * var1.field_41518
         + this.field_41518 * var1.field_41519
         + this.field_41521 * var1.field_41525
         + this.field_41517 * var1.field_41526;
      float var6 = this.field_41531 * var1.field_41521
         + this.field_41518 * var1.field_41528
         + this.field_41521 * var1.field_41522
         + this.field_41517 * var1.field_41530;
      float var7 = this.field_41531 * var1.field_41517
         + this.field_41518 * var1.field_41516
         + this.field_41521 * var1.field_41532
         + this.field_41517 * var1.field_41527;
      float var8 = this.field_41520 * var1.field_41531
         + this.field_41519 * var1.field_41520
         + this.field_41528 * var1.field_41523
         + this.field_41516 * var1.field_41524;
      float var9 = this.field_41520 * var1.field_41518
         + this.field_41519 * var1.field_41519
         + this.field_41528 * var1.field_41525
         + this.field_41516 * var1.field_41526;
      float var10 = this.field_41520 * var1.field_41521
         + this.field_41519 * var1.field_41528
         + this.field_41528 * var1.field_41522
         + this.field_41516 * var1.field_41530;
      float var11 = this.field_41520 * var1.field_41517
         + this.field_41519 * var1.field_41516
         + this.field_41528 * var1.field_41532
         + this.field_41516 * var1.field_41527;
      float var12 = this.field_41523 * var1.field_41531
         + this.field_41525 * var1.field_41520
         + this.field_41522 * var1.field_41523
         + this.field_41532 * var1.field_41524;
      float var13 = this.field_41523 * var1.field_41518
         + this.field_41525 * var1.field_41519
         + this.field_41522 * var1.field_41525
         + this.field_41532 * var1.field_41526;
      float var14 = this.field_41523 * var1.field_41521
         + this.field_41525 * var1.field_41528
         + this.field_41522 * var1.field_41522
         + this.field_41532 * var1.field_41530;
      float var15 = this.field_41523 * var1.field_41517
         + this.field_41525 * var1.field_41516
         + this.field_41522 * var1.field_41532
         + this.field_41532 * var1.field_41527;
      float var16 = this.field_41524 * var1.field_41531
         + this.field_41526 * var1.field_41520
         + this.field_41530 * var1.field_41523
         + this.field_41527 * var1.field_41524;
      float var17 = this.field_41524 * var1.field_41518
         + this.field_41526 * var1.field_41519
         + this.field_41530 * var1.field_41525
         + this.field_41527 * var1.field_41526;
      float var18 = this.field_41524 * var1.field_41521
         + this.field_41526 * var1.field_41528
         + this.field_41530 * var1.field_41522
         + this.field_41527 * var1.field_41530;
      float var19 = this.field_41524 * var1.field_41517
         + this.field_41526 * var1.field_41516
         + this.field_41530 * var1.field_41532
         + this.field_41527 * var1.field_41527;
      this.field_41531 = var4;
      this.field_41518 = var5;
      this.field_41521 = var6;
      this.field_41517 = var7;
      this.field_41520 = var8;
      this.field_41519 = var9;
      this.field_41528 = var10;
      this.field_41516 = var11;
      this.field_41523 = var12;
      this.field_41525 = var13;
      this.field_41522 = var14;
      this.field_41532 = var15;
      this.field_41524 = var16;
      this.field_41526 = var17;
      this.field_41530 = var18;
      this.field_41527 = var19;
   }

   public void method_36831(Quaternion var1) {
      float var4 = var1.method_24653();
      float var5 = var1.method_24647();
      float var6 = var1.method_24648();
      float var7 = var1.method_24656();
      float var8 = 2.0F * var4 * var4;
      float var9 = 2.0F * var5 * var5;
      float var10 = 2.0F * var6 * var6;
      float var11 = var4 * var5;
      float var12 = var5 * var6;
      float var13 = var6 * var4;
      float var14 = var4 * var7;
      float var15 = var5 * var7;
      float var16 = var6 * var7;
      float var17 = 1.0F - var9 - var10;
      float var18 = 2.0F * (var11 - var16);
      float var19 = 2.0F * (var13 + var15);
      float var20 = 0.0F;
      float var21 = 2.0F * (var11 + var16);
      float var22 = 1.0F - var10 - var8;
      float var23 = 2.0F * (var12 - var14);
      float var24 = 0.0F;
      float var25 = 2.0F * (var13 - var15);
      float var26 = 2.0F * (var12 + var14);
      float var27 = 1.0F - var8 - var9;
      float var28 = 0.0F;
      float var29 = 0.0F;
      float var30 = 0.0F;
      float var31 = 0.0F;
      float var32 = 1.0F;
      float var33 = this.field_41531 * var17 + this.field_41518 * var21 + this.field_41521 * var25 + this.field_41517 * var29;
      float var34 = this.field_41531 * var18 + this.field_41518 * var22 + this.field_41521 * var26 + this.field_41517 * var30;
      float var35 = this.field_41531 * var19 + this.field_41518 * var23 + this.field_41521 * var27 + this.field_41517 * var31;
      float var36 = this.field_41531 * var20 + this.field_41518 * var24 + this.field_41521 * var28 + this.field_41517 * var32;
      float var37 = this.field_41520 * var17 + this.field_41519 * var21 + this.field_41528 * var25 + this.field_41516 * var29;
      float var38 = this.field_41520 * var18 + this.field_41519 * var22 + this.field_41528 * var26 + this.field_41516 * var30;
      float var39 = this.field_41520 * var19 + this.field_41519 * var23 + this.field_41528 * var27 + this.field_41516 * var31;
      float var40 = this.field_41520 * var20 + this.field_41519 * var24 + this.field_41528 * var28 + this.field_41516 * var32;
      float var41 = this.field_41523 * var17 + this.field_41525 * var21 + this.field_41522 * var25 + this.field_41532 * var29;
      float var42 = this.field_41523 * var18 + this.field_41525 * var22 + this.field_41522 * var26 + this.field_41532 * var30;
      float var43 = this.field_41523 * var19 + this.field_41525 * var23 + this.field_41522 * var27 + this.field_41532 * var31;
      float var44 = this.field_41523 * var20 + this.field_41525 * var24 + this.field_41522 * var28 + this.field_41532 * var32;
      float var45 = this.field_41524 * var17 + this.field_41526 * var21 + this.field_41530 * var25 + this.field_41527 * var29;
      float var46 = this.field_41524 * var18 + this.field_41526 * var22 + this.field_41530 * var26 + this.field_41527 * var30;
      float var47 = this.field_41524 * var19 + this.field_41526 * var23 + this.field_41530 * var27 + this.field_41527 * var31;
      float var48 = this.field_41524 * var20 + this.field_41526 * var24 + this.field_41530 * var28 + this.field_41527 * var32;
      this.field_41531 = var33;
      this.field_41518 = var34;
      this.field_41521 = var35;
      this.field_41517 = var36;
      this.field_41520 = var37;
      this.field_41519 = var38;
      this.field_41528 = var39;
      this.field_41516 = var40;
      this.field_41523 = var41;
      this.field_41525 = var42;
      this.field_41522 = var43;
      this.field_41532 = var44;
      this.field_41524 = var45;
      this.field_41526 = var46;
      this.field_41530 = var47;
      this.field_41527 = var48;
   }

   public void method_36830(float var1) {
      this.field_41531 *= var1;
      this.field_41518 *= var1;
      this.field_41521 *= var1;
      this.field_41517 *= var1;
      this.field_41520 *= var1;
      this.field_41519 *= var1;
      this.field_41528 *= var1;
      this.field_41516 *= var1;
      this.field_41523 *= var1;
      this.field_41525 *= var1;
      this.field_41522 *= var1;
      this.field_41532 *= var1;
      this.field_41524 *= var1;
      this.field_41526 *= var1;
      this.field_41530 *= var1;
      this.field_41527 *= var1;
   }

   public static class_8107 method_36820(double var0, float var2, float var3, float var4) {
      float var7 = (float)(1.0 / Math.tan(var0 * (float) (Math.PI / 180.0) / 2.0));
      class_8107 var8 = new class_8107();
      var8.field_41531 = var7 / var2;
      var8.field_41519 = var7;
      var8.field_41522 = (var4 + var3) / (var3 - var4);
      var8.field_41530 = -1.0F;
      var8.field_41532 = 2.0F * var4 * var3 / (var3 - var4);
      return var8;
   }

   public static class_8107 method_36825(float var0, float var1, float var2, float var3) {
      class_8107 var6 = new class_8107();
      var6.field_41531 = 2.0F / var0;
      var6.field_41519 = 2.0F / var1;
      float var7 = var3 - var2;
      var6.field_41522 = -2.0F / var7;
      var6.field_41527 = 1.0F;
      var6.field_41517 = -1.0F;
      var6.field_41516 = -1.0F;
      var6.field_41532 = -(var3 + var2) / var7;
      return var6;
   }

   public void method_36808(class_2426 var1) {
      this.field_41517 = this.field_41517 + var1.method_11057();
      this.field_41516 = this.field_41516 + var1.method_11061();
      this.field_41532 = this.field_41532 + var1.method_11055();
   }

   public class_8107 method_36824() {
      return new class_8107(this);
   }

   public static class_8107 method_36814(float var0, float var1, float var2) {
      class_8107 var5 = new class_8107();
      var5.field_41531 = var0;
      var5.field_41519 = var1;
      var5.field_41522 = var2;
      var5.field_41527 = 1.0F;
      return var5;
   }

   public static class_8107 method_36813(float var0, float var1, float var2) {
      class_8107 var5 = new class_8107();
      var5.field_41531 = 1.0F;
      var5.field_41519 = 1.0F;
      var5.field_41522 = 1.0F;
      var5.field_41527 = 1.0F;
      var5.field_41517 = var0;
      var5.field_41516 = var1;
      var5.field_41532 = var2;
      return var5;
   }

   public float method_36805(float var1, float var2, float var3, float var4) {
      return this.field_41531 * var1 + this.field_41518 * var2 + this.field_41521 * var3 + this.field_41517 * var4;
   }

   public float method_36812(float var1, float var2, float var3, float var4) {
      return this.field_41520 * var1 + this.field_41519 * var2 + this.field_41528 * var3 + this.field_41516 * var4;
   }

   public float method_36815(float var1, float var2, float var3, float var4) {
      return this.field_41523 * var1 + this.field_41525 * var2 + this.field_41522 * var3 + this.field_41532 * var4;
   }

   public float method_36816(float var1, float var2, float var3, float var4) {
      return this.field_41524 * var1 + this.field_41526 * var2 + this.field_41530 * var3 + this.field_41527 * var4;
   }

   public void method_36829(float var1, float var2, float var3) {
      this.field_41517 = this.field_41517 + this.field_41531 * var1 + this.field_41518 * var2 + this.field_41521 * var3;
      this.field_41516 = this.field_41516 + this.field_41520 * var1 + this.field_41519 * var2 + this.field_41528 * var3;
      this.field_41532 = this.field_41532 + this.field_41523 * var1 + this.field_41525 * var2 + this.field_41522 * var3;
      this.field_41527 = this.field_41527 + this.field_41524 * var1 + this.field_41526 * var2 + this.field_41530 * var3;
   }

   public void method_36826(float var1, float var2, float var3) {
      this.field_41531 *= var1;
      this.field_41518 *= var2;
      this.field_41521 *= var3;
      this.field_41520 *= var1;
      this.field_41519 *= var2;
      this.field_41528 *= var3;
      this.field_41523 *= var1;
      this.field_41525 *= var2;
      this.field_41522 *= var3;
      this.field_41524 *= var1;
      this.field_41526 *= var2;
      this.field_41530 *= var3;
   }

   public void method_36818(Random var1) {
      this.field_41531 = var1.nextFloat();
      this.field_41518 = var1.nextFloat();
      this.field_41521 = var1.nextFloat();
      this.field_41517 = var1.nextFloat();
      this.field_41520 = var1.nextFloat();
      this.field_41519 = var1.nextFloat();
      this.field_41528 = var1.nextFloat();
      this.field_41516 = var1.nextFloat();
      this.field_41523 = var1.nextFloat();
      this.field_41525 = var1.nextFloat();
      this.field_41522 = var1.nextFloat();
      this.field_41532 = var1.nextFloat();
      this.field_41524 = var1.nextFloat();
      this.field_41526 = var1.nextFloat();
      this.field_41530 = var1.nextFloat();
      this.field_41527 = var1.nextFloat();
   }

   public void method_36828(float[] var1) {
      var1[0] = this.field_41531;
      var1[1] = this.field_41518;
      var1[2] = this.field_41521;
      var1[3] = this.field_41517;
      var1[4] = this.field_41520;
      var1[5] = this.field_41519;
      var1[6] = this.field_41528;
      var1[7] = this.field_41516;
      var1[8] = this.field_41523;
      var1[9] = this.field_41525;
      var1[10] = this.field_41522;
      var1[11] = this.field_41532;
      var1[12] = this.field_41524;
      var1[13] = this.field_41526;
      var1[14] = this.field_41530;
      var1[15] = this.field_41527;
   }

   public class_8107(float[] var1) {
      this.field_41531 = var1[0];
      this.field_41518 = var1[1];
      this.field_41521 = var1[2];
      this.field_41517 = var1[3];
      this.field_41520 = var1[4];
      this.field_41519 = var1[5];
      this.field_41528 = var1[6];
      this.field_41516 = var1[7];
      this.field_41523 = var1[8];
      this.field_41525 = var1[9];
      this.field_41522 = var1[10];
      this.field_41532 = var1[11];
      this.field_41524 = var1[12];
      this.field_41526 = var1[13];
      this.field_41530 = var1[14];
      this.field_41527 = var1[15];
   }

   public void method_36804(class_8107 var1) {
      this.field_41531 = var1.field_41531;
      this.field_41518 = var1.field_41518;
      this.field_41521 = var1.field_41521;
      this.field_41517 = var1.field_41517;
      this.field_41520 = var1.field_41520;
      this.field_41519 = var1.field_41519;
      this.field_41528 = var1.field_41528;
      this.field_41516 = var1.field_41516;
      this.field_41523 = var1.field_41523;
      this.field_41525 = var1.field_41525;
      this.field_41522 = var1.field_41522;
      this.field_41532 = var1.field_41532;
      this.field_41524 = var1.field_41524;
      this.field_41526 = var1.field_41526;
      this.field_41530 = var1.field_41530;
      this.field_41527 = var1.field_41527;
   }

   public void method_36823(class_8107 var1) {
      this.field_41531 = this.field_41531 + var1.field_41531;
      this.field_41518 = this.field_41518 + var1.field_41518;
      this.field_41521 = this.field_41521 + var1.field_41521;
      this.field_41517 = this.field_41517 + var1.field_41517;
      this.field_41520 = this.field_41520 + var1.field_41520;
      this.field_41519 = this.field_41519 + var1.field_41519;
      this.field_41528 = this.field_41528 + var1.field_41528;
      this.field_41516 = this.field_41516 + var1.field_41516;
      this.field_41523 = this.field_41523 + var1.field_41523;
      this.field_41525 = this.field_41525 + var1.field_41525;
      this.field_41522 = this.field_41522 + var1.field_41522;
      this.field_41532 = this.field_41532 + var1.field_41532;
      this.field_41524 = this.field_41524 + var1.field_41524;
      this.field_41526 = this.field_41526 + var1.field_41526;
      this.field_41530 = this.field_41530 + var1.field_41530;
      this.field_41527 = this.field_41527 + var1.field_41527;
   }

   public void method_36822(class_8107 var1) {
      class_8107 var4 = var1.method_36824();
      var4.method_36832(this);
      this.method_36804(var4);
   }

   public void method_36819(float var1, float var2, float var3) {
      this.field_41531 = 1.0F;
      this.field_41519 = 1.0F;
      this.field_41522 = 1.0F;
      this.field_41527 = 1.0F;
      this.field_41517 = var1;
      this.field_41516 = var2;
      this.field_41532 = var3;
   }
}
