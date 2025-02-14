package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.module.settings.Setting;
import com.mentalfrostbyte.jello.unmapped.ResourceList;

public class Class4248 extends Class4247 {
    public final Setting setting;

   public Class4248(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, Setting var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.setting = var7;
   }

   @Override
   public void draw(float partialTicks) {
      RenderUtil.drawRect(
         (float)this.getXA(),
         (float)this.getYA(),
         (float)(this.getXA() + this.getWidthA()),
         (float)(this.getYA() + this.getHeightA()),
         -3618616
      );
      RenderUtil.drawString(ResourceList.regular17, (float)(this.getXA() + 5), (float)(this.getYA() - 2), this.setting.getDescription(), -14540254);
   }
}
