package mapped;

import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.text.StringTextComponent;

public class Class847 extends Class838 {
   private Screen field4690;
   private GameSettings field4691;
   private static AbstractOption[] field4692 = new AbstractOption[]{
      AbstractOption.field25378,
      AbstractOption.field25379,
      AbstractOption.field25380,
      AbstractOption.field25381,
      AbstractOption.field25396,
      AbstractOption.field25397,
      AbstractOption.field25398,
      AbstractOption.field25419,
      AbstractOption.field25374,
      AbstractOption.field25375,
      AbstractOption.field25433,
      AbstractOption.field25427,
      AbstractOption.field25428,
      AbstractOption.field25414,
      AbstractOption.field25399,
      AbstractOption.field25436,
      AbstractOption.field25334,
      AbstractOption.field25315
   };
   private Class9046 field4693 = new Class9046(this, new Class7548());

   public Class847(Screen var1, GameSettings var2) {
      super(new StringTextComponent(I18n.format("of.options.detailsTitle")));
      this.field4690 = var1;
      this.field4691 = var2;
   }

   @Override
   public void init() {
      this.field4629.clear();

      for (int var3 = 0; var3 < field4692.length; var3++) {
         AbstractOption var4 = field4692[var3];
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
            this.mc.displayGuiScreen(this.field4690);
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
      drawCenteredString(var1, this.mc.fontRenderer, this.title, this.width / 2, 15, 16777215);
      super.render(var1, var2, var3, var4);
      this.field4693.method33640(var1, var2, var3, this.field4629);
   }
}
