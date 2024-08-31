package mapped;

import com.google.common.collect.Lists;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;

public class Class844 extends Class838 {
   private Screen field4675;
   private ITextComponent field4676;
   private ITextComponent field4677;
   private final List<Class9125> field4678 = Lists.newArrayList();
   public String field4679;
   private int field4680;

   public Class844(Screen var1, String var2, String var3) {
      super(new TranslationTextComponent("of.options.detailsTitle"));
      this.field4675 = var1;
      this.field4676 = new StringTextComponent(var2);
      this.field4677 = new StringTextComponent(var3);
      this.field4679 = I18n.format("gui.done");
   }

   @Override
   public void init() {
      this.<Class1210>addButton(new Class1210(0, this.width / 2 - 100, this.height / 6 + 96, this.field4679));
      this.field4678.clear();
      this.field4678.addAll(this.mc.fontRenderer.method38828(this.field4677, this.width - 50));
   }

   @Override
   public void method2563(Widget var1) {
      Class7944.method26860().displayGuiScreen(this.field4675);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.field4630, this.field4676, this.width / 2, 70, 16777215);
      int var7 = 90;

      for (Class9125 var9 : this.field4678) {
         method2567(var1, this.field4630, var9, this.width / 2, var7, 16777215);
         var7 += 9;
      }

      super.render(var1, var2, var3, var4);
   }

   public void method2589(int var1) {
      this.field4680 = var1;

      for (Widget var5 : this.field4629) {
         var5.active = false;
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (--this.field4680 == 0) {
         for (Widget var4 : this.field4629) {
            var4.active = true;
         }
      }
   }
}
