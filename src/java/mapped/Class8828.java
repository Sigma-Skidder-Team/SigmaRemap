package mapped;

public class Class8828 {
   public static final Class8828 field39801 = new Class8828(0, 0);
   public static final Class8828 field39802 = new Class8828(1, 0);
   public static final Class8828 field39803 = new Class8828(0, 1);
   public static final Class8828 field39804 = new Class8828(1, 1);
   public final double field39805;
   public final double field39806;

   public Class8828(double var1, double var3) {
      this.field39805 = var1;
      this.field39806 = var3;
   }

   public Class8828(int var1, int var2) {
      this.field39805 = (double)var1;
      this.field39806 = (double)var2;
   }

   public Class8828(float var1, float var2) {
      this.field39805 = (double)var1;
      this.field39806 = (double)var2;
   }

   public Class8828(Class8828 var1) {
      this.field39805 = var1.field39805;
      this.field39806 = var1.field39806;
   }

   public Class8828() {
      this.field39805 = 0.0;
      this.field39806 = 0.0;
   }

   public double method31878() {
      return this.field39805;
   }

   public int method31879() {
      return (int)Math.round(this.field39805);
   }

   public Class8828 method31880(double var1) {
      return new Class8828(var1, this.field39806);
   }

   public Class8828 method31881(int var1) {
      return new Class8828((double)var1, this.field39806);
   }

   public double method31882() {
      return this.field39806;
   }

   public int method31883() {
      return (int)Math.round(this.field39806);
   }

   public Class8828 method31884(double var1) {
      return new Class8828(this.field39805, var1);
   }

   public Class8828 method31885(int var1) {
      return new Class8828(this.field39805, (double)var1);
   }

   public Class8828 method31886(Class8828 var1) {
      return new Class8828(this.field39805 + var1.field39805, this.field39806 + var1.field39806);
   }

   public Class8828 method31887(double var1, double var3) {
      return new Class8828(this.field39805 + var1, this.field39806 + var3);
   }

   public Class8828 method31888(int var1, int var2) {
      return new Class8828(this.field39805 + (double)var1, this.field39806 + (double)var2);
   }

   public Class8828 method31889(Class8828... var1) {
      double var4 = this.field39805;
      double var6 = this.field39806;

      for (Class8828 var11 : var1) {
         var4 += var11.field39805;
         var6 += var11.field39806;
      }

      return new Class8828(var4, var6);
   }

   public Class8828 method31890(Class8828 var1) {
      return new Class8828(this.field39805 - var1.field39805, this.field39806 - var1.field39806);
   }

   public Class8828 method31891(double var1, double var3) {
      return new Class8828(this.field39805 - var1, this.field39806 - var3);
   }

   public Class8828 method31892(int var1, int var2) {
      return new Class8828(this.field39805 - (double)var1, this.field39806 - (double)var2);
   }

   public Class8828 method31893(Class8828... var1) {
      double var4 = this.field39805;
      double var6 = this.field39806;

      for (Class8828 var11 : var1) {
         var4 -= var11.field39805;
         var6 -= var11.field39806;
      }

      return new Class8828(var4, var6);
   }

   public Class8828 method31894(Class8828 var1) {
      return new Class8828(this.field39805 * var1.field39805, this.field39806 * var1.field39806);
   }

   public Class8828 method31895(double var1, double var3) {
      return new Class8828(this.field39805 * var1, this.field39806 * var3);
   }

   public Class8828 method31896(int var1, int var2) {
      return new Class8828(this.field39805 * (double)var1, this.field39806 * (double)var2);
   }

   public Class8828 method31897(Class8828... var1) {
      double var4 = this.field39805;
      double var6 = this.field39806;

      for (Class8828 var11 : var1) {
         var4 *= var11.field39805;
         var6 *= var11.field39806;
      }

      return new Class8828(var4, var6);
   }

   public Class8828 method31898(double var1) {
      return new Class8828(this.field39805 * var1, this.field39806 * var1);
   }

   public Class8828 method31899(float var1) {
      return new Class8828(this.field39805 * (double)var1, this.field39806 * (double)var1);
   }

   public Class8828 method31900(int var1) {
      return new Class8828(this.field39805 * (double)var1, this.field39806 * (double)var1);
   }

   public Class8828 method31901(Class8828 var1) {
      return new Class8828(this.field39805 / var1.field39805, this.field39806 / var1.field39806);
   }

   public Class8828 method31902(double var1, double var3) {
      return new Class8828(this.field39805 / var1, this.field39806 / var3);
   }

   public Class8828 method31903(int var1, int var2) {
      return new Class8828(this.field39805 / (double)var1, this.field39806 / (double)var2);
   }

