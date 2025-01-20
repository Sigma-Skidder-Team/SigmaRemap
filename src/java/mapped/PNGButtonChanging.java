package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.ClientColors;

public class PNGButtonChanging extends Class4247 {
   public Class189 field20607;

   public PNGButtonChanging(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, Class189 var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20607 = var7;
      this.doThis((var1x, var2x) -> {
         this.field20607 = this.field20607.method577();
         this.method13037();
      });
   }

   public Class189 method13038() {
      return this.field20607;
   }

   @Override
   public void draw(float var1) {
      RenderUtil.startScissor((float)this.xA, (float)this.yA, (float)this.widthA, (float)this.heightA);
      RenderUtil.drawImage(
         (float)(this.xA - this.field20607.field719 * this.widthA),
         (float)this.yA,
         (float)(this.widthA * 3),
         (float)this.heightA,
         ResourceList.repeatPNG,
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.35F)
      );
      RenderUtil.endScissor();
      super.draw(var1);
   }
}
