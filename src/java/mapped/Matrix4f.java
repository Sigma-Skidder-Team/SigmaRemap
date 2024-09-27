package mapped;

import net.minecraft.util.math.vector.Quaternion;

import java.nio.FloatBuffer;
import java.util.Random;

public final class Matrix4f {
   public float field43471;
   public float field43472;
   public float field43473;
   public float field43474;
   public float field43475;
   public float field43476;
   public float field43477;
   public float field43478;
   public float field43479;
   public float field43480;
   public float field43481;
   public float field43482;
   public float field43483;
   public float field43484;
   public float field43485;
   public float field43486;

   public Matrix4f() {
   }

   public Matrix4f(Matrix4f var1) {
      this.field43471 = var1.field43471;
      this.field43472 = var1.field43472;
      this.field43473 = var1.field43473;
      this.field43474 = var1.field43474;
      this.field43475 = var1.field43475;
      this.field43476 = var1.field43476;
      this.field43477 = var1.field43477;
      this.field43478 = var1.field43478;
      this.field43479 = var1.field43479;
      this.field43480 = var1.field43480;
      this.field43481 = var1.field43481;
      this.field43482 = var1.field43482;
      this.field43483 = var1.field43483;
      this.field43484 = var1.field43484;
      this.field43485 = var1.field43485;
      this.field43486 = var1.field43486;
   }

   public Matrix4f(Quaternion var1) {
      float var4 = var1.method31178();
      float var5 = var1.method31179();
      float var6 = var1.method31180();
      float var7 = var1.method31181();
      float var8 = 2.0F * var4 * var4;
      float var9 = 2.0F * var5 * var5;
      float var10 = 2.0F * var6 * var6;
      this.field43471 = 1.0F - var9 - var10;
      this.field43476 = 1.0F - var10 - var8;
      this.field43481 = 1.0F - var8 - var9;
      this.field43486 = 1.0F;
      float var11 = var4 * var5;
      float var12 = var5 * var6;
      float var13 = var6 * var4;
      float var14 = var4 * var7;
      float var15 = var5 * var7;
      float var16 = var6 * var7;
      this.field43475 = 2.0F * (var11 + var16);
      this.field43472 = 2.0F * (var11 - var16);
      this.field43479 = 2.0F * (var13 - var15);
      this.field43473 = 2.0F * (var13 + var15);
      this.field43480 = 2.0F * (var12 + var14);
      this.field43477 = 2.0F * (var12 - var14);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Matrix4f var4 = (Matrix4f)var1;
         return Float.compare(var4.field43471, this.field43471) == 0
            && Float.compare(var4.field43472, this.field43472) == 0
            && Float.compare(var4.field43473, this.field43473) == 0
            && Float.compare(var4.field43474, this.field43474) == 0
            && Float.compare(var4.field43475, this.field43475) == 0
            && Float.compare(var4.field43476, this.field43476) == 0
            && Float.compare(var4.field43477, this.field43477) == 0
            && Float.compare(var4.field43478, this.field43478) == 0
            && Float.compare(var4.field43479, this.field43479) == 0
            && Float.compare(var4.field43480, this.field43480) == 0
            && Float.compare(var4.field43481, this.field43481) == 0
            && Float.compare(var4.field43482, this.field43482) == 0
            && Float.compare(var4.field43483, this.field43483) == 0
            && Float.compare(var4.field43484, this.field43484) == 0
            && Float.compare(var4.field43485, this.field43485) == 0
            && Float.compare(var4.field43486, this.field43486) == 0;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field43471 == 0.0F ? 0 : Float.floatToIntBits(this.field43471);
      var3 = 31 * var3 + (this.field43472 == 0.0F ? 0 : Float.floatToIntBits(this.field43472));
      var3 = 31 * var3 + (this.field43473 == 0.0F ? 0 : Float.floatToIntBits(this.field43473));
      var3 = 31 * var3 + (this.field43474 == 0.0F ? 0 : Float.floatToIntBits(this.field43474));
      var3 = 31 * var3 + (this.field43475 == 0.0F ? 0 : Float.floatToIntBits(this.field43475));
      var3 = 31 * var3 + (this.field43476 == 0.0F ? 0 : Float.floatToIntBits(this.field43476));
      var3 = 31 * var3 + (this.field43477 == 0.0F ? 0 : Float.floatToIntBits(this.field43477));
      var3 = 31 * var3 + (this.field43478 == 0.0F ? 0 : Float.floatToIntBits(this.field43478));
      var3 = 31 * var3 + (this.field43479 == 0.0F ? 0 : Float.floatToIntBits(this.field43479));
      var3 = 31 * var3 + (this.field43480 == 0.0F ? 0 : Float.floatToIntBits(this.field43480));
      var3 = 31 * var3 + (this.field43481 == 0.0F ? 0 : Float.floatToIntBits(this.field43481));
      var3 = 31 * var3 + (this.field43482 == 0.0F ? 0 : Float.floatToIntBits(this.field43482));
      var3 = 31 * var3 + (this.field43483 == 0.0F ? 0 : Float.floatToIntBits(this.field43483));
      var3 = 31 * var3 + (this.field43484 == 0.0F ? 0 : Float.floatToIntBits(this.field43484));
      var3 = 31 * var3 + (this.field43485 == 0.0F ? 0 : Float.floatToIntBits(this.field43485));
      return 31 * var3 + (this.field43486 == 0.0F ? 0 : Float.floatToIntBits(this.field43486));
   }

