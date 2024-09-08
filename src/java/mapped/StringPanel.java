package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import org.lwjgl.opengl.GL11;

public class StringPanel extends Class4278 {
   private static String[] field20736;
   public static ColorHelper field20778 = new ColorHelper(
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      Class2218.field14488,
      Class2218.field14492
   );
   public boolean field20779 = false;

   public StringPanel(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
   }

   public StringPanel(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, ClientResource var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
   }

   @Override
   public void draw(float var1) {
      if (this.field20779) {
         GL11.glAlphaFunc(518, 0.01F);
         RenderUtil.drawString(
            ResourceRegistry.JelloLightFont18_1,
            (float)this.method13263(),
            (float)this.method13265(),
            this.method13303(),
            ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, var1)
         );
         GL11.glAlphaFunc(519, 0.0F);
      }

      if (this.field20912 != null) {
         RenderUtil.drawString(
            this.method13305(),
            (float)this.method13263(),
            (float)this.method13265(),
            this.method13303(),
            ColorUtils.applyAlpha(this.field20914.method19409(), var1 * ColorUtils.method17710(this.field20914.method19409()))
         );
      }
   }
}
