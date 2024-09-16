package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.settings.Setting;

public class Class4248 extends Class4247 {
   private static String[] field20604;
   public final Setting field20605;

   public Class4248(IconPanel var1, String var2, int var3, int var4, int var5, int var6, Setting var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20605 = var7;
   }

   @Override
   public void draw(float var1) {
      RenderUtil.drawRect(
         (float)this.getXA(),
         (float)this.getYA(),
         (float)(this.getXA() + this.getWidthA()),
         (float)(this.getYA() + this.getHeightA()),
         -3618616
      );
      RenderUtil.drawString(ClassicDecryption.regular17, (float)(this.getXA() + 5), (float)(this.getYA() - 2), this.field20605.method18626(), -14540254);
   }
}