   private static int method35501(int var0, int var1) {
      return var1 * 4 + var0;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append("Matrix4f:\n");
      var3.append(this.field43471);
      var3.append(" ");
      var3.append(this.field43472);
      var3.append(" ");
      var3.append(this.field43473);
      var3.append(" ");
      var3.append(this.field43474);
      var3.append("\n");
      var3.append(this.field43475);
      var3.append(" ");
      var3.append(this.field43476);
      var3.append(" ");
      var3.append(this.field43477);
      var3.append(" ");
      var3.append(this.field43478);
      var3.append("\n");
      var3.append(this.field43479);
      var3.append(" ");
      var3.append(this.field43480);
      var3.append(" ");
      var3.append(this.field43481);
      var3.append(" ");
      var3.append(this.field43482);
      var3.append("\n");
      var3.append(this.field43483);
      var3.append(" ");
      var3.append(this.field43484);
      var3.append(" ");
      var3.append(this.field43485);
      var3.append(" ");
      var3.append(this.field43486);
      var3.append("\n");
      return var3.toString();
   }

   public void write(FloatBuffer var1) {
      var1.put(method35501(0, 0), this.field43471);
      var1.put(method35501(0, 1), this.field43472);
      var1.put(method35501(0, 2), this.field43473);
      var1.put(method35501(0, 3), this.field43474);
      var1.put(method35501(1, 0), this.field43475);
      var1.put(method35501(1, 1), this.field43476);
      var1.put(method35501(1, 2), this.field43477);
      var1.put(method35501(1, 3), this.field43478);
      var1.put(method35501(2, 0), this.field43479);
      var1.put(method35501(2, 1), this.field43480);
      var1.put(method35501(2, 2), this.field43481);
      var1.put(method35501(2, 3), this.field43482);
      var1.put(method35501(3, 0), this.field43483);
      var1.put(method35501(3, 1), this.field43484);
      var1.put(method35501(3, 2), this.field43485);
      var1.put(method35501(3, 3), this.field43486);
   }

