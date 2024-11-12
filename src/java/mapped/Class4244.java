package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;
import org.lwjgl.opengl.GL11;

public class Class4244 extends ButtonPanel {
   private static String[] field20594;
   public static final ColorHelper field20595 = new ColorHelper(ClientColors.DARK_BLUE_GREY.color, MultiUtilities.method17691(ClientColors.DARK_BLUE_GREY.color, 0.1F));

   public Class4244(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, field20595);
   }

   @Override
   public void draw(float var1) {
      if (var1 != 0.0F) {
         if (!this.isHovered()) {
            float var10000 = 0.3F;
         } else if (!this.method13216()) {
            if (!this.method13212()) {
               Math.max(var1 * this.field20584, 0.0F);
            } else {
               float var5 = 1.5F;
            }
         } else {
            float var6 = 0.0F;
         }

         RenderUtil.method11474(
            (float)this.getXA(),
            (float)this.getYA(),
            (float)this.getWidthA(),
            (float)this.getHeightA(),
            5.0F,
            MultiUtilities.applyAlpha(this.textColor.method19405(), var1)
         );
         if (this.getTypedText() != null) {
            RenderUtil.drawString(
               this.getFont(),
               (float)(this.getXA() + this.getWidthA() / 2),
               (float)(this.getYA() + this.getHeightA() / 2),
               this.getTypedText(),
               MultiUtilities.applyAlpha(this.textColor.getTextColor(), var1),
               this.textColor.method19411(),
               this.textColor.method19413()
            );
         }

         GL11.glPushMatrix();
         super.method13226(var1);
         GL11.glPopMatrix();
      }
   }
}
