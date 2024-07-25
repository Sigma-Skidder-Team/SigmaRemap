package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_515 implements class_2274 {
   private static final ITextComponent field_3160 = new TranslationTextComponent("tutorial.open_inventory.title");
   private static final ITextComponent field_3161 = new TranslationTextComponent("tutorial.open_inventory.description", class_8827.method_40532("inventory"));
   private final class_8827 field_3164;
   private class_2297 field_3163;
   private int field_3159;

   public class_515(class_8827 var1) {
      this.field_3164 = var1;
   }

   public void 錌圭훔곻瀧쿨() {
      this.field_3159++;
      if (this.field_3164.method_40539() == GameType.field_22764) {
         if (this.field_3159 >= 600 && this.field_3163 == null) {
            this.field_3163 = new class_2297(class_7856.field_39811, field_3160, field_3161, false);
            this.field_3164.method_40530().method_8519().method_42329(this.field_3163);
         }
      } else {
         this.field_3164.method_40538(class_6240.field_31929);
      }
   }

   public void 湗鏟퉧Ⱋ놣驋() {
      if (this.field_3163 != null) {
         this.field_3163.method_10566();
         this.field_3163 = null;
      }
   }

   public void 뵯䬹콵鞞쥦侃() {
      this.field_3164.method_40538(class_6240.field_31934);
   }
}
