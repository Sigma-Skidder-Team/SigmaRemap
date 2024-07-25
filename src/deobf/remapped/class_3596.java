package remapped;

public class class_3596 extends class_8394<class_7805> {
   private static String[] field_17611;
   private final class_3089 field_17612;

   public class_3596(class_3089 var1, int var2, int var3, class_9616 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field_17612 = var1;
   }

   public void method_16790(class_6322 var1, class_6541 var2, class_5799 var3, int var4, int var5, class_6325 var6, class_7805 var7) {
      BlockPos var10 = new BlockPos(var4 * 16, class_3089.method_14165(this.field_17612), var5 * 16);
      class_9863.method_45481();
      class_6006.method_27412(
         var1,
         var7,
         class_7624::new,
         var2,
         var3,
         var10,
         this.field_15986,
         this.field_15989,
         class_3089.method_14166(this.field_17612),
         class_3089.method_14167(this.field_17612)
      );
      this.method_14720();
   }
}
