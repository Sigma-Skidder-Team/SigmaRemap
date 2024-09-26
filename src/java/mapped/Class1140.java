package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public abstract class Class1140 extends Class1135 {
   private final AbstractOption[] field6203;
   private Widget field6204;
   private Class1296 field6205;

   public Class1140(Screen var1, GameSettings var2, ITextComponent var3, AbstractOption[] var4) {
      super(var1, var2, var3);
      this.field6203 = var4;
   }

   @Override
   public void init() {
      this.field6205 = new Class1296(this.mc, this.width, this.height, 32, this.height - 32, 25);
      this.field6205.method6131(this.field6203);
      this.children.add(this.field6205);
      this.method5472();
      this.field6204 = this.field6205.method6132(AbstractOption.field25346);
      if (this.field6204 != null) {
         this.field6204.active = NarratorChatListener.INSTANCE.method20405();
      }
   }

   public void method5472() {
      this.<Button>addButton(
         new Button(this.width / 2 - 100, this.height - 27, 200, 20, DialogTexts.field30658, var1 -> this.mc.displayGuiScreen(this.field6192))
      );
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.field6205.render(var1, var2, var3, var4);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 20, 16777215);
      super.render(var1, var2, var3, var4);
      List var7 = method5458(this.field6205, var2, var3);
      if (var7 != null) {
         this.method2461(var1, var7, var2, var3);
      }
   }

   public void method5473() {
      if (this.field6204 != null) {
         this.field6204.setMessage(AbstractOption.field25346.method17947(this.field6193));
      }
   }
}
