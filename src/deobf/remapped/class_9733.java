package remapped;

import java.util.Random;
import java.util.stream.Stream;

public abstract class class_9733 {
   private static final class_4092 field_49483 = new class_4092(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   public final ClientWorld field_49469;
   public double field_49459;
   public double field_49480;
   public double field_49479;
   public double field_49462;
   public double field_49473;
   public double field_49465;
   public double field_49481;
   public double field_49486;
   public double field_49471;
   private class_4092 field_49461 = field_49483;
   public boolean field_49482;
   public boolean field_49474 = true;
   private boolean field_49460;
   public boolean field_49464;
   public float field_49484 = 0.6F;
   public float field_49463 = 1.8F;
   public final Random field_49466 = new Random();
   public int field_49475;
   public int field_49476;
   public float field_49477;
   public float field_49485 = 1.0F;
   public float field_49468 = 1.0F;
   public float field_49487 = 1.0F;
   public float field_49470 = 1.0F;
   public float field_49478;
   public float field_49467;
   private class_523 field_49472 = new class_523();

   public class_9733(ClientWorld var1, double var2, double var4, double var6) {
      this.field_49469 = var1;
      this.method_44955(0.2F, 0.2F);
      this.method_44960(var2, var4, var6);
      this.field_49459 = var2;
      this.field_49480 = var4;
      this.field_49479 = var6;
      this.field_49476 = (int)(4.0F / (this.field_49466.nextFloat() * 0.9F + 0.1F));
   }

   public class_9733(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6);
      this.field_49481 = var8 + (Math.random() * 2.0 - 1.0) * 0.4F;
      this.field_49486 = var10 + (Math.random() * 2.0 - 1.0) * 0.4F;
      this.field_49471 = var12 + (Math.random() * 2.0 - 1.0) * 0.4F;
      float var16 = (float)(Math.random() + Math.random() + 1.0) * 0.15F;
      float var17 = class_9299.method_42842(this.field_49481 * this.field_49481 + this.field_49486 * this.field_49486 + this.field_49471 * this.field_49471);
      this.field_49481 = this.field_49481 / (double)var17 * (double)var16 * 0.4F;
      this.field_49486 = this.field_49486 / (double)var17 * (double)var16 * 0.4F + 0.1F;
      this.field_49471 = this.field_49471 / (double)var17 * (double)var16 * 0.4F;
   }

   public class_9733 method_44963(float var1) {
      this.field_49481 *= (double)var1;
      this.field_49486 = (this.field_49486 - 0.1F) * (double)var1 + 0.1F;
      this.field_49471 *= (double)var1;
      return this;
   }

   public class_9733 method_44947(float var1) {
      this.method_44955(0.2F * var1, 0.2F * var1);
      return this;
   }

   public void method_44953(float var1, float var2, float var3) {
      this.field_49485 = var1;
      this.field_49468 = var2;
      this.field_49487 = var3;
   }

   public void method_44956(float var1) {
      this.field_49470 = var1;
   }

   public void method_44950(int var1) {
      this.field_49476 = var1;
   }

