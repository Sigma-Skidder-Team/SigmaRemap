package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_606 extends class_129 {
   private final double field_3477;
   private final double field_3474;

   public class_606(class_2977 var1, int var2, int var3, int var4, int var5, float var6, float var7) {
      super(var2, var3, var4, 20, StringTextComponent.EMPTY, 0.0);
      this.field_3475 = var1;
      this.field_3477 = (double)var6;
      this.field_3474 = (double)var7;
      this.field_319 = (double)((class_9299.method_42828((float)var5, var6, var7) - var6) / (var7 - var6));
      this.method_396();
   }

   @Override
   public void method_399() {
      if (class_2977.method_13638(this.field_3475).field_36675) {
         class_2977.method_13633(
            this.field_3475, (int)class_9299.method_42794(class_9299.method_42827(this.field_319, 0.0, 1.0), this.field_3477, this.field_3474)
         );
      }
   }

   @Override
   public void method_396() {
      this.method_32687(
         new TranslationTextComponent("mco.configure.world.spawnProtection")
            .appendString(": ")
            .append(
               (ITextComponent)(class_2977.method_13634(this.field_3475) != 0
                  ? new StringTextComponent(String.valueOf(class_2977.method_13634(this.field_3475)))
                  : new TranslationTextComponent("mco.configure.world.off"))
            )
      );
   }

   @Override
   public void method_32694(double var1, double var3) {
   }

   @Override
   public void method_32704(double var1, double var3) {
   }
}