   public void method35503() {
      this.field43471 = 1.0F;
      this.field43472 = 0.0F;
      this.field43473 = 0.0F;
      this.field43474 = 0.0F;
      this.field43475 = 0.0F;
      this.field43476 = 1.0F;
      this.field43477 = 0.0F;
      this.field43478 = 0.0F;
      this.field43479 = 0.0F;
      this.field43480 = 0.0F;
      this.field43481 = 1.0F;
      this.field43482 = 0.0F;
      this.field43483 = 0.0F;
      this.field43484 = 0.0F;
      this.field43485 = 0.0F;
      this.field43486 = 1.0F;
   }

   public boolean method35504() {
      return this.field43471 == 1.0F
         && this.field43472 == 0.0F
         && this.field43473 == 0.0F
         && this.field43474 == 0.0F
         && this.field43475 == 0.0F
         && this.field43476 == 1.0F
         && this.field43477 == 0.0F
         && this.field43478 == 0.0F
         && this.field43479 == 0.0F
         && this.field43480 == 0.0F
         && this.field43481 == 1.0F
         && this.field43482 == 0.0F
         && this.field43483 == 0.0F
         && this.field43484 == 0.0F
         && this.field43485 == 0.0F
         && this.field43486 == 1.0F;
   }

   public float method35505() {
      float var3 = this.field43471 * this.field43476 - this.field43472 * this.field43475;
      float var4 = this.field43471 * this.field43477 - this.field43473 * this.field43475;
      float var5 = this.field43471 * this.field43478 - this.field43474 * this.field43475;
      float var6 = this.field43472 * this.field43477 - this.field43473 * this.field43476;
      float var7 = this.field43472 * this.field43478 - this.field43474 * this.field43476;
      float var8 = this.field43473 * this.field43478 - this.field43474 * this.field43477;
      float var9 = this.field43479 * this.field43484 - this.field43480 * this.field43483;
      float var10 = this.field43479 * this.field43485 - this.field43481 * this.field43483;
      float var11 = this.field43479 * this.field43486 - this.field43482 * this.field43483;
      float var12 = this.field43480 * this.field43485 - this.field43481 * this.field43484;
      float var13 = this.field43480 * this.field43486 - this.field43482 * this.field43484;
      float var14 = this.field43481 * this.field43486 - this.field43482 * this.field43485;
      float var15 = this.field43476 * var14 - this.field43477 * var13 + this.field43478 * var12;
      float var16 = -this.field43475 * var14 + this.field43477 * var11 - this.field43478 * var10;
      float var17 = this.field43475 * var13 - this.field43476 * var11 + this.field43478 * var9;
      float var18 = -this.field43475 * var12 + this.field43476 * var10 - this.field43477 * var9;
      float var19 = -this.field43472 * var14 + this.field43473 * var13 - this.field43474 * var12;
      float var20 = this.field43471 * var14 - this.field43473 * var11 + this.field43474 * var10;
      float var21 = -this.field43471 * var13 + this.field43472 * var11 - this.field43474 * var9;
      float var22 = this.field43471 * var12 - this.field43472 * var10 + this.field43473 * var9;
      float var23 = this.field43484 * var8 - this.field43485 * var7 + this.field43486 * var6;
      float var24 = -this.field43483 * var8 + this.field43485 * var5 - this.field43486 * var4;
      float var25 = this.field43483 * var7 - this.field43484 * var5 + this.field43486 * var3;
      float var26 = -this.field43483 * var6 + this.field43484 * var4 - this.field43485 * var3;
      float var27 = -this.field43480 * var8 + this.field43481 * var7 - this.field43482 * var6;
      float var28 = this.field43479 * var8 - this.field43481 * var5 + this.field43482 * var4;
      float var29 = -this.field43479 * var7 + this.field43480 * var5 - this.field43482 * var3;
      float var30 = this.field43479 * var6 - this.field43480 * var4 + this.field43481 * var3;
      this.field43471 = var15;
      this.field43475 = var16;
      this.field43479 = var17;
      this.field43483 = var18;
      this.field43472 = var19;
      this.field43476 = var20;
      this.field43480 = var21;
      this.field43484 = var22;
      this.field43473 = var23;
      this.field43477 = var24;
      this.field43481 = var25;
      this.field43485 = var26;
      this.field43474 = var27;
      this.field43478 = var28;
      this.field43482 = var29;
      this.field43486 = var30;
      return var3 * var14 - var4 * var13 + var5 * var12 + var6 * var11 - var7 * var10 + var8 * var9;
   }

