package mapped;

import com.mojang.datafixers.util.Pair;
import java.util.Random;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Quaternion;
import org.apache.commons.lang3.tuple.Triple;

public final class Class8967 {
   private static final float field40495 = 3.0F + 2.0F * (float)Math.sqrt(2.0);
   private static final float field40496 = (float)Math.cos(Math.PI / 8);
   private static final float field40497 = (float)Math.sin(Math.PI / 8);
   private static final float field40498 = 1.0F / (float)Math.sqrt(2.0);
   public float field40499;
   public float field40500;
   public float field40501;
   public float field40502;
   public float field40503;
   public float field40504;
   public float field40505;
   public float field40506;
   public float field40507;

   public Class8967() {
   }

   public Class8967(Quaternion var1) {
      float var4 = var1.method31178();
      float var5 = var1.method31179();
      float var6 = var1.method31180();
      float var7 = var1.method31181();
      float var8 = 2.0F * var4 * var4;
      float var9 = 2.0F * var5 * var5;
      float var10 = 2.0F * var6 * var6;
      this.field40499 = 1.0F - var9 - var10;
      this.field40503 = 1.0F - var10 - var8;
      this.field40507 = 1.0F - var8 - var9;
      float var11 = var4 * var5;
      float var12 = var5 * var6;
      float var13 = var6 * var4;
      float var14 = var4 * var7;
      float var15 = var5 * var7;
      float var16 = var6 * var7;
      this.field40502 = 2.0F * (var11 + var16);
      this.field40500 = 2.0F * (var11 - var16);
      this.field40505 = 2.0F * (var13 - var15);
      this.field40501 = 2.0F * (var13 + var15);
      this.field40506 = 2.0F * (var12 + var14);
      this.field40504 = 2.0F * (var12 - var14);
   }

   public static Class8967 method32817(float var0, float var1, float var2) {
      Class8967 var5 = new Class8967();
      var5.field40499 = var0;
      var5.field40503 = var1;
      var5.field40507 = var2;
      return var5;
   }

   public Class8967(Matrix4f var1) {
      this.field40499 = var1.field43471;
      this.field40500 = var1.field43472;
      this.field40501 = var1.field43473;
      this.field40502 = var1.field43475;
      this.field40503 = var1.field43476;
      this.field40504 = var1.field43477;
      this.field40505 = var1.field43479;
      this.field40506 = var1.field43480;
      this.field40507 = var1.field43481;
   }

   public Class8967(Class8967 var1) {
      this.field40499 = var1.field40499;
      this.field40500 = var1.field40500;
      this.field40501 = var1.field40501;
      this.field40502 = var1.field40502;
      this.field40503 = var1.field40503;
      this.field40504 = var1.field40504;
      this.field40505 = var1.field40505;
      this.field40506 = var1.field40506;
      this.field40507 = var1.field40507;
   }

   private static Pair<Float, Float> method32818(float var0, float var1, float var2) {
      float var5 = 2.0F * (var0 - var2);
      if (!(field40495 * var1 * var1 < var5 * var5)) {
         return Pair.of(field40497, field40496);
      } else {
         float var6 = MathHelper.method37815(var1 * var1 + var5 * var5);
         return Pair.of(var6 * var1, var6 * var5);
      }
   }

   private static Pair<Float, Float> method32819(float var0, float var1) {
      float var4 = (float)Math.hypot((double)var0, (double)var1);
      float var5 = !(var4 > 1.0E-6F) ? 0.0F : var1;
      float var6 = Math.abs(var0) + Math.max(var4, 1.0E-6F);
      if (var0 < 0.0F) {
         float var7 = var5;
         var5 = var6;
         var6 = var7;
      }

      float var10 = MathHelper.method37815(var6 * var6 + var5 * var5);
      var6 *= var10;
      var5 *= var10;
      return Pair.of(var5, var6);
   }

