package remapped;

import java.util.Random;

public class class_1195 extends class_8557 {
   private static String[] field_6692;
   public static final class_7044 field_6691 = class_6023.field_30750;
   private static final class_4190[] field_6690 = new class_4190[]{
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   public class_1195(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_7044 method_39380() {
      return field_6691;
   }

   @Override
   public int method_39381() {
      return 3;
   }

   @Override
   public class_8525 method_39382() {
      return class_4897.field_24883;
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (var4.nextInt(3) != 0) {
         super.method_10783(var1, var2, var3, var4);
      }
   }

   @Override
   public int method_39378(World var1) {
      return super.method_39378(var1) / 3;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_6691);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_6690[var1.<Integer>method_10313(this.method_39380())];
   }
}