   public void method35506() {
      float var3 = this.field43475;
      this.field43475 = this.field43472;
      this.field43472 = var3;
      var3 = this.field43479;
      this.field43479 = this.field43473;
      this.field43473 = var3;
      var3 = this.field43480;
      this.field43480 = this.field43477;
      this.field43477 = var3;
      var3 = this.field43483;
      this.field43483 = this.field43474;
      this.field43474 = var3;
      var3 = this.field43484;
      this.field43484 = this.field43478;
      this.field43478 = var3;
      var3 = this.field43485;
      this.field43485 = this.field43482;
      this.field43482 = var3;
   }

   public boolean method35507() {
      float var3 = this.method35505();
      if (!(Math.abs(var3) > 1.0E-6F)) {
         return false;
      } else {
         this.method35510(var3);
         return true;
      }
   }

   public void method35508(Matrix4f var1) {
      float var4 = this.field43471 * var1.field43471
         + this.field43472 * var1.field43475
         + this.field43473 * var1.field43479
         + this.field43474 * var1.field43483;
      float var5 = this.field43471 * var1.field43472
         + this.field43472 * var1.field43476
         + this.field43473 * var1.field43480
         + this.field43474 * var1.field43484;
      float var6 = this.field43471 * var1.field43473
         + this.field43472 * var1.field43477
         + this.field43473 * var1.field43481
         + this.field43474 * var1.field43485;
      float var7 = this.field43471 * var1.field43474
         + this.field43472 * var1.field43478
         + this.field43473 * var1.field43482
         + this.field43474 * var1.field43486;
      float var8 = this.field43475 * var1.field43471
         + this.field43476 * var1.field43475
         + this.field43477 * var1.field43479
         + this.field43478 * var1.field43483;
      float var9 = this.field43475 * var1.field43472
         + this.field43476 * var1.field43476
         + this.field43477 * var1.field43480
         + this.field43478 * var1.field43484;
      float var10 = this.field43475 * var1.field43473
         + this.field43476 * var1.field43477
         + this.field43477 * var1.field43481
         + this.field43478 * var1.field43485;
      float var11 = this.field43475 * var1.field43474
         + this.field43476 * var1.field43478
         + this.field43477 * var1.field43482
         + this.field43478 * var1.field43486;
      float var12 = this.field43479 * var1.field43471
         + this.field43480 * var1.field43475
         + this.field43481 * var1.field43479
         + this.field43482 * var1.field43483;
      float var13 = this.field43479 * var1.field43472
         + this.field43480 * var1.field43476
         + this.field43481 * var1.field43480
         + this.field43482 * var1.field43484;
      float var14 = this.field43479 * var1.field43473
         + this.field43480 * var1.field43477
         + this.field43481 * var1.field43481
         + this.field43482 * var1.field43485;
      float var15 = this.field43479 * var1.field43474
         + this.field43480 * var1.field43478
         + this.field43481 * var1.field43482
         + this.field43482 * var1.field43486;
      float var16 = this.field43483 * var1.field43471
         + this.field43484 * var1.field43475
         + this.field43485 * var1.field43479
         + this.field43486 * var1.field43483;
      float var17 = this.field43483 * var1.field43472
         + this.field43484 * var1.field43476
         + this.field43485 * var1.field43480
         + this.field43486 * var1.field43484;
      float var18 = this.field43483 * var1.field43473
         + this.field43484 * var1.field43477
         + this.field43485 * var1.field43481
         + this.field43486 * var1.field43485;
      float var19 = this.field43483 * var1.field43474
         + this.field43484 * var1.field43478
         + this.field43485 * var1.field43482
         + this.field43486 * var1.field43486;
      this.field43471 = var4;
      this.field43472 = var5;
      this.field43473 = var6;
      this.field43474 = var7;
      this.field43475 = var8;
      this.field43476 = var9;
      this.field43477 = var10;
      this.field43478 = var11;
      this.field43479 = var12;
      this.field43480 = var13;
      this.field43481 = var14;
      this.field43482 = var15;
      this.field43483 = var16;
      this.field43484 = var17;
      this.field43485 = var18;
      this.field43486 = var19;
   }

