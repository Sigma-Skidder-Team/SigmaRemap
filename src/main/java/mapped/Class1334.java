package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.MultiplayerScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1334 extends Screen {
   private final Screen field7053;
   private static final ITextComponent field7054 = new TranslationTextComponent("multiplayerWarning.header").mergeStyle(TextFormatting.BOLD);
   private static final ITextComponent field7055 = new TranslationTextComponent("multiplayerWarning.message");
   private static final ITextComponent field7056 = new TranslationTextComponent("multiplayerWarning.check");
   private static final ITextComponent field7057 = field7054.deepCopy().appendString("\n").append(field7055);
   private Class1248 field7058;
   private Class5991 field7059 = Class5991.field26162;

   public Class1334(Screen var1) {
      super(NarratorChatListener.EMPTY);
      this.field7053 = var1;
   }

   @Override
   public void init() {
      super.init();
      this.field7059 = Class5991.method18584(this.font, field7055, this.width - 50);
      int var3 = (this.field7059.method18592() + 1) * 9 * 2;
      this.<Button>addButton(new Button(this.width / 2 - 155, 100 + var3, 150, 20, DialogTexts.GUI_PROCEED, var1 -> {
         if (this.field7058.method5820()) {
            this.mc.gameSettings.field44630 = true;
            this.mc.gameSettings.saveOptions();
         }

         this.mc.displayGuiScreen(new MultiplayerScreen(this.field7053));
      }));
      this.<Button>addButton(
         new Button(this.width / 2 - 155 + 160, 100 + var3, 150, 20, DialogTexts.field30663, var1 -> this.mc.displayGuiScreen(this.field7053))
      );
      this.field7058 = new Class1248(this.width / 2 - 155 + 80, 76 + var3, 150, 20, field7056, false);
      this.<Class1248>addButton(this.field7058);
   }

   @Override
   public String getNarrationMessage() {
      return field7057.getString();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.method2471(0);
      drawString(var1, this.font, field7054, 25, 30, 16777215);
      this.field7059.method18590(var1, 25, 70, 18, 16777215);
      super.render(var1, var2, var3, var4);
   }
}
