package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_207 extends Screen {
   private static final Identifier field_693 = new Identifier("textures/gui/demo_background.png");
   private class_416 field_692 = class_416.field_1766;
   private class_416 field_694 = class_416.field_1766;

   public class_207() {
      super(new TranslationTextComponent("demo.help.title"));
   }

   @Override
   public void method_1163() {
      byte var3 = -16;
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 116, this.field_940 / 2 + 62 + -16, 114, 20, new TranslationTextComponent("demo.help.buy"), var0 -> {
            var0.field_36675 = false;
            Util.getOperatingSystem().method_37581("http://www.minecraft.net/store?source=demo");
         })
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 2, this.field_940 / 2 + 62 + -16, 114, 20, new TranslationTextComponent("demo.help.later"), var1 -> {
            this.field_943.method_8609((Screen)null);
            this.field_943.field_9625.method_39834();
         })
      );
      GameOptions var4 = this.field_943.gameOptions;
      this.field_692 = class_416.method_2073(
         this.field_948,
         new TranslationTextComponent(
            "demo.help.movementShort",
            var4.keyForward.method_27061(),
            var4.keyLeft.method_27061(),
            var4.keyBack.method_27061(),
            var4.keyRight.method_27061()
         ),
         new TranslationTextComponent("demo.help.movementMouse"),
         new TranslationTextComponent("demo.help.jump", var4.keyJump.method_27061()),
         new TranslationTextComponent("demo.help.inventory", var4.keyInventory.method_27061())
      );
      this.field_694 = class_416.method_2075(this.field_948, new TranslationTextComponent("demo.help.fullWrapped"), 218);
   }

   @Override
   public void method_1183(class_7966 var1) {
      super.method_1183(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.getTextureManager().bindTexture(field_693);
      int var4 = (this.field_941 - 248) / 2;
      int var5 = (this.field_940 - 166) / 2;
      this.method_9781(var1, var4, var5, 0, 0, 248, 166);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      int var7 = (this.field_941 - 248) / 2 + 10;
      int var8 = (this.field_940 - 166) / 2 + 8;
      this.field_948.method_45378(var1, this.field_947, (float)var7, (float)var8, 2039583);
      var8 = this.field_692.method_2068(var1, var7, var8 + 12, 12, 5197647);
      this.field_694.method_2068(var1, var7, var8 + 20, 9, 2039583);
      super.method_6767(var1, var2, var3, var4);
   }
}
