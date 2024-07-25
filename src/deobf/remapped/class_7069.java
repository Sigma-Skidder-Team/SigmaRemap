package remapped;

import java.util.Random;

public class class_7069 extends class_2830 implements class_3978 {
   private static String[] field_36497;
   public static final class_4190 field_36498 = class_6414.method_29292(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public class_7069(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_36498;
   }

   @Override
   public boolean method_18358(class_6163 var1, BlockPos var2, class_2522 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method_18357(World var1, Random var2, BlockPos var3, class_2522 var4) {
      return true;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, BlockPos var3, class_2522 var4) {
      class_3064 var7 = (class_3064)(this != class_4783.field_23616 ? class_4783.field_23247 : class_4783.field_23586);
      if (var7.method_29260().method_8309(var1, var3) && var1.method_22548(var3.method_6081())) {
         var7.method_14009(var1, var3, 2);
      }
   }

   @Override
   public class_7971 method_10772() {
      return class_7971.field_40822;
   }
}
