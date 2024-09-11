package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class808 extends RealmsScreen {
   private final Class2134 field4326;
   private final ITextComponent field4327;
   private final ITextComponent field4328;
   public final BooleanConsumer field4329;
   private final boolean field4330;

   public Class808(BooleanConsumer var1, Class2134 var2, ITextComponent var3, ITextComponent var4, boolean var5) {
      this.field4329 = var1;
      this.field4326 = var2;
      this.field4327 = var3;
      this.field4328 = var4;
      this.field4330 = var5;
   }

   @Override
   public void init() {
      Class9229.method34713(this.field4326.field13982, this.field4327.getString(), this.field4328.getString());
      if (!this.field4330) {
         this.<Button>addButton(
            new Button(this.width / 2 - 50, method1929(8), 100, 20, new TranslationTextComponent("mco.gui.ok"), var1 -> this.field4329.accept(true))
         );
      } else {
         this.<Button>addButton(new Button(this.width / 2 - 105, method1929(8), 100, 20, DialogTexts.field30660, var1 -> this.field4329.accept(true)));
         this.<Button>addButton(new Button(this.width / 2 + 5, method1929(8), 100, 20, DialogTexts.field30661, var1 -> this.field4329.accept(false)));
      }
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.field4329.accept(false);
         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      method5690(var1, this.fontRenderer, this.field4326.field13982, this.width / 2, method1929(2), this.field4326.field13981);
      drawCenteredString(var1, this.fontRenderer, this.field4327, this.width / 2, method1929(4), 16777215);
      drawCenteredString(var1, this.fontRenderer, this.field4328, this.width / 2, method1929(6), 16777215);
      super.render(var1, var2, var3, var4);
   }
}
