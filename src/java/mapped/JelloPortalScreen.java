package mapped;

import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.StringTextComponent;

import java.util.ArrayList;
import java.util.List;

public class JelloPortalScreen extends MultiplayerScreen {
   private Class1206 field6959;
   public static int field6960 = 0;
   private Class1197 field6961;

   public JelloPortalScreen() {
      super(new MainMenuScreen());
   }

   public JelloPortalScreen(Screen var1) {
      super(var1);
   }

  @Override
   public void method1921() {
      super.method1921();
      Class5807 var3 = new Class5807(
         "jello.portaloption",
         0.0,
         (double)(this.method6251().size() - 1),
         1.0F,
         var1 -> (double)this.method6250(),
         (var1, var2) -> Class8005.field34417 = this.method6252(var2.intValue()),
         (var1, var2) -> {
            int var5 = (int)var2.method18090(var1);
            return new StringTextComponent(this.method6252(var5).method18580());
         }
      );
      this.field6961 = this.method2455(var3.method17946(this.mc.gameSettings, this.field4564 / 2 + 40, 7, 114));
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      super.method1923(var1, var2, var3, var4);
      RenderUtil.method11420(
         0, 0, Minecraft.getInstance().mainWindow.method8043(), (int)(30.0 * Minecraft.getInstance().mainWindow.method8049() / (double) GuiManager.field41348)
      );
      this.method2469(var1);
      RenderUtil.method11422();
      this.field6961.method1923(var1, var2, var3, var4);
      drawString(var1, this.fontRenderer, this.getTextComponent().getString(), this.field4564 / 2 - 146, 13, 16777215);
      drawString(var1, this.fontRenderer, "Jello Portal:", this.field4564 / 2 - 30, 13, Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F));
   }

   private int method6250() {
      field6960 = 0;

      for (Class5989 var4 : this.method6251()) {
         if (this.method6252(field6960).equals(Class8005.method27372())) {
            break;
         }

         field6960++;
      }

      return field6960;
   }

   private List<Class5989> method6251() {
      ArrayList var3 = new ArrayList();

      for (Class5989 var5 : Class5989.field26128) {
         if (var5.method18582() >= Class5989.field26129.method18582()) {
            var3.add(var5);
         }
      }

      return var3;
   }

   private Class5989 method6252(int var1) {
      return this.method6251().get(var1);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
