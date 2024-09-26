package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Arrays;
import java.util.stream.Stream;

public class Class1143 extends Class1135 {
   private Class1296 field6209;
   private static final AbstractOption[] field6210 = new AbstractOption[]{
      AbstractOption.field25335, AbstractOption.field25361, AbstractOption.field25331, AbstractOption.field25357, AbstractOption.field25368
   };

   public Class1143(Screen var1, GameSettings var2) {
      super(var1, var2, new TranslationTextComponent("options.mouse_settings.title"));
   }

   @Override
   public void init() {
      this.field6209 = new Class1296(this.mc, this.width, this.height, 32, this.height - 32, 25);
      if (!InputMappings.method38643()) {
         this.field6209.method6131(field6210);
      } else {
         this.field6209.method6131(Stream.<AbstractOption>concat(Arrays.stream(field6210), Stream.of(AbstractOption.field25332)).<AbstractOption>toArray(AbstractOption[]::new));
      }

      this.children.add(this.field6209);
      this.<Button>addButton(new Button(this.width / 2 - 100, this.height - 27, 200, 20, DialogTexts.field30658, var1 -> {
         this.field6193.saveOptions();
         this.mc.displayGuiScreen(this.field6192);
      }));
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.field6209.render(var1, var2, var3, var4);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 5, 16777215);
      super.render(var1, var2, var3, var4);
   }
}
