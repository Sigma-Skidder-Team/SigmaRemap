package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7612 extends class_2219 {
   private final class_562 field_38744;

   public class_7612(class_1893 var1, int var2, int var3, class_562 var4, int var5) {
      super(var1.field_9577, var2, var3, var5, 20, (double)var1.field_9577.method_40885(var4));
      this.field_38744 = var4;
      this.method_396();
   }

   @Override
   public void method_396() {
      Object var3 = (float)this.field_319 != (float)this.method_32684(false)
         ? new StringTextComponent((int)(this.field_319 * 100.0) + "%")
         : class_1402.field_7629;
      this.method_32687(new TranslationTextComponent("soundCategory." + this.field_38744.method_2681()).appendString(": ").append((ITextComponent)var3));
   }

   @Override
   public void method_399() {
      this.field_11096.method_40886(this.field_38744, (float)this.field_319);
      this.field_11096.method_40873();
   }
}