   private static Quaternion method32820(Class8967 var0) {
      Class8967 var3 = new Class8967();
      Quaternion var4 = Quaternion.field39030.method31189();
      if (var0.field40500 * var0.field40500 + var0.field40502 * var0.field40502 > 1.0E-6F) {
         Pair var5 = method32818(var0.field40499, 0.5F * (var0.field40500 + var0.field40502), var0.field40503);
         Float var6 = (Float)var5.getFirst();
         Float var7 = (Float)var5.getSecond();
         Quaternion var8 = new Quaternion(0.0F, 0.0F, var6, var7);
         float var9 = var7 * var7 - var6 * var6;
         float var10 = -2.0F * var6 * var7;
         float var11 = var7 * var7 + var6 * var6;
         var4.method31182(var8);
         var3.method32824();
         var3.field40499 = var9;
         var3.field40503 = var9;
         var3.field40502 = -var10;
         var3.field40500 = var10;
         var3.field40507 = var11;
         var0.method32828(var3);
         var3.method32821();
         var3.method32828(var0);
         var0.method32823(var3);
      }

      if (var0.field40501 * var0.field40501 + var0.field40505 * var0.field40505 > 1.0E-6F) {
         Pair var12 = method32818(var0.field40499, 0.5F * (var0.field40501 + var0.field40505), var0.field40507);
         float var14 = -(Float)var12.getFirst();
         Float var16 = (Float)var12.getSecond();
         Quaternion var18 = new Quaternion(0.0F, var14, 0.0F, var16);
         float var20 = var16 * var16 - var14 * var14;
         float var22 = -2.0F * var14 * var16;
         float var24 = var16 * var16 + var14 * var14;
         var4.method31182(var18);
         var3.method32824();
         var3.field40499 = var20;
         var3.field40507 = var20;
         var3.field40505 = var22;
         var3.field40501 = -var22;
         var3.field40503 = var24;
         var0.method32828(var3);
         var3.method32821();
         var3.method32828(var0);
         var0.method32823(var3);
      }

      if (var0.field40504 * var0.field40504 + var0.field40506 * var0.field40506 > 1.0E-6F) {
         Pair var13 = method32818(var0.field40503, 0.5F * (var0.field40504 + var0.field40506), var0.field40507);
         Float var15 = (Float)var13.getFirst();
         Float var17 = (Float)var13.getSecond();
         Quaternion var19 = new Quaternion(var15, 0.0F, 0.0F, var17);
         float var21 = var17 * var17 - var15 * var15;
         float var23 = -2.0F * var15 * var17;
         float var25 = var17 * var17 + var15 * var15;
         var4.method31182(var19);
         var3.method32824();
         var3.field40503 = var21;
         var3.field40507 = var21;
         var3.field40506 = -var23;
         var3.field40504 = var23;
         var3.field40499 = var25;
         var0.method32828(var3);
         var3.method32821();
         var3.method32828(var0);
         var0.method32823(var3);
      }

      return var4;
   }

   public void method32821() {
      float var3 = this.field40500;
      this.field40500 = this.field40502;
      this.field40502 = var3;
      var3 = this.field40501;
      this.field40501 = this.field40505;
      this.field40505 = var3;
      var3 = this.field40504;
      this.field40504 = this.field40506;
      this.field40506 = var3;
   }

