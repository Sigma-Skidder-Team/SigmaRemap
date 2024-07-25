package remapped;

import java.util.Random;

public class class_7096 implements class_4904 {
   private static String[] field_36608;
   private final class_6098 field_36607;
   private final int field_36609;
   private final int field_36610;
   private final int field_36611;
   private final float field_36606;

   public class_7096(class_2451 var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 0.05F);
   }

   public class_7096(class_2451 var1, int var2, int var3, int var4, float var5) {
      this.field_36607 = new class_6098(var1);
      this.field_36609 = var2;
      this.field_36610 = var3;
      this.field_36611 = var4;
      this.field_36606 = var5;
   }

   @Override
   public class_8014 method_22451(class_8145 var1, Random var2) {
      int var5 = 5 + var2.nextInt(15);
      class_6098 var6 = class_2931.method_13426(var2, new class_6098(this.field_36607.method_27960()), var5, false);
      int var7 = Math.min(this.field_36609 + var5, 64);
      class_6098 var8 = new class_6098(class_4897.field_24997, var7);
      return new class_8014(var8, var6, this.field_36610, this.field_36611, this.field_36606);
   }
}
