package remapped;

public class class_4792 extends class_1859 {
   private static String[] field_23968;
   public class_6098 field_23969;
   public boolean field_23967;

   public class_4792(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_6098 var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_23969 = var7;
   }

   @Override
   public void method_32178(float var1) {
      byte var4 = 5;
      if (this.method_22100() || this.method_32183()) {
         class_73.method_147(
            (float)this.field_36270,
            (float)this.field_36261,
            (float)this.field_36278,
            (float)this.field_36257,
            14.0F,
            !this.method_22100() ? 0.3F * var1 : 0.8F * var1
         );
      }

      class_73.method_126(this.field_23969, this.field_36270 + var4, this.field_36261 + var4, this.field_36278 - var4 * 2, this.field_36257 - var4 * 2);
      super.method_32178(var1);
   }

   public boolean method_22100() {
      return this.field_23967;
   }

   public void method_22098(boolean var1) {
      this.method_22099(var1, true);
   }

   public void method_22099(boolean var1, boolean var2) {
      if (var1 != this.method_22100()) {
         this.field_23967 = var1;
         this.method_8235();
      }
   }

   @Override
   public void method_29506(int var1, int var2, int var3) {
      this.method_22099(!this.field_23967, true);
   }
}
