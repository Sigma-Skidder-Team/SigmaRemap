package mapped;

import java.util.ArrayList;

public class Class2522 extends Class2520 {
   private static String[] field16684;
   public static final int field16685 = 50;
   private int field16686;
   private float field16687;
   private float field16688;

   public Class2522(float var1, float var2, float var3, float var4) {
      this(var1, var2, var3, var4, 50);
   }

   public Class2522(float var1, float var2, float var3, float var4, int var5) {
      this.field16673 = var1 - var3;
      this.field16674 = var2 - var4;
      this.field16687 = var3;
      this.field16688 = var4;
      this.field16686 = var5;
      this.method10610();
   }

   public void method10618(float var1, float var2) {
      this.method10620(var1);
      this.method10622(var2);
   }

   public float method10619() {
      return this.field16687;
   }

   public void method10620(float var1) {
      if (var1 != this.field16687) {
         this.field16687 = var1;
         this.field16680 = true;
      }
   }

   public float method10621() {
      return this.field16688;
   }

   public void method10622(float var1) {
      if (var1 != this.field16688) {
         this.field16688 = var1;
         this.field16680 = true;
      }
   }

   @Override
   public void method10578() {
      ArrayList var3 = new ArrayList();
      this.field16675 = -Float.MIN_VALUE;
      this.field16676 = -Float.MIN_VALUE;
      this.field16677 = Float.MAX_VALUE;
      this.field16678 = Float.MAX_VALUE;
      float var4 = 0.0F;
      float var5 = 359.0F;
      float var6 = this.field16673 + this.field16687;
      float var7 = this.field16674 + this.field16688;
      int var8 = 360 / this.field16686;

      for (float var9 = var4; var9 <= var5 + (float)var8; var9 += (float)var8) {
         float var10 = var9;
         if (var9 > var5) {
            var10 = var5;
         }

         float var11 = (float)((double)var6 + Class4835.method14957(Math.toRadians((double)var10)) * (double)this.field16687);
         float var12 = (float)((double)var7 + Class4835.method14956(Math.toRadians((double)var10)) * (double)this.field16688);
         if (var11 > this.field16675) {
            this.field16675 = var11;
         }

         if (var12 > this.field16676) {
            this.field16676 = var12;
         }

         if (var11 < this.field16677) {
            this.field16677 = var11;
         }

         if (var12 < this.field16678) {
            this.field16678 = var12;
         }

         var3.add(new Float(var11));
         var3.add(new Float(var12));
      }

      this.field16671 = new float[var3.size()];

      for (int var13 = 0; var13 < this.field16671.length; var13++) {
         this.field16671[var13] = (Float)var3.get(var13);
      }
   }

   @Override
   public Class2520 method10577(Class8412 var1) {
      this.method10610();
      Class2526 var4 = new Class2526();
      float[] var5 = new float[this.field16671.length];
      var1.method29529(this.field16671, 0, var5, 0, this.field16671.length / 2);
      var4.field16671 = var5;
      var4.method10610();
      return var4;
   }

   @Override
   public void method10605() {
      this.field16672 = new float[2];
      this.field16672[0] = this.field16673 + this.field16687;
      this.field16672[1] = this.field16674 + this.field16688;
   }

   @Override
   public void method10606() {
      this.field16679 = !(this.field16687 > this.field16688) ? this.field16688 : this.field16687;
   }
}
