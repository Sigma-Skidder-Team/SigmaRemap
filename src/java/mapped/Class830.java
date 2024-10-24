package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class830 extends ConfirmScreen {
   private final ITextComponent field4606;
   private final ITextComponent field4607;
   private final String field4608;
   private final boolean field4609;

   public Class830(BooleanConsumer var1, String var2, boolean var3) {
      super(var1, new TranslationTextComponent(!var3 ? "chat.link.confirm" : "chat.link.confirmTrusted"), new StringTextComponent(var2));
      this.field4602 = (ITextComponent)(!var3 ? DialogTexts.field30660 : new TranslationTextComponent("chat.link.open"));
      this.field4603 = !var3 ? DialogTexts.field30661 : DialogTexts.GUI_CANCEL;
      this.field4607 = new TranslationTextComponent("chat.copy");
      this.field4606 = new TranslationTextComponent("chat.link.warning");
      this.field4609 = !var3;
      this.field4608 = var2;
   }

   @Override
   public void init() {
      super.init();
      this.buttons.clear();
      this.children.clear();
      this.<Button>addButton(
         new Button(this.width / 2 - 50 - 105, this.height / 6 + 96, 100, 20, this.field4602, var1 -> this.field4605.accept(true))
      );
      this.<Button>addButton(new Button(this.width / 2 - 50, this.height / 6 + 96, 100, 20, this.field4607, var1 -> {
         this.method2539();
         this.field4605.accept(false);
      }));
      this.<Button>addButton(
         new Button(this.width / 2 - 50 + 105, this.height / 6 + 96, 100, 20, this.field4603, var1 -> this.field4605.accept(false))
      );
   }

   public void method2539() {
      this.mc.keyboardListener.method36350(this.field4608);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      super.render(var1, var2, var3, var4);
      if (this.field4609) {
         drawCenteredString(var1, this.font, this.field4606, this.width / 2, 110, 16764108);
      }
   }
}
