package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;
import net.minecraft.util.text.StringTextComponent;

public class JelloOptionsMainMenu extends IconPanel {
   public JelloOptionsMainMenu(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method13300(false);
      ColorHelper var9 = ColorHelper.field27961.method19415();
      var9.method19406(ClientColors.LIGHT_GREYISH_BLUE.getColor);
      UIButton var10;
      this.addToList(var10 = new UIButton(this, "openKeybinds", var5 / 2 - 300, var6 - 80, 300, 38, var9, "Open Keybind Manager", ResourceRegistry.JelloLightFont24));
      UIButton var11;
      this.addToList(var11 = new UIButton(this, "openGui", var5 / 2, var6 - 80, 300, 38, var9, "Open Jello's Click GUI", ResourceRegistry.JelloLightFont24));
      UIButton var12;
      this.addToList(var12 = new UIButton(this, "credits", var5 / 2 - 100, var6 - 280, 200, 38, var9, "Credits", ResourceRegistry.JelloLightFont18));
      var10.doThis((var0, var1x) -> Class4325.method13438(new Class1144(new StringTextComponent("Keybind Manager"))));
      var11.doThis((var0, var1x) -> Class4325.method13438(new ClickGui(new StringTextComponent("Click GUI"))));
      var12.doThis((var0, var1x) -> Class4325.method13438(new Class1133(new StringTextComponent("GuiCredits"))));
      UICheckBox var13;
      this.addToList(var13 = new UICheckBox(this, "guiBlurCheckBox", var5 / 2 - 70, var6 - 220, 25, 25));
      var13.method13705(Client.getInstance().getGuiManager().method33470(), false);
      var13.method13036(var1x -> Client.getInstance().getGuiManager().method33469(var13.method13703()));
      UICheckBox var14;
      this.addToList(var14 = new UICheckBox(this, "guiBlurIngameCheckBox", var5 / 2 + 130, var6 - 220, 25, 25));
      var14.method13705(Client.getInstance().getGuiManager().method33472(), false);
      var14.method13036(var1x -> Client.getInstance().getGuiManager().method33471(var14.method13703()));
   }

   @Override
   public void draw(float var1) {
      this.method13463(this.field20895 + (this.method13267() - 202) / 2, this.field20896 + 10, var1);
      StringBuilder var10000 = new StringBuilder().append("You're currently using Sigma ");
      Client.getInstance();
      String var4 = var10000.append(Client.VERSION).toString();
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont20,
         (float)(this.field20895 + (this.method13267() - ResourceRegistry.JelloLightFont20.method23942(var4)) / 2),
         (float)(this.field20896 + 70),
         var4,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.4F * var1)
      );
      String var5 = "Click GUI is currently bound to: "
         + ColorUtils.method17736(Client.getInstance().getModuleManager().method14668().method13728(ClickGui.class))
         + " Key";
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont20,
         (float)(this.method13263() + (this.method13267() - ResourceRegistry.JelloLightFont20.method23942(var5)) / 2),
         (float)(this.method13265() + this.method13269() - 180),
         var5,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.6F * var1)
      );
      String var6 = "Configure all your keybinds in the keybind manager!";
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont14,
         (float)(this.method13263() + (this.method13267() - ResourceRegistry.JelloLightFont14.method23942(var6)) / 2),
         (float)(this.method13265() + this.method13269() - 150),
         var6,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.4F * var1)
      );
      String var7 = "GUI Blur: ";
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont20,
         (float)(this.method13263() + (this.method13267() - ResourceRegistry.JelloLightFont20.method23942(var7)) / 2 - 114),
         (float)(this.method13265() + this.method13269() - 221),
         var7,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F * var1)
      );
      String var8 = "GPU Accelerated: ";
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont20,
         (float)(this.method13263() + (this.method13267() - ResourceRegistry.JelloLightFont20.method23942(var8)) / 2 + 52),
         (float)(this.method13265() + this.method13269() - 221),
         var8,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F * var1)
      );
      super.draw(var1);
   }

   private void method13463(int var1, int var2, float var3) {
      RenderUtil.drawString(ResourceRegistry.JelloMediumFont40, (float)var1, (float)(var2 + 1), "Jello", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var3));
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont25, (float)(var1 + 95), (float)(var2 + 14), "for Sigma", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.86F * var3)
      );
   }
}