   public int method_44958() {
      return this.field_49476;
   }

   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         this.field_49486 = this.field_49486 - 0.04 * (double)this.field_49477;
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.field_49481 *= 0.98F;
         this.field_49486 *= 0.98F;
         this.field_49471 *= 0.98F;
         if (this.field_49482) {
            this.field_49481 *= 0.7F;
            this.field_49471 *= 0.7F;
         }
      } else {
         this.method_44948();
      }
   }

   public abstract void method_44951(class_7907 var1, Camera var2, float var3);

   public abstract class_7154 method_44957();

   @Override
   public String toString() {
      return this.getClass().getSimpleName()
         + ", Pos ("
         + this.field_49462
         + ","
         + this.field_49473
         + ","
         + this.field_49465
         + "), RGBA ("
         + this.field_49485
         + ","
         + this.field_49468
         + ","
         + this.field_49487
         + ","
         + this.field_49470
         + "), Age "
         + this.field_49475;
   }

   public void method_44948() {
      this.field_49464 = true;
   }

   public void method_44955(float var1, float var2) {
      if (var1 != this.field_49484 || var2 != this.field_49463) {
         this.field_49484 = var1;
         this.field_49463 = var2;
         class_4092 var5 = this.method_44945();
         double var6 = (var5.field_19941 + var5.field_19940 - (double)var1) / 2.0;
         double var8 = (var5.field_19938 + var5.field_19942 - (double)var1) / 2.0;
         this.method_44961(
            new class_4092(
               var6, var5.field_19937, var8, var6 + (double)this.field_49484, var5.field_19937 + (double)this.field_49463, var8 + (double)this.field_49484
            )
         );
      }
   }

   public void method_44960(double var1, double var3, double var5) {
      this.field_49462 = var1;
      this.field_49473 = var3;
      this.field_49465 = var5;
      float var9 = this.field_49484 / 2.0F;
      float var10 = this.field_49463;
      this.method_44961(new class_4092(var1 - (double)var9, var3, var5 - (double)var9, var1 + (double)var9, var3 + (double)var10, var5 + (double)var9));
   }

   public void method_44962(double var1, double var3, double var5) {
      if (!this.field_49460) {
         double var9 = var1;
         double var11 = var3;
         double var13 = var5;
         if (this.field_49474 && (var1 != 0.0 || var3 != 0.0 || var5 != 0.0) && this.method_44954(var1, var3, var5)) {
            class_1343 var15 = Entity.method_37301(
               (Entity)null,
               new class_1343(var1, var3, var5),
               this.method_44945(),
               this.field_49469,
               class_214.method_928(),
               new class_4997<class_4190>(Stream.<class_4190>empty())
            );
            var1 = var15.field_7336;
            var3 = var15.field_7333;
            var5 = var15.field_7334;
         }

         if (var1 != 0.0 || var3 != 0.0 || var5 != 0.0) {
            this.method_44961(this.method_44945().method_18918(var1, var3, var5));
            this.method_44944();
         }

         if (Math.abs(var11) >= 1.0E-5F && Math.abs(var3) < 1.0E-5F) {
            this.field_49460 = true;
         }

         this.field_49482 = var11 != var3 && var11 < 0.0;
         if (var9 != var1) {
            this.field_49481 = 0.0;
         }

         if (var13 != var5) {
            this.field_49471 = 0.0;
         }
      }
   }

   public void method_44944() {
      class_4092 var3 = this.method_44945();
      this.field_49462 = (var3.field_19941 + var3.field_19940) / 2.0;
      this.field_49473 = var3.field_19937;
      this.field_49465 = (var3.field_19938 + var3.field_19942) / 2.0;
   }

   public int method_44952(float var1) {
      class_1331 var4 = new class_1331(this.field_49462, this.field_49473, this.field_49465);
      return !this.field_49469.method_22559(var4) ? 0 : WorldRenderer.method_20002(this.field_49469, var4);
   }

   public boolean method_44946() {
      return !this.field_49464;
   }

   public class_4092 method_44945() {
      return this.field_49461;
   }

   public void method_44961(class_4092 var1) {
      this.field_49461 = var1;
   }

   private boolean method_44954(double var1, double var3, double var5) {
      if (!(this.field_49484 > 1.0F) && !(this.field_49463 > 1.0F)) {
         int var9 = class_9299.method_42847(this.field_49462);
         int var10 = class_9299.method_42847(this.field_49473);
         int var11 = class_9299.method_42847(this.field_49465);
         this.field_49472.method_2548(var9, var10, var11);
         class_2522 var12 = this.field_49469.method_28262(this.field_49472);
         if (var12.method_8345()) {
            double var13 = !(var1 > 0.0) ? (!(var1 < 0.0) ? this.field_49462 : this.field_49461.field_19941) : this.field_49461.field_19940;
            double var15 = !(var3 > 0.0) ? (!(var3 < 0.0) ? this.field_49473 : this.field_49461.field_19937) : this.field_49461.field_19939;
            double var17 = !(var5 > 0.0) ? (!(var5 < 0.0) ? this.field_49465 : this.field_49461.field_19938) : this.field_49461.field_19942;
            int var19 = class_9299.method_42847(var13 + var1);
            int var20 = class_9299.method_42847(var15 + var3);
            int var21 = class_9299.method_42847(var17 + var5);
            if (var19 != var9 || var20 != var10 || var21 != var11) {
               this.field_49472.method_2548(var19, var20, var21);
               class_2522 var22 = this.field_49469.method_28262(this.field_49472);
               if (!var22.method_8345()) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public boolean method_44959() {
      return true;
   }
}
