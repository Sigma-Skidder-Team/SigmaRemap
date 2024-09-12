package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;

public class Class4368 extends Class4247 {
   public Module field21351;

   public Class4368(IconPanel var1, String var2, int var3, int var4, int var5, int var6, Module var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field21351 = var7;
      Class4262 var10;
      this.addToList(var10 = new Class4262(this, "enable", 114, 9, 40, 18));
      var10.method13093(var7.isEnabled());
      var10.method13036(var2x -> var7.method15999(var10.method13092()));
      if (var7.getSettingMap().size() > 0) {
         Class4364 var11;
         this.addToList(var11 = new Class4364(this, "gear", 132, 32));
         var11.doThis((var2x, var3x) -> ((Class4335)this.getIconPanel()).method13486(var7));
      }
   }

   @Override
   public void draw(float var1) {
      RenderUtil.drawString(
         ClassicDecryption.regular17,
         (float)(this.x + 10),
         (float)(this.y + 8),
         this.field21351.getSuffix(),
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, !this.field21351.isEnabled() ? 0.5F : 0.9F)
      );
      RenderUtil.drawString(
         ClassicDecryption.regular15,
         (float)(this.x + 15),
         (float)(this.y + 33),
         "Bind",
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 1.0F)
      );
      RenderUtil.drawString(
         ClassicDecryption.regular15,
         (float)(this.x + 15),
         (float)(this.y + 52),
         ColorUtils.method17736(this.field21351.parseSettingValueToIntBySettingName("Keybind")),
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.7F)
      );
      if (this.field21351.getSettingMap().size() > 1) {
         RenderUtil.drawString(
            ClassicDecryption.regular12,
            (float)(this.x + 84),
            (float)(this.y + 34),
            "Settings",
            ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 1.0F)
         );
      }

      super.draw(var1);
   }
}
