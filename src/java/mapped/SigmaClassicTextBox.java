package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;

public class SigmaClassicTextBox extends UIInput {
   private static String[] field20759;

   public SigmaClassicTextBox(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, String var9, ClientResource var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.method13308(new ColorHelper(var7).method19410(ClientColors.LIGHT_GREYISH_BLUE.getColor));
      this.method13156(false);
   }

   @Override
   public void draw(float var1) {
      this.setFont(ResourceRegistry.DefaultClientFont);
      RenderUtil.drawRect(
         (float)this.xA,
         (float)this.yA,
         (float)(this.xA + this.widthA),
         (float)(this.yA + this.heightA),
         ClientColors.DEEP_TEAL.getColor
      );
      RenderUtil.method11429(
         (float)(this.xA - 2),
         (float)this.yA,
         (float)(this.xA + this.widthA + 2),
         (float)(this.yA + this.heightA),
         2,
         MultiUtilities.method17690(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.DEEP_TEAL.getColor, 625.0F)
      );
      super.draw(var1);
   }
}
