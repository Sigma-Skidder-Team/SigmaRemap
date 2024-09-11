package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class832 extends Screen {
   private final ITextComponent field4616;
   private Class5991 field4617 = Class5991.field26162;
   private final Screen field4618;
   private int field4619;

   public Class832(Screen var1, ITextComponent var2, ITextComponent var3) {
      super(var2);
      this.field4618 = var1;
      this.field4616 = var3;
   }

   @Override
   public boolean shouldCloseOnEsc() {
      return false;
   }

   @Override
   public void init() {
      this.field4617 = Class5991.method18584(this.fontRenderer, this.field4616, this.width - 50);
      this.field4619 = this.field4617.method18592() * 9;
      this.<Button>addButton(
         new Button(
            this.width / 2 - 100,
            Math.min(this.height / 2 + this.field4619 / 2 + 9, this.height - 30),
            200,
            20,
            new TranslationTextComponent("gui.toMenu"),
            var1 -> this.mc.displayGuiScreen(this.field4618)
         )
      );
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, this.height / 2 - this.field4619 / 2 - 18, 11184810);
      this.field4617.method18588(var1, this.width / 2, this.height / 2 - this.field4619 / 2);
      super.render(var1, var2, var3, var4);
   }
}
