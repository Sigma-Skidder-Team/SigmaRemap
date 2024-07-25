package remapped;

import java.util.Random;

public class class_9231 implements class_4904 {
   private static String[] field_47190;
   private final class_2451 field_47188;
   private final int field_47191;
   private final int field_47189;
   private final int field_47187;
   private final float field_47186;

   public class_9231(class_8525 var1, int var2, int var3, int var4) {
      this.field_47188 = var1.method_10803();
      this.field_47191 = var2;
      this.field_47189 = var3;
      this.field_47187 = var4;
      this.field_47186 = 0.05F;
   }

   @Override
   public class_8014 method_22451(class_8145 var1, Random var2) {
      class_6098 var5 = new class_6098(this.field_47188, this.field_47191);
      return new class_8014(var5, new class_6098(class_4897.field_24997), this.field_47189, this.field_47187, this.field_47186);
   }
}
