package mapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.text.ITextComponent;

public class Class802 extends RealmsScreen {
   private static String[] field4186;
   public BooleanConsumer field4187;
   private final ITextComponent field4188;
   private final ITextComponent field4189;
   private int field4190;

   public Class802(BooleanConsumer var1, ITextComponent var2, ITextComponent var3) {
      this.field4187 = var1;
      this.field4188 = var2;
      this.field4189 = var3;
   }

   @Override
   public void init() {
      this.<Button>addButton(new Button(this.width / 2 - 105, method1929(9), 100, 20, DialogTexts.field30660, var1 -> this.field4187.accept(true)));
      this.<Button>addButton(new Button(this.width / 2 + 5, method1929(9), 100, 20, DialogTexts.field30661, var1 -> this.field4187.accept(false)));
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.fontRenderer, this.field4188, this.width / 2, method1929(3), 16777215);
      drawCenteredString(var1, this.fontRenderer, this.field4189, this.width / 2, method1929(5), 16777215);
      super.render(var1, var2, var3, var4);
   }

   @Override
   public void tick() {
      super.tick();
      if (--this.field4190 == 0) {
         for (Widget var4 : this.field4566) {
            var4.active = true;
         }
      }
   }
}
