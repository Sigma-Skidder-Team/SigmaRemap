package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;

public class DirtMessageScreen extends Screen {
   private static String[] field6916;

   public DirtMessageScreen(ITextComponent var1) {
      super(var1);
   }

   @Override
   public boolean shouldCloseOnEsc() {
      return false;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.method2471(0);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 70, 16777215);
      super.render(var1, var2, var3, var4);
   }
}
