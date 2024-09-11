package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;

public class ConfirmScreen extends Screen {
   private final ITextComponent field4600;
   private Class5991 field4601 = Class5991.field26162;
   public ITextComponent field4602;
   public ITextComponent field4603;
   private int field4604;
   public final BooleanConsumer field4605;

   public ConfirmScreen(BooleanConsumer var1, ITextComponent var2, ITextComponent var3) {
      this(var1, var2, var3, DialogTexts.field30660, DialogTexts.field30661);
   }

   public ConfirmScreen(BooleanConsumer var1, ITextComponent var2, ITextComponent var3, ITextComponent var4, ITextComponent var5) {
      super(var2);
      this.field4605 = var1;
      this.field4600 = var3;
      this.field4602 = var4;
      this.field4603 = var5;
   }

   @Override
   public String getNarrationMessage() {
      return super.getNarrationMessage() + ". " + this.field4600.getString();
   }

   @Override
   public void init() {
      super.init();
      this.<Button>addButton(new Button(this.width / 2 - 155, this.height / 6 + 96, 150, 20, this.field4602, var1 -> this.field4605.accept(true)));
      this.<Button>addButton(
         new Button(this.width / 2 - 155 + 160, this.height / 6 + 96, 150, 20, this.field4603, var1 -> this.field4605.accept(false))
      );
      this.field4601 = Class5991.method18584(this.fontRenderer, this.field4600, this.width - 50);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 70, 16777215);
      this.field4601.method18588(var1, this.width / 2, 90);
      super.render(var1, var2, var3, var4);
   }

   public void method2536(int var1) {
      this.field4604 = var1;

      for (Widget var5 : this.field4566) {
         var5.active = false;
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (--this.field4604 == 0) {
         for (Widget var4 : this.field4566) {
            var4.active = true;
         }
      }
   }

   @Override
   public boolean shouldCloseOnEsc() {
      return false;
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.field4605.accept(false);
         return true;
      }
   }
}
