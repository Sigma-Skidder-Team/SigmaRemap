package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.CreateWorldScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;

public class Class1341 extends Screen {
   public final Screen field7113;
   private List<Class9125> field7114;
   private Button field7115;
   private Button field7116;
   private Button field7117;
   private Button field7118;
   public TextFieldWidget field7119;
   private Class1276 field7120;

   public Class1341(Screen var1) {
      super(new TranslationTextComponent("selectWorld.title"));
      this.field7113 = var1;
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      return super.mouseScrolled(var1, var3, var5);
   }

   @Override
   public void tick() {
      this.field7119.method5633();
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field7119 = new TextFieldWidget(this.fontRenderer, this.width / 2 - 100, 22, 200, 20, this.field7119, new TranslationTextComponent("selectWorld.search"));
      this.field7119.method5631(var1 -> this.field7120.method6066(() -> var1, false));
      this.field7120 = new Class1276(
         this, this.mc, this.width, this.height, 48, this.height - 64, 36, () -> this.field7119.getText(), this.field7120
      );
      this.field4561.add(this.field7119);
      this.field4561.add(this.field7120);
      this.field7116 = this.<Button>addButton(
         new Button(
            this.width / 2 - 154,
            this.height - 52,
            150,
            20,
            new TranslationTextComponent("selectWorld.select"),
            var1 -> this.field7120.method6067().ifPresent(Class1173::method5578)
         )
      );
      this.addButton(
         new Button(
            this.width / 2 + 4,
            this.height - 52,
            150,
            20,
            new TranslationTextComponent("selectWorld.create"),
            var1 -> {
               System.out.println("Creating new world");
               this.mc.displayGuiScreen(CreateWorldScreen.func_243425_a(this));
            }
         )
      );
      this.field7117 = this.<Button>addButton(
         new Button(
            this.width / 2 - 154,
            this.height - 28,
            72,
            20,
            new TranslationTextComponent("selectWorld.edit"),
            var1 -> this.field7120.method6067().ifPresent(Class1173::method5580)
         )
      );
      this.field7115 = this.<Button>addButton(
         new Button(
            this.width / 2 - 76,
            this.height - 28,
            72,
            20,
            new TranslationTextComponent("selectWorld.delete"),
            var1 -> this.field7120.method6067().ifPresent(Class1173::method5579)
         )
      );
      this.field7118 = this.<Button>addButton(
         new Button(
            this.width / 2 + 4,
            this.height - 28,
            72,
            20,
            new TranslationTextComponent("selectWorld.recreate"),
            var1 -> this.field7120.method6067().ifPresent(Class1173::method5581)
         )
      );
      this.<Button>addButton(
         new Button(this.width / 2 + 82, this.height - 28, 72, 20, DialogTexts.GUI_CANCEL, var1 -> this.mc.displayGuiScreen(this.field7113))
      );
      this.method6422(false);
      this.setFocusedDefault(this.field7119);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      return !super.keyPressed(var1, var2, var3) ? this.field7119.keyPressed(var1, var2, var3) : true;
   }

   @Override
   public void method1945() {
      this.mc.displayGuiScreen(this.field7113);
   }

   @Override
   public boolean charTyped(char var1, int var2) {
      return this.field7119.charTyped(var1, var2);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.field7114 = null;
      this.field7120.render(var1, var2, var3, var4);
      this.field7119.render(var1, var2, var3, var4);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 8, 16777215);
      super.render(var1, var2, var3, var4);
      if (this.field7114 != null) {
         this.method2461(var1, this.field7114, var2, var3);
      }
   }

   public void method6421(List<Class9125> var1) {
      this.field7114 = var1;
   }

   public void method6422(boolean var1) {
      this.field7116.active = var1;
      this.field7115.active = var1;
      this.field7117.active = var1;
      this.field7118.active = var1;
   }

   @Override
   public void onClose() {
      if (this.field7120 != null) {
         this.field7120.getEventListeners().forEach(Class1173::close);
      }
   }
}
