package remapped;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class class_6800 implements class_4904 {
   private static String[] field_35050;
   private final class_6098 field_35048;
   private final int field_35046;
   private final int field_35047;
   private final int field_35044;
   private final int field_35049;
   private final class_2451 field_35043;
   private final int field_35045;
   private final float field_35042;

   public class_6800(class_2451 var1, int var2, class_2451 var3, int var4, int var5, int var6, int var7) {
      this.field_35048 = new class_6098(var3);
      this.field_35047 = var5;
      this.field_35044 = var6;
      this.field_35049 = var7;
      this.field_35043 = var1;
      this.field_35045 = var2;
      this.field_35046 = var4;
      this.field_35042 = 0.05F;
   }

   @Override
   public class_8014 method_22451(Entity var1, Random var2) {
      class_6098 var5 = new class_6098(class_4897.field_24997, this.field_35047);
      List var6 = class_8669.field_44365
         .method_39801()
         .filter(var0 -> !var0.method_27404().isEmpty() && class_1387.method_6419(var0))
         .collect(Collectors.toList());
      class_6004 var7 = (class_6004)var6.get(var2.nextInt(var6.size()));
      class_6098 var8 = class_9541.method_43999(new class_6098(this.field_35048.method_27960(), this.field_35046), var7);
      return new class_8014(var5, new class_6098(this.field_35043, this.field_35045), var8, this.field_35044, this.field_35049, this.field_35042);
   }
}
