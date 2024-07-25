package remapped;

import org.lwjgl.opengl.GL11;

public class class_1581 extends class_446 {
   private static String[] field_8282;
   public Timer field_8281 = new Timer();
   public float field_8280 = 0.0F;

   public class_1581(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_8281.method_14776();
   }

   @Override
   public void method_32178(float var1) {
      this.field_8280 = this.field_8280 + (this.method_32140() ? 0.2F : -0.2F);
      this.field_8280 = Math.min(1.0F, Math.max(0.0F, this.field_8280));
      float var4 = (float)(this.field_8281.method_14772() / 75L % 12L);
      if (this.field_8280 != 0.0F) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(this.field_36270 + this.field_36278 / 2), (float)(this.field_36261 + this.field_36257 / 2), 0.0F);
         GL11.glRotatef(var4 * 30.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef((float)(-this.field_36270 - this.field_36278 / 2), (float)(-this.field_36261 - this.field_36257 / 2), 0.0F);
         class_73.method_99(
            (float)this.field_36270,
            (float)this.field_36261,
            (float)this.field_36278,
            (float)this.field_36257,
            NotificationIcons.field_11056,
            class_314.method_1444(class_1255.field_6929.field_6917, this.field_8280 * var1)
         );
         GL11.glPopMatrix();
      }
   }
}
