package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

public class class_5995 implements class_4904 {
   private static String[] field_30548;
   private final class_2451 field_30547;
   private final int field_30550;
   private final int field_30551;
   private final int field_30549;

   public class_5995(class_2451 var1, int var2) {
      this(var1, var2, 12, 1);
   }

   public class_5995(class_2451 var1, int var2, int var3, int var4) {
      this.field_30547 = var1;
      this.field_30550 = var2;
      this.field_30551 = var3;
      this.field_30549 = var4;
   }

   @Override
   public class_8014 method_22451(Entity var1, Random var2) {
      class_6098 var5 = new class_6098(class_4897.field_24997, this.field_30550);
      class_6098 var6 = new class_6098(this.field_30547);
      if (this.field_30547 instanceof class_3385) {
         ArrayList var7 = Lists.newArrayList();
         var7.add(method_27384(var2));
         if (var2.nextFloat() > 0.7F) {
            var7.add(method_27384(var2));
         }

         if (var2.nextFloat() > 0.8F) {
            var7.add(method_27384(var2));
         }

         var6 = class_9168.method_42264(var6, var7);
      }

      return new class_8014(var5, var6, this.field_30551, this.field_30549, 0.2F);
   }

   private static class_239 method_27384(Random var0) {
      return class_239.method_1016(class_9077.method_41789(var0.nextInt(16)));
   }
}
