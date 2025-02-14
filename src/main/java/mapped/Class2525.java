package mapped;

import java.util.ArrayList;

public class Class2525 extends Class2520 {
   private static String[] field16694;
   private ArrayList field16695 = new ArrayList();
   private float field16696;
   private float field16697;
   private boolean field16698;
   private ArrayList field16699 = new ArrayList();
   private ArrayList field16700;

   public Class2525(float var1, float var2) {
      this.field16695.add(new float[]{var1, var2});
      this.field16696 = var1;
      this.field16697 = var2;
      this.field16680 = true;
   }

   public void method10635(float var1, float var2) {
      this.field16700 = new ArrayList();
      this.field16699.add(this.field16700);
   }

   public void method10636(float var1, float var2) {
      if (this.field16700 == null) {
         this.field16695.add(new float[]{var1, var2});
      } else {
         this.field16700.add(new float[]{var1, var2});
      }

      this.field16696 = var1;
      this.field16697 = var2;
      this.field16680 = true;
   }

   public void method10637() {
      this.field16698 = true;
   }

   public void method10638(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method10639(var1, var2, var3, var4, var5, var6, 10);
   }

   public void method10639(float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      if (this.field16696 != var1 || this.field16697 != var2) {
         Class2529 var10 = new Class2529(
            new Class2532(this.field16696, this.field16697), new Class2532(var3, var4), new Class2532(var5, var6), new Class2532(var1, var2)
         );
         float var11 = 1.0F / (float)var7;

         for (int var12 = 1; var12 < var7 + 1; var12++) {
            float var13 = (float)var12 * var11;
            Class2532 var14 = var10.method10657(var13);
            if (this.field16700 == null) {
               this.field16695.add(new float[]{var14.field16737, var14.field16738});
            } else {
               this.field16700.add(new float[]{var14.field16737, var14.field16738});
            }

            this.field16696 = var14.field16737;
            this.field16697 = var14.field16738;
         }

         this.field16680 = true;
      }
   }

   @Override
   public void method10578() {
      this.field16671 = new float[this.field16695.size() * 2];

      for (int var3 = 0; var3 < this.field16695.size(); var3++) {
         float[] var4 = (float[])this.field16695.get(var3);
         this.field16671[var3 * 2] = var4[0];
         this.field16671[var3 * 2 + 1] = var4[1];
      }
   }

   @Override
   public Class2520 method10577(Class8412 var1) {
      Class2525 var4 = new Class2525(this.field16696, this.field16697);
      var4.field16695 = this.method10640(this.field16695, var1);

      for (int var5 = 0; var5 < this.field16699.size(); var5++) {
         var4.field16699.add(this.method10640((ArrayList)this.field16699.get(var5), var1));
      }

      var4.field16698 = this.field16698;
      return var4;
   }

   private ArrayList method10640(ArrayList var1, Class8412 var2) {
      float[] var5 = new float[var1.size() * 2];
      float[] var6 = new float[var1.size() * 2];

      for (int var7 = 0; var7 < var1.size(); var7++) {
         var5[var7 * 2] = ((float[])var1.get(var7))[0];
         var5[var7 * 2 + 1] = ((float[])var1.get(var7))[1];
      }

      var2.method29529(var5, 0, var6, 0, var1.size());
      ArrayList var9 = new ArrayList();

      for (int var8 = 0; var8 < var1.size(); var8++) {
         var9.add(new float[]{var6[var8 * 2], var6[var8 * 2 + 1]});
      }

      return var9;
   }

   @Override
   public boolean method10612() {
      return this.field16698;
   }
}
