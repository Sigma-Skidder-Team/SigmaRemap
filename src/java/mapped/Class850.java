package mapped;

import org.lwjgl.opengl.GL11;

public class Class850 extends MainMenuScreen {
   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      super.method1923(var1, var2, var3, var4);
      drawString(var1, this.fontRenderer, "No Addons - SIGMA", 87, this.field4565 - 10, Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.4F));
      GL11.glPushMatrix();
      GL11.glTranslatef(88.0F, (float)(this.field4565 - 10), 0.0F);
      GL11.glScalef(0.5F, 0.5F, 1.0F);
      GL11.glTranslatef(-88.0F, (float)(-(this.field4565 - 10)), 0.0F);
      drawString(var1, this.fontRenderer, "PROD", 280, this.field4565 - 10, Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.4F));
      GL11.glPopMatrix();
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
