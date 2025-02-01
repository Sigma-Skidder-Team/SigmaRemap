package mapped;

import com.mentalfrostbyte.jello.resource.TrueTypeFont;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.ClientColors;
import org.lwjgl.opengl.GL11;

public class UITextDisplay extends Class4278 {
   private static String[] field20736;
   public static ColorHelper field20778 = new ColorHelper(
         ClientColors.DEEP_TEAL.getColor(),
         ClientColors.DEEP_TEAL.getColor(),
         ClientColors.DEEP_TEAL.getColor(),
         ClientColors.DEEP_TEAL.getColor(),
         Class2218.field14488,
         Class2218.field14492);
   public boolean field20779 = false;

   public UITextDisplay(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7,
         String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
   }

   public UITextDisplay(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7,
         String var8, TrueTypeFont var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
   }

   @Override
   public void draw(float partialTicks) {
      if (this.field20779) {
         GL11.glAlphaFunc(518, 0.01F);
         RenderUtil.drawString(
               ResourceRegistry.JelloLightFont18_1,
               (float) this.getXA(),
               (float) this.getYA(),
               this.getTypedText(),
               MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), partialTicks));
         GL11.glAlphaFunc(519, 0.0F);
      }

      if (this.typedText != null) {
         RenderUtil.drawString(
               this.getFont(),
               (float) this.getXA(),
               (float) this.getYA(),
               this.getTypedText(),
               MultiUtilities.applyAlpha(this.textColor.getTextColor(),
                     partialTicks * MultiUtilities.method17710(this.textColor.getTextColor())));
      }
   }
}
