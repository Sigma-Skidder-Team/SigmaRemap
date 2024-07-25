package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7773 extends class_266 {
   private final ITextComponent field_39404;
   private class_416 field_39403 = class_416.field_1766;
   private final class_266 field_39402;
   private int field_39401;

   public class_7773(class_266 var1, ITextComponent var2, ITextComponent var3) {
      super(var2);
      this.field_39402 = var1;
      this.field_39404 = var3;
   }

   @Override
   public boolean method_1178() {
      return false;
   }

   @Override
   public void method_1163() {
      this.field_39403 = class_416.method_2075(this.field_948, this.field_39404, this.field_941 - 50);
      this.field_39401 = this.field_39403.method_2072() * 9;
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100,
            Math.min(this.field_940 / 2 + this.field_39401 / 2 + 9, this.field_940 - 30),
            200,
            20,
            new TranslationTextComponent("gui.toMenu"),
            var1 -> this.field_943.method_8609(this.field_39402)
         )
      );
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, this.field_940 / 2 - this.field_39401 / 2 - 18, 11184810);
      this.field_39403.method_2067(var1, this.field_941 / 2, this.field_940 / 2 - this.field_39401 / 2);
      super.method_6767(var1, var2, var3, var4);
   }
}
