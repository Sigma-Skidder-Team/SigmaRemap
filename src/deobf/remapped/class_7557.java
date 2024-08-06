package remapped;

public class class_7557 extends class_1859 {
   private static String[] field_38518;
   public int field_38519 = -16711936;

   public class_7557(class_7038 var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_38519 = var7;
   }

   @Override
   public void method_32178(float var1) {
      FontManager.method_121(
         (float)this.field_36270 + (float)this.field_36278 / 2.0F,
         (float)this.field_36261 + (float)this.field_36278 / 2.0F,
         (float)this.field_36278,
         class_314.method_1444(class_314.method_1442(this.field_38519, class_1255.field_6929.field_6917, 0.8F), var1)
      );
      FontManager.method_121(
         (float)this.field_36270 + (float)this.field_36278 / 2.0F,
         (float)this.field_36261 + (float)this.field_36278 / 2.0F,
         (float)(this.field_36278 - 2),
         class_314.method_1444(this.field_38519, var1)
      );
      if (this.method_32185()) {
         FontManager.method_121(
            (float)this.field_36270 + (float)this.field_36278 / 2.0F,
            (float)this.field_36261 + (float)this.field_36278 / 2.0F,
            (float)(this.field_36278 - 2),
            class_314.method_1444(class_1255.field_6929.field_6917, var1 * 0.2F)
         );
      }

      super.method_32178(var1);
   }
}
