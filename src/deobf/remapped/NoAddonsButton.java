package remapped;

import org.lwjgl.opengl.GL11;

public class NoAddonsButton extends MainMenuScreen {
   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      super.method_6767(var1, var2, var3, var4);
      method_9770(var1, this.field_948, "No Addons - SIGMA", 87, this.field_940 - 10, class_314.method_1444(class_1255.field_6918.field_6917, 0.4F));
      GL11.glPushMatrix();
      GL11.glTranslatef(88.0F, (float)(this.field_940 - 10), 0.0F);
      GL11.glScalef(0.5F, 0.5F, 1.0F);
      GL11.glTranslatef(-88.0F, (float)(-(this.field_940 - 10)), 0.0F);
      method_9770(var1, this.field_948, "PROD", 280, this.field_940 - 10, class_314.method_1444(class_1255.field_6918.field_6917, 0.4F));
      GL11.glPopMatrix();
   }

   @Override
   public boolean method_1161() {
      return false;
   }
}
