package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.text.StringTextComponent;

public class Class841 extends Class838 {
   private Screen field4639;
   private GameSettings field4640;
   private Class9046 field4641 = new Class9046(this, new Class7548());

   public Class841(Screen var1, GameSettings var2) {
      super(new StringTextComponent(I18n.format("of.options.otherTitle")));
      this.field4639 = var1;
      this.field4640 = var2;
   }

   @Override
   public void init() {
      this.field4629.clear();
      Class5810 var3 = new Class5810(this.mc.getMainWindow());
      AbstractOption[] var4 = new AbstractOption[]{
         AbstractOption.field25387,
         AbstractOption.field25410,
         AbstractOption.field25388,
         AbstractOption.field25438,
         AbstractOption.field25395,
         AbstractOption.field25402,
         AbstractOption.field25369,
         AbstractOption.field25389,
         AbstractOption.field25439,
         AbstractOption.field25442,
         var3,
         null
      };

      for (int var5 = 0; var5 < var4.length; var5++) {
         AbstractOption var6 = var4[var5];
         int var7 = this.width / 2 - 155 + var5 % 2 * 160;
         int var8 = this.height / 6 + 21 * (var5 / 2) - 12;
         Widget var9 = this.<Widget>addButton(var6.createWidget(this.mc.gameSettings, var7, var8, 150));
         if (var6 == var3) {
            var9.method5741(310);
            var5++;
         }
      }

      this.<Class1210>addButton(
         new Class1210(210, this.width / 2 - 100, this.height / 6 + 168 + 11 - 44, I18n.format("of.options.other.reset"))
      );
      this.<Class1210>addButton(new Class1210(200, this.width / 2 - 100, this.height / 6 + 168 + 11, I18n.format("gui.done")));
   }

   @Override
   public void method2563(Widget var1) {
      if (var1 instanceof Class1210) {
         Class1210 var4 = (Class1210)var1;
         if (var4.active) {
            if (var4.field6523 == 200) {
               this.mc.gameSettings.saveOptions();
               this.mc.getMainWindow().update();
               this.mc.displayGuiScreen(this.field4639);
            }

            if (var4.field6523 == 210) {
               this.mc.gameSettings.saveOptions();
               String var5 = I18n.format("of.message.other.reset");
               ConfirmScreen var6 = new ConfirmScreen(this::method2568, new StringTextComponent(var5), new StringTextComponent(""));
               this.mc.displayGuiScreen(var6);
            }
         }
      }
   }

   @Override
   public void onClose() {
      this.mc.gameSettings.saveOptions();
      this.mc.getMainWindow().update();
      super.onClose();
   }

   public void method2568(boolean var1) {
      if (var1) {
         this.mc.gameSettings.method37163();
      }

      this.mc.displayGuiScreen(this);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.field4630, this.title, this.width / 2, 15, 16777215);
      super.render(var1, var2, var3, var4);
      this.field4641.method33640(var1, var2, var3, this.field4629);
   }
}