   public void method35509(Quaternion var1) {
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
      float var33 = this.field43471 * var17 + this.field43472 * var21 + this.field43473 * var25 + this.field43474 * var29;
      float var34 = this.field43471 * var18 + this.field43472 * var22 + this.field43473 * var26 + this.field43474 * var30;
      float var35 = this.field43471 * var19 + this.field43472 * var23 + this.field43473 * var27 + this.field43474 * var31;
      float var36 = this.field43471 * var20 + this.field43472 * var24 + this.field43473 * var28 + this.field43474 * var32;
      float var37 = this.field43475 * var17 + this.field43476 * var21 + this.field43477 * var25 + this.field43478 * var29;
      float var38 = this.field43475 * var18 + this.field43476 * var22 + this.field43477 * var26 + this.field43478 * var30;
      float var39 = this.field43475 * var19 + this.field43476 * var23 + this.field43477 * var27 + this.field43478 * var31;
      float var40 = this.field43475 * var20 + this.field43476 * var24 + this.field43477 * var28 + this.field43478 * var32;
      float var41 = this.field43479 * var17 + this.field43480 * var21 + this.field43481 * var25 + this.field43482 * var29;
      float var42 = this.field43479 * var18 + this.field43480 * var22 + this.field43481 * var26 + this.field43482 * var30;
      float var43 = this.field43479 * var19 + this.field43480 * var23 + this.field43481 * var27 + this.field43482 * var31;
      float var44 = this.field43479 * var20 + this.field43480 * var24 + this.field43481 * var28 + this.field43482 * var32;
      float var45 = this.field43483 * var17 + this.field43484 * var21 + this.field43485 * var25 + this.field43486 * var29;
      float var46 = this.field43483 * var18 + this.field43484 * var22 + this.field43485 * var26 + this.field43486 * var30;
      float var47 = this.field43483 * var19 + this.field43484 * var23 + this.field43485 * var27 + this.field43486 * var31;
      float var48 = this.field43483 * var20 + this.field43484 * var24 + this.field43485 * var28 + this.field43486 * var32;
      this.field43471 = var33;
      this.field43472 = var34;
      this.field43473 = var35;
      this.field43474 = var36;
      this.field43475 = var37;
      this.field43476 = var38;
      this.field43477 = var39;
      this.field43478 = var40;
      this.field43479 = var41;
      this.field43480 = var42;
      this.field43481 = var43;
      this.field43482 = var44;
      this.field43483 = var45;
      this.field43484 = var46;
      this.field43485 = var47;
      this.field43486 = var48;
   }

   public void method35510(float var1) {
      this.field43471 *= var1;
      this.field43472 *= var1;
      this.field43473 *= var1;
      this.field43474 *= var1;
      this.field43475 *= var1;
      this.field43476 *= var1;
      this.field43477 *= var1;
      this.field43478 *= var1;
      this.field43479 *= var1;
      this.field43480 *= var1;
      this.field43481 *= var1;
      this.field43482 *= var1;
      this.field43483 *= var1;
      this.field43484 *= var1;
      this.field43485 *= var1;
      this.field43486 *= var1;
   }

