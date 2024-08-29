package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.animation.Animation;
import org.lwjgl.opengl.GL11;

import java.awt.image.BufferedImage;
import java.net.URL;

public class Class4283 extends Class4278 {
   private static String[] field20736;
   public static Class6387 field20760 = new Class6387(
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      Class2218.field14488,
      Class2218.field14492
   );
   public URL field20761 = null;
   public BufferedImage field20762;
   public boolean field20763 = false;
   private Texture field20764;
   private Texture field20765;
   private Animation field20766;

   public Class4283(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, field20760, var2, false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      double var4 = Minecraft.getInstance().mouseHelper.method36738() - (double)(Minecraft.getInstance().mainWindow.method8043() / 2);
      var4 /= (double)(Minecraft.getInstance().mainWindow.method8043() / 2);
      var4 = Math.max(-1.0, Math.min(1.0, var4));
      double var6 = Minecraft.getInstance().mouseHelper.method36739() - (double)(Minecraft.getInstance().mainWindow.method8044() / 2);
      var6 /= (double)(Minecraft.getInstance().mainWindow.method8044() / 2);
      var6 = Math.max(-1.0, Math.min(1.0, var6));
      GL11.glPushMatrix();
      GL11.glMatrixMode(5888);
      GL11.glEnable(2929);
      GL11.glRotated(1.0 * Math.abs(var4 * var6), var6, var4, 0.0);
      GL11.glTranslatef((float)(-this.field20895 - this.field20897 / 2), (float)(-this.field20896 - this.field20898 / 2), 0.0F);
      GL11.glDisable(2929);
      Class3192.method11424((float)this.field20895, (float)this.field20896, (float)this.field20897, (float)this.field20898, ClientColors.PALE_YELLOW.getColor);
      GL11.glPopMatrix();
      super.method13027(var1);
   }
}
