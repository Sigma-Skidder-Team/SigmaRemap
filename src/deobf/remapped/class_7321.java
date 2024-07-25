package remapped;

import java.util.Random;

public class class_7321 {
   private static String[] field_37431;
   private double field_37430;
   private double field_37432;

   public double method_33376(class_7321 var1) {
      double var4 = this.field_37430 - var1.field_37430;
      double var6 = this.field_37432 - var1.field_37432;
      return Math.sqrt(var4 * var4 + var6 * var6);
   }

   public void method_33377() {
      double var3 = (double)this.method_33379();
      this.field_37430 /= var3;
      this.field_37432 /= var3;
   }

   public float method_33379() {
      return class_9299.method_42842(this.field_37430 * this.field_37430 + this.field_37432 * this.field_37432);
   }

   public void method_33378(class_7321 var1) {
      this.field_37430 = this.field_37430 - var1.field_37430;
      this.field_37432 = this.field_37432 - var1.field_37432;
   }

   public boolean method_33374(double var1, double var3, double var5, double var7) {
      boolean var11 = false;
      if (!(this.field_37430 < var1)) {
         if (this.field_37430 > var5) {
            this.field_37430 = var5;
            var11 = true;
         }
      } else {
         this.field_37430 = var1;
         var11 = true;
      }

      if (!(this.field_37432 < var3)) {
         if (this.field_37432 > var7) {
            this.field_37432 = var7;
            var11 = true;
         }
      } else {
         this.field_37432 = var3;
         var11 = true;
      }

      return var11;
   }

   public int method_33384(class_6163 var1, int var2) {
      class_2921 var5 = new class_2921(this.field_37430, (double)(var2 + 1), this.field_37432);
      boolean var6 = var1.method_28262(var5).method_8345();
      var5.method_13368(Direction.field_802);
      boolean var7 = var1.method_28262(var5).method_8345();

      while (var5.method_12165() > 0) {
         var5.method_13368(Direction.field_802);
         boolean var8 = var1.method_28262(var5).method_8345();
         if (!var8 && var7 && var6) {
            return var5.method_12165() + 1;
         }

         var6 = var7;
         var7 = var8;
      }

      return var2 + 1;
   }

   public boolean method_33382(class_6163 var1, int var2) {
      BlockPos var5 = new BlockPos(this.field_37430, (double)(this.method_33384(var1, var2) - 1), this.field_37432);
      class_2522 var6 = var1.method_28262(var5);
      class_5371 var7 = var6.method_8362();
      return var5.method_12165() < var2 && !var7.method_24494() && var7 != class_5371.field_27434;
   }

   public void method_33383(Random var1, double var2, double var4, double var6, double var8) {
      this.field_37430 = class_9299.method_42832(var1, var2, var6);
      this.field_37432 = class_9299.method_42832(var1, var4, var8);
   }
}
