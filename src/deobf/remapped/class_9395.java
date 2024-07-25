package remapped;

public class class_9395 extends class_1859 {
   private static String[] field_48007;
   public class_6512 field_48008;

   public class_9395(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_6512 var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_48008 = var7;
      this.method_32100((var1x, var2x) -> {
         this.field_48008 = this.field_48008.method_29666();
         this.method_8235();
      });
   }

   public class_6512 method_43466() {
      return this.field_48008;
   }

   @Override
   public void method_32178(float var1) {
      class_73.method_135((float)this.field_36270, (float)this.field_36261, (float)this.field_36278, (float)this.field_36257);
      class_73.method_99(
         (float)(this.field_36270 - this.field_48008.field_33115 * this.field_36278),
         (float)this.field_36261,
         (float)(this.field_36278 * 3),
         (float)this.field_36257,
         class_2209.field_11055,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.35F)
      );
      class_73.method_141();
      super.method_32178(var1);
   }
}
