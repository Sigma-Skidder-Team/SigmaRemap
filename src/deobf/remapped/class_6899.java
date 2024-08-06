package remapped;

public class class_6899 extends class_1859 {
   private static String[] field_35473;
   private boolean field_35472 = true;
   private class_2440 field_35471 = new class_2440(100, 100);

   public class_6899(class_7038 var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_35472 = var7;
   }

   @Override
   public void method_32178(float var1) {
      this.field_35471.method_11119(!this.method_32183() ? class_4043.field_19618 : class_4043.field_19620);
      var1 *= 0.09F + 0.25F * this.field_35471.method_11123() + (this.field_35472 ? 0.0F : 0.2F);
      FontManager.method_103(
         (float)(this.field_36270 + 10), (float)(this.field_36261 + 16), 5.0F, 14.0F, class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      FontManager.method_103(
         (float)(this.field_36270 + 17), (float)(this.field_36261 + 10), 5.0F, 20.0F, class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      FontManager.method_103(
         (float)(this.field_36270 + 24), (float)(this.field_36261 + 20), 5.0F, 10.0F, class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      super.method_32178(var1);
   }

   public void method_31596(boolean var1) {
      this.field_35472 = var1;
   }
}
