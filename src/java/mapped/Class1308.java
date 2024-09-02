package mapped;

import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1308 extends Screen {
   private static final ResourceLocation field6913 = new ResourceLocation("textures/gui/demo_background.png");
   private Class5991 field6914 = Class5991.field26162;
   private Class5991 field6915 = Class5991.field26162;

   public Class1308() {
      super(new TranslationTextComponent("demo.help.title"));
   }

   @Override
   public void init() {
      byte var3 = -16;
      this.<Button>addButton(
         new Button(this.width / 2 - 116, this.height / 2 + 62 + -16, 114, 20, new TranslationTextComponent("demo.help.buy"), var0 -> {
            var0.active = false;
            Util.getOSType().method8181("http://www.minecraft.net/store?source=demo");
         })
      );
      this.<Button>addButton(
         new Button(this.width / 2 + 2, this.height / 2 + 62 + -16, 114, 20, new TranslationTextComponent("demo.help.later"), var1 -> {
            this.mc.displayGuiScreen((Screen)null);
            this.mc.mouseHelper.grabMouse();
         })
      );
      GameSettings var4 = this.mc.gameSettings;
      this.field6914 = Class5991.method18586(
         this.fontRenderer,
         new TranslationTextComponent(
            "demo.help.movementShort", var4.keyBindForward.func_238171_j_(), var4.keyBindLeft.func_238171_j_(), var4.keyBindBack.func_238171_j_(), var4.keyBindRight.func_238171_j_()
         ),
         new TranslationTextComponent("demo.help.movementMouse"),
         new TranslationTextComponent("demo.help.jump", var4.keyBindJump.func_238171_j_()),
         new TranslationTextComponent("demo.help.inventory", var4.keyBindInventory.func_238171_j_())
      );
      this.field6915 = Class5991.method18584(this.fontRenderer, new TranslationTextComponent("demo.help.fullWrapped"), 218);
   }

   @Override
   public void renderBackground(MatrixStack var1) {
      super.renderBackground(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(field6913);
      int var4 = (this.width - 248) / 2;
      int var5 = (this.height - 166) / 2;
      this.method5696(var1, var4, var5, 0, 0, 248, 166);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      int var7 = (this.width - 248) / 2 + 10;
      int var8 = (this.height - 166) / 2 + 8;
      this.fontRenderer.func_243248_b(var1, this.title, (float)var7, (float)var8, 2039583);
      var8 = this.field6914.method18591(var1, var7, var8 + 12, 12, 5197647);
      this.field6915.method18591(var1, var7, var8 + 20, 9, 2039583);
      super.render(var1, var2, var3, var4);
   }
}
