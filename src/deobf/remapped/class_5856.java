package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5856 implements class_4259 {
   public class_5856(class_1170 var1, class_7099 var2, class_7099 var3, class_6867 var4) {
      this.field_29760 = var1;
      this.field_29758 = var2;
      this.field_29762 = var3;
      this.field_29761 = var4;
   }

   @Nullable
   @Override
   public class_4088 method_11419(int var1, class_7051 var2, class_704 var3) {
      if (this.field_29758.method_38430(var3) && this.field_29762.method_38430(var3)) {
         this.field_29758.method_10812(var2.field_36409);
         this.field_29762.method_10812(var2.field_36409);
         return class_1465.method_6771(var1, var2, this.field_29761);
      } else {
         return null;
      }
   }

   @Override
   public ITextComponent method_19839() {
      if (!this.field_29758.method_45507()) {
         return (ITextComponent)(!this.field_29762.method_45507() ? new TranslationTextComponent("container.chestDouble") : this.field_29762.method_19839());
      } else {
         return this.field_29758.method_19839();
      }
   }
}
