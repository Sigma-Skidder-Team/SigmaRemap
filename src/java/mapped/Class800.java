package mapped;

import com.mojang.realmsclient.gui.screens.RealmsResetWorldScreen;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.realms.RealmsLabel;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class800 extends RealmsScreen {
   private static final ITextComponent field4173 = new TranslationTextComponent("mco.reset.world.seed");
   private static final ITextComponent[] field4174 = new ITextComponent[]{
      new TranslationTextComponent("generator.default"),
      new TranslationTextComponent("generator.flat"),
      new TranslationTextComponent("generator.large_biomes"),
      new TranslationTextComponent("generator.amplified")
   };
   private final RealmsResetWorldScreen field4175;
   private RealmsLabel field4176;
   private TextFieldWidget field4177;
   private Boolean field4178 = true;
   private Integer field4179 = 0;
   private ITextComponent field4180;

   public Class800(RealmsResetWorldScreen var1, ITextComponent var2) {
      this.field4175 = var1;
      this.field4180 = var2;
   }

   @Override
   public void tick() {
      this.field4177.method5633();
      super.tick();
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field4176 = new RealmsLabel(new TranslationTextComponent("mco.reset.world.generate"), this.width / 2, 17, 16777215);
      this.<RealmsLabel>addListener(this.field4176);
      this.field4177 = new TextFieldWidget(
         this.mc.fontRenderer, this.width / 2 - 100, method1929(2), 200, 20, (TextFieldWidget)null, new TranslationTextComponent("mco.reset.world.seed")
      );
      this.field4177.method5657(32);
      this.<TextFieldWidget>addListener(this.field4177);
      this.setFocusedDefault(this.field4177);
      this.<Button>addButton(new Button(this.width / 2 - 102, method1929(4), 205, 20, this.method1939(), var1 -> {
         this.field4179 = (this.field4179 + 1) % field4174.length;
         var1.setMessage(this.method1939());
      }));
      this.<Button>addButton(new Button(this.width / 2 - 102, method1929(6) - 2, 205, 20, this.method1940(), var1 -> {
         this.field4178 = !this.field4178;
         var1.setMessage(this.method1940());
      }));
      this.<Button>addButton(
         new Button(
            this.width / 2 - 102,
            method1929(12),
            97,
            20,
            this.field4180,
            var1 -> this.field4175.method2255(new Class7044(this.field4177.getText(), this.field4179, this.field4178))
         )
      );
      this.<Button>addButton(
         new Button(this.width / 2 + 8, method1929(12), 97, 20, DialogTexts.field30663, var1 -> this.mc.displayGuiScreen(this.field4175))
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
         this.mc.displayGuiScreen(this.field4175);
         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.field4176.func_239560_a_(this, var1);
      this.fontRenderer.func_243248_b(var1, field4173, (float)(this.width / 2 - 100), (float)method1929(1), 10526880);
      this.field4177.render(var1, var2, var3, var4);
      super.render(var1, var2, var3, var4);
   }

   private ITextComponent method1939() {
      return new TranslationTextComponent("selectWorld.mapType").appendString(" ").append(field4174[this.field4179]);
   }

   private ITextComponent method1940() {
      return DialogTexts.method22238(new TranslationTextComponent("selectWorld.mapFeatures"), this.field4178);
   }
}
