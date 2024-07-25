package remapped;

import java.util.ArrayList;

public class class_342 extends class_3316 {
   private ArrayList field_1346 = new ArrayList();
   private float field_1345;
   private class_3316 field_1347;
   private class_3316 field_1349;

   public class_342(class_3316 var1) {
      this.field_1346.add(var1);
      float[] var4 = var1.field_16385;
      this.field_16385 = new float[var4.length];
      this.field_1347 = var1;
      this.field_1349 = var1;
   }

   public void method_1761(class_3316 var1) {
      if (var1.field_16385.length == this.field_16385.length) {
         class_3316 var4 = (class_3316)this.field_1346.get(this.field_1346.size() - 1);
         if (!this.method_1758(var4, var1)) {
            this.field_1346.add(var1);
         } else {
            this.field_1346.add(var4);
         }

         if (this.field_1346.size() == 2) {
            this.field_1349 = (class_3316)this.field_1346.get(1);
         }
      } else {
         throw new RuntimeException("Attempt to morph between two shapes with different vertex counts");
      }
   }

   private boolean method_1758(class_3316 var1, class_3316 var2) {
      var1.method_15202();
      var2.method_15202();

      for (int var5 = 0; var5 < var1.field_16385.length; var5++) {
         if (var1.field_16385[var5] != var2.field_16385[var5]) {
            return false;
         }
      }

      return true;
   }

   public void method_1760(float var1) {
      int var4 = (int)var1;
      int var5 = var4 + 1;
      float var6 = var1 - (float)var4;
      var4 = this.method_1763(var4);
      var5 = this.method_1763(var5);
      this.method_1759(var4, var5, var6);
   }

   public void method_1764(float var1) {
      this.field_1345 += var1;
      if (!(this.field_1345 < 0.0F)) {
         if (!(this.field_1345 > 1.0F)) {
            this.field_16377 = true;
         } else {
            int var4 = this.field_1346.indexOf(this.field_1349);
            if (var4 < 1) {
               var4 = 0;
            }

            int var5 = this.method_1763(var4 + 1);
            this.method_1759(var4, var5, this.field_1345);
            this.field_1345--;
         }
      } else {
         int var6 = this.field_1346.indexOf(this.field_1347);
         if (var6 < 0) {
            var6 = this.field_1346.size() - 1;
         }

         int var7 = this.method_1763(var6 + 1);
         this.method_1759(var6, var7, this.field_1345);
         this.field_1345++;
      }
   }

   public void method_1762(class_3316 var1) {
      this.field_1347 = var1;
      this.field_1349 = (class_3316)this.field_1346.get(0);
      this.field_1345 = 0.0F;
   }

   private int method_1763(int var1) {
      while (var1 >= this.field_1346.size()) {
         var1 -= this.field_1346.size();
      }

      while (var1 < 0) {
         var1 += this.field_1346.size();
      }

      return var1;
   }

   private void method_1759(int var1, int var2, float var3) {
      this.field_1347 = (class_3316)this.field_1346.get(var1);
      this.field_1349 = (class_3316)this.field_1346.get(var2);
      this.field_1345 = var3;
      this.field_16377 = true;
   }

   @Override
   public void method_15217() {
      if (this.field_1347 == this.field_1349) {
         System.arraycopy(this.field_1347.field_16385, 0, this.field_16385, 0, this.field_16385.length);
      } else {
         float[] var3 = this.field_1347.field_16385;
         float[] var4 = this.field_1349.field_16385;

         for (int var5 = 0; var5 < this.field_16385.length; var5++) {
            this.field_16385[var5] = var3[var5] * (1.0F - this.field_1345);
            this.field_16385[var5] = this.field_16385[var5] + var4[var5] * this.field_1345;
         }
      }
   }

   @Override
   public class_3316 method_15207(class_4508 var1) {
      this.method_15217();
      return new class_6714(this.field_16385);
   }
}
