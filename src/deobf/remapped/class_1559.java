package remapped;

import java.util.Comparator;

public class class_1559 implements Comparator<class_2451> {
   private static String[] field_8218;

   private class_1559(class_2605 var1) {
      this.field_8217 = var1;
   }

   public int compare(class_2451 var1, class_2451 var2) {
      int var6;
      int var7;
      if (this.field_8217.field_12878 != null) {
         if (!this.field_8217.field_12877.contains(this.field_8217.field_12878)) {
            class_9478 var5 = this.field_8217.field_12878;
            var6 = class_3231.method_14804(this.field_8217.field_12881).method_19277(var5, var1);
            var7 = class_3231.method_14804(this.field_8217.field_12881).method_19277(var5, var2);
         } else {
            class_9478 var8 = this.field_8217.field_12878;
            var6 = !(var1 instanceof class_6201)
               ? -1
               : class_3231.method_14804(this.field_8217.field_12881).method_19277(var8, ((class_6201)var1).method_28392());
            var7 = !(var2 instanceof class_6201)
               ? -1
               : class_3231.method_14804(this.field_8217.field_12881).method_19277(var8, ((class_6201)var2).method_28392());
         }
      } else {
         var6 = 0;
         var7 = 0;
      }

      return var6 != var7
         ? this.field_8217.field_12872 * Integer.compare(var6, var7)
         : this.field_8217.field_12872 * Integer.compare(class_2451.method_11244(var1), class_2451.method_11244(var2));
   }
}
