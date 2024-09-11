package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.TranslationTextComponent;

public class DatapackFailureScreen extends Screen {
   private Class5991 field6213 = Class5991.field26162;
   private final Runnable field6214;

   public DatapackFailureScreen(Runnable var1) {
      super(new TranslationTextComponent("datapackFailure.title"));
      this.field6214 = var1;
   }

   @Override
   public void init() {
      super.init();
      this.field6213 = Class5991.method18584(this.fontRenderer, this.getTextComponent(), this.width - 50);
      this.<Button>addButton(
         new Button(
            this.width / 2 - 155, this.height / 6 + 96, 150, 20, new TranslationTextComponent("datapackFailure.safeMode"), var1 -> this.field6214.run()
         )
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 - 155 + 160,
            this.height / 6 + 96,
            150,
            20,
            new TranslationTextComponent("gui.toTitle"),
            var1 -> this.mc.displayGuiScreen((Screen)null)
         )
      );
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.field6213.method18588(var1, this.width / 2, 70);
      super.render(var1, var2, var3, var4);
   }

   @Override
   public boolean shouldCloseOnEsc() {
      return false;
   }
}
