package remapped;

public class class_9635 extends class_1859 {
   private static String[] field_49091;
   public float field_49092;

   public class_9635(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.field_49092 = this.field_49092 + (!this.method_32183() ? -0.14F : 0.14F);
      this.field_49092 = Math.min(Math.max(0.0F, this.field_49092), 1.0F);
   }

   @Override
   public void method_32178(float var1) {
      class_73.method_121(
         (float)(this.field_36270 + this.field_36278 / 2),
         (float)(this.field_36261 + this.field_36257 / 2),
         (float)this.field_36278,
         class_314.method_1444(class_1255.field_6928.field_6917, (0.5F + this.field_49092 * 0.3F + (!this.field_36267 ? 0.0F : 0.2F)) * var1)
      );
      class_73.method_103(
         (float)(this.field_36270 + (this.field_36278 - 10) / 2),
         (float)(this.field_36261 + this.field_36257 / 2 - 1),
         10.0F,
         2.0F,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.75F * var1)
      );
      super.method_32178(var1);
   }
}
