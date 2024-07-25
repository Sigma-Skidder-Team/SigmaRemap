package remapped;

import java.util.Comparator;

public class class_5428 implements Comparator<class_2034> {
   private static String[] field_27654;
   private int field_27652;
   private int field_27653;
   private double field_27651;
   private double field_27650;

   public class_5428(int var1, int var2, double var3, double var5) {
      this.field_27652 = var1;
      this.field_27653 = var2;
      this.field_27651 = var3;
      this.field_27650 = 1.0 - MathHelper.clamp(Math.abs(var5) / (Math.PI / 2), 0.0, 1.0);
   }

   public int compare(class_2034 var1, class_2034 var2) {
      int var5 = this.method_24694(var1);
      int var6 = this.method_24694(var2);
      return var5 - var6;
   }

   private int method_24694(class_2034 var1) {
      int var4 = var1.field_10328 - this.field_27652;
      int var5 = var1.field_10327 - this.field_27653;
      int var6 = var4 * var4 + var5 * var5;
      double var7 = MathHelper.atan2((double)var5, (double)var4);
      double var9 = Math.abs(var7 - this.field_27651);
      if (var9 > Math.PI) {
         var9 = (Math.PI * 2) - var9;
      }

      return (int)((double)var6 * 1000.0 * this.field_27650 * var9 * var9);
   }
}
