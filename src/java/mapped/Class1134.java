package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;

public class Class1134 extends Screen {
   private static String[] field6189;
   private final ITextComponent field6190;

   public Class1134(ITextComponent var1, ITextComponent var2) {
      super(var1);
      this.field6190 = var2;
   }

   @Override
   public void init() {
      super.init();
      this.<Button>addButton(new Button(this.width / 2 - 100, 140, 200, 20, DialogTexts.GUI_CANCEL, var1 -> this.mc.displayGuiScreen((Screen)null)));
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.method5688(var1, 0, 0, this.width, this.height, -12574688, -11530224);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 90, 16777215);
      drawCenteredString(var1, this.fontRenderer, this.field6190, this.width / 2, 110, 16777215);
      super.render(var1, var2, var3, var4);
   }

   @Override
   public boolean method2454() {
      return false;
   }
}
