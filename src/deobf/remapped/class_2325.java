package remapped;

public class class_2325 extends class_6414 {
   private static String[] field_11628;
   public static final class_4190 field_11627 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private final class_9077 field_11629;

   public class_2325(class_9077 var1, class_3073 var2) {
      super(var2);
      this.field_11629 = var1;
   }

   public class_9077 method_10672() {
      return this.field_11629;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_11627;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      return var1.method_8309(var4, var5) ? super.method_10763(var1, var2, var3, var4, var5, var6) : class_4783.field_23184.method_29260();
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      return !var2.method_22548(var3.method_6100());
   }
}
