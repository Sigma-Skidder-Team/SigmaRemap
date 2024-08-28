package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class1308 extends Screen {
   private static final ResourceLocation field6913 = new ResourceLocation("textures/gui/demo_background.png");
   private Class5991 field6914 = Class5991.field26162;
   private Class5991 field6915 = Class5991.field26162;

   public Class1308() {
      super(new TranslationTextComponent("demo.help.title"));
   }

   @Override
   public void method1921() {
      byte var3 = -16;
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 116, this.field4565 / 2 + 62 + -16, 114, 20, new TranslationTextComponent("demo.help.buy"), var0 -> {
            var0.field6482 = false;
            Util.getOSType().method8181("http://www.minecraft.net/store?source=demo");
         })
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 2, this.field4565 / 2 + 62 + -16, 114, 20, new TranslationTextComponent("demo.help.later"), var1 -> {
            this.field4562.displayGuiScreen((Screen)null);
            this.field4562.field1301.method36742();
         })
      );
      Class9574 var4 = this.field4562.field1299;
      this.field6914 = Class5991.method18586(
         this.field4568,
         new TranslationTextComponent(
            "demo.help.movementShort", var4.field44632.method8521(), var4.field44633.method8521(), var4.field44634.method8521(), var4.field44635.method8521()
         ),
         new TranslationTextComponent("demo.help.movementMouse"),
         new TranslationTextComponent("demo.help.jump", var4.field44636.method8521()),
         new TranslationTextComponent("demo.help.inventory", var4.field44639.method8521())
      );
      this.field6915 = Class5991.method18584(this.field4568, new TranslationTextComponent("demo.help.fullWrapped"), 218);
   }

   @Override
   public void method2469(Class9332 var1) {
      super.method2469(var1);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.field4562.getTextureManager().bindTexture(field6913);
      int var4 = (this.field4564 - 248) / 2;
      int var5 = (this.field4565 - 166) / 2;
      this.method5696(var1, var4, var5, 0, 0, 248, 166);
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      int var7 = (this.field4564 - 248) / 2 + 10;
      int var8 = (this.field4565 - 166) / 2 + 8;
      this.field4568.method38805(var1, this.field4560, (float)var7, (float)var8, 2039583);
      var8 = this.field6914.method18591(var1, var7, var8 + 12, 12, 5197647);
      this.field6915.method18591(var1, var7, var8 + 20, 9, 2039583);
      super.method1923(var1, var2, var3, var4);
   }
}
