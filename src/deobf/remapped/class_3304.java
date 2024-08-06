package remapped;

public class class_3304 extends class_446 {
   private static String[] field_16346;
   private class_8343 field_16345;

   public class_3304(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_16345 = var7;
   }

   @Override
   public void method_32178(float var1) {
      FontManager.method_99(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)this.field_36278,
         (float)this.field_36257,
         this.field_16345,
         class_314.method_1442(
            class_1255.field_6929.field_6917, class_1255.field_6918.field_6917, !this.method_32183() ? 0.0F : (!this.method_32185() ? 0.15F : 0.3F)
         )
      );
      super.method_32178(var1);
   }
}
