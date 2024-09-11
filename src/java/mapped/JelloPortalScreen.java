package mapped;

import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.StringTextComponent;

import java.util.ArrayList;
import java.util.List;

public class JelloPortalScreen extends MultiplayerScreen {
   private Button field6959;
   public static int field6960 = 0;
   private Widget field6961;

   public JelloPortalScreen() {
      super(new VanillaMainMenuScreen());
   }

   public JelloPortalScreen(Screen var1) {
      super(var1);
   }

  @Override
   public void init() {
      super.init();
      Class5807 var3 = new Class5807(
         "jello.portaloption",
         0.0,
         (double)(this.method6251().size() - 1),
         1.0F,
         var1 -> (double)this.method6250(),
         (var1, var2) -> JelloPortal.field34417 = this.method6252(var2.intValue()),
         (var1, var2) -> {
            int var5 = (int)var2.method18090(var1);
            return new StringTextComponent(this.method6252(var5).method18580());
         }
      );
      this.field6961 = this.addButton(var3.createWidget(this.mc.gameSettings, this.width / 2 + 40, 7, 114));
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      super.render(var1, var2, var3, var4);
      RenderUtil.method11420(
         0, 0, Minecraft.getInstance().mainWindow.getWidth(), (int)(30.0 * Minecraft.getInstance().mainWindow.getGuiScaleFactor() / (double) GuiManager.field41348)
      );
      this.renderBackground(var1);
      RenderUtil.endScissor();
      this.field6961.render(var1, var2, var3, var4);
      drawString(var1, this.fontRenderer, this.getTextComponent().getString(), this.width / 2 - 146, 13, 16777215);
      drawString(var1, this.fontRenderer, "Jello Portal:", this.width / 2 - 30, 13, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F));
   }

   private int method6250() {
      field6960 = 0;

      for (ViaVerList var4 : this.method6251()) {
         if (this.method6252(field6960).equals(JelloPortal.method27372())) {
            break;
         }

         field6960++;
      }

      return field6960;
   }

   private List<ViaVerList> method6251() {
      ArrayList var3 = new ArrayList();

      for (ViaVerList var5 : ViaVerList.field26128) {
         if (var5.method18582() >= ViaVerList.field26129.method18582()) {
            var3.add(var5);
         }
      }

      return var3;
   }

   private ViaVerList method6252(int var1) {
      return this.method6251().get(var1);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
