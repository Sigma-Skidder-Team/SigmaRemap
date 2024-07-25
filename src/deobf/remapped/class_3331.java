package remapped;

import java.util.Random;

public class class_3331 extends class_2830 {
   private static String[] field_16437;
   public static final class_7044 field_16435 = class_6023.field_30750;
   private static final class_4190[] field_16436 = new class_4190[]{
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   public class_3331(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_16435, Integer.valueOf(0)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_16436[var1.<Integer>method_10313(field_16435)];
   }

   @Override
   public boolean method_12870(class_2522 var1, class_6163 var2, BlockPos var3) {
      return var1.method_8350(class_4783.field_23784);
   }

   @Override
   public boolean method_29300(class_2522 var1) {
      return var1.<Integer>method_10313(field_16435) < 3;
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      int var7 = var1.<Integer>method_10313(field_16435);
      if (var7 < 3 && var4.nextInt(10) == 0) {
         var1 = var1.method_10308(field_16435, Integer.valueOf(var7 + 1));
         var2.method_7513(var3, var1, 2);
      }
   }

   @Override
   public ItemStack method_29276(class_6163 var1, BlockPos var2, class_2522 var3) {
      return new ItemStack(class_4897.field_24573);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_16435);
   }
}
