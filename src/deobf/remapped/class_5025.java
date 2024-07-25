package remapped;

public class class_5025 extends class_3200<class_4080> {
   private static String[] field_25996;

   public class_5025(class_5390<class_4080> var1, int var2, int var3, class_9616 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method_23171(class_6322 var1, class_6541 var2, class_5799 var3, int var4, int var5, class_6325 var6, class_4080 var7) {
      int var10 = var4 * 16;
      int var11 = var5 * 16;
      BlockPos var12 = new BlockPos(var10 + 9, 90, var11 + 9);
      this.field_15986.add(new class_5473(var12));
      this.method_14720();
   }

   @Override
   public BlockPos method_14730() {
      return new BlockPos((this.method_14722() << 4) + 9, 0, (this.method_14726() << 4) + 9);
   }
}
