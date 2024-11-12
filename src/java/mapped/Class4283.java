package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import lol.ClientColors;
import org.newdawn.slick.opengl.Texture;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

import java.awt.image.BufferedImage;
import java.net.URL;

public class Class4283 extends Class4278 {
   private static String[] field20736;
   public static ColorHelper field20760 = new ColorHelper(
      ClientColors.DEEP_TEAL.color,
      ClientColors.DEEP_TEAL.color,
      ClientColors.DEEP_TEAL.color,
      ClientColors.DEEP_TEAL.color,
      Class2218.field14488,
      Class2218.field14492
   );
   public URL field20761 = null;
   public BufferedImage field20762;
   public boolean field20763 = false;
   private Texture field20764;
   private Texture field20765;
   private Animation field20766;

   public Class4283(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, field20760, var2, false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      double var4 = Minecraft.getInstance().mouseHelper.getMouseX() - (double)(Minecraft.getInstance().mainWindow.getWidth() / 2);
      var4 /= (double)(Minecraft.getInstance().mainWindow.getWidth() / 2);
      var4 = Math.max(-1.0, Math.min(1.0, var4));
      double var6 = Minecraft.getInstance().mouseHelper.getMouseY() - (double)(Minecraft.getInstance().mainWindow.getHeight() / 2);
      var6 /= (double)(Minecraft.getInstance().mainWindow.getHeight() / 2);
      var6 = Math.max(-1.0, Math.min(1.0, var6));
      GL11.glPushMatrix();
      GL11.glMatrixMode(5888);
      GL11.glEnable(2929);
      GL11.glRotated(1.0 * Math.abs(var4 * var6), var6, var4, 0.0);
      GL11.glTranslatef((float)(-this.xA - this.widthA / 2), (float)(-this.yA - this.heightA / 2), 0.0F);
      GL11.glDisable(2929);
      RenderUtil.renderBackgroundBox((float)this.xA, (float)this.yA, (float)this.widthA, (float)this.heightA, ClientColors.PALE_YELLOW.color);
      GL11.glPopMatrix();
      super.draw(var1);
   }
}
