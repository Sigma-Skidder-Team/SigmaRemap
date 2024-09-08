package mapped;

import com.mojang.realmsclient.dto.RealmsServer;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.realms.RealmsLabel;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class818 extends RealmsScreen {
   private static final ITextComponent field4454 = new TranslationTextComponent("mco.configure.world.name");
   private static final ITextComponent field4455 = new TranslationTextComponent("mco.configure.world.description");
   private final Class815 field4456;
   private final RealmsServer field4457;
   private Button field4458;
   private TextFieldWidget field4459;
   private TextFieldWidget field4460;
   private RealmsLabel field4461;

   public Class818(Class815 var1, RealmsServer var2) {
      this.field4456 = var1;
      this.field4457 = var2;
   }

   @Override
   public void tick() {
      this.field4460.method5633();
      this.field4459.method5633();
      this.field4458.active = !this.field4460.getText().trim().isEmpty();
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      int var3 = this.width / 2 - 106;
      this.field4458 = this.<Button>addButton(
         new Button(var3 - 2, method1929(12), 106, 20, new TranslationTextComponent("mco.configure.world.buttons.done"), var1 -> this.method2329())
      );
      this.<Button>addButton(
         new Button(this.width / 2 + 2, method1929(12), 106, 20, DialogTexts.GUI_CANCEL, var1 -> this.mc.displayGuiScreen(this.field4456))
      );
      String var4 = this.field4457.field27447 != Class2261.field14707 ? "mco.configure.world.buttons.open" : "mco.configure.world.buttons.close";
      Button var5 = new Button(this.width / 2 - 53, method1929(0), 106, 20, new TranslationTextComponent(var4), var1 -> {
         if (this.field4457.field27447 != Class2261.field14707) {
            this.field4456.method2295(false, this);
         } else {
            TranslationTextComponent var4x = new TranslationTextComponent("mco.configure.world.close.question.line1");
            TranslationTextComponent var5x = new TranslationTextComponent("mco.configure.world.close.question.line2");
            this.mc.displayGuiScreen(new Class808(var1x -> {
               if (!var1x) {
                  this.mc.displayGuiScreen(this);
               } else {
                  this.field4456.method2296(this);
               }
            }, Class2134.field13980, var4x, var5x, true));
         }
      });
      this.<Button>addButton(var5);
      this.field4460 = new TextFieldWidget(
         this.mc.fontRenderer, var3, method1929(4), 212, 20, (TextFieldWidget)null, new TranslationTextComponent("mco.configure.world.name")
      );
      this.field4460.method5657(32);
      this.field4460.method5635(this.field4457.method18907());
      this.<TextFieldWidget>addListener(this.field4460);
      this.setListenerDefault(this.field4460);
      this.field4459 = new TextFieldWidget(
         this.mc.fontRenderer, var3, method1929(8), 212, 20, (TextFieldWidget)null, new TranslationTextComponent("mco.configure.world.description")
      );
      this.field4459.method5657(32);
      this.field4459.method5635(this.field4457.method18906());
      this.<TextFieldWidget>addListener(this.field4459);
      this.field4461 = this.<RealmsLabel>addListener(
         new RealmsLabel(new TranslationTextComponent("mco.configure.world.settings.title"), this.width / 2, 17, 16777215)
      );
      this.func_231411_u_();
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.mc.displayGuiScreen(this.field4456);
         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.field4461.func_239560_a_(this, var1);
      this.fontRenderer.func_243248_b(var1, field4454, (float)(this.width / 2 - 106), (float)method1929(3), 10526880);
      this.fontRenderer.func_243248_b(var1, field4455, (float)(this.width / 2 - 106), (float)method1929(7), 10526880);
      this.field4460.render(var1, var2, var3, var4);
      this.field4459.render(var1, var2, var3, var4);
      super.render(var1, var2, var3, var4);
   }

   public void method2329() {
      this.field4456.method2294(this.field4460.getText(), this.field4459.getText());
   }
}