   public Triple<Quaternion, Vector3f, Quaternion> method32822() {
      Quaternion var3 = Quaternion.field39030.method31189();
      Quaternion var4 = Quaternion.field39030.method31189();
      Class8967 var5 = this.method32831();
      var5.method32821();
      var5.method32828(this);

      for (int var6 = 0; var6 < 5; var6++) {
         var4.method31182(method32820(var5));
      }

      var4.method31188();
      Class8967 var31 = new Class8967(this);
      var31.method32828(new Class8967(var4));
      float var7 = 1.0F;
      Pair var8 = method32819(var31.field40499, var31.field40502);
      Float var9 = (Float)var8.getFirst();
      Float var10 = (Float)var8.getSecond();
      float var11 = var10 * var10 - var9 * var9;
      float var12 = -2.0F * var9 * var10;
      float var13 = var10 * var10 + var9 * var9;
      Quaternion var14 = new Quaternion(0.0F, 0.0F, var9, var10);
      var3.method31182(var14);
      Class8967 var15 = new Class8967();
      var15.method32824();
      var15.field40499 = var11;
      var15.field40503 = var11;
      var15.field40502 = var12;
      var15.field40500 = -var12;
      var15.field40507 = var13;
      var7 *= var13;
      var15.method32828(var31);
      var8 = method32819(var15.field40499, var15.field40505);
      float var16 = -(Float)var8.getFirst();
      Float var17 = (Float)var8.getSecond();
      float var18 = var17 * var17 - var16 * var16;
      float var19 = -2.0F * var16 * var17;
      float var20 = var17 * var17 + var16 * var16;
      Quaternion var21 = new Quaternion(0.0F, var16, 0.0F, var17);
      var3.method31182(var21);
      Class8967 var22 = new Class8967();
      var22.method32824();
      var22.field40499 = var18;
      var22.field40507 = var18;
      var22.field40505 = -var19;
      var22.field40501 = var19;
      var22.field40503 = var20;
      var7 *= var20;
      var22.method32828(var15);
      var8 = method32819(var22.field40503, var22.field40506);
      Float var23 = (Float)var8.getFirst();
      Float var24 = (Float)var8.getSecond();
      float var25 = var24 * var24 - var23 * var23;
      float var26 = -2.0F * var23 * var24;
      float var27 = var24 * var24 + var23 * var23;
      Quaternion var28 = new Quaternion(var23, 0.0F, 0.0F, var24);
      var3.method31182(var28);
      Class8967 var29 = new Class8967();
      var29.method32824();
      var29.field40503 = var25;
      var29.field40507 = var25;
      var29.field40506 = var26;
      var29.field40504 = -var26;
      var29.field40499 = var27;
      var7 *= var27;
      var29.method32828(var22);
      var7 = 1.0F / var7;
      var3.method31183((float)Math.sqrt((double)var7));
      Vector3f var30 = new Vector3f(var29.field40499 * var7, var29.field40503 * var7, var29.field40507 * var7);
      return Triple.of(var3, var30, var4);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class8967 var4 = (Class8967)var1;
         return Float.compare(var4.field40499, this.field40499) == 0
            && Float.compare(var4.field40500, this.field40500) == 0
            && Float.compare(var4.field40501, this.field40501) == 0
            && Float.compare(var4.field40502, this.field40502) == 0
            && Float.compare(var4.field40503, this.field40503) == 0
            && Float.compare(var4.field40504, this.field40504) == 0
            && Float.compare(var4.field40505, this.field40505) == 0
            && Float.compare(var4.field40506, this.field40506) == 0
            && Float.compare(var4.field40507, this.field40507) == 0;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field40499 == 0.0F ? 0 : Float.floatToIntBits(this.field40499);
      var3 = 31 * var3 + (this.field40500 == 0.0F ? 0 : Float.floatToIntBits(this.field40500));
      var3 = 31 * var3 + (this.field40501 == 0.0F ? 0 : Float.floatToIntBits(this.field40501));
      var3 = 31 * var3 + (this.field40502 == 0.0F ? 0 : Float.floatToIntBits(this.field40502));
      var3 = 31 * var3 + (this.field40503 == 0.0F ? 0 : Float.floatToIntBits(this.field40503));
      var3 = 31 * var3 + (this.field40504 == 0.0F ? 0 : Float.floatToIntBits(this.field40504));
      var3 = 31 * var3 + (this.field40505 == 0.0F ? 0 : Float.floatToIntBits(this.field40505));
      var3 = 31 * var3 + (this.field40506 == 0.0F ? 0 : Float.floatToIntBits(this.field40506));
      return 31 * var3 + (this.field40507 == 0.0F ? 0 : Float.floatToIntBits(this.field40507));
   }

