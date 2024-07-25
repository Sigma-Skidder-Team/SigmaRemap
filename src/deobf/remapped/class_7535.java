package remapped;

public final class class_7535 implements class_9538 {
   private static String[] field_38461;

   @Override
   public int method_43977(class_2522 var1, class_5561 var2, BlockPos var3) {
      class_6325 var6 = class_9300.method_42872(var2, var3);
      return class_9300.method_42876() != null && var6 == class_5630.field_28566
         ? class_9300.method_42876().method_44171(var6, var3)
         : var6.method_28872((double)var3.getX(), (double)var3.getZ());
   }

   @Override
   public boolean method_43978() {
      return false;
   }
}
