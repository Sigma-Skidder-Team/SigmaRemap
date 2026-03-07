package mapped;

import com.mentalfrostbyte.jello.unmapped.GuiComponent;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.ClientColors;

public class Class4371 extends InteractiveWidget {
   public int field21365;

   public Class4371(GuiComponent var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field21365 = var7;
   }

   @Override
   public void draw(float partialTicks) {
      RenderUtil.drawCircle(
            (float) this.xA + (float) this.widthA / 2.0F,
            (float) this.yA + (float) this.widthA / 2.0F,
            (float) this.widthA,
            MultiUtilities.applyAlpha(
                  MultiUtilities.blendColors(this.field21365, ClientColors.DEEP_TEAL.getColor(), 0.8F), partialTicks));
      RenderUtil.drawCircle(
            (float) this.xA + (float) this.widthA / 2.0F,
            (float) this.yA + (float) this.widthA / 2.0F,
            (float) (this.widthA - 2),
            MultiUtilities.applyAlpha(this.field21365, partialTicks));
      if (this.isMouseDownOverComponent()) {
         RenderUtil.drawCircle(
               (float) this.xA + (float) this.widthA / 2.0F,
               (float) this.yA + (float) this.widthA / 2.0F,
               (float) (this.widthA - 2),
               MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), partialTicks * 0.2F));
      }

      super.draw(partialTicks);
   }
}