   public void method32823(Class8967 var1) {
      this.field40499 = var1.field40499;
      this.field40500 = var1.field40500;
      this.field40501 = var1.field40501;
      this.field40502 = var1.field40502;
      this.field40503 = var1.field40503;
      this.field40504 = var1.field40504;
      this.field40505 = var1.field40505;
      this.field40506 = var1.field40506;
      this.field40507 = var1.field40507;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append("Matrix3f:\n");
      var3.append(this.field40499);
      var3.append(" ");
      var3.append(this.field40500);
      var3.append(" ");
      var3.append(this.field40501);
      var3.append("\n");
      var3.append(this.field40502);
      var3.append(" ");
      var3.append(this.field40503);
      var3.append(" ");
      var3.append(this.field40504);
      var3.append("\n");
      var3.append(this.field40505);
      var3.append(" ");
      var3.append(this.field40506);
      var3.append(" ");
      var3.append(this.field40507);
      var3.append("\n");
      return var3.toString();
   }

   public void method32824() {
      this.field40499 = 1.0F;
      this.field40500 = 0.0F;
      this.field40501 = 0.0F;
      this.field40502 = 0.0F;
      this.field40503 = 1.0F;
      this.field40504 = 0.0F;
      this.field40505 = 0.0F;
      this.field40506 = 0.0F;
      this.field40507 = 1.0F;
   }

   public float method32825() {
      float var3 = this.field40503 * this.field40507 - this.field40504 * this.field40506;
      float var4 = -(this.field40502 * this.field40507 - this.field40504 * this.field40505);
      float var5 = this.field40502 * this.field40506 - this.field40503 * this.field40505;
      float var6 = -(this.field40500 * this.field40507 - this.field40501 * this.field40506);
      float var7 = this.field40499 * this.field40507 - this.field40501 * this.field40505;
      float var8 = -(this.field40499 * this.field40506 - this.field40500 * this.field40505);
      float var9 = this.field40500 * this.field40504 - this.field40501 * this.field40503;
      float var10 = -(this.field40499 * this.field40504 - this.field40501 * this.field40502);
      float var11 = this.field40499 * this.field40503 - this.field40500 * this.field40502;
      float var12 = this.field40499 * var3 + this.field40500 * var4 + this.field40501 * var5;
      this.field40499 = var3;
      this.field40502 = var4;
      this.field40505 = var5;
      this.field40500 = var6;
      this.field40503 = var7;
      this.field40506 = var8;
      this.field40501 = var9;
      this.field40504 = var10;
      this.field40507 = var11;
      return var12;
   }

   public boolean method32826() {
      float var3 = this.method32825();
      if (!(Math.abs(var3) > 1.0E-6F)) {
         return false;
      } else {
         this.method32830(var3);
         return true;
      }
   }

