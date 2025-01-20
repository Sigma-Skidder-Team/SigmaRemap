package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.ClientColors;

public class Class4344 extends Class4339 {
   private static String[] field21228;

   public Class4344(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void draw(float var1) {
      RenderUtil.drawRect(
            (float) this.xA,
            (float) this.yA,
            (float) (this.xA + this.widthA),
            (float) (this.yA + this.heightA),
            MultiUtilities.applyAlpha(ClientColors.MID_GREY.getColor(), 0.35F));
      RenderUtil.method11429(
            (float) this.xA,
            (float) this.yA,
            (float) (this.xA + this.widthA),
            (float) (this.yA + this.heightA),
            2,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), 0.14F));
      super.draw(var1);
   }
}
