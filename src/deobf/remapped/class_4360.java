package remapped;

import java.util.Random;

public class class_4360 extends class_5837 {
   private static String[] field_21392;
   private final class_3254 field_21391;
   private final boolean field_21390;

   private class_4360(class_7279[] var1, class_3254 var2, boolean var3) {
      super(var1);
      this.field_21391 = var2;
      this.field_21390 = var3;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26394;
   }

   @Override
   public class_6098 method_26627(class_6098 var1, class_2792 var2) {
      Random var5 = var2.method_12693();
      return class_2931.method_13426(var5, var1, this.field_21391.method_14868(var5), this.field_21390);
   }

   public static class_8513 method_20231(class_3254 var0) {
      return new class_8513(var0);
   }
}
