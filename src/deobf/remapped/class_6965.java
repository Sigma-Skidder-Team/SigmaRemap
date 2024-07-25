package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_6965 extends class_2783 {
   public static final int field_35797 = 1;
   public static final int field_35790 = 2;
   public static final int field_35791 = 4;
   public static final int field_35792 = 8;
   public static final int field_35794 = 15;
   private static final int field_35795 = 25;
   private float field_35799;
   private int field_35796;
   private int field_35793;

   public class_6965(float var1, float var2, float var3, float var4, float var5) {
      this(var1, var2, var3, var4, var5, 25);
   }

   public class_6965(float var1, float var2, float var3, float var4, float var5, int var6) {
      this(var1, var2, var3, var4, var5, var6, 15);
   }

   public class_6965(float var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      super(var1, var2, var3, var4);
      if (!(var5 < 0.0F)) {
         this.field_16381 = var1;
         this.field_16380 = var2;
         this.field_13583 = var3;
         this.field_13582 = var4;
         this.field_35799 = var5;
         this.field_35796 = var6;
         this.field_16377 = true;
         this.field_35793 = var7;
      } else {
         throw new IllegalArgumentException("corner radius must be >= 0");
      }
   }

   public float method_31853() {
      return this.field_35799;
   }

   public void method_31854(float var1) {
      if (var1 >= 0.0F && var1 != this.field_35799) {
         this.field_35799 = var1;
         this.field_16377 = true;
      }
   }

   @Override
   public float method_15239() {
      return this.field_13582;
   }

   @Override
   public void method_12660(float var1) {
      if (this.field_13582 != var1) {
         this.field_13582 = var1;
         this.field_16377 = true;
      }
   }

   @Override
   public float method_15213() {
      return this.field_13583;
   }

   @Override
   public void method_12653(float var1) {
      if (var1 != this.field_13583) {
         this.field_13583 = var1;
         this.field_16377 = true;
      }
   }

   @Override
   public void method_15217() {
      this.field_16386 = this.field_16381 + this.field_13583;
      this.field_16375 = this.field_16380 + this.field_13582;
      this.field_16384 = this.field_16381;
      this.field_16383 = this.field_16380;
      float var3 = this.field_13583 - 1.0F;
      float var4 = this.field_13582 - 1.0F;
      if (this.field_35799 != 0.0F) {
         float var5 = this.field_35799 * 2.0F;
         if (var5 > var3) {
            var5 = var3;
            this.field_35799 = var3 / 2.0F;
         }

         if (var5 > var4) {
            this.field_35799 = var4 / 2.0F;
         }

         ArrayList var6 = new ArrayList();
         if ((this.field_35793 & 1) == 0) {
            var6.add(new Float(this.field_16381));
            var6.add(new Float(this.field_16380));
         } else {
            var6.addAll(
               this.method_31852(this.field_35796, this.field_35799, this.field_16381 + this.field_35799, this.field_16380 + this.field_35799, 180.0F, 270.0F)
            );
         }

         if ((this.field_35793 & 2) == 0) {
            var6.add(new Float(this.field_16381 + var3));
            var6.add(new Float(this.field_16380));
         } else {
            var6.addAll(
               this.method_31852(
                  this.field_35796, this.field_35799, this.field_16381 + var3 - this.field_35799, this.field_16380 + this.field_35799, 270.0F, 360.0F
               )
            );
         }

         if ((this.field_35793 & 4) == 0) {
            var6.add(new Float(this.field_16381 + var3));
            var6.add(new Float(this.field_16380 + var4));
         } else {
            var6.addAll(
               this.method_31852(
                  this.field_35796, this.field_35799, this.field_16381 + var3 - this.field_35799, this.field_16380 + var4 - this.field_35799, 0.0F, 90.0F
               )
            );
         }

         if ((this.field_35793 & 8) == 0) {
            var6.add(new Float(this.field_16381));
            var6.add(new Float(this.field_16380 + var4));
         } else {
            var6.addAll(
               this.method_31852(
                  this.field_35796, this.field_35799, this.field_16381 + this.field_35799, this.field_16380 + var4 - this.field_35799, 90.0F, 180.0F
               )
            );
         }

         this.field_16385 = new float[var6.size()];

         for (int var7 = 0; var7 < var6.size(); var7++) {
            this.field_16385[var7] = (Float)var6.get(var7);
         }
      } else {
         this.field_16385 = new float[8];
         this.field_16385[0] = this.field_16381;
         this.field_16385[1] = this.field_16380;
         this.field_16385[2] = this.field_16381 + var3;
         this.field_16385[3] = this.field_16380;
         this.field_16385[4] = this.field_16381 + var3;
         this.field_16385[5] = this.field_16380 + var4;
         this.field_16385[6] = this.field_16381;
         this.field_16385[7] = this.field_16380 + var4;
      }

      this.method_15218();
      this.method_15235();
   }

   private List method_31852(int var1, float var2, float var3, float var4, float var5, float var6) {
      ArrayList var9 = new ArrayList();
      int var10 = 360 / var1;

      for (float var11 = var5; var11 <= var6 + (float)var10; var11 += (float)var10) {
         float var12 = var11;
         if (var11 > var6) {
            var12 = var6;
         }

         float var13 = (float)((double)var3 + class_215.method_933(Math.toRadians((double)var12)) * (double)var2);
         float var14 = (float)((double)var4 + class_215.method_932(Math.toRadians((double)var12)) * (double)var2);
         var9.add(new Float(var13));
         var9.add(new Float(var14));
      }

      return var9;
   }

   @Override
   public class_3316 method_15207(class_4508 var1) {
      this.method_15202();
      class_6714 var4 = new class_6714();
      float[] var5 = new float[this.field_16385.length];
      var1.method_20952(this.field_16385, 0, var5, 0, this.field_16385.length / 2);
      var4.field_16385 = var5;
      var4.method_15218();
      return var4;
   }
}
