package remapped;

import java.util.Arrays;

public class class_9304 {
   private class_4639 field_47528;
   private float[] field_47527;

   public class_9304(class_4639 var1, float[] var2) {
      this.field_47528 = var1;
      this.field_47527 = (float[])var2.clone();
      Arrays.sort(this.field_47527);
   }

   public Integer method_42959(class_6098 var1, class_174 var2, class_5834 var3) {
      class_2451 var6 = var1.method_27960();
      class_3825 var7 = class_6878.method_31546(var6, this.field_47528);
      if (var7 != null) {
         float var8 = var7.method_17802(var1, var2, var3);
         int var9 = Arrays.binarySearch(this.field_47527, var8);
         return var9;
      } else {
         return null;
      }
   }

   public class_4639 method_42960() {
      return this.field_47528;
   }

   public float[] method_42958() {
      return this.field_47527;
   }

   @Override
   public String toString() {
      return "location: " + this.field_47528 + ", values: [" + class_3111.method_14285(this.field_47527) + "]";
   }
}
