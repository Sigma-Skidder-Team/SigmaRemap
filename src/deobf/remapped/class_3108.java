package remapped;

public class class_3108 extends class_4314 {
   private static String[] field_15446;

   public class_3108(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_1896();
   }

   @Override
   public void method_10765(class_2522 var1, class_6331 var2, BlockPos var3, ItemStack var4) {
      super.method_10765(var1, var2, var3, var4);
      int var7 = 15 + var2.field_33033.nextInt(15) + var2.field_33033.nextInt(15);
      this.method_29304(var2, var3, var7);
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public ItemStack method_29276(class_6163 var1, BlockPos var2, class_2522 var3) {
      return ItemStack.EMPTY;
   }
}
