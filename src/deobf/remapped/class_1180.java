package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1180 extends class_9521 {
   private boolean field_6646;

   public class_1180(int var1, int var2, class_1500 var3) {
      super(var1, var2, 20, 20, new TranslationTextComponent("narrator.button.difficulty_lock"), var3);
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return super.method_32701()
         .appendString(". ")
         .append(
            !this.method_5221()
               ? new TranslationTextComponent("narrator.button.difficulty_lock.unlocked")
               : new TranslationTextComponent("narrator.button.difficulty_lock.locked")
         );
   }

   public boolean method_5221() {
      return this.field_6646;
   }

   public void method_5222(boolean var1) {
      this.field_6646 = var1;
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      MinecraftClient.method_8510().method_8577().method_35674(class_9521.field_36678);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_8132 var7;
      if (this.field_36675) {
         if (!this.method_32703()) {
            var7 = !this.field_6646 ? class_8132.field_41653 : class_8132.field_41657;
         } else {
            var7 = !this.field_6646 ? class_8132.field_41658 : class_8132.field_41654;
         }
      } else {
         var7 = !this.field_6646 ? class_8132.field_41660 : class_8132.field_41659;
      }

      this.method_9781(var1, this.field_36670, this.field_36674, var7.method_37000(), var7.method_37001(), this.field_36671, this.field_36681);
   }
}
