package remapped;

import java.util.ArrayList;

public class class_6714 extends class_3316 {
   private static String[] field_34696;
   private boolean field_34697 = false;
   private boolean field_34695 = true;

   public class_6714(float[] var1) {
      int var4 = var1.length;
      this.field_16385 = new float[var4];
      this.field_16386 = -Float.MIN_VALUE;
      this.field_16375 = -Float.MIN_VALUE;
      this.field_16384 = Float.MAX_VALUE;
      this.field_16383 = Float.MAX_VALUE;
      this.field_16381 = Float.MAX_VALUE;
      this.field_16380 = Float.MAX_VALUE;

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_16385[var5] = var1[var5];
         if (var5 % 2 != 0) {
            if (var1[var5] > this.field_16375) {
               this.field_16375 = var1[var5];
            }

            if (var1[var5] < this.field_16383) {
               this.field_16383 = var1[var5];
            }

            if (var1[var5] < this.field_16380) {
               this.field_16380 = var1[var5];
            }
         } else {
            if (var1[var5] > this.field_16386) {
               this.field_16386 = var1[var5];
            }

            if (var1[var5] < this.field_16384) {
               this.field_16384 = var1[var5];
            }

            if (var1[var5] < this.field_16381) {
               this.field_16381 = var1[var5];
            }
         }
      }

      this.method_15218();
      this.method_15235();
      this.field_16377 = true;
   }

   public class_6714() {
      this.field_16385 = new float[0];
      this.field_16386 = -Float.MIN_VALUE;
      this.field_16375 = -Float.MIN_VALUE;
      this.field_16384 = Float.MAX_VALUE;
      this.field_16383 = Float.MAX_VALUE;
   }

   public void method_30832(boolean var1) {
      this.field_34697 = var1;
   }

   public void method_30834(float var1, float var2) {
      if (!this.method_15214(var1, var2) || this.field_34697) {
         ArrayList var5 = new ArrayList();

         for (int var6 = 0; var6 < this.field_16385.length; var6++) {
            var5.add(new Float(this.field_16385[var6]));
         }

         var5.add(new Float(var1));
         var5.add(new Float(var2));
         int var8 = var5.size();
         this.field_16385 = new float[var8];

         for (int var7 = 0; var7 < var8; var7++) {
            this.field_16385[var7] = (Float)var5.get(var7);
         }

         if (var1 > this.field_16386) {
            this.field_16386 = var1;
         }

         if (var2 > this.field_16375) {
            this.field_16375 = var2;
         }

         if (var1 < this.field_16384) {
            this.field_16384 = var1;
         }

         if (var2 < this.field_16383) {
            this.field_16383 = var2;
         }

         this.method_15218();
         this.method_15235();
         this.field_16377 = true;
      }
   }

   @Override
   public class_3316 method_15207(class_4508 var1) {
      this.method_15202();
      class_6714 var4 = new class_6714();
      float[] var5 = new float[this.field_16385.length];
      var1.method_20952(this.field_16385, 0, var5, 0, this.field_16385.length / 2);
      var4.field_16385 = var5;
      var4.method_15218();
      var4.field_34695 = this.field_34695;
      return var4;
   }

   @Override
   public void method_15201(float var1) {
      super.method_15201(var1);
      this.field_16377 = false;
   }

   @Override
   public void method_15240(float var1) {
      super.method_15240(var1);
      this.field_16377 = false;
   }

   @Override
   public void method_15217() {
   }

   @Override
   public boolean method_15232() {
      return this.field_34695;
   }

   public void method_30833(boolean var1) {
      this.field_34695 = var1;
   }

   public class_6714 method_30835() {
      float[] var3 = new float[this.field_16385.length];
      System.arraycopy(this.field_16385, 0, var3, 0, var3.length);
      return new class_6714(var3);
   }
}
