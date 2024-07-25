package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_881 extends Screen {
   private static final ITextComponent field_4540 = new TranslationTextComponent("multiplayer.downloadingTerrain");
   private class_1433 field_4539 = class_5609.method_25460();

   public class_881() {
      super(class_7542.field_38486);
   }

   @Override
   public boolean method_1178() {
      return false;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (this.field_4539 == null) {
         this.method_1170(0);
      } else {
         this.field_4539.method_6579(this.field_941, this.field_940);
      }

      method_9788(var1, this.field_948, field_4540, this.field_941 / 2, this.field_940 / 2 - 50, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public boolean method_1161() {
      return false;
   }
}
