package remapped;

public class class_9463 extends class_8557 {
   private static String[] field_48278;
   private static final class_4190[] field_48277 = new class_4190[]{
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   public class_9463(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_8525 method_39382() {
      return class_4897.field_25136;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_48277[var1.<Integer>method_10313(this.method_39380())];
   }
}
