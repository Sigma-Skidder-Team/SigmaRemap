package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import org.lwjgl.opengl.GL11;

public class Class4255 extends Class4247 {
   private static String[] field20632;
   public Texture field20633;
   public Texture field20634;

   public Class4255(IconPanel var1, String var2, int var3, int var4, int var5, int var6, String var7, Texture var8, Texture var9) {
      super(var1, var2, var3, var4, var5, var6, ColorHelper.field27961, var7, false);
      this.field20633 = var8;
      this.field20634 = var9;
   }

   @Override
   public void draw(float var1) {
      GL11.glAlphaFunc(518, 0.1F);
      RenderUtil.method11449(
         (float)(this.field20895 + (this.field20897 - 64) / 2),
         (float)(this.field20896 + 10),
         64.0F,
         64.0F,
         !this.method13298() ? this.field20633 : this.field20634,
         ClientColors.LIGHT_GREYISH_BLUE.getColor
      );
      int var4 = this.method13267() / 2 + this.field20895;
      int var5 = this.method13269() / 2 + this.field20896;
      RenderUtil.drawString(
         ClassicDecryption.regular25,
         (float)(this.field20895 + (this.method13267() - ClassicDecryption.regular25.method23942(this.field20912)) / 2),
         (float)(this.field20896 + this.method13269() - 50),
         this.field20912,
         !this.method13298() ? -14869219 : -319475
      );
      super.draw(var1);
   }
}
