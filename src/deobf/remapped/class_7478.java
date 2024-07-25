package remapped;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class class_7478 implements class_4904 {
   private static String[] field_38161;
   private final int field_38162;

   public class_7478(int var1) {
      this.field_38162 = var1;
   }

   @Override
   public class_8014 method_22451(class_8145 var1, Random var2) {
      List var5 = class_8669.field_44445.method_39801().filter(class_4382::method_20436).collect(Collectors.toList());
      class_4382 var6 = (class_4382)var5.get(var2.nextInt(var5.size()));
      int var7 = class_9299.method_42824(var2, var6.method_20425(), var6.method_20417());
      class_6098 var8 = class_7597.method_34502(new class_9693(var6, var7));
      int var9 = 2 + var2.nextInt(5 + var7 * 10) + 3 * var7;
      if (var6.method_20429()) {
         var9 *= 2;
      }

      if (var9 > 64) {
         var9 = 64;
      }

      return new class_8014(new class_6098(class_4897.field_24997, var9), new class_6098(class_4897.field_24551), var8, 12, this.field_38162, 0.2F);
   }
}
