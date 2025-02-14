package mapped;

import java.util.ArrayList;

public class Class2524 extends Class2520 {
   private ArrayList field16690 = new ArrayList();
   private float field16691;
   private Class2520 field16692;
   private Class2520 field16693;

   public Class2524(Class2520 var1) {
      this.field16690.add(var1);
      float[] var4 = var1.field16671;
      this.field16671 = new float[var4.length];
      this.field16692 = var1;
      this.field16693 = var1;
   }

   public void method10628(Class2520 var1) {
      if (var1.field16671.length == this.field16671.length) {
         Class2520 var4 = (Class2520)this.field16690.get(this.field16690.size() - 1);
         if (!this.method10629(var4, var1)) {
            this.field16690.add(var1);
         } else {
            this.field16690.add(var4);
         }

         if (this.field16690.size() == 2) {
            this.field16693 = (Class2520)this.field16690.get(1);
         }
      } else {
         throw new RuntimeException("Attempt to morph between two shapes with different vertex counts");
      }
   }

   private boolean method10629(Class2520 var1, Class2520 var2) {
      var1.method10610();
      var2.method10610();

      for (int var5 = 0; var5 < var1.field16671.length; var5++) {
         if (var1.field16671[var5] != var2.field16671[var5]) {
            return false;
         }
      }

      return true;
   }

   public void method10630(float var1) {
      int var4 = (int)var1;
      int var5 = var4 + 1;
      float var6 = var1 - (float)var4;
      var4 = this.method10633(var4);
      var5 = this.method10633(var5);
      this.method10634(var4, var5, var6);
   }

   public void method10631(float var1) {
      this.field16691 += var1;
      if (!(this.field16691 < 0.0F)) {
         if (!(this.field16691 > 1.0F)) {
            this.field16680 = true;
         } else {
            int var4 = this.field16690.indexOf(this.field16693);
            if (var4 < 1) {
               var4 = 0;
            }

            int var5 = this.method10633(var4 + 1);
            this.method10634(var4, var5, this.field16691);
            this.field16691--;
         }
      } else {
         int var6 = this.field16690.indexOf(this.field16692);
         if (var6 < 0) {
            var6 = this.field16690.size() - 1;
         }

         int var7 = this.method10633(var6 + 1);
         this.method10634(var6, var7, this.field16691);
         this.field16691++;
      }
   }

   public void method10632(Class2520 var1) {
      this.field16692 = var1;
      this.field16693 = (Class2520)this.field16690.get(0);
      this.field16691 = 0.0F;
   }

   private int method10633(int var1) {
      while (var1 >= this.field16690.size()) {
         var1 -= this.field16690.size();
      }

      while (var1 < 0) {
         var1 += this.field16690.size();
      }

      return var1;
   }

   private void method10634(int var1, int var2, float var3) {
      this.field16692 = (Class2520)this.field16690.get(var1);
      this.field16693 = (Class2520)this.field16690.get(var2);
      this.field16691 = var3;
      this.field16680 = true;
   }

   @Override
   public void method10578() {
      if (this.field16692 == this.field16693) {
         System.arraycopy(this.field16692.field16671, 0, this.field16671, 0, this.field16671.length);
      } else {
         float[] var3 = this.field16692.field16671;
         float[] var4 = this.field16693.field16671;

         for (int var5 = 0; var5 < this.field16671.length; var5++) {
            this.field16671[var5] = var3[var5] * (1.0F - this.field16691);
            this.field16671[var5] = this.field16671[var5] + var4[var5] * this.field16691;
         }
      }
   }

   @Override
   public Class2520 method10577(Class8412 var1) {
      this.method10578();
      return new Class2526(this.field16671);
   }
}