   public static Matrix4f method35511(double var0, float var2, float var3, float var4) {
      float var7 = (float)(1.0 / Math.tan(var0 * (float) (Math.PI / 180.0) / 2.0));
      Matrix4f var8 = new Matrix4f();
      var8.field43471 = var7 / var2;
      var8.field43476 = var7;
      var8.field43481 = (var4 + var3) / (var3 - var4);
      var8.field43485 = -1.0F;
      var8.field43482 = 2.0F * var4 * var3 / (var3 - var4);
      return var8;
   }

   public static Matrix4f method35512(float var0, float var1, float var2, float var3) {
      Matrix4f var6 = new Matrix4f();
      var6.field43471 = 2.0F / var0;
      var6.field43476 = 2.0F / var1;
      float var7 = var3 - var2;
      var6.field43481 = -2.0F / var7;
      var6.field43486 = 1.0F;
      var6.field43474 = -1.0F;
      var6.field43478 = -1.0F;
      var6.field43482 = -(var3 + var2) / var7;
      return var6;
   }

   public void method35513(Vector3f var1) {
      this.field43474 = this.field43474 + var1.method25269();
      this.field43478 = this.field43478 + var1.method25270();
      this.field43482 = this.field43482 + var1.method25271();
   }

   public Matrix4f method35514() {
      return new Matrix4f(this);
   }

   public static Matrix4f method35515(float var0, float var1, float var2) {
      Matrix4f var5 = new Matrix4f();
      var5.field43471 = var0;
      var5.field43476 = var1;
      var5.field43481 = var2;
      var5.field43486 = 1.0F;
      return var5;
   }

   public static Matrix4f method35516(float var0, float var1, float var2) {
      Matrix4f var5 = new Matrix4f();
      var5.field43471 = 1.0F;
      var5.field43476 = 1.0F;
      var5.field43481 = 1.0F;
      var5.field43486 = 1.0F;
      var5.field43474 = var0;
      var5.field43478 = var1;
      var5.field43482 = var2;
      return var5;
   }

   public float method35517(float var1, float var2, float var3, float var4) {
      return this.field43471 * var1 + this.field43472 * var2 + this.field43473 * var3 + this.field43474 * var4;
   }

   public float method35518(float var1, float var2, float var3, float var4) {
      return this.field43475 * var1 + this.field43476 * var2 + this.field43477 * var3 + this.field43478 * var4;
   }

   public float method35519(float var1, float var2, float var3, float var4) {
      return this.field43479 * var1 + this.field43480 * var2 + this.field43481 * var3 + this.field43482 * var4;
   }

   public float method35520(float var1, float var2, float var3, float var4) {
      return this.field43483 * var1 + this.field43484 * var2 + this.field43485 * var3 + this.field43486 * var4;
   }

   public void method35521(float var1, float var2, float var3) {
      this.field43474 = this.field43474 + this.field43471 * var1 + this.field43472 * var2 + this.field43473 * var3;
      this.field43478 = this.field43478 + this.field43475 * var1 + this.field43476 * var2 + this.field43477 * var3;
      this.field43482 = this.field43482 + this.field43479 * var1 + this.field43480 * var2 + this.field43481 * var3;
      this.field43486 = this.field43486 + this.field43483 * var1 + this.field43484 * var2 + this.field43485 * var3;
   }

   public void method35522(float var1, float var2, float var3) {
      this.field43471 *= var1;
      this.field43472 *= var2;
      this.field43473 *= var3;
      this.field43475 *= var1;
      this.field43476 *= var2;
      this.field43477 *= var3;
      this.field43479 *= var1;
      this.field43480 *= var2;
      this.field43481 *= var3;
      this.field43483 *= var1;
      this.field43484 *= var2;
      this.field43485 *= var3;
   }

