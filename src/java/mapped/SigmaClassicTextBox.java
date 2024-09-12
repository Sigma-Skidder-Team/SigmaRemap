package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;

public class SigmaClassicTextBox extends Class4281 {
   private static String[] field20759;

   public SigmaClassicTextBox(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, String var9, ClientResource var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.method13308(new ColorHelper(var7).setTextColor(ClientColors.LIGHT_GREYISH_BLUE.getColor));
      this.method13156(false);
   }

   @Override
   public void draw(float var1) {
      this.method13306(ResourceRegistry.field38868);
      RenderUtil.drawRect(
         (float)this.x,
         (float)this.y,
         (float)(this.x + this.width),
         (float)(this.y + this.height),
         ClientColors.DEEP_TEAL.getColor
      );
      RenderUtil.method11429(
         (float)(this.x - 2),
         (float)this.y,
         (float)(this.x + this.width + 2),
         (float)(this.y + this.height),
         2,
         ColorUtils.method17690(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor, 625.0F)
      );
      super.draw(var1);
   }
}