package mapped;

import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mojang.blaze3d.matrix.MatrixStack;
import lol.ClientColors;
import org.lwjgl.opengl.GL11;

public class NoAddOnnScreenMenu extends VanillaMainMenuScreen {
   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      super.render(var1, var2, var3, var4);
      drawString(var1, this.font, "No Addons - SIGMA", 87, this.height - 10, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.4F));
      GL11.glPushMatrix();
      GL11.glTranslatef(88.0F, (float)(this.height - 10), 0.0F);
      GL11.glScalef(0.5F, 0.5F, 1.0F);
      GL11.glTranslatef(-88.0F, (float)(-(this.height - 10)), 0.0F);
      drawString(var1, this.font, "PROD", 280, this.height - 10, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.4F));
      GL11.glPopMatrix();
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
