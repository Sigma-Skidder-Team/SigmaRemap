package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.text.ITextComponent;

public class Class801 extends RealmsScreen {
   private final ITextComponent field4181;
   private final ITextComponent field4182;
   private Class5991 field4183 = Class5991.field26162;
   private final Screen field4184;
   private int field4185;

   public Class801(Screen var1, ITextComponent var2, ITextComponent var3) {
      this.field4184 = var1;
      this.field4181 = var2;
      this.field4182 = var3;
   }

   @Override
   public void init() {
      Minecraft var3 = Minecraft.getInstance();
      var3.setConnectedToRealms(false);
      var3.getPackFinder().clearResourcePack();
      Class9229.method34711(this.field4181.getString() + ": " + this.field4182.getString());
      this.field4183 = Class5991.method18584(this.font, this.field4182, this.width - 50);
      this.field4185 = this.field4183.method18592() * 9;
      this.<Button>addButton(
         new Button(
            this.width / 2 - 100, this.height / 2 + this.field4185 / 2 + 9, 200, 20, DialogTexts.field30663, var2 -> var3.displayGuiScreen(this.field4184)
         )
      );
   }

   @Override
   public void method1945() {
      Minecraft.getInstance().displayGuiScreen(this.field4184);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.font, this.field4181, this.width / 2, this.height / 2 - this.field4185 / 2 - 18, 11184810);
      this.field4183.method18588(var1, this.width / 2, this.height / 2 - this.field4185 / 2);
      super.render(var1, var2, var3, var4);
   }
}