   public Class8828 method31904(int var1) {
      return new Class8828(this.field39805 / (double)var1, this.field39806 / (double)var1);
   }

   public Class8828 method31905(double var1) {
      return new Class8828(this.field39805 / var1, this.field39806 / var1);
   }

   public Class8828 method31906(float var1) {
      return new Class8828(this.field39805 / (double)var1, this.field39806 / (double)var1);
   }

   public double method31907() {
      return Math.sqrt(this.field39805 * this.field39805 + this.field39806 * this.field39806);
   }

   public double method31908() {
      return this.field39805 * this.field39805 + this.field39806 * this.field39806;
   }

   public double method31909(Class8828 var1) {
      return Math.sqrt(Math.pow(var1.field39805 - this.field39805, 2.0) + Math.pow(var1.field39806 - this.field39806, 2.0));
   }

   public double method31910(Class8828 var1) {
      return Math.pow(var1.field39805 - this.field39805, 2.0) + Math.pow(var1.field39806 - this.field39806, 2.0);
   }

   public Class8828 method31911() {
      return this.method31905(this.method31907());
   }

   public double method31912(Class8828 var1) {
      return this.field39805 * var1.field39805 + this.field39806 * var1.field39806;
   }

   public boolean method31913(Class8828 var1, Class8828 var2) {
      return this.field39805 >= var1.field39805
         && this.field39805 <= var2.field39805
         && this.field39806 >= var1.field39806
         && this.field39806 <= var2.field39806;
   }

   public boolean method31914(Class8828 var1, Class8828 var2) {
      return this.method31879() >= var1.method31879()
         && this.method31879() <= var2.method31879()
         && this.method31883() >= var1.method31883()
         && this.method31883() <= var2.method31883();
   }

   public Class8828 method31915() {
      return new Class8828(Math.floor(this.field39805), Math.floor(this.field39806));
   }

   public Class8828 method31916() {
      return new Class8828(Math.ceil(this.field39805), Math.ceil(this.field39806));
   }

   public Class8828 method31917() {
      return new Class8828(Math.floor(this.field39805 + 0.5), Math.floor(this.field39806 + 0.5));
   }

   public Class8828 method31918() {
      return new Class8828(Math.abs(this.field39805), Math.abs(this.field39806));
   }

   public Class8828 method31919(double var1, double var3, double var5, double var7, double var9) {
      var1 = Math.toRadians(var1);
      double var13 = this.field39805 - var3;
      double var15 = this.field39806 - var5;
      double var17 = var13 * Math.cos(var1) - var15 * Math.sin(var1);
      double var19 = var13 * Math.sin(var1) + var15 * Math.cos(var1);
      return new Class8828(var17 + var3 + var7, var19 + var5 + var9);
   }

   public boolean method31920(Class8828 var1) {
      if (this.field39805 == 0.0 && this.field39806 == 0.0) {
         return true;
      } else {
         double var4 = var1.field39805;
         double var6 = var1.field39806;
         if (var4 == 0.0 && var6 == 0.0) {
            return true;
         } else if (this.field39805 == 0.0 == (var4 == 0.0)) {
            if (this.field39806 == 0.0 == (var6 == 0.0)) {
               double var8 = var4 / this.field39805;
               if (Double.isNaN(var8)) {
                  double var10 = var6 / this.field39806;
                  if (Double.isNaN(var10)) {
                     throw new RuntimeException("This should not happen");
                  } else {
                     return var1.equals(this.method31898(var10));
                  }
               } else {
                  return var1.equals(this.method31898(var8));
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public Class8829 method31921() {
      return new Class8829(this);
   }

   public Class2020 method31922() {
      return new Class2020(this.field39805, 0.0, this.field39806);
   }

   public Class2020 method31923(double var1) {
      return new Class2020(this.field39805, var1, this.field39806);
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class8828)) {
         return false;
      } else {
         Class8828 var4 = (Class8828)var1;
         return var4.field39805 == this.field39805 && var4.field39806 == this.field39806;
      }
   }

   @Override
   public int hashCode() {
      return new Double(this.field39805).hashCode() >> 13 ^ new Double(this.field39806).hashCode();
   }

   @Override
   public String toString() {
      return "(" + this.field39805 + ", " + this.field39806 + ")";
   }

   public static Class8828 method31924(Class8828 var0, Class8828 var1) {
      return new Class8828(Math.min(var0.field39805, var1.field39805), Math.min(var0.field39806, var1.field39806));
   }

   public static Class8828 method31925(Class8828 var0, Class8828 var1) {
      return new Class8828(Math.max(var0.field39805, var1.field39805), Math.max(var0.field39806, var1.field39806));
   }
}
