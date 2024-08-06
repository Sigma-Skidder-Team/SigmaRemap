package remapped;

public class class_4989 extends class_446 {
   private static String[] field_25830;
   public final int field_25829;

   public class_4989(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_25829 = var5;
   }

   @Override
   public void method_32178(float var1) {
      if (this.method_32109() != 0) {
         this.method_32130();
         float var4 = 1.0F - Math.min(1.0F, Math.max((float)this.method_32109() / (float)this.field_25829, 0.0F));
         FontManager.method_103(
            (float)this.field_36270, (float)this.field_36261, (float)this.field_25829, (float)this.field_36257, class_314.method_1444(-3254955, var1)
         );
         super.method_32178(var1 * (1.0F - var4));
         FontManager.method_99(
            0.0F, 0.0F, 20.0F, (float)this.field_36257, NotificationIcons.shadow_right, class_314.method_1444(class_1255.field_6918.field_6917, var4 * var1)
         );
      }
   }
}
