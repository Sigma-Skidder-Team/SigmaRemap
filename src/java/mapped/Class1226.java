package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1226 extends Class1206 {
   private boolean field6575;

   public Class1226(int var1, int var2, Class7192 var3) {
      super(var1, var2, 20, 20, new TranslationTextComponent("narrator.button.difficulty_lock"), var3);
   }

   @Override
   public IFormattableTextComponent method5634() {
      return super.method5634()
         .appendString(". ")
         .append(
            !this.method5807()
               ? new TranslationTextComponent("narrator.button.difficulty_lock.unlocked")
               : new TranslationTextComponent("narrator.button.difficulty_lock.locked")
         );
   }

   public boolean method5807() {
      return this.field6575;
   }

   public void method5808(boolean var1) {
      this.field6575 = var1;
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      Minecraft.getInstance().getTextureManager().bindTexture(Class1206.field6474);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      Class2105 var7;
      if (this.field6482) {
         if (!this.method5737()) {
            var7 = !this.field6575 ? Class2105.field13725 : Class2105.field13722;
         } else {
            var7 = !this.field6575 ? Class2105.field13726 : Class2105.field13723;
         }
      } else {
         var7 = !this.field6575 ? Class2105.field13727 : Class2105.field13724;
      }

      this.method5696(var1, this.field6477, this.field6478, var7.method8770(), var7.method8771(), this.field6475, this.field6476);
   }
}