   public void method32827(int var1, int var2, float var3) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var2 != 0) {
               if (var2 != 1) {
                  this.field40507 = var3;
               } else {
                  this.field40506 = var3;
               }
            } else {
               this.field40505 = var3;
            }
         } else if (var2 != 0) {
            if (var2 != 1) {
               this.field40504 = var3;
            } else {
               this.field40503 = var3;
            }
         } else {
            this.field40502 = var3;
         }
      } else if (var2 != 0) {
         if (var2 != 1) {
            this.field40501 = var3;
         } else {
            this.field40500 = var3;
         }
      } else {
         this.field40499 = var3;
      }
   }

   public void method32828(Class8967 var1) {
      float var4 = this.field40499 * var1.field40499 + this.field40500 * var1.field40502 + this.field40501 * var1.field40505;
      float var5 = this.field40499 * var1.field40500 + this.field40500 * var1.field40503 + this.field40501 * var1.field40506;
      float var6 = this.field40499 * var1.field40501 + this.field40500 * var1.field40504 + this.field40501 * var1.field40507;
      float var7 = this.field40502 * var1.field40499 + this.field40503 * var1.field40502 + this.field40504 * var1.field40505;
      float var8 = this.field40502 * var1.field40500 + this.field40503 * var1.field40503 + this.field40504 * var1.field40506;
      float var9 = this.field40502 * var1.field40501 + this.field40503 * var1.field40504 + this.field40504 * var1.field40507;
      float var10 = this.field40505 * var1.field40499 + this.field40506 * var1.field40502 + this.field40507 * var1.field40505;
      float var11 = this.field40505 * var1.field40500 + this.field40506 * var1.field40503 + this.field40507 * var1.field40506;
      float var12 = this.field40505 * var1.field40501 + this.field40506 * var1.field40504 + this.field40507 * var1.field40507;
      this.field40499 = var4;
      this.field40500 = var5;
      this.field40501 = var6;
      this.field40502 = var7;
      this.field40503 = var8;
      this.field40504 = var9;
      this.field40505 = var10;
      this.field40506 = var11;
      this.field40507 = var12;
   }

   public void method32829(Quaternion var1) {
      float var4 = var1.method31178();
      float var5 = var1.method31179();
      float var6 = var1.method31180();
      float var7 = var1.method31181();
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
      float var20 = 2.0F * (var11 + var16);
      float var21 = 1.0F - var10 - var8;
      float var22 = 2.0F * (var12 - var14);
      float var23 = 2.0F * (var13 - var15);
      float var24 = 2.0F * (var12 + var14);
      float var25 = 1.0F - var8 - var9;
      float var26 = this.field40499 * var17 + this.field40500 * var20 + this.field40501 * var23;
      float var27 = this.field40499 * var18 + this.field40500 * var21 + this.field40501 * var24;
      float var28 = this.field40499 * var19 + this.field40500 * var22 + this.field40501 * var25;
      float var29 = this.field40502 * var17 + this.field40503 * var20 + this.field40504 * var23;
      float var30 = this.field40502 * var18 + this.field40503 * var21 + this.field40504 * var24;
      float var31 = this.field40502 * var19 + this.field40503 * var22 + this.field40504 * var25;
      float var32 = this.field40505 * var17 + this.field40506 * var20 + this.field40507 * var23;
      float var33 = this.field40505 * var18 + this.field40506 * var21 + this.field40507 * var24;
      float var34 = this.field40505 * var19 + this.field40506 * var22 + this.field40507 * var25;
      this.field40499 = var26;
      this.field40500 = var27;
      this.field40501 = var28;
      this.field40502 = var29;
      this.field40503 = var30;
      this.field40504 = var31;
      this.field40505 = var32;
      this.field40506 = var33;
      this.field40507 = var34;
   }

   public void method32830(float var1) {
      this.field40499 *= var1;
      this.field40500 *= var1;
      this.field40501 *= var1;
      this.field40502 *= var1;
      this.field40503 *= var1;
      this.field40504 *= var1;
      this.field40505 *= var1;
      this.field40506 *= var1;
      this.field40507 *= var1;
   }

   public Class8967 method32831() {
      return new Class8967(this);
   }

   public float method32832(float var1, float var2, float var3) {
      return this.field40499 * var1 + this.field40500 * var2 + this.field40501 * var3;
   }

   public float method32833(float var1, float var2, float var3) {
      return this.field40502 * var1 + this.field40503 * var2 + this.field40504 * var3;
   }

   public float method32834(float var1, float var2, float var3) {
      return this.field40505 * var1 + this.field40506 * var2 + this.field40507 * var3;
   }

   public void method32835(Random var1) {
      this.field40499 = var1.nextFloat();
      this.field40500 = var1.nextFloat();
      this.field40501 = var1.nextFloat();
      this.field40502 = var1.nextFloat();
      this.field40503 = var1.nextFloat();
      this.field40504 = var1.nextFloat();
      this.field40505 = var1.nextFloat();
      this.field40506 = var1.nextFloat();
      this.field40507 = var1.nextFloat();
   }

   public void method32836(Class8967 var1) {
      Class8967 var4 = var1.method32831();
      var4.method32828(this);
      this.method32823(var4);
   }
}
