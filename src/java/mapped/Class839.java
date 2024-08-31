package mapped;

import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.text.StringTextComponent;

public class Class839 extends Class838 {
   private Screen field4632;
   private GameSettings field4633;
   private static AbstractOption[] field4634 = new AbstractOption[]{
      AbstractOption.field25441,
      AbstractOption.field25432,
      AbstractOption.field25443,
      AbstractOption.field25431,
      AbstractOption.field25377,
      AbstractOption.field25403,
      AbstractOption.field25400,
      AbstractOption.field25401,
      AbstractOption.field25429
   };
   private Class9046 field4635 = new Class9046(this, new Class7548());

   public Class839(Screen var1, GameSettings var2) {
      super(new StringTextComponent(I18n.format("of.options.performanceTitle")));
      this.field4632 = var1;
      this.field4633 = var2;
   }

   @Override
   public void init() {
      this.field4629.clear();

      for (int var3 = 0; var3 < field4634.length; var3++) {
         AbstractOption var4 = field4634[var3];
         int var5 = this.width / 2 - 155 + var3 % 2 * 160;
         int var6 = this.height / 6 + 21 * (var3 / 2) - 12;
         this.<Widget>addButton(var4.createWidget(this.mc.gameSettings, var5, var6, 150));
      }

      this.<Class1210>addButton(new Class1210(200, this.width / 2 - 100, this.height / 6 + 168 + 11, I18n.format("gui.done")));
   }

   @Override
   public void method2563(Widget var1) {
      if (var1 instanceof Class1210) {
         Class1210 var4 = (Class1210)var1;
         if (var4.active && var4.field6523 == 200) {
            this.mc.gameSettings.saveOptions();
            this.mc.displayGuiScreen(this.field4632);
         }
      }
   }

   @Override
   public void onClose() {
      this.mc.gameSettings.saveOptions();
      super.onClose();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.field4630, this.title, this.width / 2, 15, 16777215);
      super.render(var1, var2, var3, var4);
      this.field4635.method33640(var1, var2, var3, this.field4629);
   }
}
