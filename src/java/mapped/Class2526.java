package mapped;

import java.util.ArrayList;

public class Class2526 extends Class2520 {
   private static String[] field16701;
   private boolean field16702 = false;
   private boolean field16703 = true;

   public Class2526(float[] var1) {
      int var4 = var1.length;
      this.field16671 = new float[var4];
      this.field16675 = -Float.MIN_VALUE;
      this.field16676 = -Float.MIN_VALUE;
      this.field16677 = Float.MAX_VALUE;
      this.field16678 = Float.MAX_VALUE;
      this.field16673 = Float.MAX_VALUE;
      this.field16674 = Float.MAX_VALUE;

      for (int var5 = 0; var5 < var4; var5++) {
         this.field16671[var5] = var1[var5];
         if (var5 % 2 != 0) {
            if (var1[var5] > this.field16676) {
               this.field16676 = var1[var5];
            }

            if (var1[var5] < this.field16678) {
               this.field16678 = var1[var5];
            }

            if (var1[var5] < this.field16674) {
               this.field16674 = var1[var5];
            }
         } else {
            if (var1[var5] > this.field16675) {
               this.field16675 = var1[var5];
            }

            if (var1[var5] < this.field16677) {
               this.field16677 = var1[var5];
            }

            if (var1[var5] < this.field16673) {
               this.field16673 = var1[var5];
            }
         }
      }

      this.method10605();
      this.method10606();
      this.field16680 = true;
   }

   public Class2526() {
      this.field16671 = new float[0];
      this.field16675 = -Float.MIN_VALUE;
      this.field16676 = -Float.MIN_VALUE;
      this.field16677 = Float.MAX_VALUE;
      this.field16678 = Float.MAX_VALUE;
   }

   public void method10641(boolean var1) {
      this.field16702 = var1;
   }

   public void method10642(float var1, float var2) {
      if (!this.method10604(var1, var2) || this.field16702) {
         ArrayList var5 = new ArrayList();

         for (int var6 = 0; var6 < this.field16671.length; var6++) {
            var5.add(new Float(this.field16671[var6]));
         }

         var5.add(new Float(var1));
         var5.add(new Float(var2));
         int var8 = var5.size();
         this.field16671 = new float[var8];

         for (int var7 = 0; var7 < var8; var7++) {
            this.field16671[var7] = (Float)var5.get(var7);
         }

         if (var1 > this.field16675) {
            this.field16675 = var1;
         }

         if (var2 > this.field16676) {
            this.field16676 = var2;
         }

         if (var1 < this.field16677) {
            this.field16677 = var1;
         }

         if (var2 < this.field16678) {
            this.field16678 = var2;
         }

         this.method10605();
         this.method10606();
         this.field16680 = true;
      }
   }

   @Override
   public Class2520 method10577(Class8412 var1) {
      this.method10610();
      Class2526 var4 = new Class2526();
      float[] var5 = new float[this.field16671.length];
      var1.method29529(this.field16671, 0, var5, 0, this.field16671.length / 2);
      var4.field16671 = var5;
      var4.method10605();
      var4.field16703 = this.field16703;
      return var4;
   }

   @Override
   public void method10580(float var1) {
      super.method10580(var1);
      this.field16680 = false;
   }

   @Override
   public void method10581(float var1) {
      super.method10581(var1);
      this.field16680 = false;
   }

   @Override
   public void method10578() {
   }

   @Override
   public boolean method10612() {
      return this.field16703;
   }

   public void method10643(boolean var1) {
      this.field16703 = var1;
   }

   public Class2526 method10644() {
      float[] var3 = new float[this.field16671.length];
      System.arraycopy(this.field16671, 0, var3, 0, var3.length);
      return new Class2526(var3);
   }
}
