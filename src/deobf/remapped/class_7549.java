package remapped;

public class class_7549 extends class_1173 {
   private static String[] field_38498;

   public class_7549(EntityType<? extends class_7549> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 10.440001F;
   }

   public static class_1313 method_34356() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37468, 100.0)
         .method_5984(class_7331.field_37465, 0.5)
         .method_5984(class_7331.field_37462, 50.0);
   }

   @Override
   public float method_21376(BlockPos var1, class_4924 var2) {
      return var2.method_22566(var1) - 0.5F;
   }
}