   public void method35523(Random var1) {
      this.field43471 = var1.nextFloat();
      this.field43472 = var1.nextFloat();
      this.field43473 = var1.nextFloat();
      this.field43474 = var1.nextFloat();
      this.field43475 = var1.nextFloat();
      this.field43476 = var1.nextFloat();
      this.field43477 = var1.nextFloat();
      this.field43478 = var1.nextFloat();
      this.field43479 = var1.nextFloat();
      this.field43480 = var1.nextFloat();
      this.field43481 = var1.nextFloat();
      this.field43482 = var1.nextFloat();
      this.field43483 = var1.nextFloat();
      this.field43484 = var1.nextFloat();
      this.field43485 = var1.nextFloat();
      this.field43486 = var1.nextFloat();
   }

   public void method35524(float[] var1) {
      var1[0] = this.field43471;
      var1[1] = this.field43472;
      var1[2] = this.field43473;
      var1[3] = this.field43474;
      var1[4] = this.field43475;
      var1[5] = this.field43476;
      var1[6] = this.field43477;
      var1[7] = this.field43478;
      var1[8] = this.field43479;
      var1[9] = this.field43480;
      var1[10] = this.field43481;
      var1[11] = this.field43482;
      var1[12] = this.field43483;
      var1[13] = this.field43484;
      var1[14] = this.field43485;
      var1[15] = this.field43486;
   }

   public Matrix4f(float[] var1) {
      this.field43471 = var1[0];
      this.field43472 = var1[1];
      this.field43473 = var1[2];
      this.field43474 = var1[3];
      this.field43475 = var1[4];
      this.field43476 = var1[5];
      this.field43477 = var1[6];
      this.field43478 = var1[7];
      this.field43479 = var1[8];
      this.field43480 = var1[9];
      this.field43481 = var1[10];
      this.field43482 = var1[11];
      this.field43483 = var1[12];
      this.field43484 = var1[13];
      this.field43485 = var1[14];
      this.field43486 = var1[15];
   }

   public void method35525(Matrix4f var1) {
      this.field43471 = var1.field43471;
      this.field43472 = var1.field43472;
      this.field43473 = var1.field43473;
      this.field43474 = var1.field43474;
      this.field43475 = var1.field43475;
      this.field43476 = var1.field43476;
      this.field43477 = var1.field43477;
      this.field43478 = var1.field43478;
      this.field43479 = var1.field43479;
      this.field43480 = var1.field43480;
      this.field43481 = var1.field43481;
      this.field43482 = var1.field43482;
      this.field43483 = var1.field43483;
      this.field43484 = var1.field43484;
      this.field43485 = var1.field43485;
      this.field43486 = var1.field43486;
   }

   public void method35526(Matrix4f var1) {
      this.field43471 = this.field43471 + var1.field43471;
      this.field43472 = this.field43472 + var1.field43472;
      this.field43473 = this.field43473 + var1.field43473;
      this.field43474 = this.field43474 + var1.field43474;
      this.field43475 = this.field43475 + var1.field43475;
      this.field43476 = this.field43476 + var1.field43476;
      this.field43477 = this.field43477 + var1.field43477;
      this.field43478 = this.field43478 + var1.field43478;
      this.field43479 = this.field43479 + var1.field43479;
      this.field43480 = this.field43480 + var1.field43480;
      this.field43481 = this.field43481 + var1.field43481;
      this.field43482 = this.field43482 + var1.field43482;
      this.field43483 = this.field43483 + var1.field43483;
      this.field43484 = this.field43484 + var1.field43484;
      this.field43485 = this.field43485 + var1.field43485;
      this.field43486 = this.field43486 + var1.field43486;
   }

   public void method35527(Matrix4f var1) {
      Matrix4f var4 = var1.method35514();
      var4.method35508(this);
      this.method35525(var4);
   }

   public void method35528(float var1, float var2, float var3) {
      this.field43471 = 1.0F;
      this.field43476 = 1.0F;
      this.field43481 = 1.0F;
      this.field43486 = 1.0F;
      this.field43474 = var1;
      this.field43478 = var2;
      this.field43482 = var3;
   }
}
